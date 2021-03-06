package formularios;

import java.beans.PropertyVetoException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dan Arevalo
 */
public class PanelInicio extends javax.swing.JFrame implements Runnable{
    
    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    int x, y;
    
    public PanelInicio() {
        initComponents();
        this.setExtendedState(PanelInicio.MAXIMIZED_BOTH);
        this.setTitle("SISTEMA DE CONTROL DE ASISTENCIA");
        
        h1 = new Thread(this);
        h1.start();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        lblHora = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        lblFApellido = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblidtratabajor = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        menuArchivo = new javax.swing.JMenu();
        administrativo = new javax.swing.JMenuItem();
        docente = new javax.swing.JMenuItem();
        estudiante = new javax.swing.JMenuItem();
        cargos = new javax.swing.JMenuItem();
        menuRegistro = new javax.swing.JMenu();
        permisoEstudiante = new javax.swing.JMenuItem();
        permisoDocente = new javax.swing.JMenuItem();
        permisoAdmin = new javax.swing.JMenuItem();
        menuAsistencia = new javax.swing.JMenu();
        IngresoEst = new javax.swing.JMenuItem();
        salidaEst = new javax.swing.JMenuItem();
        btnHuellaEst = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        totalEst = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        asistenciaEst = new javax.swing.JMenuItem();
        asistenciaDocen = new javax.swing.JMenuItem();
        asistenciaAdmin = new javax.swing.JMenuItem();
        retardo = new javax.swing.JMenuItem();
        carnet = new javax.swing.JMenuItem();
        menuConfig = new javax.swing.JMenu();
        usuarios = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblacceso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblFApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblnombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblidtratabajor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        escritorio.setLayer(lblHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblacceso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblFApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblnombres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblidtratabajor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblacceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblidtratabajor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblidtratabajor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        menuBar.setAutoscrolls(true);
        menuBar.setMaximumSize(new java.awt.Dimension(1002, 32769));
        menuBar.setPreferredSize(new java.awt.Dimension(1002, 55));

        menuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/INICIO.png"))); // NOI18N
        menuInicio.setText("Inicio");
        menuInicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/businessman_add.png"))); // NOI18N
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        menuInicio.add(cerrarSesion);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Close.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuInicio.add(salir);

        menuBar.add(menuInicio);

        menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/the_documents_icon.png"))); // NOI18N
        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        administrativo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        administrativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/2986.png"))); // NOI18N
        administrativo.setText("Administrativo");
        administrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administrativoActionPerformed(evt);
            }
        });
        menuArchivo.add(administrativo);

        docente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        docente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/edit_group.png"))); // NOI18N
        docente.setText("Docente");
        docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docenteActionPerformed(evt);
            }
        });
        menuArchivo.add(docente);

        estudiante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/user_32x32.png"))); // NOI18N
        estudiante.setText("Estudiante");
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        menuArchivo.add(estudiante);

        cargos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/el-informe-del-usuario-icono-9444-32.png"))); // NOI18N
        cargos.setText("Cargos");
        cargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargosActionPerformed(evt);
            }
        });
        menuArchivo.add(cargos);

        menuBar.add(menuArchivo);

        menuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar-usuario-icono-7266-32.png"))); // NOI18N
        menuRegistro.setText("Registro");
        menuRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        permisoEstudiante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        permisoEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/user_32x32.png"))); // NOI18N
        permisoEstudiante.setText("Permiso Estudiante");
        permisoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permisoEstudianteActionPerformed(evt);
            }
        });
        menuRegistro.add(permisoEstudiante);

        permisoDocente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        permisoDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/edit_group.png"))); // NOI18N
        permisoDocente.setText("Permiso Docente");
        permisoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permisoDocenteActionPerformed(evt);
            }
        });
        menuRegistro.add(permisoDocente);

        permisoAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        permisoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/2986.png"))); // NOI18N
        permisoAdmin.setText("Permiso Administrativo");
        permisoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permisoAdminActionPerformed(evt);
            }
        });
        menuRegistro.add(permisoAdmin);

        menuBar.add(menuRegistro);

        menuAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/checkbox-checked.png"))); // NOI18N
        menuAsistencia.setText("Asistencia");
        menuAsistencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        IngresoEst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        IngresoEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/slideshare.png"))); // NOI18N
        IngresoEst.setText("Ingreso Personal");
        IngresoEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoEstActionPerformed(evt);
            }
        });
        menuAsistencia.add(IngresoEst);

        salidaEst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salidaEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salirw.png"))); // NOI18N
        salidaEst.setText("Salida Personal");
        salidaEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaEstActionPerformed(evt);
            }
        });
        menuAsistencia.add(salidaEst);

        btnHuellaEst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHuellaEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/xmyspace.png.pagespeed.ic.BvO8Orln7M.png"))); // NOI18N
        btnHuellaEst.setText("Ingreso por Huella");
        btnHuellaEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuellaEstActionPerformed(evt);
            }
        });
        menuAsistencia.add(btnHuellaEst);

        menuBar.add(menuAsistencia);

        menuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/tramites.gif"))); // NOI18N
        menuReportes.setText("Reportes");
        menuReportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        totalEst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/edit_group.png"))); // NOI18N
        totalEst.setText("Total Personal");
        totalEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalEstActionPerformed(evt);
            }
        });
        menuReportes.add(totalEst);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/success.png"))); // NOI18N
        jMenu5.setText("Asistencias");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        asistenciaEst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        asistenciaEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/user_32x32.png"))); // NOI18N
        asistenciaEst.setText("Asistencia Estudiantes");
        asistenciaEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistenciaEstActionPerformed(evt);
            }
        });
        jMenu5.add(asistenciaEst);

        asistenciaDocen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        asistenciaDocen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/edit_group.png"))); // NOI18N
        asistenciaDocen.setText("Asistencia Docentes");
        asistenciaDocen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistenciaDocenActionPerformed(evt);
            }
        });
        jMenu5.add(asistenciaDocen);

        asistenciaAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        asistenciaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/2986.png"))); // NOI18N
        asistenciaAdmin.setText("Asistencia Administrativos");
        asistenciaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistenciaAdminActionPerformed(evt);
            }
        });
        jMenu5.add(asistenciaAdmin);

        menuReportes.add(jMenu5);

        retardo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        retardo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Announcement.png"))); // NOI18N
        retardo.setText("Retardos");
        retardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retardoActionPerformed(evt);
            }
        });
        menuReportes.add(retardo);

        carnet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        carnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Digg.png"))); // NOI18N
        carnet.setText("Carnets");
        carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnetActionPerformed(evt);
            }
        });
        menuReportes.add(carnet);

        menuBar.add(menuReportes);

        menuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/1837084.cfbfef783fe0d1f0fc44ae1c292101ab.gif"))); // NOI18N
        menuConfig.setText("Configuraciones");
        menuConfig.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        usuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        usuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/xmyspace.png.pagespeed.ic.BvO8Orln7M.png"))); // NOI18N
        usuarios.setText("Usuarios y Accesos");
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        menuConfig.add(usuarios);

        menuBar.add(menuConfig);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalEstActionPerformed
        frmReporteTotalAlumno form = new frmReporteTotalAlumno();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_totalEstActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void administrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administrativoActionPerformed
        frmAdministrativo form = new frmAdministrativo();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_administrativoActionPerformed

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        frmUsuarios form = new frmUsuarios();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_usuariosActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed
        frmEstudiante form = new frmEstudiante();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_estudianteActionPerformed

    private void IngresoEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoEstActionPerformed
        frmAsistenciaPersonal form = new frmAsistenciaPersonal();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_IngresoEstActionPerformed

    private void permisoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permisoEstudianteActionPerformed
        frmPermiso form = new frmPermiso();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_permisoEstudianteActionPerformed

    private void permisoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permisoDocenteActionPerformed
        frmLicencia form = new frmLicencia();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_permisoDocenteActionPerformed

    private void salidaEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaEstActionPerformed
        frmAsistenciaSalidaPersonal form = new frmAsistenciaSalidaPersonal();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_salidaEstActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        dispose();
        frmLogin login = new frmLogin();
        login.toFront();
        login.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void asistenciaEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistenciaEstActionPerformed
        frmReportAsisEst form = new frmReportAsisEst();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_asistenciaEstActionPerformed

    private void asistenciaDocenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistenciaDocenActionPerformed
        frmReportAsisDocen form = new frmReportAsisDocen();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_asistenciaDocenActionPerformed

    private void cargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargosActionPerformed
        frmCargo form = new frmCargo();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_cargosActionPerformed

    private void docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docenteActionPerformed
        frmDocente form = new frmDocente();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_docenteActionPerformed

    private void asistenciaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistenciaAdminActionPerformed
        frmReportAsisAdmin form = new frmReportAsisAdmin();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_asistenciaAdminActionPerformed

    private void permisoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permisoAdminActionPerformed
        frmLicenAdmin form = new frmLicenAdmin();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_permisoAdminActionPerformed

    private void btnHuellaEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuellaEstActionPerformed
        frmEntradaPersonal form = new frmEntradaPersonal();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_btnHuellaEstActionPerformed

    private void retardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retardoActionPerformed
        frmReportRetardo form = new frmReportRetardo();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_retardoActionPerformed

    private void carnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnetActionPerformed
        frmCarnet form = new frmCarnet();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        x = (escritorio.getWidth() / 2) - form.getWidth() / 2;
        y = (escritorio.getHeight() / 2) - form.getHeight() / 2;
        
        form.setLocation(x, y);
    }//GEN-LAST:event_carnetActionPerformed

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
            java.util.logging.Logger.getLogger(PanelInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PanelInicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem IngresoEst;
    private javax.swing.JMenuItem administrativo;
    private javax.swing.JMenuItem asistenciaAdmin;
    private javax.swing.JMenuItem asistenciaDocen;
    private javax.swing.JMenuItem asistenciaEst;
    public static javax.swing.JMenuItem btnHuellaEst;
    private javax.swing.JMenuItem cargos;
    public static javax.swing.JMenuItem carnet;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JMenuItem docente;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem estudiante;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JLabel lblFApellido;
    private javax.swing.JLabel lblHora;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblidtratabajor;
    public static javax.swing.JLabel lblnombres;
    public static javax.swing.JMenu menuArchivo;
    public static javax.swing.JMenu menuAsistencia;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu menuConfig;
    public static javax.swing.JMenu menuInicio;
    public static javax.swing.JMenu menuRegistro;
    public static javax.swing.JMenu menuReportes;
    private javax.swing.JMenuItem permisoAdmin;
    private javax.swing.JMenuItem permisoDocente;
    private javax.swing.JMenuItem permisoEstudiante;
    public static javax.swing.JMenuItem retardo;
    public static javax.swing.JMenuItem salidaEst;
    private javax.swing.JMenuItem salir;
    public static javax.swing.JMenuItem totalEst;
    private javax.swing.JMenuItem usuarios;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            lblHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    public void calcula() {
        Calendar calendar = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendar.setTime(fechaHoraActual);
        ampm = calendar.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendar.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendar.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendar.get(Calendar.HOUR_OF_DAY) : "0" + calendar.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendar.get(Calendar.MINUTE) > 9 ? "" + calendar.get(Calendar.MINUTE) : "0" + calendar.get(Calendar.MINUTE);
        segundos = calendar.get(Calendar.SECOND) > 9 ? "" + calendar.get(Calendar.SECOND) : "0" + calendar.get(Calendar.SECOND);
    }
}
