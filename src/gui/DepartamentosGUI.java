
package gui;

import Crud.IDAO;
import Crud.Departamento;
import Crud.Empleado;
import Crud.FactoryDAO;
import Hibernate.DepDAOH;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jahaziel1999
 */
public class DepartamentosGUI extends javax.swing.JInternalFrame {

    private static DepartamentosGUI depgui=null;
    public static DepartamentosGUI getInstance(){
        if(depgui==null)
            depgui=new DepartamentosGUI();
        return depgui;
    }
    
    private Departamento departamento;
    private DepDAOH dao;
    
    public DepartamentosGUI() {
        initComponents();
        dao = new DepDAOH();
        
    }

    public void limpiar() {
        txtClave.setText("");
        txtNombre.setText("");
    }

//    public String Recorrer() {
//        String listaPersonas = "Datos: \n ";
//        List<Departamento> lista = new ArrayList<Departamento>();
//        lista = factory.mostrarAll();
//        Iterator<Departamento> itr = lista.iterator();
//        while (itr.hasNext()) {
//            departamento = itr.next();
//            listaPersonas += " ID:" + departamento.getId()
//                    + " Nombre:" + departamento.getNombre()
//                    + " \n ";
//        }
//        return listaPersonas;
//    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        btoGuardar = new javax.swing.JButton();
        btoActualizar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();
        btoBuscar = new javax.swing.JButton();
        btoMostrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Departamentos");
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(300, 200));
        setPreferredSize(new java.awt.Dimension(400, 300));

        jToolBar2.setRollover(true);

        btoGuardar.setText("guardar");
        btoGuardar.setToolTipText("Guardar");
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });
        jToolBar2.add(btoGuardar);

        btoActualizar.setText("actualizar");
        btoActualizar.setToolTipText("Nuevo");
        btoActualizar.setFocusable(false);
        btoActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoActualizarActionPerformed(evt);
            }
        });
        jToolBar2.add(btoActualizar);

        btoEliminar.setText("eliminar");
        btoEliminar.setToolTipText("Eliminar");
        btoEliminar.setFocusable(false);
        btoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });
        jToolBar2.add(btoEliminar);

        btoBuscar.setText("Buscar");
        btoBuscar.setFocusable(false);
        btoBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoBuscarActionPerformed(evt);
            }
        });
        jToolBar2.add(btoBuscar);

        btoMostrar.setText("mostrar");
        btoMostrar.setToolTipText("Modificar");
        btoMostrar.setFocusable(false);
        btoMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoMostrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoMostrarActionPerformed(evt);
            }
        });
        jToolBar2.add(btoMostrar);

        getContentPane().add(jToolBar2, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("Clave: ");

        jLabel2.setText("Nombre:");

        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(txtClave))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoActualizarActionPerformed
     
        departamento = new Departamento();
        departamento.setId(Long.parseLong(txtClave.getText()));
        departamento.setNombre(txtNombre.getText());
        dao.actualizar(departamento);
        limpiar();
    }//GEN-LAST:event_btoActualizarActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        departamento = new Departamento();
        departamento.setId(Long.parseLong(txtClave.getText()));
        departamento.setNombre(txtNombre.getText());
        dao.ingresar(departamento);
        limpiar();
       
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
       
        dao.eliminar(Long.parseLong(txtClave.getText()));
        limpiar();
    }//GEN-LAST:event_btoEliminarActionPerformed

    private void btoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoMostrarActionPerformed
        
    }//GEN-LAST:event_btoMostrarActionPerformed

    private void btoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoBuscarActionPerformed
        departamento = new Departamento();
        departamento =dao.mostrarById(Long.parseLong(txtClave.getText()));
        mostrar.setText("Id: " + departamento.getId() + " Nombre: " + departamento.getNombre());
    }//GEN-LAST:event_btoBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoActualizar;
    private javax.swing.JButton btoBuscar;
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
