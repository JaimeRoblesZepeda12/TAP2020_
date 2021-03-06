
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Pulgadas extends javax.swing.JDialog {
    Ventana puntero;
    /**
     * Creates new form Pulgadas
     */
    public Pulgadas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEstatura = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblEstatura.setBackground(new java.awt.Color(102, 102, 255));
        lblEstatura.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEstatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstatura.setText("Estatura en cm:");
        lblEstatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnConvertir.setBackground(new java.awt.Color(153, 153, 153));
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lblEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConvertir)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConvertir))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        if(validaEstatura(txtEstatura)){txtEstatura.requestFocus(); lblEstatura.setForeground(Color.red);txtEstatura.setText(""); return;}
        double e = Double.parseDouble(txtEstatura.getText());
        e= e/2.54;
        JOptionPane.showMessageDialog(this, "Su estatura en pulgadas es: "+e);
        
        txtEstatura.setText("");
    }//GEN-LAST:event_btnConvertirActionPerformed
    //------Exception
    public void cadenaVacia(String cad)throws VentanaException{
        if(cad.length()==0)throw new VentanaException("Campos Vacios");
    }
    private void validaNum(String d) throws VentanaException{
        if(!d.matches("[0-9]*")) throw new VentanaException("Solo Numeros");
        
    }
    private void validaNu(String d) throws VentanaException{
        if(!d.matches("[1-9]*")) throw new VentanaException("No validos \n *0 \n *letras \n *caracter especial \n *Negativos");
    }
    private void validaNeg(String num)throws VentanaException{
        if(Integer.parseInt(num)<0)throw new VentanaException("Solo positivos");
    }
    public boolean validaEstatura(JTextField t){
        try {
            cadenaVacia(t.getText());
        }catch(VentanaException e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }try {
            validaNeg(t.getText());
        }catch(VentanaException e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }try {
            validaNum(t.getText());
        }catch(VentanaException e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }try {
            validaNu(t.getText());
        }catch(VentanaException e){
           showMessageDialog(this,e.getMessage()); t.requestFocus();return true;
        }
        return false;
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
            java.util.logging.Logger.getLogger(Pulgadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pulgadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pulgadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pulgadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pulgadas dialog = new Pulgadas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JTextField txtEstatura;
    // End of variables declaration//GEN-END:variables
}
