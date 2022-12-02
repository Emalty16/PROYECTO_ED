/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.FuncionalidadesClientes;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.FuncionalidadesAlquileres.Arbol;
import proyecto.FuncionalidadesVehiculo.ListaDoble;
import proyecto.FuncionalidadesVehiculo.Vehiculo;

/**
 *
 * @author crist
 */
public class ConsultarClientes extends javax.swing.JFrame {

    private ListaDoble vehiculos;
    private Pila clientes;
    private Arbol alquileres;

    public ConsultarClientes(ListaDoble vehiculos, Pila clientes, Arbol alquileres) {
        initComponents();
        this.vehiculos = vehiculos;
        this.clientes = clientes;
        this.alquileres = alquileres;
        
        //inicializarAccionClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipoReporte = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosCliente = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        filtroTxt = new javax.swing.JTextField();
        cerrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Clientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un metodo: ");

        tipoReporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipoReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente por Nombre", "Cliente por Cedula", " " }));
        tipoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoReporteActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 51));

        datosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(datosCliente);

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtro:");

        filtroTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cerrar.setBackground(new java.awt.Color(51, 51, 51));
        cerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setText("Cerrar");
        cerrar.setBorderPainted(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(0, 204, 0));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.setBorderPainted(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(573, 573, 573)
                        .addComponent(cerrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filtroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(454, 454, 454)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(167, 167, 167)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(478, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
     this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void tipoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoReporteActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String seleccion = this.tipoReporte.getSelectedItem().toString();
        String filtro = this.filtroTxt.getText();

        refrescarJLista(seleccion, filtro);
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void refrescarJLista(String seleccion, String filtro) {

        Cliente datos[] = clientes.listarenArreglo();

        int id = (int) Math.floor(Math.random() * 100);
        
        clientes.listarPila();
        JOptionPane.showMessageDialog(null, "Se ha guardado un nuevo cliente", "Mensaje", 1);
        System.out.print(" ID del reporte: ");
        clientes.listarPila();
        for (Cliente e : datos) {
            System.out.println("Nombre: "+e.getNombreCompleto());
        }

        try {

            String[] columsName = {"ID ", "Cedula", "NombreCompleto", "FechaNacimiento", "Correo", "Categoria"};
            DefaultTableModel model = (DefaultTableModel) datosCliente.getModel();
            model.setColumnIdentifiers(columsName);
            model.setRowCount(0);

            for (Cliente dato : datos) {
                if (seleccion.equals("Cliente por nombre")) {
                    if (dato.getNombreCompleto().equals(filtro)) {
                        String ln = dato.toString();
                        String[] dataRow = ln.split(",");
                        model.addRow(dataRow);
                    }
                } else if (seleccion.equals("Cliente por cedula")) {
                    if (dato.getCedula().equals(filtro)) {
                        String ln = dato.toString();
                        String[] dataRow = ln.split(",");
                        model.addRow(dataRow);
                    }
                } else {

                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Reportes().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Reportes().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton cerrar;
    private javax.swing.JTable datosCliente;
    private javax.swing.JTextField filtroTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> tipoReporte;
    // End of variables declaration//GEN-END:variables
}
