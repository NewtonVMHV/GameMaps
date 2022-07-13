package gamemaps;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class DashboardFormAbout extends javax.swing.JFrame {

    public DashboardFormAbout() {
        initComponents();
        this.setLocationRelativeTo(null);//Center Form in the screen
        this.setBackground(new Color(30,75,112));
        setIco();
        
        jPanel1.setBackground(new Color(30,75,112));
        jPanel1.setOpaque(true);
        
        jPanel3.setBackground(new Color(30,75,112));
        jPanel3.setOpaque(true);
        
        jLabelJudulHome.setBackground(new Color(30,75,112));
        jLabelJudulHome.setOpaque(true);
        
        jButtonLogOut.setBorder(new LineBorder(Color.WHITE));
        jButtonLogOut.setBorder(new RoundedBorder(30));
        jButtonLogOut.setContentAreaFilled(false);
        
        Trivia.setBorder(new LineBorder(Color.WHITE));
        Trivia.setBorder(new RoundedBorder(30));
        Trivia.setContentAreaFilled(false);
        
        Rompecabeza.setBorder(new LineBorder(Color.WHITE));
        Rompecabeza.setBorder(new RoundedBorder(30));
        Rompecabeza.setContentAreaFilled(false);
        
        Adivinanza.setBorder(new LineBorder(Color.WHITE));
        Adivinanza.setBorder(new RoundedBorder(30));
        Adivinanza.setContentAreaFilled(false);
        
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
        jPanel4 = new javax.swing.JPanel();
        jLabelFullName = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jTextFieldGender = new javax.swing.JTextField();
        logros = new javax.swing.JLabel();
        Trivia = new javax.swing.JButton();
        Rompecabeza = new javax.swing.JButton();
        Adivinanza = new javax.swing.JButton();
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
        jLabelJudulHome.setText("PERFIL");
        jLabelJudulHome.setMaximumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setMinimumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setPreferredSize(new java.awt.Dimension(480, 60));

        jPanel4.setPreferredSize(new java.awt.Dimension(470, 470));

        jLabelFullName.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelFullName.setForeground(new java.awt.Color(30, 78, 112));
        jLabelFullName.setText("Nombre completo");

        jLabelEmail.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(30, 78, 112));
        jLabelEmail.setText("Correo");

        jLabelUsername.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(30, 78, 112));
        jLabelUsername.setText("Nickname");

        jTextFieldFullName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldFullName.setText("Victor Manuel Hernandez Vargas");
        jTextFieldFullName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldFullName.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldFullName.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldFullName.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldFullName.setSelectionColor(new java.awt.Color(30, 75, 112));
        jTextFieldFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFullNameActionPerformed(evt);
            }
        });

        jTextFieldUsername.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldUsername.setText("test");
        jTextFieldUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldUsername.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldUsername.setSelectionColor(new java.awt.Color(30, 75, 112));

        jTextFieldEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldEmail.setText("vargasvictor847@gmail.com");
        jTextFieldEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldEmail.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldEmail.setSelectionColor(new java.awt.Color(30, 75, 112));

        jLabelGender.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(30, 78, 112));
        jLabelGender.setText("Genero");

        jTextFieldGender.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldGender.setText("Masculino");
        jTextFieldGender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldGender.setMaximumSize(new java.awt.Dimension(66, 30));
        jTextFieldGender.setMinimumSize(new java.awt.Dimension(66, 30));
        jTextFieldGender.setPreferredSize(new java.awt.Dimension(66, 30));
        jTextFieldGender.setSelectionColor(new java.awt.Color(30, 75, 112));

        logros.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        logros.setForeground(new java.awt.Color(30, 78, 112));
        logros.setText("Logros");

        Trivia.setBackground(new java.awt.Color(255, 255, 255));
        Trivia.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Trivia.setForeground(new java.awt.Color(255, 255, 255));
        Trivia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamemaps/resources/insignia.png"))); // NOI18N
        Trivia.setMaximumSize(new java.awt.Dimension(66, 30));
        Trivia.setMinimumSize(new java.awt.Dimension(66, 30));
        Trivia.setPreferredSize(new java.awt.Dimension(66, 30));
        Trivia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TriviaMouseClicked(evt);
            }
        });

        Rompecabeza.setBackground(new java.awt.Color(255, 255, 255));
        Rompecabeza.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Rompecabeza.setForeground(new java.awt.Color(255, 255, 255));
        Rompecabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamemaps/resources/star.png"))); // NOI18N
        Rompecabeza.setMaximumSize(new java.awt.Dimension(66, 30));
        Rompecabeza.setMinimumSize(new java.awt.Dimension(66, 30));
        Rompecabeza.setPreferredSize(new java.awt.Dimension(66, 30));
        Rompecabeza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RompecabezaMouseClicked(evt);
            }
        });

        Adivinanza.setBackground(new java.awt.Color(255, 255, 255));
        Adivinanza.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Adivinanza.setForeground(new java.awt.Color(255, 255, 255));
        Adivinanza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamemaps/resources/premium-badge.png"))); // NOI18N
        Adivinanza.setMaximumSize(new java.awt.Dimension(66, 30));
        Adivinanza.setMinimumSize(new java.awt.Dimension(66, 30));
        Adivinanza.setPreferredSize(new java.awt.Dimension(66, 30));
        Adivinanza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdivinanzaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFullName)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelUsername)
                            .addComponent(jLabelGender))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(logros)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Trivia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rompecabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Adivinanza, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFullName)
                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGender))
                .addGap(26, 26, 26)
                .addComponent(logros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Trivia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rompecabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adivinanza, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 91, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 480, 490));

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelImagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabelImageHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
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
                    .addComponent(jLabelImagePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
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

    private void jLabelImagePersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagePersonMouseClicked
        new DashboardFormAbout().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagePersonMouseClicked

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

    private void jTextFieldFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFullNameActionPerformed

    private void TriviaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TriviaMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Trivia Campeche");
    }//GEN-LAST:event_TriviaMouseClicked

    private void RompecabezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RompecabezaMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Rompecabeza Campeche");
    }//GEN-LAST:event_RompecabezaMouseClicked

    private void AdivinanzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdivinanzaMouseClicked
        JOptionPane.showMessageDialog(null, "Adivinanza Campeche");// TODO add your handling code here:
    }//GEN-LAST:event_AdivinanzaMouseClicked

    private void acercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaMouseClicked
        new Acerca().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_acercaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardFormAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adivinanza;
    private javax.swing.JButton Rompecabeza;
    private javax.swing.JButton Trivia;
    private javax.swing.JLabel acerca;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAbout;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelImageHome;
    private javax.swing.JLabel jLabelImagePerson;
    private javax.swing.JLabel jLabelJudulHome;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel logros;
    private javax.swing.JLabel mapa;
    // End of variables declaration//GEN-END:variables
}
