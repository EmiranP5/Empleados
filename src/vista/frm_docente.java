/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import docente.conexion;
import docente.docente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felix
 */
public class frm_docente extends javax.swing.JFrame {

    /**
     * Creates new form frm_docente
     */
    docente obj_docente;
    public frm_docente() {
        initComponents();
        obj_docente = new docente();
        tbl_docente.setModel(obj_docente.leer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nacimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_ingreso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_registro = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_leer = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_docente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Docente");

        jLabel2.setText("NIT");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellidos");

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        jLabel5.setText("Direccion");

        jLabel6.setText("Telefono");

        jLabel7.setText("Nacimiento");

        jLabel8.setText("ID");

        lbl_id.setText("0");

        jLabel10.setText("Codigo");

        jLabel11.setText("Salario");

        jLabel12.setText("Fecha Ingreso");

        jLabel13.setText("Fecha Registro");

        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_leer.setText("LEER");
        btn_leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leerActionPerformed(evt);
            }
        });

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        tbl_docente.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_docente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_docenteMouseClicked(evt);
            }
        });
        tbl_docente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_docenteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_docente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_apellido)
                                    .addComponent(txt_direccion)
                                    .addComponent(txt_telefono)
                                    .addComponent(txt_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_salario)
                                    .addComponent(txt_ingreso)
                                    .addComponent(txt_registro))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_actualizar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_leer, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbl_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_leer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
                
        obj_docente = new docente(0,txt_codigo.getText(),txt_nit.getText(),txt_nombre.getText(),txt_apellido.getText(),txt_direccion.getText(),txt_telefono.getText(),txt_nacimiento.getText(),txt_salario.getText(),txt_ingreso.getText(),txt_registro.getText());
        obj_docente.agregar();
        tbl_docente.setModel(obj_docente.leer());
        
        
        this.txt_codigo.setText("");
        this.txt_nit.setText("");
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.txt_nacimiento.setText("");
        this.txt_salario.setText("");
        this.txt_ingreso.setText("");
        this.txt_registro.setText("");
        this.lbl_id.setText("");
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tbl_docenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_docenteKeyReleased
        // TODO add your handling code here:
        selec_datos();
    }//GEN-LAST:event_tbl_docenteKeyReleased

    private void tbl_docenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_docenteMouseClicked
        // TODO add your handling code here:
        selec_datos();
    }//GEN-LAST:event_tbl_docenteMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        obj_docente = new docente();
        obj_docente.setId(Integer.valueOf(lbl_id.getText()) );
        obj_docente.borrar();
        tbl_docente.setModel(obj_docente.leer());
        
        this.txt_codigo.setText("");
        this.txt_nit.setText("");
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.txt_nacimiento.setText("");
        this.txt_salario.setText("");
        this.txt_ingreso.setText("");
        this.txt_registro.setText("");
        this.lbl_id.setText("");
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        obj_docente = new docente(Integer.valueOf(lbl_id.getText()),txt_codigo.getText(),txt_nit.getText(),txt_nombre.getText(),txt_apellido.getText(),txt_direccion.getText(),txt_telefono.getText(),txt_nacimiento.getText(),txt_salario.getText(),txt_ingreso.getText(),txt_registro.getText());
        obj_docente.actualizar();
        tbl_docente.setModel(obj_docente.leer());
        
        this.txt_codigo.setText("");
        this.txt_nit.setText("");
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.txt_nacimiento.setText("");
        this.txt_salario.setText("");
        this.txt_ingreso.setText("");
        this.txt_registro.setText("");
        this.lbl_id.setText("");
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leerActionPerformed
        // TODO add your handling code here:
    docente obj_docente = new docente();
    DefaultTableModel modelo = obj_docente.leer();
    tbl_docente.setModel(modelo);
    
    int totalRegistros = modelo.getRowCount();
    JOptionPane.showMessageDialog(null, "Total de registros: " + totalRegistros);
    }//GEN-LAST:event_btn_leerActionPerformed

        public void selec_datos(){
    int fil = tbl_docente.getSelectedRow();
    lbl_id.setText(tbl_docente.getValueAt(fil, 0).toString());
    txt_codigo.setText(tbl_docente.getValueAt(fil, 1).toString());
    txt_nit.setText(tbl_docente.getValueAt(fil, 2).toString());
    txt_nombre.setText(tbl_docente.getValueAt(fil, 3).toString());
    txt_apellido.setText(tbl_docente.getValueAt(fil, 4).toString());
    txt_direccion.setText(tbl_docente.getValueAt(fil, 5).toString());
    txt_telefono.setText(tbl_docente.getValueAt(fil, 6).toString());
    txt_nacimiento.setText(tbl_docente.getValueAt(fil, 7).toString());
    txt_salario.setText(tbl_docente.getValueAt(fil, 8).toString());
    txt_ingreso.setText(tbl_docente.getValueAt(fil, 9).toString());
    txt_registro.setText(tbl_docente.getValueAt(fil, 10).toString());
    
    }
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_docente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_leer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_docente;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_ingreso;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_registro;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
