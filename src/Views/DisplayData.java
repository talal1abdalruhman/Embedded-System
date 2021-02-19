/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DataBase.ConnectionDB;
import Models.Record;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Lenovo
 */
public class DisplayData extends javax.swing.JFrame {

    ConnectionDB myDB = new ConnectionDB();

    public DisplayData() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        DisplayData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yearsCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Extract2Excel = new javax.swing.JButton();
        updateRecord = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hospitalCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Req_status_CB = new javax.swing.JComboBox<>();
        deleteAllBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        yearsCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الكل", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        yearsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsCBActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "تاريخ الطلب", "المستشفى", "القسم", "رقم الطلب", "اسم الجهاز", "الشركة الصانعة", "الموديل", "الرقم التسلسلي", "القطع", "حالة الطلب", "صادر المشتريات", "صادر الذمم", "مصدر الشراء", "القيمة", "التاريخ", "التسلسل في الجلاسور"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Extract2Excel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Extract2Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-export-excel-25.png"))); // NOI18N
        Extract2Excel.setText("استخراج البيانات ");
        Extract2Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Extract2ExcelActionPerformed(evt);
            }
        });

        updateRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-edit-property-25.png"))); // NOI18N
        updateRecord.setText("تعديل الطلب");
        updateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-restore-25.png"))); // NOI18N
        refreshBtn.setText("تحديث");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("السنة:");

        hospitalCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hospitalCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الكل", "مستشفى الحسين", "مستشفى الملكة رانيا العبدالله للأطفال", "مستشفى الملكة علياء العسكري", "مستشفى الأميرة هيا بنت الحسين", "مستشفى الأمير راشد بن الحسن", "مستشفى الأمير علي بن الحسين", "مستشفى الأمير زيد بن الحسين", "مستشفى الأمير هاشم بن الحسين", "مستشفى الأمير هاشم بن عبدالله الثاني", "مركز معالجة الأورام", "مركز الملكة علياء لأمراض وجراحة القلب", "مركز الامير حسين لأمراض وجراحة الكلى", "مركز الأميرة إيمان للأبحاث والعلوم المخبرية", "مركز التأهيل الملكي", "مركز طبي الحسا", "مركز طبي القويرة", "أخرى" }));
        hospitalCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalCBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("المستشفى:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("حالة الطلب:");

        Req_status_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Req_status_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الكل", "تم الشراء (سلفه)", "تم الشراء (ذمم)", " قطع احتياطيه", "إصلاح", "قيد الاجراء", "موافقة مديرية" }));
        Req_status_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Req_status_CBActionPerformed(evt);
            }
        });

        deleteAllBtn.setText("حذف الكل");
        deleteAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteAllBtn)
                .addGap(18, 18, 18)
                .addComponent(Extract2Excel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(updateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Req_status_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(hospitalCB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(yearsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yearsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hospitalCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(Req_status_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Extract2Excel)
                            .addComponent(refreshBtn)
                            .addComponent(updateRecord)
                            .addComponent(deleteAllBtn))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsCBActionPerformed

        DisplayData();
    }//GEN-LAST:event_yearsCBActionPerformed

    private void Extract2ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Extract2ExcelActionPerformed
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter(".xlsx", "Excel file"));
        fileChooser.setDialogTitle("Specify a file to save");
        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filter = fileChooser.getFileFilter().getDescription();
            String path = fileToSave.getAbsolutePath() + filter;
            System.out.println("Save as file: " + path);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet ws = wb.createSheet();

            XSSFRow titleRow = ws.createRow(0);
            for (int i = 1; i < model.getColumnCount(); i++) {
                XSSFCell cell = titleRow.createCell(i - 1);
                cell.setCellValue(model.getColumnName(i));
            }

            for (int i = 1; i < model.getRowCount(); i++) {
                XSSFRow row = ws.createRow(i);
                for (int j = 1; j < model.getColumnCount(); j++) {
                    XSSFCell cell = row.createCell(j - 1);
                    cell.setCellValue(model.getValueAt(i, j).toString());
                }
            }
            try {
                FileOutputStream excelFOS = new FileOutputStream(path);
                BufferedOutputStream excelBOS = new BufferedOutputStream(excelFOS);
                wb.write(excelBOS);
                excelBOS.close();
                excelFOS.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_Extract2ExcelActionPerformed

    private void updateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordActionPerformed

        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            String id = jTable1.getModel().getValueAt(row, 0).toString();
            String status = jTable1.getModel().getValueAt(row, 10).toString();
            UpdateRecord updateRecord = new UpdateRecord();
            updateRecord.getRecordId(id, status);
            updateRecord.setLocationRelativeTo(this);
            updateRecord.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Select row to update !");
        }
    }//GEN-LAST:event_updateRecordActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        DisplayData();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void hospitalCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalCBActionPerformed
        DisplayData();
    }//GEN-LAST:event_hospitalCBActionPerformed

    private void Req_status_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Req_status_CBActionPerformed
        DisplayData();
    }//GEN-LAST:event_Req_status_CBActionPerformed

    private void deleteAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllBtnActionPerformed
        int rs = myDB.deleteAllRecord();
        System.out.println("records deleted successfully =" + rs);
        DisplayData();
    }//GEN-LAST:event_deleteAllBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    private void DisplayData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().clear();

        String selectedYear = yearsCB.getSelectedItem().toString();
        String selectedHospital = hospitalCB.getSelectedItem().toString();
        String selectedStatus = Req_status_CB.getSelectedItem().toString();
        System.out.println(selectedYear + "\t" + selectedHospital);

        ArrayList<Record> recordList = refreshRecords(selectedYear, selectedHospital, selectedStatus);
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        recordList.stream().forEach((current) -> {
            tblModel.addRow(new Object[]{current.getID(), current.getREQUEST_DATE(), current.getHOSPITAL(),
                current.getSECTION(), current.getREQUEST_ID(), current.getDEVICE_NAME(), current.getFACTORY_NAME(),
                current.getDEVICE_MODEL(), current.getDEVICE_SERIAL(), current.getDEVICE_TOOLS(), current.getREQUEST_STATUS(),
                current.getPROCUREMENT(), current.getRECEIVABLES(), current.getPURCHASE_SOURCE(), current.getAMOUNT(),
                current.getPURCHASE_DATE(), current.getGLASOUR_SERIAL()});
        });
        tblModel.fireTableDataChanged();
    }

    private ArrayList<Record> refreshRecords(String year, String hospital, String status) {
        return myDB.getAllRecords(year, hospital, status);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Extract2Excel;
    private javax.swing.JComboBox<String> Req_status_CB;
    private javax.swing.JButton deleteAllBtn;
    private javax.swing.JComboBox<String> hospitalCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton updateRecord;
    private javax.swing.JComboBox<String> yearsCB;
    // End of variables declaration//GEN-END:variables
}
