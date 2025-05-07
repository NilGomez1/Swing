package view.gui;

import ficheros.ClassFichero;
import exceptions.InvalidUserDataException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import model.validations.UserDataValidations;
import javax.swing.JOptionPane;
/**
 *
 * @author nilgomcap
 */
public class JFrameMain extends javax.swing.JFrame {

    public JFrameMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
        // Código de inicialización de componentes (sin cambios)
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelNif = new javax.swing.JLabel();
        jTextFieldNif = new javax.swing.JTextField();
        jButtonValidation = new javax.swing.JButton();
        jLabelErrName = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail1 = new javax.swing.JLabel();
        jTextFieldBirthdate = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jLabelErrEmail = new javax.swing.JLabel();
        jLabelErrBirth = new javax.swing.JLabel();
        jLabelErrAge = new javax.swing.JLabel();
        jLabelErrNif = new javax.swing.JLabel();
        jLabelZip = new javax.swing.JLabel();
        jTextFieldZip = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelErrZip = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitle.setText("VALIDADOR DATOS USUARIO");

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-02-03 083143.png"))); // NOI18N

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelName.setText("Name:");

        jLabelNif.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNif.setText("DNI/NIF:");

        jButtonValidation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonValidation.setText("Validate");
        jButtonValidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidationActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmail.setText("Email:");

        jLabelEmail1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmail1.setText("Birthdate:");

        jLabelAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelAge.setText("Age");

        jLabelZip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelZip.setText("ZIP");

        jTextFieldZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldZipActionPerformed(evt);
            }
        });

        jTextFieldAge.setEditable(false);

        jButtonClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonCSV.setText("CSV");
        jButtonCSV.setToolTipText("");
        jButtonCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLogo)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNif)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNif, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelEmail1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelAge)
                                        .addGap(12, 12, 12)
                                        .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelZip)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldZip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelErrName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrAge, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrNif, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrZip, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonValidation)
                                .addGap(74, 74, 74)
                                .addComponent(jButtonClear)
                                .addGap(57, 57, 57)
                                .addComponent(jButtonCSV)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelErrName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNif)
                    .addComponent(jTextFieldNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrNif, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail1)
                    .addComponent(jTextFieldBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAge)
                        .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelErrAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelZip)
                    .addComponent(jTextFieldZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrZip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidation)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonCSV))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidationActionPerformed
        String Name = jTextFieldName.getText();
    String NIF = jTextFieldNif.getText();
    String Email = jTextFieldEmail.getText();
    String Birth = jTextFieldBirthdate.getText();
    String ZIP = jTextFieldZip.getText();
    int age = 0;
    boolean error = false;

    try {
        // Validación del nombre
        if (!UserDataValidations.checkName(Name)) {
            jLabelErrName.setText("incorrect name!");
            error = true;
        } else {
            jTextFieldName.setEditable(false);
            jLabelErrName.setText("");
        }

        // Validación del NIF
        if (!UserDataValidations.checkId(1, NIF)) {
            jLabelErrNif.setText("incorrect NIF!");
            error = true;
        } else {
            jTextFieldNif.setEditable(false);
            jLabelErrNif.setText("");
        }

        // Validación del correo electrónico
        if (!UserDataValidations.checkEmail(Email)) {
            jLabelErrEmail.setText("incorrect e-mail!");
            error = true;
        } else {
            jTextFieldEmail.setEditable(false);
            jLabelErrEmail.setText("");
        }

        // Validación de la fecha de nacimiento
        if (!UserDataValidations.checkFormatDate(Birth)) {
            jLabelErrBirth.setText("incorrect birthday!");
            error = true;
        } else {
            age = UserDataValidations.calculateAge(Birth);
            jTextFieldAge.setText(String.valueOf(age));
            jTextFieldAge.setEditable(false);
            jTextFieldBirthdate.setEditable(false);
            jLabelErrBirth.setText("");
        }

        // Validación del código postal
        if (!UserDataValidations.checkPostalCode(ZIP)) {
            jLabelErrZip.setText("incorrect ZIP!");
            error = true;
        } else {
            jTextFieldZip.setEditable(false);
            jLabelErrZip.setText("");
        }

    } catch (InvalidUserDataException ex) {
        // Mostrar el mensaje de error de validación
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        error = true;
    }

    // Habilitar o deshabilitar el botón CSV según el estado de las validaciones
    jButtonCSV.setEnabled(!error);
    }//GEN-LAST:event_jButtonValidationActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
            jButtonValidation.setEnabled(true);
    jButtonCSV.setEnabled(false);
    jTextFieldName.setText("");
    jTextFieldNif.setText("");
    jTextFieldEmail.setText("");
    jTextFieldBirthdate.setText("");
    jTextFieldZip.setText("");
    jTextFieldAge.setText("");
    jTextFieldZip.setText("");

    // Limpiar los mensajes de error
    jLabelErrName.setText("");
    jLabelErrNif.setText("");
    jLabelErrEmail.setText("");
    jLabelErrBirth.setText("");
    jLabelErrZip.setText("");

    // Volver a habilitar los campos de texto para edición
    jTextFieldName.setEditable(true);
    jTextFieldNif.setEditable(true);
    jTextFieldEmail.setEditable(true);
    jTextFieldBirthdate.setEditable(true);
    jTextFieldZip.setEditable(true);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCSVActionPerformed
        try (PrintWriter writer = new PrintWriter(new FileWriter("user_data_NGC.csv", true))) {
                String name = jTextFieldName.getText();
                String nif = jTextFieldNif.getText();
                String email = jTextFieldEmail.getText();
                String birthdate = jTextFieldBirthdate.getText();
                String age = jTextFieldAge.getText();
                String zip = jTextFieldZip.getText();

                writer.printf("%s,%s,%s,%s,%s,%s%n", name, nif, email, birthdate, age, zip);

                javax.swing.JOptionPane.showMessageDialog(this, "Datos guardados correctamente en CSV.");

                jButtonCSV.setEnabled(false);
            } catch (IOException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar el archivo CSV: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButtonCSVActionPerformed

    private void jTextFieldZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldZipActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {

        ClassFichero.createFile("user_data_NGC.csv");
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCSV;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonValidation;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelErrAge;
    private javax.swing.JLabel jLabelErrBirth;
    private javax.swing.JLabel jLabelErrEmail;
    private javax.swing.JLabel jLabelErrName;
    private javax.swing.JLabel jLabelErrNif;
    private javax.swing.JLabel jLabelErrZip;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNif;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelZip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldBirthdate;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNif;
    private javax.swing.JTextField jTextFieldZip;
    // End of variables declaration//GEN-END:variables

}