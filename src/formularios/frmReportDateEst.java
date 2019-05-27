package formularios;

import BD.ConexionBD;
import java.net.URL;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Dan Arevalo
 */
public class frmReportDateEst extends javax.swing.JFrame {

    private final String generar[] = {"<Seleccionar una opción>", "Diario", "Intervalo"};
    private final ComboBoxModel modeloGenerar = new DefaultComboBoxModel(generar);
    private final ConexionBD conn = new ConexionBD();
    private final URL jrxml = this.getClass().getResource("/Reportes/asistenciaAlumnos.jrxml");
    private final URL jasper = this.getClass().getResource("/Reportes/asistenciaAlumnos.jasper");
    private final URL pdf = this.getClass().getResource("/Reporte/asistenciaAlumnos.pdf");

    /**
     * Creates new form NewJFrame
     */
    public frmReportDateEst() {
        initComponents();
        inhabilitar();
        this.setLocationRelativeTo(null);
    }

    void inhabilitar() {
        lblFechaIn.setVisible(false);
        lblFechaOut.setVisible(false);
        txtFechaIn.setVisible(false);
        txtFechaOut.setVisible(false);

        btnGenerarDate.setVisible(false);
        btnGenerar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbGenerar = new javax.swing.JComboBox<>();
        btnGenerar = new javax.swing.JButton();
        btnGenerarDate = new javax.swing.JButton();
        lblFechaIn = new javax.swing.JLabel();
        lblFechaOut = new javax.swing.JLabel();
        txtFechaOut = new javax.swing.JTextField();
        txtFechaIn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Generar Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cmbGenerar.setModel(modeloGenerar);
        cmbGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenerarActionPerformed(evt);
            }
        });

        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnGenerarDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerarDate.setText("GENERAR");
        btnGenerarDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarDateActionPerformed(evt);
            }
        });

        lblFechaIn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFechaIn.setText("Fecha de Inicio:");

        lblFechaOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFechaOut.setText("Fecha Final:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cmbGenerar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaIn)
                            .addComponent(lblFechaOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnGenerarDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaIn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaOut))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenerarActionPerformed
        String seleccion = (String) cmbGenerar.getSelectedItem();

        switch (seleccion) {
            case "Diario":
                inhabilitar();
                btnGenerar.setVisible(true);
                break;

            case "Intervalo":
                inhabilitar();
                lblFechaIn.setVisible(true);
                lblFechaOut.setVisible(true);
                txtFechaIn.setVisible(true);
                txtFechaOut.setVisible(true);
                btnGenerarDate.setVisible(true);
                break;

            case "<Seleccionar una opción>":
                inhabilitar();
                break;
        }
    }//GEN-LAST:event_cmbGenerarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        conn.startReport("Estudiantes", jasper);
        cmbGenerar.setModel(modeloGenerar);
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnGenerarDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarDateActionPerformed
        String fechaIn = txtFechaIn.getText();
        String fechaOut = txtFechaOut.getText();
        conn.startReportDate("Estudiantes", jasper, fechaIn, fechaOut);
        cmbGenerar.setModel(modeloGenerar);
    }//GEN-LAST:event_btnGenerarDateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportDateEst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmReportDateEst().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGenerarDate;
    private javax.swing.JComboBox<String> cmbGenerar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFechaIn;
    private javax.swing.JLabel lblFechaOut;
    private javax.swing.JTextField txtFechaIn;
    private javax.swing.JTextField txtFechaOut;
    // End of variables declaration//GEN-END:variables
}
