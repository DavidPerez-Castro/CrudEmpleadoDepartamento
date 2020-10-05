package Crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class GuiDAO_Dep extends javax.swing.JFrame {

    private Departamento departamento;
    private IDAO factory;

    public GuiDAO_Dep() {
        initComponents();
        factory = FactoryDAO.create(FactoryDAO.TypeDAO.DEPARTAMENTO);
    }

    public void limpiar() {
        txtClave.setText("");
        txtNombre.setText("");
    }

    public String Recorrer() {
        String listaPersonas = "Datos: \n ";
        List<Departamento> lista = new ArrayList<Departamento>();
        lista = factory.mostrarAll();
        Iterator<Departamento> itr = lista.iterator();
        while (itr.hasNext()) {
            departamento = itr.next();
            listaPersonas += " ID:" + departamento.getId()
                    + " Nombre:" + departamento.getNombre()
                    + " \n ";
        }
        return listaPersonas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btoGuardar = new javax.swing.JButton();
        btoActualizar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();
        btoBuscar = new javax.swing.JButton();
        btoMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 250));
        setMinimumSize(new java.awt.Dimension(600, 250));
        setPreferredSize(new java.awt.Dimension(600, 250));
        setResizable(false);

        jLabel1.setText("ID: ");

        jLabel2.setText("Nombre:");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btoGuardar.setText("Guardar");
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoGuardar);

        btoActualizar.setText("Actualizar");
        btoActualizar.setFocusable(false);
        btoActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoActualizar);

        btoEliminar.setText("Eliminar");
        btoEliminar.setFocusable(false);
        btoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoEliminar);

        btoBuscar.setText("Buscar");
        btoBuscar.setFocusable(false);
        btoBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoBuscar);

        btoMostrar.setText("Mostrar");
        btoMostrar.setFocusable(false);
        btoMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoMostrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoMostrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoMostrar);

        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        departamento = new Departamento();
        departamento.setId(Long.parseLong(txtClave.getText()));
        departamento.setNombre(txtNombre.getText());
        factory.ingresar(departamento);
        limpiar();
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void btoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoActualizarActionPerformed
        departamento = new Departamento();
        departamento.setId(Long.parseLong(txtClave.getText()));
        departamento.setNombre(txtNombre.getText());
        factory.actualizar(departamento);
        limpiar();
    }//GEN-LAST:event_btoActualizarActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        factory.eliminar(Long.parseLong(txtClave.getText()));
        limpiar();
    }//GEN-LAST:event_btoEliminarActionPerformed

    private void btoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoBuscarActionPerformed
        departamento = (Departamento) factory.mostrarById(Long.parseLong(txtClave.getText()));
        if (departamento != null) {
            String resul = " ID:" + String.valueOf(departamento.getId())
                    + " Nombre:" + departamento.getNombre()
                    + " \n ";
            mostrar.setText(resul);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro este departamento");
        }
        limpiar();
    }//GEN-LAST:event_btoBuscarActionPerformed

    private void btoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoMostrarActionPerformed
        mostrar.setText(Recorrer());
    }//GEN-LAST:event_btoMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiDAO_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiDAO_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiDAO_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiDAO_Dep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiDAO_Dep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoActualizar;
    private javax.swing.JButton btoBuscar;
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
