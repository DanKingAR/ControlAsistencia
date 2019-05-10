package formularios;

import BD.ConexionBD;
import java.net.URL;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Dan Arevalo
 */
public class frmCarnet extends javax.swing.JInternalFrame {

    private final String generar[] = {"<Seleccionar una opción>", "Estudiantil", "Docente", "Administrativo"};
    private final ComboBoxModel modeloGenerar = new DefaultComboBoxModel(generar);
    private final ConexionBD conn = new ConexionBD();
    private final URL estudiantil = this.getClass().getResource("/Reportes/carnetEstudiantil.jasper");
    private final URL docente = this.getClass().getResource("/Reportes/carnetDocencia.jasper");
    private final URL admin = this.getClass().getResource("/Reportes/carnetAdministrativo.jasper");

    /**
     * Creates new form frmCarnet
     */
    public frmCarnet() {
        initComponents();
        lblDni.setVisible(false);
        txtDni.setVisible(false);
        btnCarnet.setVisible(false);
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
        txtDni = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        btnCarnet = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Generar Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cmbGenerar.setModel(modeloGenerar);
        cmbGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenerarActionPerformed(evt);
            }
        });

        lblDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDni.setText("Identificación: ");

        btnCarnet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCarnet.setText("Generar Carnet");
        btnCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarnetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cmbGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDni)
                        .addGap(18, 18, 18)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarnetActionPerformed
        int seleccion = cmbGenerar.getSelectedIndex();
        String dni = txtDni.getText();

        switch (seleccion) {
            case 1:
                lblDni.setVisible(true);
                txtDni.setVisible(true);
                btnCarnet.setVisible(true);
                conn.carnet("Estudiantil", estudiantil, dni);
                txtDni.setText("");
                break;

            case 2:
                lblDni.setVisible(true);
                txtDni.setVisible(true);
                btnCarnet.setVisible(true);
                conn.carnet("Docencia", docente, dni);
                txtDni.setText("");
                break;

            case 3:
                lblDni.setVisible(true);
                txtDni.setVisible(true);
                btnCarnet.setVisible(true);
                conn.carnet("Administrativo", admin, dni);
                txtDni.setText("");
                break;

            case 0:
                lblDni.setVisible(false);
                txtDni.setVisible(false);
                btnCarnet.setVisible(false);
                txtDni.setText("");
                break;
        }
    }//GEN-LAST:event_btnCarnetActionPerformed

    private void cmbGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenerarActionPerformed
        int seleccion = cmbGenerar.getSelectedIndex();

        switch (seleccion) {
            case 1:
                lblDni.setVisible(true);
                txtDni.setVisible(true);
                txtDni.setText("");
                btnCarnet.setVisible(true);
                break;

            case 2:
                lblDni.setVisible(true);
                txtDni.setVisible(true);
                txtDni.setText("");
                btnCarnet.setVisible(true);
                break;

            case 3:
                lblDni.setVisible(true);
                txtDni.setVisible(true);
                txtDni.setText("");
                btnCarnet.setVisible(true);
                break;

            case 0:
                lblDni.setVisible(false);
                txtDni.setVisible(false);
                txtDni.setText("");
                btnCarnet.setVisible(false);
                break;
        }
    }//GEN-LAST:event_cmbGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarnet;
    private javax.swing.JComboBox<String> cmbGenerar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}