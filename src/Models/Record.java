package Models;

public class Record {

    private String ID, REQUEST_ID, REQUEST_YEAR, HOSPITAL, SECTION, REQUEST_DATE, DEVICE_NAME, FACTORY_NAME, DEVICE_MODEL,
            DEVICE_SERIAL, DEVICE_TOOLS, REQUEST_STATUS, PROCUREMENT, RECEIVABLES,
            PURCHASE_SOURCE, AMOUNT, PURCHASE_DATE, GLASOUR_SERIAL;

    public Record() {
    }

    public Record(String REQUEST_ID, String REQUEST_YEAR, String HOSPITAL, String SECTION, String REQUEST_DATE, String DEVICE_NAME, String FACTORY_NAME, String DEVICE_MODEL, String DEVICE_SERIAL, String DEVICE_TOOLS, String REQUEST_STATUS) {
        this.REQUEST_ID = REQUEST_ID;
        this.REQUEST_YEAR = REQUEST_YEAR;
        this.HOSPITAL = HOSPITAL;
        this.SECTION = SECTION;
        this.REQUEST_DATE = REQUEST_DATE;
        this.DEVICE_NAME = DEVICE_NAME;
        this.FACTORY_NAME = FACTORY_NAME;
        this.DEVICE_MODEL = DEVICE_MODEL;
        this.DEVICE_SERIAL = DEVICE_SERIAL;
        this.DEVICE_TOOLS = DEVICE_TOOLS;
        this.REQUEST_STATUS = REQUEST_STATUS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getREQUEST_ID() {
        return REQUEST_ID;
    }

    public void setREQUEST_ID(String REQUEST_ID) {
        this.REQUEST_ID = REQUEST_ID;
    }

    public String getREQUEST_YEAR() {
        return REQUEST_YEAR;
    }

    public void setREQUEST_YEAR(String REQUEST_YEAR) {
        this.REQUEST_YEAR = REQUEST_YEAR;
    }

    public String getHOSPITAL() {
        return HOSPITAL;
    }

    public void setHOSPITAL(String HOSPITAL) {
        this.HOSPITAL = HOSPITAL;
    }

    public String getSECTION() {
        return SECTION;
    }

    public void setSECTION(String SECTION) {
        this.SECTION = SECTION;
    }

    public String getREQUEST_DATE() {
        return REQUEST_DATE;
    }

    public void setREQUEST_DATE(String REQUEST_DATE) {
        this.REQUEST_DATE = REQUEST_DATE;
    }

    public String getDEVICE_NAME() {
        return DEVICE_NAME;
    }

    public void setDEVICE_NAME(String DEVICE_NAME) {
        this.DEVICE_NAME = DEVICE_NAME;
    }

    public String getFACTORY_NAME() {
        return FACTORY_NAME;
    }

    public void setFACTORY_NAME(String FACTORY_NAME) {
        this.FACTORY_NAME = FACTORY_NAME;
    }

    public String getDEVICE_MODEL() {
        return DEVICE_MODEL;
    }

    public void setDEVICE_MODEL(String DEVICE_MODEL) {
        this.DEVICE_MODEL = DEVICE_MODEL;
    }

    public String getDEVICE_SERIAL() {
        return DEVICE_SERIAL;
    }

    public void setDEVICE_SERIAL(String DEVICE_SERIAL) {
        this.DEVICE_SERIAL = DEVICE_SERIAL;
    }

    public String getDEVICE_TOOLS() {
        return DEVICE_TOOLS;
    }

    public void setDEVICE_TOOLS(String DEVICE_TOOLS) {
        this.DEVICE_TOOLS = DEVICE_TOOLS;
    }

    public String getREQUEST_STATUS() {
        return REQUEST_STATUS;
    }

    public void setREQUEST_STATUS(String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }

    public String getPROCUREMENT() {
        return PROCUREMENT;
    }

    public void setPROCUREMENT(String PROCUREMENT) {
        this.PROCUREMENT = PROCUREMENT;
    }

    public String getRECEIVABLES() {
        return RECEIVABLES;
    }

    public void setRECEIVABLES(String RECEIVABLES) {
        this.RECEIVABLES = RECEIVABLES;
    }

    public String getPURCHASE_SOURCE() {
        return PURCHASE_SOURCE;
    }

    public void setPURCHASE_SOURCE(String PURCHASE_SOURCE) {
        this.PURCHASE_SOURCE = PURCHASE_SOURCE;
    }

    public String getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getPURCHASE_DATE() {
        return PURCHASE_DATE;
    }

    public void setPURCHASE_DATE(String PURCHASE_DATE) {
        this.PURCHASE_DATE = PURCHASE_DATE;
    }

    public String getGLASOUR_SERIAL() {
        return GLASOUR_SERIAL;
    }

    public void setGLASOUR_SERIAL(String GLASOUR_SERIAL) {
        this.GLASOUR_SERIAL = GLASOUR_SERIAL;
    }

}
