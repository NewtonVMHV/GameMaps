package gamemaps;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;


public class Acerca extends javax.swing.JFrame {
String texto ="<html><body><center>GameMaps fue desarrollado de manera didáctica a travez"
        + " de la historia, cultura y costumbres para  niños de tercer grado de Educación Primaria en adelante."
        + " Para conocer las cualidades y los conocimientos del alumno de manera didáctico, <br> tambien para definir las aptitudes dentro del campo de la Historia.</center>"
        + "<br><br><center>INTEGRANTES DE GAMEMAPS: <br>Victor Manuel Hernandez Vargas (Programador) <br>Jose Carlos Ronzon Garcia (Analista) <br>Alfonso Escalante Rosado (Diseñador y Tester)"
        + "<br>Dorys Sujey Ortiz Cruz (Analista)</center></body></html>";
    public Acerca() {
        initComponents();
        this.setLocationRelativeTo(null);//Center Form in the screen
        this.setBackground(new Color(30,75,112));
        setIco();
        
        jPanel1.setBackground(new Color(30,75,112));
        jPanel1.setOpaque(true);
        
        jPanel3.setBackground(new Color(30,75,112));
        jPanel3.setOpaque(true);
        
        jLabelHomePage.setBackground(new Color(255,255,255,230));
        jLabelHomePage.setOpaque(true);
        
        jLabelJudulHome.setBackground(new Color(30,75,112));
        jLabelJudulHome.setOpaque(true);
        
        jButtonLogOut.setBorder(new LineBorder(Color.WHITE));
        jButtonLogOut.setBorder(new RoundedBorder(30));
        jButtonLogOut.setContentAreaFilled(false);
        
        //Load Icon untuk jLabelHome
        ImageIcon iconHome = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Home_white.png")));
        Image homeImage = iconHome.getImage();
        Image homeScaledImage = homeImage.getScaledInstance(jLabelImageHome.getWidth(), jLabelImageHome.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIconHome = new ImageIcon(homeScaledImage);
        jLabelImageHome.setIcon(finalIconHome);
        
        //Load Icon untuk jLabelPerson
        ImageIcon iconPerson = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Person_white.png")));
        Image personImage = iconPerson.getImage();
        Image personScaledImage = personImage.getScaledInstance(jLabelImagePerson.getWidth(), jLabelImagePerson.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon finalIconPerson = new ImageIcon(personScaledImage);
        jLabelImagePerson.setIcon(finalIconPerson);
        
       jLabelHomePage.setText(texto);
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabelJudulHome = new javax.swing.JLabel();
        jLabelHomePage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonLogOut = new javax.swing.JButton();
        jLabelHome = new javax.swing.JLabel();
        jLabelAbout = new javax.swing.JLabel();
        jLabelImagePerson = new javax.swing.JLabel();
        jLabelImageHome = new javax.swing.JLabel();
        mapa = new javax.swing.JLabel();
        acerca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 75, 112));
        setMinimumSize(new java.awt.Dimension(720, 490));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(720, 490));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 490));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(30, 75, 112));
        jPanel2.setMaximumSize(new java.awt.Dimension(470, 470));
        jPanel2.setMinimumSize(new java.awt.Dimension(470, 470));

        jLabelJudulHome.setBackground(new java.awt.Color(30, 75, 112));
        jLabelJudulHome.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelJudulHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJudulHome.setText("ACERCA DE");
        jLabelJudulHome.setMaximumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setMinimumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setPreferredSize(new java.awt.Dimension(480, 60));

        jLabelHomePage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHomePage.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelHomePage.setForeground(new java.awt.Color(30, 75, 112));
        jLabelHomePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 550, 490));

        jButtonLogOut.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setText("Cerrar sesion");
        jButtonLogOut.setMaximumSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.setMinimumSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.setPreferredSize(new java.awt.Dimension(66, 30));
        jButtonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogOutMouseClicked(evt);
            }
        });

        jLabelHome.setBackground(new java.awt.Color(30, 75, 112));
        jLabelHome.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setText("GameMaps");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });

        jLabelAbout.setBackground(new java.awt.Color(30, 75, 112));
        jLabelAbout.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelAbout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAbout.setText("Perfil");
        jLabelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAboutMouseClicked(evt);
            }
        });

        jLabelImagePerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagePersonMouseClicked(evt);
            }
        });

        jLabelImageHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageHomeMouseClicked(evt);
            }
        });

        mapa.setBackground(new java.awt.Color(30, 75, 112));
        mapa.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        mapa.setForeground(new java.awt.Color(255, 255, 255));
        mapa.setText("Ver Mapa");
        mapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapaMouseClicked(evt);
            }
        });

        acerca.setBackground(new java.awt.Color(30, 75, 112));
        acerca.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        acerca.setForeground(new java.awt.Color(255, 255, 255));
        acerca.setText("Acerca de");
        acerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acercaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelImagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabelImageHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(mapa, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImageHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImagePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 490));

        jLabel1.setMaximumSize(new java.awt.Dimension(720, 490));
        jLabel1.setMinimumSize(new java.awt.Dimension(720, 490));
        jLabel1.setPreferredSize(new java.awt.Dimension(720, 490));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogOutMouseClicked
        new LandingPageForm().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogOutMouseClicked

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        new DashboardFormHome().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelImageHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageHomeMouseClicked
        new DashboardFormHome().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelImageHomeMouseClicked

    private void jLabelAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutMouseClicked
        new DashboardFormAbout().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutMouseClicked

    private void mapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapaMouseClicked
        // TODO add your handling code here:
        JFrame marco = new JFrame( "Republica Mexicana" );
        marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Mapa poligonosJPanel = new Mapa();
        marco.add( poligonosJPanel ); // agrega poligonosJPanel al marco
        marco.setSize( 1250, 800 ); // establece el tamaño del marco
        marco.setVisible( true ); // muestra el marco
    }//GEN-LAST:event_mapaMouseClicked

    private void jLabelImagePersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagePersonMouseClicked
        new DashboardFormAbout().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagePersonMouseClicked

    private void acercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaMouseClicked
        new Acerca().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_acercaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardFormHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acerca;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAbout;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelHomePage;
    private javax.swing.JLabel jLabelImageHome;
    private javax.swing.JLabel jLabelImagePerson;
    private javax.swing.JLabel jLabelJudulHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mapa;
    // End of variables declaration//GEN-END:variables
}
