package DataBase;

import Models.Record;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import javax.swing.JOptionPane;

public class ConnectionDB {

    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:./database/myDB;IFEXISTS=TRUE";
    private static final String DB_USERNAME = "admin";
    private static final String DB_PASSWORD = "";
    private Connection connection;
    private Statement stmt;
    private static final String CREATE_RECORDS_TABLE = "CREATE TABLE RECORDS ("
            + " ID bigint auto_increment NOT NULL PRIMARY KEY, "
            + " REQUEST_ID VARCHAR(255), "
            + " REQUEST_YEAR VARCHAR(255), "
            + " HOSPITAL VARCHAR(255), "
            + " SECTION VARCHAR(255), "
            + " REQUEST_DATE VARCHAR(255), "
            + " DEVICE_NAME VARCHAR(255), "
            + " FACTORY_NAME VARCHAR(255), "
            + " DEVICE_MODEL VARCHAR(255), "
            + " DEVICE_SERIAL VARCHAR(255), "
            + " DEVICE_TOOLS VARCHAR(255), "
            + " REQUEST_STATUS VARCHAR(255), "
            + " PROCUREMENT VARCHAR(255) DEFAULT '--', "
            + " RECEIVABLES VARCHAR(255) DEFAULT '--', "
            + " PURCHASE_SOURCE VARCHAR(255) DEFAULT '--', "
            + " AMOUNT VARCHAR(255) DEFAULT '0', "
            + " PURCHASE_DATE VARCHAR(255) DEFAULT '--', "
            + " GLASOUR_SERIAL VARCHAR(255) DEFAULT '--' "
            + ")";

    public ConnectionDB() {
        openConnection();
    }

