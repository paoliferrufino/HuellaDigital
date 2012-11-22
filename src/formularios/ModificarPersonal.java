/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ModificarPersonal.java
 *
 * Created on 19-oct-2012, 10:18:16
 */

package formularios;

import BD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jesus
 */
public class ModificarPersonal extends javax.swing.JFrame {

    /** Creates new form ModificarPersonal */
    public ModificarPersonal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        camp_nombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        camp_clave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        camp_appaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        camp_apmaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        camp_sexo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        camp_direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        camp_telefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCargarHuella = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("Huella Digital");

        jLabel8.setText("Telefono");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        camp_nombre.setEditable(false);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        camp_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_claveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 18));
        jLabel1.setText("Modificacion de Personal");

        jLabel6.setText("Sexo");

        camp_appaterno.setEditable(false);

        jLabel7.setText("Direccion");

        camp_apmaterno.setEditable(false);

        jLabel4.setText("Apellido paterno");

        camp_sexo.setEditable(false);

        jLabel5.setText("Apellido materno");

        camp_direccion.setEditable(false);

        jLabel2.setText("Clave");

        camp_telefono.setEditable(false);

        jLabel3.setText("Nombre");

        btnCargarHuella.setText("Cargar...");
        btnCargarHuella.setEnabled(false);
        btnCargarHuella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarHuellaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnGuardar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(camp_clave, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(camp_nombre)
                                    .addComponent(camp_appaterno)
                                    .addComponent(camp_apmaterno)
                                    .addComponent(camp_sexo)
                                    .addComponent(camp_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(camp_telefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCargarHuella)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCancelar)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnCerrar)))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(camp_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(camp_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(camp_appaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(camp_apmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(camp_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(camp_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(camp_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnCargarHuella))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCerrar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();

}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        camp_clave.setText(null);
        camp_nombre.setText(null);
        camp_appaterno.setText(null);
        camp_apmaterno.setText(null);
        camp_sexo.setText(null);
        camp_telefono.setText(null);
        camp_direccion.setText(null);
}//GEN-LAST:event_btnCancelarActionPerformed

    private void camp_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_claveActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_camp_claveActionPerformed

    private void btnCargarHuellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarHuellaActionPerformed
        // TODO add your handling code here:
        CapturaHuella form = new CapturaHuella();
        form.setVisible(true);
    }//GEN-LAST:event_btnCargarHuellaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Guardar();
}//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Consulta();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
       //Desplega mensaje al pasarle el mouse
       jButton1.setToolTipText("Ingresa una clave para buscar");
    }//GEN-LAST:event_jButton1MouseMoved

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPersonal().setVisible(true);
            }
        });
    }







    ConexionBD con=new ConexionBD();
     public void Consulta() {
    try {
    //Establece los valores para la sentencia SQL
    Connection c=con.conectar();
    //Obtiene la plantilla correspondiente a la persona indicada
    PreparedStatement verificarStmt = c.prepareStatement("SELECT *FROM personal WHERE clave=?");
    verificarStmt.setString(1,camp_clave.getText());
    ResultSet rs = verificarStmt.executeQuery();
    //Si se encuentra el nombre en la base de datos
    if (rs.next()){
    //Lee la plantilla de la base de datos
    String nombre= rs.getString("nombre");
    String appaterno= rs.getString("appaterno");
    String apmaterno= rs.getString("apmaterno");
    String telefono= rs.getString("telefono");
    String direccion= rs.getString("direccion");
    String sexo= rs.getString("sexo");

    camp_telefono.setEditable(true);
    camp_direccion.setEditable(true);
    btnCargarHuella.setEnabled(true);
    btnGuardar.setEnabled(true);
    camp_nombre.setText(nombre);
    camp_appaterno.setText(appaterno);
    camp_apmaterno.setText(apmaterno);
    camp_telefono.setText(telefono);
    camp_direccion.setText(direccion);
    camp_sexo.setText(sexo);
   
    } else {

    }
    } catch (SQLException e) {
    //Si ocurre un error lo indica en la consola
    System.err.println("Error al verificar los datos del personal.");
    }finally{
       con.desconectar();
    }
    }


public void Guardar() {
    try {
    //Establece los valores para la sentencia SQL
    Connection c=con.conectar();
    //Obtiene la plantilla correspondiente a la persona indicada
        PreparedStatement updatePersonal = c.prepareStatement("UPDATE personal set telefono=?, direccion=? WHERE clave=?");
        //updatePersonal.setBinaryStream(1, datosHuella,tamañoHuella);
        updatePersonal.setString(1, camp_telefono.getText());
        updatePersonal.setString(2,camp_direccion.getText());
        updatePersonal.setString(3,camp_clave.getText());
        updatePersonal.execute();
        updatePersonal.close();
    
    } catch (SQLException e) {
    //Si ocurre un error lo indica en la consola
    System.err.println("Error al verificar los datos del personal.");
    }finally{
       con.desconectar();
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarHuella;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField camp_apmaterno;
    private javax.swing.JTextField camp_appaterno;
    public static javax.swing.JTextField camp_clave;
    private javax.swing.JTextField camp_direccion;
    private javax.swing.JTextField camp_nombre;
    private javax.swing.JTextField camp_sexo;
    private javax.swing.JTextField camp_telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}