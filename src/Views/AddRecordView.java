/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DataBase.ConnectionDB;
import Models.Record;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AddRecordView extends javax.swing.JFrame {

    ConnectionDB myDB = new ConnectionDB();

    /**
     * Creates new form AddRecordView
     */
    public AddRecordView() {
        initComponents();
        setAllErrorsDisable();
        setLocationRelativeTo(null);
        requestNoTF.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        hospitalCB = new javax.swing.JComboBox<>();
        sectionCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        requestNoTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateSpinner = new javax.swing.JSpinner();
        deviceNameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        factoryNameTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        modelTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        serialNoTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        toolsTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        requestStateCB = new javax.swing.JComboBox<>();
        AddRequestBtn = new javax.swing.JButton();
        CancelRequestBtn = new javax.swing.JButton();
        requestNoTF_label = new javax.swing.JLabel();
        deviceNameTF_label = new javax.swing.JLabel();
        factoryNameTF_label = new javax.swing.JLabel();
        modelTF_label = new javax.swing.JLabel();
        serialNoTF_label = new javax.swing.JLabel();
        toolsTF_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospitalCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hospitalCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "مستشفى الحسين", "مستشفى الملكة رانيا العبدالله للأطفال", "مستشفى الملكة علياء العسكري", "مستشفى الأميرة هيا بنت الحسين", "مستشفى الأمير راشد بن الحسن", "مستشفى الأمير علي بن الحسين", "مستشفى الأمير زيد بن الحسين", "مستشفى الأمير هاشم بن الحسين", "مستشفى الأمير هاشم بن عبدالله الثاني", "مركز معالجة الأورام", "مركز الملكة علياء لأمراض وجراحة القلب", "مركز الامير حسين لأمراض وجراحة الكلى", "مركز الأميرة إيمان للأبحاث والعلوم المخبرية", "مركز التأهيل الملكي", "مركز طبي الحسا", "مركز طبي القويرة", "أخرى" }));
        MainPanel.add(hospitalCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 83, 230, 36));

        sectionCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "العمليات", "ICU", "الطوارئ", "الأشعة", "التوليد", "الخداج", "العزل", "أخرى" }));
        MainPanel.add(sectionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 146, 175, 36));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("المستشفى:");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 93, 81, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("القسم:");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 156, 53, -1));

        requestNoTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        requestNoTF.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                requestNoTFInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        requestNoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                requestNoTFKeyTyped(evt);
            }
        });
        MainPanel.add(requestNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 24, 175, 36));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("رقم طلب الوارد:");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 33, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("تاريخ الطلب:");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 219, -1, -1));

        dateSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_WEEK_IN_MONTH));
        MainPanel.add(dateSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 210, 175, 36));

        deviceNameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deviceNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        deviceNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceNameTFActionPerformed(evt);
            }
        });
        deviceNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deviceNameTFKeyTyped(evt);
            }
        });
        MainPanel.add(deviceNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 24, 175, 36));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("اسم الجهاز:");
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 33, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("الشركة الصانعة:");
        MainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 93, -1, -1));

        factoryNameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        factoryNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        factoryNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                factoryNameTFKeyTyped(evt);
            }
        });
        MainPanel.add(factoryNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 84, 175, 36));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("الموديل:");
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 156, -1, -1));

        modelTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modelTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modelTFKeyTyped(evt);
            }
        });
        MainPanel.add(modelTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 147, 175, 36));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("الرقم التسلسلي:");
        MainPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 219, -1, -1));

        serialNoTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serialNoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        serialNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNoTFActionPerformed(evt);
            }
        });
        serialNoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                serialNoTFKeyTyped(evt);
            }
        });
        MainPanel.add(serialNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 210, 175, 36));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("القطع:");
        MainPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 282, -1, -1));

        toolsTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toolsTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toolsTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toolsTFKeyTyped(evt);
            }
        });
        MainPanel.add(toolsTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 273, 175, 36));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("حال الطلب:");
        MainPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 282, -1, -1));

        requestStateCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestStateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "تم الشراء (سلفه)", "تم الشراء (ذمم)", " قطع احتياطيه", "إصلاح", "قيد الاجراء", "موافقة مديرية" }));
        MainPanel.add(requestStateCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 272, 175, 36));

        AddRequestBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddRequestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-plus-25.png"))); // NOI18N
        AddRequestBtn.setText("اضافة الطلب");
        AddRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRequestBtnActionPerformed(evt);
            }
        });
        MainPanel.add(AddRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 390, 175, -1));

        CancelRequestBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CancelRequestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-cancel-25.png"))); // NOI18N
        CancelRequestBtn.setText("إلغاء الامر");
        CancelRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelRequestBtnActionPerformed(evt);
            }
        });
        MainPanel.add(CancelRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 390, 175, -1));

        requestNoTF_label.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        requestNoTF_label.setForeground(new java.awt.Color(255, 102, 0));
        requestNoTF_label.setText("هذا الحقل لا يمكن ان يكون فارغاً.");
        MainPanel.add(requestNoTF_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        deviceNameTF_label.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        deviceNameTF_label.setForeground(new java.awt.Color(255, 102, 0));
        deviceNameTF_label.setText("هذا الحقل لا يمكن ان يكون فارغاً.");
        MainPanel.add(deviceNameTF_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 140, -1));

        factoryNameTF_label.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        factoryNameTF_label.setForeground(new java.awt.Color(255, 102, 0));
        factoryNameTF_label.setText("هذا الحقل لا يمكن ان يكون فارغاً.");
        MainPanel.add(factoryNameTF_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 121, -1, -1));

        modelTF_label.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        modelTF_label.setForeground(new java.awt.Color(255, 102, 0));
        modelTF_label.setText("هذا الحقل لا يمكن ان يكون فارغاً.");
        MainPanel.add(modelTF_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 185, -1, -1));

        serialNoTF_label.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        serialNoTF_label.setForeground(new java.awt.Color(255, 102, 0));
        serialNoTF_label.setText("هذا الحقل لا يمكن ان يكون فارغاً.");
        MainPanel.add(serialNoTF_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 247, -1, -1));

        toolsTF_label.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        toolsTF_label.setForeground(new java.awt.Color(255, 102, 0));
        toolsTF_label.setText("هذا الحقل لا يمكن ان يكون فارغاً.");
        MainPanel.add(toolsTF_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deviceNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deviceNameTFActionPerformed

    private void serialNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNoTFActionPerformed

    private void AddRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRequestBtnActionPerformed
        setAllErrorsDisable();
        if(!validation(requestNoTF, requestNoTF_label) | !validation(deviceNameTF, deviceNameTF_label)
                | !validation(factoryNameTF, factoryNameTF_label) | !validation(modelTF, modelTF_label)
                | !validation(serialNoTF, serialNoTF_label) | !validation(toolsTF, toolsTF_label)) return;
        
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String spinnerValue = formater.format(dateSpinner.getValue());
        String spinnerYear = yearFormat.format(dateSpinner.getValue());
        System.out.println(spinnerValue);
        Record record = new Record(requestNoTF.getText(), spinnerYear,
                hospitalCB.getSelectedItem().toString(), sectionCB.getSelectedItem().toString(),
                spinnerValue, deviceNameTF.getText(), factoryNameTF.getText(), modelTF.getText(),
                serialNoTF.getText(), toolsTF.getText(), requestStateCB.getSelectedItem().toString());
        if (myDB.addRecord(record)) {
            JOptionPane.showMessageDialog(null, "تمت اضافة الطلب بنجاح.");
            clearFeilds();
        }
    }//GEN-LAST:event_AddRequestBtnActionPerformed

    private void CancelRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelRequestBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelRequestBtnActionPerformed

    private void requestNoTFInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_requestNoTFInputMethodTextChanged
        
    }//GEN-LAST:event_requestNoTFInputMethodTextChanged

    private void requestNoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_requestNoTFKeyTyped
        if(!requestNoTF.getText().isEmpty()) requestNoTF_label.setVisible(false);
    }//GEN-LAST:event_requestNoTFKeyTyped

    private void deviceNameTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deviceNameTFKeyTyped
        if(!deviceNameTF.getText().isEmpty()) deviceNameTF_label.setVisible(false);
    }//GEN-LAST:event_deviceNameTFKeyTyped

    private void factoryNameTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_factoryNameTFKeyTyped
        if(!factoryNameTF.getText().isEmpty()) factoryNameTF_label.setVisible(false);
    }//GEN-LAST:event_factoryNameTFKeyTyped

    private void modelTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelTFKeyTyped
        if(!modelTF.getText().isEmpty()) modelTF_label.setVisible(false);
    }//GEN-LAST:event_modelTFKeyTyped

    private void serialNoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialNoTFKeyTyped
        if(!serialNoTF.getText().isEmpty()) serialNoTF_label.setVisible(false);
    }//GEN-LAST:event_serialNoTFKeyTyped

    private void toolsTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toolsTFKeyTyped
        if(!toolsTF.getText().isEmpty()) toolsTF_label.setVisible(false);
    }//GEN-LAST:event_toolsTFKeyTyped

    public void clearFeilds() {
        requestNoTF.setText("");
        hospitalCB.setSelectedIndex(0);
        sectionCB.setSelectedIndex(0);
        deviceNameTF.setText("");
        factoryNameTF.setText("");
        modelTF.setText("");
        serialNoTF.setText("");
        toolsTF.setText("");
        requestStateCB.setSelectedIndex(0);
    }
    public boolean validation(javax.swing.JTextField tf, javax.swing.JLabel label){
        String text = tf.getText().toString();
        if(text.isEmpty()){
            label.setVisible(true);
            return false;
        }
        return true;
    }
    public void setAllErrorsDisable(){
        requestNoTF_label.setVisible(false);
        deviceNameTF_label.setVisible(false);
        factoryNameTF_label.setVisible(false);
        modelTF_label.setVisible(false);
        serialNoTF_label.setVisible(false);
        toolsTF_label.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRequestBtn;
    private javax.swing.JButton CancelRequestBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JTextField deviceNameTF;
    private javax.swing.JLabel deviceNameTF_label;
    private javax.swing.JTextField factoryNameTF;
    private javax.swing.JLabel factoryNameTF_label;
    private javax.swing.JComboBox<String> hospitalCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField modelTF;
    private javax.swing.JLabel modelTF_label;
    private javax.swing.JTextField requestNoTF;
    private javax.swing.JLabel requestNoTF_label;
    private javax.swing.JComboBox<String> requestStateCB;
    private javax.swing.JComboBox<String> sectionCB;
    private javax.swing.JTextField serialNoTF;
    private javax.swing.JLabel serialNoTF_label;
    private javax.swing.JTextField toolsTF;
    private javax.swing.JLabel toolsTF_label;
    // End of variables declaration//GEN-END:variables
}