    public void openConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("connected");
            stmt = connection.createStatement();
            //stmt.execute(CREATE_RECORDS_TABLE);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database connection error\n" + ex);
        }
    }

    public boolean addRecord(Record record) {
        try {
            String sql = "INSERT INTO RECORDS (REQUEST_ID, REQUEST_YEAR, HOSPITAL, SECTION, REQUEST_DATE, "
                    + "DEVICE_NAME, FACTORY_NAME, DEVICE_MODEL, DEVICE_SERIAL, DEVICE_TOOLS, REQUEST_STATUS) "
                    + "VALUES ('" + record.getREQUEST_ID() + "', '" + record.getREQUEST_YEAR() + "', '" + record.getHOSPITAL() + "', "
                    + "'" + record.getSECTION() + "', '" + record.getREQUEST_DATE() + "', '" + record.getDEVICE_NAME() + "', "
                    + "'" + record.getFACTORY_NAME() + "', '" + record.getDEVICE_MODEL() + "', '" + record.getDEVICE_SERIAL() + "', "
                    + "'" + record.getDEVICE_TOOLS() + "', '" + record.getREQUEST_STATUS() + "'"
                    + ")";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database connection error\n" + ex.getMessage());
            return false;
        }
        return true;
    }

    public ArrayList<Record> getAllRecords(String year, String hospital, String status) {
        ArrayList<Record> recordsList = new ArrayList<>();
        String sql = "";
        if (year.equals("الكل") && hospital.equals("الكل") && status.equals("الكل")) {
            sql = "SELECT * FROM RECORDS";
        } else if (year.equals("الكل") && hospital.equals("الكل") && !status.equals("الكل")) {
            sql = "SELECT * FROM RECORDS where REQUEST_STATUS='" + status + "'";
        } else if (year.equals("الكل") && !hospital.equals("الكل") && status.equals("الكل")) {
            sql = "SELECT * FROM RECORDS where HOSPITAL='" + hospital + "'";
        } else if (year.equals("الكل") && !hospital.equals("الكل") && !status.equals("الكل")) {
            sql = "SELECT * FROM RECORDS where HOSPITAL='" + hospital + "' and REQUEST_STATUS='" + status + "'";
        } else if (!year.equals("الكل") && hospital.equals("الكل") && status.equals("الكل")) {
            sql = "SELECT * FROM RECORDS where REQUEST_YEAR='" + year + "'";
        } else if (!year.equals("الكل") && hospital.equals("الكل") && !status.equals("الكل")) {
            sql = "SELECT * FROM RECORDS where REQUEST_YEAR='" + year + "' and REQUEST_STATUS='" + status + "'";
        } else if (!year.equals("الكل") && !hospital.equals("الكل") && status.equals("الكل")) {
            sql = "SELECT * FROM RECORDS where REQUEST_YEAR='" + year + "' and HOSPITAL='" + hospital + "'";
        } else {
            sql = "SELECT * FROM RECORDS where REQUEST_YEAR='" + year + "' and HOSPITAL='" + hospital + "' and REQUEST_STATUS='" + status + "'";
        }

        try {

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Record record = new Record();
                record.setID(rs.getBigDecimal("ID") + "");
                record.setREQUEST_ID(rs.getString("REQUEST_ID"));
                record.setREQUEST_YEAR(rs.getString("REQUEST_YEAR"));
                record.setHOSPITAL(rs.getString("HOSPITAL"));
                record.setSECTION(rs.getString("SECTION"));
                record.setREQUEST_DATE(rs.getString("REQUEST_DATE"));
                record.setDEVICE_NAME(rs.getString("DEVICE_NAME"));
                record.setFACTORY_NAME(rs.getString("FACTORY_NAME"));
                record.setDEVICE_MODEL(rs.getString("DEVICE_MODEL"));
                record.setDEVICE_SERIAL(rs.getString("DEVICE_SERIAL"));
                record.setDEVICE_TOOLS(rs.getString("DEVICE_TOOLS"));
                record.setREQUEST_STATUS(rs.getString("REQUEST_STATUS"));
                record.setPROCUREMENT(rs.getString("PROCUREMENT"));
                record.setRECEIVABLES(rs.getString("RECEIVABLES"));
                record.setPURCHASE_SOURCE(rs.getString("PURCHASE_SOURCE"));
                record.setAMOUNT(rs.getString("AMOUNT"));
                record.setPURCHASE_DATE(rs.getString("PURCHASE_DATE"));
                record.setGLASOUR_SERIAL(rs.getString("GLASOUR_SERIAL"));

                recordsList.add(record);
            }
            return recordsList;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database connection error\n" + ex.getMessage());
        }
        return recordsList;
    }

    public void updateRecord(Record record) {
        try {
            String sql = "UPDATE RECORDS set REQUEST_STATUS = '" + record.getREQUEST_STATUS() + "', PROCUREMENT = '"
                    + (record.getPROCUREMENT().equals("") ? "--" : record.getPROCUREMENT()) + "', "
                    + "RECEIVABLES = '" + (record.getRECEIVABLES().equals("") ? "--" : record.getRECEIVABLES()) + "', "
                    + "PURCHASE_SOURCE = '" + (record.getPURCHASE_SOURCE().equals("") ? "--" : record.getPURCHASE_SOURCE())
                    + "', AMOUNT = '" + (record.getAMOUNT().equals("") ? "0" : record.getAMOUNT()) + "', "
                    + "PURCHASE_DATE = '" + record.getPURCHASE_DATE() + "', GLASOUR_SERIAL = '"
                    + (record.getGLASOUR_SERIAL().equals("") ? "--" : record.getGLASOUR_SERIAL())
                    + "' where ID =  '" + record.getID() + "'";
            stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database connection error\n" + ex.getMessage());
        }
    }

    public double[] getCalculation(String year, String hospital) {
        double[] sum = new double[2];
        sum[0] = 0;
        sum[1] = 0;
        String sql = "";
        if (year.equals("الكل") && hospital.equals("الكل")) {
            sql = "SELECT * FROM RECORDS";
        } else if (year.equals("الكل") && !hospital.equals("الكل")) {
            sql = "SELECT * FROM RECORDS where HOSPITAL='" + hospital + "'";
        } else if (!year.equals("الكل") && hospital.equals("الكل")) {
            sql = "SELECT * FROM RECORDS where REQUEST_YEAR='" + year + "'";
        } else {
            sql = "SELECT * FROM RECORDS where REQUEST_YEAR='" + year + "' and HOSPITAL='" + hospital + "'";
        }

        try {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString("REQUEST_STATUS").equals("تم الشراء (سلفه)")) {
                    sum[0] += Double.parseDouble(rs.getString("AMOUNT"));
                } else {
                    sum[1] += Double.parseDouble(rs.getString("AMOUNT"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sum;
    }
    
    public int deleteAllRecord(){
        String sql="DELETE FROM RECORDS";
        int rs = 0;
        try {
            rs = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return rs;
    }
}
