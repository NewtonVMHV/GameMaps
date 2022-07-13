package gamemaps;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;


public class LandingPageForm extends javax.swing.JFrame {

    /**
     * Creates new form LandingPageForm
     */
    public LandingPageForm() {
        initComponents();
        this.setBackground(new Color(30,75,112));
        this.setLocationRelativeTo(null);
        setIco();

        jButtonLogin.setBorder(new LineBorder(Color.WHITE));
        jButtonLogin.setBorder(new RoundedBorder(30));

        jButtonRegister.setBorder(new LineBorder(Color.WHITE));
        jButtonRegister.setBorder(new RoundedBorder(30));

        jButtonExit.setBorder(new LineBorder(Color.WHITE));
        jButtonExit.setBorder(new RoundedBorder(30));

       
    }
    private void setIco() {
        Image imagen;

        try {
            imagen = ImageIO.read( getClass().getClassLoader().getResource( "gamemaps/resources/logo.png" ) );
            setIconImage(imagen);
        } catch( java.io.IOException e ){
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 75, 112));
        setMinimumSize(new java.awt.Dimension(720, 490));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(30, 75, 112));
        jPanel1.setToolTipText("");

        jButtonLogin.setBackground(new java.awt.Color(30, 75, 112));
        jButtonLogin.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Iniciar Sesion");
        jButtonLogin.setMaximumSize(new java.awt.Dimension(50, 30));
        jButtonLogin.setMinimumSize(new java.awt.Dimension(50, 30));
        jButtonLogin.setPreferredSize(new java.awt.Dimension(50, 30));
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(30, 75, 112));
        jButtonRegister.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("Registrar");
        jButtonRegister.setMaximumSize(new java.awt.Dimension(50, 30));
        jButtonRegister.setMinimumSize(new java.awt.Dimension(50, 30));
        jButtonRegister.setPreferredSize(new java.awt.Dimension(50, 30));
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseClicked(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(30, 75, 112));
        jButtonExit.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Salir");
        jButtonExit.setMaximumSize(new java.awt.Dimension(66, 30));
        jButtonExit.setMinimumSize(new java.awt.Dimension(66, 30));
        jButtonExit.setPreferredSize(new java.awt.Dimension(66, 30));
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExitMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GameMaps");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamemaps/resources/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitMouseClicked

    private void jButtonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseClicked
        new RegisterForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegisterMouseClicked

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        new LoginForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
