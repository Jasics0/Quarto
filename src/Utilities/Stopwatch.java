package Utilities;

public class Stopwatch extends javax.swing.JFrame implements Runnable {
    
    private int seg = 0;
    private int min = 0;
    private int hora = 0;
    private boolean continuar = true;
    private Increment i;
    
    public Stopwatch() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Cronómetro");
        txf_cont1.setText(String.valueOf(hora));
        txf_cont2.setText(String.valueOf(min));
        txf_cont3.setText(String.valueOf(seg));
        resetSeg();
        resetMin();
        resetHora();
        seguir();
        i = new Increment(this);
        i.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txf_cont3 = new javax.swing.JTextField();
        txf_cont1 = new javax.swing.JTextField();
        txf_cont2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        txf_cont3.setEditable(false);
        txf_cont3.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont3ActionPerformed(evt);
            }
        });

        txf_cont1.setEditable(false);
        txf_cont1.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont1ActionPerformed(evt);
            }
        });

        txf_cont2.setEditable(false);
        txf_cont2.setBackground(new java.awt.Color(204, 255, 255));
        txf_cont2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txf_cont2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txf_cont2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cont2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txf_cont1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txf_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txf_cont3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_cont1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_cont3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_cont3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont3ActionPerformed

    private void txf_cont1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont1ActionPerformed

    private void txf_cont2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cont2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cont2ActionPerformed
    /**
     *
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
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stopwatch().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txf_cont1;
    private javax.swing.JTextField txf_cont2;
    private javax.swing.JTextField txf_cont3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        this.setVisible(true);
    }
    
    public synchronized int aumentSeg() {
        seg++;
        txf_cont3.setText(String.valueOf(seg));
        return seg;
    }
    
    public synchronized int aumentMin() {
        min++;
        txf_cont2.setText(String.valueOf(min));
        return min;
    }
    
    public synchronized int aumentHora() {
        hora++;
        txf_cont1.setText(String.valueOf(hora));
        return hora;
    }
    
    public void resetSeg() {
        txf_cont3.setText(String.valueOf("0"));
        seg = 0;
    }
    
    public void resetMin() {
        txf_cont2.setText(String.valueOf("0"));
        min = 0;
    }
    
    public void resetHora() {
        txf_cont1.setText(String.valueOf("0"));
        hora = 0;
    }
    
    public synchronized int getMin() {
        return min;
    }
    
    public synchronized int getSeg() {
        return seg;
    }
    
    public synchronized int getHora() {
        return hora;
    }
    
    public synchronized void seguir() {
        continuar = true;
    }
    
    public synchronized void reanudar() {
        continuar = true;
        i.seguir();
    }
    
    public synchronized void initCrono() {
        resetSeg();
        resetMin();
        resetHora();
        seguir();
    }
    
    public synchronized void closeCrono() {
        resetSeg();
        resetMin();
        resetHora();
        parar();
        this.setVisible(false);
    }
    
    public synchronized void parar() {
        continuar = false;
    }
    
    public synchronized boolean isContinuar() {
        return continuar;
    }
}
