/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasInterfazD;

/**
 *
 * @author danie
 */
public class CrearVehiculos extends javax.swing.JFrame {

    /**
     * Contructor de mi JFRAME CrearVehículos
     * Creates new form CrearVehículos
     */
    public CrearVehiculos() {
        initComponents();
         this.setLocationRelativeTo(null);
           setSize(1290, 1000);
           setTitle("FEROVA GAME");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRegresarVeh = new javax.swing.JButton();
        jButtonCrearTanques = new javax.swing.JButton();
        jButtonCrearAviones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 0));
        jLabel8.setText("Creación de Vehículos");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 30, 470, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesD/aviones.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 20, 620, 150);

        jButtonRegresarVeh.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegresarVeh.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jButtonRegresarVeh.setForeground(new java.awt.Color(0, 255, 0));
        jButtonRegresarVeh.setText("Regresar");
        jButtonRegresarVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarVehActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresarVeh);
        jButtonRegresarVeh.setBounds(120, 820, 250, 90);

        jButtonCrearTanques.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCrearTanques.setFont(new java.awt.Font("Dubai", 3, 48)); // NOI18N
        jButtonCrearTanques.setForeground(new java.awt.Color(0, 255, 0));
        jButtonCrearTanques.setText("Crear Tanques");
        jButtonCrearTanques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearTanquesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrearTanques);
        jButtonCrearTanques.setBounds(450, 500, 560, 210);

        jButtonCrearAviones.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCrearAviones.setFont(new java.awt.Font("Dubai", 3, 48)); // NOI18N
        jButtonCrearAviones.setForeground(new java.awt.Color(0, 255, 0));
        jButtonCrearAviones.setText("Crear Aviones");
        jButtonCrearAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearAvionesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrearAviones);
        jButtonCrearAviones.setBounds(450, 250, 560, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesD/FinesseGrande.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1810, 1300);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método para ir a Crear aviones
 * @param evt 
 */
    private void jButtonCrearAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearAvionesActionPerformed
        // TODO add your handling code here:
        CrearAviones entrada2 = new CrearAviones();
        entrada2.show();
        entrada2.setSize(1290, 1000);
        dispose();

       
    }//GEN-LAST:event_jButtonCrearAvionesActionPerformed
/**
 * Método para ir a Crear Tanques
 * @param evt 
 */
    private void jButtonCrearTanquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearTanquesActionPerformed
        // TODO add your handling code here:
        CrearTanques entrada2 = new CrearTanques();
        entrada2.show();
        entrada2.setSize(1290, 1000);
        dispose();

        
    }//GEN-LAST:event_jButtonCrearTanquesActionPerformed
/**
 * Método para regresar a mi JFRAME Tienda
 * @param evt 
 */
    private void jButtonRegresarVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarVehActionPerformed
        // TODO add your handling code here:
        //Persona persona = new Persona(jTextFieldNombre.getText() );
        //lista.add(persona);
        this.setVisible(false);

        new Tienda().setVisible(true);

        setSize(825, 866);
        dispose();
        
    }//GEN-LAST:event_jButtonRegresarVehActionPerformed

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
            java.util.logging.Logger.getLogger(CrearVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearAviones;
    private javax.swing.JButton jButtonCrearTanques;
    private javax.swing.JButton jButtonRegresarVeh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}