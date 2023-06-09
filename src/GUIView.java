

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RE_Evolution Gaming
 */
public class GUIView extends javax.swing.JFrame {

    /**
     * Creates new form GUIView
     */
    public GUIView() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Exit = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ManagerBTN = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        StoreBTN = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Store Management System");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user2.png"))); // NOI18N

        Exit.setBackground(new java.awt.Color(153, 0, 153));
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 255));
        jLabel8.setText("X");

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(366, 366, 366)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(313, 313, 313))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
        );

        ManagerBTN.setBackground(new java.awt.Color(255, 255, 255));
        ManagerBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManagerBTN.setPreferredSize(new java.awt.Dimension(236, 236));
        ManagerBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ManagerBTNMouseMoved(evt);
            }
        });
        ManagerBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManagerBTNMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Manager View");

        javax.swing.GroupLayout ManagerBTNLayout = new javax.swing.GroupLayout(ManagerBTN);
        ManagerBTN.setLayout(ManagerBTNLayout);
        ManagerBTNLayout.setHorizontalGroup(
            ManagerBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerBTNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(53, 53, 53))
            .addGroup(ManagerBTNLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        ManagerBTNLayout.setVerticalGroup(
            ManagerBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerBTNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        StoreBTN.setBackground(new java.awt.Color(255, 255, 255));
        StoreBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StoreBTN.setPreferredSize(new java.awt.Dimension(236, 236));
        StoreBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoreBTNMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 204));
        jLabel6.setText("Store View");

        javax.swing.GroupLayout StoreBTNLayout = new javax.swing.GroupLayout(StoreBTN);
        StoreBTN.setLayout(StoreBTNLayout);
        StoreBTNLayout.setHorizontalGroup(
            StoreBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StoreBTNLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(StoreBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48))
        );
        StoreBTNLayout.setVerticalGroup(
            StoreBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoreBTNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(ManagerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(StoreBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManagerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StoreBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ManagerBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerBTNMouseClicked
        // TODO add your handling code here:
        new ManagerView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManagerBTNMouseClicked

    private void ManagerBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerBTNMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ManagerBTNMouseMoved

    private void StoreBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoreBTNMouseClicked
        // TODO add your handling code here:
        new StoreView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StoreBTNMouseClicked

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
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Exit;
    private javax.swing.JPanel ManagerBTN;
    private javax.swing.JPanel StoreBTN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
