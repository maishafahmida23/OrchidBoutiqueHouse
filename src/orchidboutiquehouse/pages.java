/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orchidboutiquehouse;

/**
 *
 * @author HP
 */
public class pages extends javax.swing.JFrame {

    /**
     * Creates new form pages
     */
    public pages() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inventory = new javax.swing.JLabel();
        Order = new javax.swing.JLabel();
        Supply = new javax.swing.JLabel();
        customer = new javax.swing.JLabel();
        billing = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orchid Fashion House");
        setMaximumSize(new java.awt.Dimension(1300, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryMouseClicked(evt);
            }
        });
        getContentPane().add(Inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 240, 130));

        Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderMouseClicked(evt);
            }
        });
        getContentPane().add(Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 220, 140));

        Supply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplyMouseClicked(evt);
            }
        });
        getContentPane().add(Supply, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 220, 130));

        customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerMouseClicked(evt);
            }
        });
        getContentPane().add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 220, 130));

        billing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingMouseClicked(evt);
            }
        });
        getContentPane().add(billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, 230, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fp.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseClicked
        new Inventory().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_InventoryMouseClicked

    private void SupplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplyMouseClicked
        new Supplier().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplyMouseClicked

    private void customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseClicked
        new Customer().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_customerMouseClicked

    private void OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderMouseClicked
        new Order().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderMouseClicked

    private void billingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingMouseClicked
        new Billing().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_billingMouseClicked

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
            java.util.logging.Logger.getLogger(pages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Inventory;
    private javax.swing.JLabel Order;
    private javax.swing.JLabel Supply;
    private javax.swing.JLabel billing;
    private javax.swing.JLabel customer;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
