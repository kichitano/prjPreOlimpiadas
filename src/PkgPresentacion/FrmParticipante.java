/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgPresentacion;


import PkgLogico.ClsApoderadoLog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vera
 */
public class FrmParticipante extends javax.swing.JFrame {
    ClsApoderadoLog apoderadoLog = new ClsApoderadoLog();
 
    public FrmParticipante() {
        initComponents();
        HabilitarControles();
        CargarComboDisciplinas();
        CargarComboAnios();
        DeshabilitarControles();
        jlestado.setVisible(false);
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
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlAnio = new javax.swing.JLabel();
        jlDisciplina = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jlAP = new javax.swing.JLabel();
        jlAM = new javax.swing.JLabel();
        jlNombres = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        cmbAnios = new javax.swing.JComboBox<>();
        cmbDisciplinas = new javax.swing.JComboBox<>();
        txtAP = new javax.swing.JTextField();
        txtAM = new javax.swing.JTextField();
        cmbEstados = new javax.swing.JComboBox<>();
        txtNombres = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jlestado = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusquedaDNI = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        jLabel15.setText("Participante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlAnio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlAnio.setText("Año:");

        jlDisciplina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlDisciplina.setText("Disciplina:");

        jlDNI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlDNI.setText("DNI:");

        jlAP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlAP.setText("Apellido Paterno:");

        jlAM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlAM.setText("Apellido Materno:");

        jlNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNombres.setText("Nombres:");

        jlEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEstado.setText("Estado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAP)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlAM)
                        .addComponent(jlNombres, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlDNI)
                                .addComponent(jlDisciplina)
                                .addComponent(jlAnio)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlAnio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDisciplina)
                .addGap(18, 18, 18)
                .addComponent(jlDNI)
                .addGap(18, 18, 18)
                .addComponent(jlAP)
                .addGap(18, 18, 18)
                .addComponent(jlAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbAnios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar una opción" }));
        cmbAnios.setEnabled(false);

        cmbDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar una opción" }));
        cmbDisciplinas.setEnabled(false);

        cmbEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar una opción", "Activo", "Inactivo" }));
        cmbEstados.setToolTipText("");
        cmbEstados.setEnabled(false);
        cmbEstados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadosItemStateChanged(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jlestado.setText("jLabel2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDNI)
                    .addComponent(cmbAnios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDisciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAP)
                    .addComponent(txtAM)
                    .addComponent(cmbEstados, 0, 138, Short.MAX_VALUE)
                    .addComponent(txtNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(jlestado)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cmbAnios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(jlestado))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Participante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("DNI:");

        txtBusquedaDNI.setToolTipText("El # de DNI es de 8 dígitos");
        txtBusquedaDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaDNIKeyTyped(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBusquedaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnVerificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBusquedaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
         
        //busqueda
        boolean perteneceDisciplina = true;
        PkgNegocios.ClsApoderado negApo = new  PkgNegocios.ClsApoderado();
        String dni = txtBusquedaDNI.getText();
        try {
            perteneceDisciplina = negApo.verificarPertenenciaDisciplina(dni); ///11111 - false
            
            if(perteneceDisciplina){
                JOptionPane.showMessageDialog(null,"Participante ya esta registrado en una disciplina",
                        "No se puede agregar",JOptionPane.ERROR_MESSAGE);
                DeshabilitarControles();
            }else{     
                JOptionPane.showMessageDialog(null,"Participante NO esta registrado en una disciplina",
                        "Se Puede Registrar",JOptionPane.PLAIN_MESSAGE);
                txtDNI.setText(dni);
                HabilitarControles();
             
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmParticipante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      InsertarNuevoApoderado();
      refrescarControles();
      DeshabilitarControles();
      
      //recargar combobox participantes frm Sapito
//      FrmSapito frmsapito = new FrmSapito();
//      String idEquipo = frmsapito.lblIdEquipo.getText();
//        try {
//            frmsapito.MtdLlenarComboParticipantesEquipo(Integer.valueOf(idEquipo));
//        } catch (SQLException ex) {
//            Logger.getLogger(FrmParticipante.class.getName()).log(Level.SEVERE, null, ex);
//        }
      //volver a formulario anterior
      this.dispose(); 

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbEstadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadosItemStateChanged
      String opcion = cmbEstados.getSelectedItem().toString();
          
          if(opcion.equals("Activo")){
             jlestado.setText("A"); 
             
          }else if(opcion.equals("Inactivo")){
             jlestado.setText("I");
          }        
//          else{
//              JOptionPane.showMessageDialog(null, "Seleccione una opción");
//          }
    }//GEN-LAST:event_cmbEstadosItemStateChanged

    private void txtBusquedaDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaDNIKeyTyped
       int limite = 8;
       char validar = evt.getKeyChar();
       if(txtBusquedaDNI.getText().length() == limite)
       { 
           evt.consume();
       }
       
       if(!Character.isDigit(validar))
       {
           evt.consume();
           JOptionPane.showMessageDialog(null, "Ingrese solo números");
       }
 
    }//GEN-LAST:event_txtBusquedaDNIKeyTyped

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
            java.util.logging.Logger.getLogger(FrmParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmParticipante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cmbAnios;
    private javax.swing.JComboBox<String> cmbDisciplinas;
    private javax.swing.JComboBox<String> cmbEstados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jlAM;
    private javax.swing.JLabel jlAP;
    private javax.swing.JLabel jlAnio;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDisciplina;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNombres;
    private javax.swing.JLabel jlestado;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtBusquedaDNI;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
    
    
    public void refrescarControles(){
        cmbAnios.setSelectedIndex(0);
        cmbDisciplinas.setSelectedIndex(0);
        cmbEstados.setSelectedIndex(0);
        txtDNI.setText("");
        txtAP.setText("");
        txtAM.setText("");
        txtNombres.setText("");
    }
    
     public void HabilitarControles(){
        jPanel2.setEnabled(true);
        jlAP.setEnabled(true);
        jlAM.setEnabled(true);
        jlEstado.setEnabled(true);
        jlDNI.setEnabled(true);
        jlNombres.setEnabled(true);
        jlAnio.setEnabled(true);
        jlDisciplina.setEnabled(true);
        cmbAnios.setEnabled(true);
        cmbDisciplinas.setEnabled(true);
        cmbEstados.setEnabled(true);
        txtDNI.setEnabled(true);
        txtAP.setEnabled(true);
        txtAM.setEnabled(true);
        txtNombres.setEnabled(true);
        btnGuardar.setEnabled(true);
    }
     public void DeshabilitarControles(){
        jPanel2.setEnabled(false);
        jlAP.setEnabled(false);
        jlAM.setEnabled(false);
        jlEstado.setEnabled(false);
        jlDNI.setEnabled(false);
        jlNombres.setEnabled(false);
        jlAnio.setEnabled(false);
        jlDisciplina.setEnabled(false);
        cmbAnios.setEnabled(false);
        cmbDisciplinas.setEnabled(false);
        cmbEstados.setEnabled(false);
        txtDNI.setEnabled(false);
        txtAP.setEnabled(false);
        txtAM.setEnabled(false);
        txtNombres.setEnabled(false);
        btnGuardar.setEnabled(false);
    }
     public void CargarComboDisciplinas(){
        try{
            for(int i = 0; i < apoderadoLog.listaDisciplinas().size(); i++){
                cmbDisciplinas.addItem(apoderadoLog.listaDisciplinas().get(i).getDescripcionDisciplina());
            }
        }catch(SQLException e){
            Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, e);
        }
      }
      public void CargarComboAnios(){
        try{
            for(int i = 0; i < apoderadoLog.listaAnios().size(); i++){
                cmbAnios.addItem(apoderadoLog.listaAnios().get(i).getDescripcionAnio());
            }
        }catch(SQLException e){
            Logger.getLogger(FrmLanzamientoCanasta.class.getName()).log(Level.SEVERE, null, e);
        }
      }
      public void InsertarNuevoApoderado(){
          int idAnio = cmbAnios.getSelectedIndex();
          int idDisciplina = cmbDisciplinas.getSelectedIndex();
          String dni = txtDNI.getText();
          String apeP = txtAP.getText();
          String apeM = txtAM.getText();
          String nomb = txtNombres.getText();
  
          apoderadoLog.InsertarApoderado(idAnio, idDisciplina, dni, apeP, apeM, nomb, jlestado.getText());
          JOptionPane.showMessageDialog(null, "Nuevo Participante Agregado");
      }  
}
