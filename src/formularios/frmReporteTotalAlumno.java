package formularios;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Alumnos;

/**
 *
 * @author Dan Arevalo
 */
public class frmReporteTotalAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmReporteTotalAlumno
     */
    public frmReporteTotalAlumno() {
        initComponents();
        mostrar("");
    }
    
    void ancho_columnas() {
        //Nombre
        tablalistadoEst.getColumnModel().getColumn(1).setMaxWidth(150);
        tablalistadoEst.getColumnModel().getColumn(1).setMinWidth(120);
        //P. Apellido
        tablalistadoEst.getColumnModel().getColumn(2).setMaxWidth(100);
        tablalistadoEst.getColumnModel().getColumn(2).setMinWidth(80);
        //S. Apellido
        tablalistadoEst.getColumnModel().getColumn(3).setMaxWidth(100);
        tablalistadoEst.getColumnModel().getColumn(3).setMinWidth(80);
        //Identificación
        tablalistadoEst.getColumnModel().getColumn(4).setMaxWidth(95);
        tablalistadoEst.getColumnModel().getColumn(4).setMinWidth(90);
        //Dirección
        tablalistadoEst.getColumnModel().getColumn(5).setMaxWidth(150);
        tablalistadoEst.getColumnModel().getColumn(5).setMinWidth(100);
        //Género
        tablalistadoEst.getColumnModel().getColumn(6).setMaxWidth(75);
        tablalistadoEst.getColumnModel().getColumn(6).setMinWidth(75);
        //Fecha de Nacimiento
        tablalistadoEst.getColumnModel().getColumn(7).setMaxWidth(130);
        tablalistadoEst.getColumnModel().getColumn(7).setMinWidth(130);
        //Fecha de Registro
        tablalistadoEst.getColumnModel().getColumn(8).setMaxWidth(115);
        tablalistadoEst.getColumnModel().getColumn(8).setMinWidth(115);
        //Grado
        tablalistadoEst.getColumnModel().getColumn(9).setMaxWidth(70);
        tablalistadoEst.getColumnModel().getColumn(9).setMinWidth(70);
        //Grupo
        tablalistadoEst.getColumnModel().getColumn(10).setMaxWidth(50);
        tablalistadoEst.getColumnModel().getColumn(10).setMinWidth(50);
        //Teléfono
        tablalistadoEst.getColumnModel().getColumn(11).setMaxWidth(90);
        tablalistadoEst.getColumnModel().getColumn(11).setMinWidth(90);
        //Sede
        tablalistadoEst.getColumnModel().getColumn(12).setMaxWidth(60);
        tablalistadoEst.getColumnModel().getColumn(12).setMinWidth(60);
        //Jornada
        tablalistadoEst.getColumnModel().getColumn(13).setMaxWidth(150);
        tablalistadoEst.getColumnModel().getColumn(13).setMinWidth(100); 
        
        /* ------------------------------------------------------------- */
        
        //Nombre
        tablalistadoDocen.getColumnModel().getColumn(1).setMaxWidth(150);
        tablalistadoDocen.getColumnModel().getColumn(1).setMinWidth(120);
        //P. Apellido
        tablalistadoDocen.getColumnModel().getColumn(2).setMaxWidth(100);
        tablalistadoDocen.getColumnModel().getColumn(2).setMinWidth(80);
        //S. Apellido
        tablalistadoDocen.getColumnModel().getColumn(3).setMaxWidth(100);
        tablalistadoDocen.getColumnModel().getColumn(3).setMinWidth(80);
        //Identificación
        tablalistadoDocen.getColumnModel().getColumn(4).setMaxWidth(90);
        tablalistadoDocen.getColumnModel().getColumn(4).setMinWidth(90);
        //Direccion
        tablalistadoDocen.getColumnModel().getColumn(5).setMaxWidth(150);
        tablalistadoDocen.getColumnModel().getColumn(5).setMinWidth(100);
        //Email
        tablalistadoDocen.getColumnModel().getColumn(6).setMaxWidth(250);
        tablalistadoDocen.getColumnModel().getColumn(6).setMinWidth(210);
        //Género
        tablalistadoDocen.getColumnModel().getColumn(7).setMaxWidth(80);
        tablalistadoDocen.getColumnModel().getColumn(7).setMinWidth(80);
        //Fecha de Nacimiento
        tablalistadoDocen.getColumnModel().getColumn(8).setMaxWidth(130);
        tablalistadoDocen.getColumnModel().getColumn(8).setMinWidth(130);
        //Materia
        tablalistadoDocen.getColumnModel().getColumn(9).setMaxWidth(100);
        tablalistadoDocen.getColumnModel().getColumn(9).setMinWidth(100);
        //Teléfono
        tablalistadoDocen.getColumnModel().getColumn(10).setMaxWidth(100);
        tablalistadoDocen.getColumnModel().getColumn(10).setMinWidth(100);
        
        /* ------------------------------------------------------------- */
        
        //Cargo
        tablalistadoAdmin.getColumnModel().getColumn(1).setMaxWidth(100);
        tablalistadoAdmin.getColumnModel().getColumn(1).setMinWidth(100);
        //Nombre
        tablalistadoAdmin.getColumnModel().getColumn(2).setMaxWidth(150);
        tablalistadoAdmin.getColumnModel().getColumn(2).setMinWidth(100);
        //P. Apellido
        tablalistadoAdmin.getColumnModel().getColumn(3).setMaxWidth(100);
        tablalistadoAdmin.getColumnModel().getColumn(3).setMinWidth(80);
        //S. Apellido
        tablalistadoAdmin.getColumnModel().getColumn(4).setMaxWidth(100);
        tablalistadoAdmin.getColumnModel().getColumn(4).setMinWidth(80);
        //Identificación
        tablalistadoAdmin.getColumnModel().getColumn(5).setMaxWidth(90);
        tablalistadoAdmin.getColumnModel().getColumn(5).setMinWidth(90);
        //Dirección
        tablalistadoAdmin.getColumnModel().getColumn(6).setMaxWidth(150);
        tablalistadoAdmin.getColumnModel().getColumn(6).setMinWidth(100);
        //Email
        tablalistadoAdmin.getColumnModel().getColumn(7).setMaxWidth(250);
        tablalistadoAdmin.getColumnModel().getColumn(7).setMinWidth(210);
        //Género
        tablalistadoAdmin.getColumnModel().getColumn(8).setMaxWidth(80);
        tablalistadoAdmin.getColumnModel().getColumn(8).setMinWidth(80);
        //Fecha de Nacimiento
        tablalistadoAdmin.getColumnModel().getColumn(9).setMaxWidth(130);
        tablalistadoAdmin.getColumnModel().getColumn(9).setMinWidth(130);
        //Fecha de Ingreso
        tablalistadoAdmin.getColumnModel().getColumn(10).setMaxWidth(110);
        tablalistadoAdmin.getColumnModel().getColumn(10).setMinWidth(110);
        //Teléfono
        tablalistadoAdmin.getColumnModel().getColumn(11).setMaxWidth(90);
        tablalistadoAdmin.getColumnModel().getColumn(11).setMinWidth(90);
    }
    
    void ocultar_columnas() {
        tablalistadoEst.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoEst.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoEst.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tablalistadoDocen.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoDocen.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoDocen.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tablalistadoAdmin.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoAdmin.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoAdmin.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modeloEst, modeloDocen, modeloAdmin;
            Alumnos func = new Alumnos();
            modeloEst = func.mostrarvista_salidapersonal(buscar);
            modeloDocen = func.mostrarvista_salidapersonalDocen(buscar);
            modeloAdmin = func.mostrarvista_salidapersonalAdmin(buscar);

            tablalistadoEst.setModel(modeloEst);
            tablalistadoDocen.setModel(modeloDocen);
            tablalistadoAdmin.setModel(modeloAdmin);
            ocultar_columnas();
            ancho_columnas();
            lbltotalregistros.setText("Total Registros: " + Integer.toString(func.totalEst + func.totalDocen + func.totalAdmin));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablalistadoEst = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablalistadoDocen = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablalistadoAdmin = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista del Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14))); // NOI18N
        jPanel2.setFocusTraversalPolicyProvider(true);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Buscar:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/211.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        lbltotalregistros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotalregistros.setText("Registros:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Identificación:");
        jLabel17.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Estudiantes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Docentes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Administrativos");

        tablalistadoEst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablalistadoEst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablalistadoEst);

        tablalistadoDocen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablalistadoDocen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tablalistadoDocen);

        tablalistadoAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablalistadoAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablalistadoAdmin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(970, Short.MAX_VALUE)
                .addComponent(lbltotalregistros)
                .addGap(140, 140, 140))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(766, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane5)
            .addComponent(jScrollPane6)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        mostrar(txtBuscar.getText().trim());
        txtBuscar.setText("");
        transferFocus();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        mostrar(txtBuscar.getText().trim());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtBuscar.setText("");
            transferFocus();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9')
            evt.consume();
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistadoAdmin;
    private javax.swing.JTable tablalistadoDocen;
    private javax.swing.JTable tablalistadoEst;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
