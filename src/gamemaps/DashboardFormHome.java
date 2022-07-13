package gamemaps;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;


public class DashboardFormHome extends javax.swing.JFrame {

    public DashboardFormHome() {
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
        
        Aguascalientes.setBorder(new LineBorder(Color.WHITE));
        Aguascalientes.setBorder(new RoundedBorder(30));
        Aguascalientes.setContentAreaFilled(false);
        
        BajaCalifornia.setBorder(new LineBorder(Color.WHITE));
        BajaCalifornia.setBorder(new RoundedBorder(30));
        BajaCalifornia.setContentAreaFilled(false);
        
        BajaCaliforniaSur.setBorder(new LineBorder(Color.WHITE));
        BajaCaliforniaSur.setBorder(new RoundedBorder(30));
        BajaCaliforniaSur.setContentAreaFilled(false);
        
        Campeche.setBorder(new LineBorder(Color.WHITE));
        Campeche.setBorder(new RoundedBorder(30));
        Campeche.setContentAreaFilled(false);
        
        Chiapas.setBorder(new LineBorder(Color.WHITE));
        Chiapas.setBorder(new RoundedBorder(30));
        Chiapas.setContentAreaFilled(false);
        
        Chihuahua.setBorder(new LineBorder(Color.WHITE));
        Chihuahua.setBorder(new RoundedBorder(30));
        Chihuahua.setContentAreaFilled(false);
        
        Coahuila.setBorder(new LineBorder(Color.WHITE));
        Coahuila.setBorder(new RoundedBorder(30));
        Coahuila.setContentAreaFilled(false);
        
        Colima.setBorder(new LineBorder(Color.WHITE));
        Colima.setBorder(new RoundedBorder(30));
        Colima.setContentAreaFilled(false);
        
        Durango.setBorder(new LineBorder(Color.WHITE));
        Durango.setBorder(new RoundedBorder(30));
        Durango.setContentAreaFilled(false);
        
        Guanajuato.setBorder(new LineBorder(Color.WHITE));
        Guanajuato.setBorder(new RoundedBorder(30));
        Guanajuato.setContentAreaFilled(false);
        
        Guerrero.setBorder(new LineBorder(Color.WHITE));
        Guerrero.setBorder(new RoundedBorder(30));
        Guerrero.setContentAreaFilled(false);
        
        Hidalgo.setBorder(new LineBorder(Color.WHITE));
        Hidalgo.setBorder(new RoundedBorder(30));
        Hidalgo.setContentAreaFilled(false);
        
        Jalisco.setBorder(new LineBorder(Color.WHITE));
        Jalisco.setBorder(new RoundedBorder(30));
        Jalisco.setContentAreaFilled(false);
        
        Mexico.setBorder(new LineBorder(Color.WHITE));
        Mexico.setBorder(new RoundedBorder(30));
        Mexico.setContentAreaFilled(false);
        
        Michoacan.setBorder(new LineBorder(Color.WHITE));
        Michoacan.setBorder(new RoundedBorder(30));
        Michoacan.setContentAreaFilled(false);
        
        Morelos.setBorder(new LineBorder(Color.WHITE));
        Morelos.setBorder(new RoundedBorder(30));
        Morelos.setContentAreaFilled(false);
        
        Nayarit.setBorder(new LineBorder(Color.WHITE));
        Nayarit.setBorder(new RoundedBorder(30));
        Nayarit.setContentAreaFilled(false);
        
        NuevoLeon.setBorder(new LineBorder(Color.WHITE));
        NuevoLeon.setBorder(new RoundedBorder(30));
        NuevoLeon.setContentAreaFilled(false);
        
        Oaxaca.setBorder(new LineBorder(Color.WHITE));
        Oaxaca.setBorder(new RoundedBorder(30));
        Oaxaca.setContentAreaFilled(false);
        
        Puebla.setBorder(new LineBorder(Color.WHITE));
        Puebla.setBorder(new RoundedBorder(30));
        Puebla.setContentAreaFilled(false);
        
        Queretaro.setBorder(new LineBorder(Color.WHITE));
        Queretaro.setBorder(new RoundedBorder(30));
        Queretaro.setContentAreaFilled(false);
        
        QuintanaRoo.setBorder(new LineBorder(Color.WHITE));
        QuintanaRoo.setBorder(new RoundedBorder(30));
        QuintanaRoo.setContentAreaFilled(false);
        
        SLuisPotosi.setBorder(new LineBorder(Color.WHITE));
        SLuisPotosi.setBorder(new RoundedBorder(30));
        SLuisPotosi.setContentAreaFilled(false);
        
        Sinaloa.setBorder(new LineBorder(Color.WHITE));
        Sinaloa.setBorder(new RoundedBorder(30));
        Sinaloa.setContentAreaFilled(false);
        
        Sonora.setBorder(new LineBorder(Color.WHITE));
        Sonora.setBorder(new RoundedBorder(30));
        Sonora.setContentAreaFilled(false);
        
        Tabasco.setBorder(new LineBorder(Color.WHITE));
        Tabasco.setBorder(new RoundedBorder(30));
        Tabasco.setContentAreaFilled(false);
        
        Tamaulipas.setBorder(new LineBorder(Color.WHITE));
        Tamaulipas.setBorder(new RoundedBorder(30));
        Tamaulipas.setContentAreaFilled(false);
        
        Tlaxcala.setBorder(new LineBorder(Color.WHITE));
        Tlaxcala.setBorder(new RoundedBorder(30));
        Tlaxcala.setContentAreaFilled(false);
        
        Veracruz.setBorder(new LineBorder(Color.WHITE));
        Veracruz.setBorder(new RoundedBorder(30));
        Veracruz.setContentAreaFilled(false);
        
        Yucatan.setBorder(new LineBorder(Color.WHITE));
        Yucatan.setBorder(new RoundedBorder(30));
        Yucatan.setContentAreaFilled(false);
        
        Zacatecas.setBorder(new LineBorder(Color.WHITE));
        Zacatecas.setBorder(new RoundedBorder(30));
        Zacatecas.setContentAreaFilled(false);
       
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
        jLabelHomePage = new javax.swing.JLabel();
        Aguascalientes = new javax.swing.JButton();
        BajaCalifornia = new javax.swing.JButton();
        BajaCaliforniaSur = new javax.swing.JButton();
        Campeche = new javax.swing.JButton();
        Chihuahua = new javax.swing.JButton();
        Chiapas = new javax.swing.JButton();
        Colima = new javax.swing.JButton();
        Durango = new javax.swing.JButton();
        Guanajuato = new javax.swing.JButton();
        Coahuila = new javax.swing.JButton();
        Guerrero = new javax.swing.JButton();
        Hidalgo = new javax.swing.JButton();
        Jalisco = new javax.swing.JButton();
        Mexico = new javax.swing.JButton();
        Michoacan = new javax.swing.JButton();
        Morelos = new javax.swing.JButton();
        Nayarit = new javax.swing.JButton();
        NuevoLeon = new javax.swing.JButton();
        Oaxaca = new javax.swing.JButton();
        Puebla = new javax.swing.JButton();
        Queretaro = new javax.swing.JButton();
        QuintanaRoo = new javax.swing.JButton();
        SLuisPotosi = new javax.swing.JButton();
        Sinaloa = new javax.swing.JButton();
        Sonora = new javax.swing.JButton();
        Tabasco = new javax.swing.JButton();
        Tamaulipas = new javax.swing.JButton();
        Tlaxcala = new javax.swing.JButton();
        Veracruz = new javax.swing.JButton();
        Yucatan = new javax.swing.JButton();
        Zacatecas = new javax.swing.JButton();
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
        jLabelJudulHome.setText("GameMaps");
        jLabelJudulHome.setMaximumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setMinimumSize(new java.awt.Dimension(480, 60));
        jLabelJudulHome.setPreferredSize(new java.awt.Dimension(480, 60));

        jLabelHomePage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHomePage.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabelHomePage.setForeground(new java.awt.Color(30, 75, 112));
        jLabelHomePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHomePage.setText("Elige un estado");

        Aguascalientes.setBackground(new java.awt.Color(255, 255, 255));
        Aguascalientes.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Aguascalientes.setForeground(new java.awt.Color(255, 255, 255));
        Aguascalientes.setText("Aguascalientes");
        Aguascalientes.setMaximumSize(new java.awt.Dimension(66, 30));
        Aguascalientes.setMinimumSize(new java.awt.Dimension(66, 30));
        Aguascalientes.setPreferredSize(new java.awt.Dimension(66, 30));
        Aguascalientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AguascalientesMouseClicked(evt);
            }
        });
        Aguascalientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguascalientesActionPerformed(evt);
            }
        });

        BajaCalifornia.setBackground(new java.awt.Color(255, 255, 255));
        BajaCalifornia.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        BajaCalifornia.setForeground(new java.awt.Color(255, 255, 255));
        BajaCalifornia.setText("Baja California");
        BajaCalifornia.setMaximumSize(new java.awt.Dimension(66, 30));
        BajaCalifornia.setMinimumSize(new java.awt.Dimension(66, 30));
        BajaCalifornia.setPreferredSize(new java.awt.Dimension(66, 30));
        BajaCalifornia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BajaCaliforniaMouseClicked(evt);
            }
        });
        BajaCalifornia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaCaliforniaActionPerformed(evt);
            }
        });

        BajaCaliforniaSur.setBackground(new java.awt.Color(255, 255, 255));
        BajaCaliforniaSur.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        BajaCaliforniaSur.setForeground(new java.awt.Color(255, 255, 255));
        BajaCaliforniaSur.setText("Baja California Sur");
        BajaCaliforniaSur.setMaximumSize(new java.awt.Dimension(66, 30));
        BajaCaliforniaSur.setMinimumSize(new java.awt.Dimension(66, 30));
        BajaCaliforniaSur.setPreferredSize(new java.awt.Dimension(66, 30));
        BajaCaliforniaSur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BajaCaliforniaSurMouseClicked(evt);
            }
        });

        Campeche.setBackground(new java.awt.Color(255, 255, 255));
        Campeche.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Campeche.setForeground(new java.awt.Color(255, 255, 255));
        Campeche.setText("Campeche");
        Campeche.setMaximumSize(new java.awt.Dimension(66, 30));
        Campeche.setMinimumSize(new java.awt.Dimension(66, 30));
        Campeche.setPreferredSize(new java.awt.Dimension(66, 30));
        Campeche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampecheMouseClicked(evt);
            }
        });

        Chihuahua.setBackground(new java.awt.Color(255, 255, 255));
        Chihuahua.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Chihuahua.setForeground(new java.awt.Color(255, 255, 255));
        Chihuahua.setText("Chihuahua");
        Chihuahua.setMaximumSize(new java.awt.Dimension(66, 30));
        Chihuahua.setMinimumSize(new java.awt.Dimension(66, 30));
        Chihuahua.setPreferredSize(new java.awt.Dimension(66, 30));
        Chihuahua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChihuahuaMouseClicked(evt);
            }
        });

        Chiapas.setBackground(new java.awt.Color(255, 255, 255));
        Chiapas.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Chiapas.setForeground(new java.awt.Color(255, 255, 255));
        Chiapas.setText("Chiapas");
        Chiapas.setMaximumSize(new java.awt.Dimension(66, 30));
        Chiapas.setMinimumSize(new java.awt.Dimension(66, 30));
        Chiapas.setPreferredSize(new java.awt.Dimension(66, 30));
        Chiapas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChiapasMouseClicked(evt);
            }
        });

        Colima.setBackground(new java.awt.Color(255, 255, 255));
        Colima.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Colima.setForeground(new java.awt.Color(255, 255, 255));
        Colima.setText("Colima");
        Colima.setMaximumSize(new java.awt.Dimension(66, 30));
        Colima.setMinimumSize(new java.awt.Dimension(66, 30));
        Colima.setPreferredSize(new java.awt.Dimension(66, 30));
        Colima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColimaMouseClicked(evt);
            }
        });

        Durango.setBackground(new java.awt.Color(255, 255, 255));
        Durango.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Durango.setForeground(new java.awt.Color(255, 255, 255));
        Durango.setText("Durango");
        Durango.setMaximumSize(new java.awt.Dimension(66, 30));
        Durango.setMinimumSize(new java.awt.Dimension(66, 30));
        Durango.setPreferredSize(new java.awt.Dimension(66, 30));
        Durango.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DurangoMouseClicked(evt);
            }
        });

        Guanajuato.setBackground(new java.awt.Color(255, 255, 255));
        Guanajuato.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Guanajuato.setForeground(new java.awt.Color(255, 255, 255));
        Guanajuato.setText("Guanajuato");
        Guanajuato.setMaximumSize(new java.awt.Dimension(66, 30));
        Guanajuato.setMinimumSize(new java.awt.Dimension(66, 30));
        Guanajuato.setPreferredSize(new java.awt.Dimension(66, 30));
        Guanajuato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuanajuatoMouseClicked(evt);
            }
        });

        Coahuila.setBackground(new java.awt.Color(255, 255, 255));
        Coahuila.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Coahuila.setForeground(new java.awt.Color(255, 255, 255));
        Coahuila.setText("Coahuila");
        Coahuila.setMaximumSize(new java.awt.Dimension(66, 30));
        Coahuila.setMinimumSize(new java.awt.Dimension(66, 30));
        Coahuila.setPreferredSize(new java.awt.Dimension(66, 30));
        Coahuila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoahuilaMouseClicked(evt);
            }
        });

        Guerrero.setBackground(new java.awt.Color(255, 255, 255));
        Guerrero.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Guerrero.setForeground(new java.awt.Color(255, 255, 255));
        Guerrero.setText("Guerrero");
        Guerrero.setMaximumSize(new java.awt.Dimension(66, 30));
        Guerrero.setMinimumSize(new java.awt.Dimension(66, 30));
        Guerrero.setPreferredSize(new java.awt.Dimension(66, 30));
        Guerrero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuerreroMouseClicked(evt);
            }
        });

        Hidalgo.setBackground(new java.awt.Color(255, 255, 255));
        Hidalgo.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Hidalgo.setForeground(new java.awt.Color(255, 255, 255));
        Hidalgo.setText("Hidalgo");
        Hidalgo.setMaximumSize(new java.awt.Dimension(66, 30));
        Hidalgo.setMinimumSize(new java.awt.Dimension(66, 30));
        Hidalgo.setPreferredSize(new java.awt.Dimension(66, 30));
        Hidalgo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HidalgoMouseClicked(evt);
            }
        });

        Jalisco.setBackground(new java.awt.Color(255, 255, 255));
        Jalisco.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Jalisco.setForeground(new java.awt.Color(255, 255, 255));
        Jalisco.setText("Jalisco");
        Jalisco.setMaximumSize(new java.awt.Dimension(66, 30));
        Jalisco.setMinimumSize(new java.awt.Dimension(66, 30));
        Jalisco.setPreferredSize(new java.awt.Dimension(66, 30));
        Jalisco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JaliscoMouseClicked(evt);
            }
        });

        Mexico.setBackground(new java.awt.Color(255, 255, 255));
        Mexico.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Mexico.setForeground(new java.awt.Color(255, 255, 255));
        Mexico.setText("Mexico");
        Mexico.setMaximumSize(new java.awt.Dimension(66, 30));
        Mexico.setMinimumSize(new java.awt.Dimension(66, 30));
        Mexico.setPreferredSize(new java.awt.Dimension(66, 30));
        Mexico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MexicoMouseClicked(evt);
            }
        });

        Michoacan.setBackground(new java.awt.Color(255, 255, 255));
        Michoacan.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Michoacan.setForeground(new java.awt.Color(255, 255, 255));
        Michoacan.setText("Michoacan");
        Michoacan.setMaximumSize(new java.awt.Dimension(66, 30));
        Michoacan.setMinimumSize(new java.awt.Dimension(66, 30));
        Michoacan.setPreferredSize(new java.awt.Dimension(66, 30));
        Michoacan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MichoacanMouseClicked(evt);
            }
        });
        Michoacan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MichoacanActionPerformed(evt);
            }
        });

        Morelos.setBackground(new java.awt.Color(255, 255, 255));
        Morelos.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Morelos.setForeground(new java.awt.Color(255, 255, 255));
        Morelos.setText("Morelos");
        Morelos.setMaximumSize(new java.awt.Dimension(66, 30));
        Morelos.setMinimumSize(new java.awt.Dimension(66, 30));
        Morelos.setPreferredSize(new java.awt.Dimension(66, 30));
        Morelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MorelosMouseClicked(evt);
            }
        });

        Nayarit.setBackground(new java.awt.Color(255, 255, 255));
        Nayarit.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Nayarit.setForeground(new java.awt.Color(255, 255, 255));
        Nayarit.setText("Nayarit");
        Nayarit.setMaximumSize(new java.awt.Dimension(66, 30));
        Nayarit.setMinimumSize(new java.awt.Dimension(66, 30));
        Nayarit.setPreferredSize(new java.awt.Dimension(66, 30));
        Nayarit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NayaritMouseClicked(evt);
            }
        });

        NuevoLeon.setBackground(new java.awt.Color(255, 255, 255));
        NuevoLeon.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        NuevoLeon.setForeground(new java.awt.Color(255, 255, 255));
        NuevoLeon.setText("Nuevo Leon");
        NuevoLeon.setMaximumSize(new java.awt.Dimension(66, 30));
        NuevoLeon.setMinimumSize(new java.awt.Dimension(66, 30));
        NuevoLeon.setPreferredSize(new java.awt.Dimension(66, 30));
        NuevoLeon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoLeonMouseClicked(evt);
            }
        });

        Oaxaca.setBackground(new java.awt.Color(255, 255, 255));
        Oaxaca.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Oaxaca.setForeground(new java.awt.Color(255, 255, 255));
        Oaxaca.setText("Oaxaca");
        Oaxaca.setMaximumSize(new java.awt.Dimension(66, 30));
        Oaxaca.setMinimumSize(new java.awt.Dimension(66, 30));
        Oaxaca.setPreferredSize(new java.awt.Dimension(66, 30));
        Oaxaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OaxacaMouseClicked(evt);
            }
        });

        Puebla.setBackground(new java.awt.Color(255, 255, 255));
        Puebla.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Puebla.setForeground(new java.awt.Color(255, 255, 255));
        Puebla.setText("Puebla");
        Puebla.setMaximumSize(new java.awt.Dimension(66, 30));
        Puebla.setMinimumSize(new java.awt.Dimension(66, 30));
        Puebla.setPreferredSize(new java.awt.Dimension(66, 30));
        Puebla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PueblaMouseClicked(evt);
            }
        });

        Queretaro.setBackground(new java.awt.Color(255, 255, 255));
        Queretaro.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Queretaro.setForeground(new java.awt.Color(255, 255, 255));
        Queretaro.setText("Queretaro");
        Queretaro.setMaximumSize(new java.awt.Dimension(66, 30));
        Queretaro.setMinimumSize(new java.awt.Dimension(66, 30));
        Queretaro.setPreferredSize(new java.awt.Dimension(66, 30));
        Queretaro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QueretaroMouseClicked(evt);
            }
        });

        QuintanaRoo.setBackground(new java.awt.Color(255, 255, 255));
        QuintanaRoo.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        QuintanaRoo.setForeground(new java.awt.Color(255, 255, 255));
        QuintanaRoo.setText("Quintana Roo");
        QuintanaRoo.setMaximumSize(new java.awt.Dimension(66, 30));
        QuintanaRoo.setMinimumSize(new java.awt.Dimension(66, 30));
        QuintanaRoo.setPreferredSize(new java.awt.Dimension(66, 30));
        QuintanaRoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuintanaRooMouseClicked(evt);
            }
        });

        SLuisPotosi.setBackground(new java.awt.Color(255, 255, 255));
        SLuisPotosi.setFont(new java.awt.Font("Roboto Black", 1, 10)); // NOI18N
        SLuisPotosi.setForeground(new java.awt.Color(255, 255, 255));
        SLuisPotosi.setText("San Luis Potosi");
        SLuisPotosi.setMaximumSize(new java.awt.Dimension(66, 30));
        SLuisPotosi.setMinimumSize(new java.awt.Dimension(66, 30));
        SLuisPotosi.setPreferredSize(new java.awt.Dimension(66, 30));
        SLuisPotosi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SLuisPotosiMouseClicked(evt);
            }
        });

        Sinaloa.setBackground(new java.awt.Color(255, 255, 255));
        Sinaloa.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Sinaloa.setForeground(new java.awt.Color(255, 255, 255));
        Sinaloa.setText("Sinaloa");
        Sinaloa.setMaximumSize(new java.awt.Dimension(66, 30));
        Sinaloa.setMinimumSize(new java.awt.Dimension(66, 30));
        Sinaloa.setPreferredSize(new java.awt.Dimension(66, 30));
        Sinaloa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SinaloaMouseClicked(evt);
            }
        });

        Sonora.setBackground(new java.awt.Color(255, 255, 255));
        Sonora.setFont(new java.awt.Font("Roboto Black", 1, 10)); // NOI18N
        Sonora.setForeground(new java.awt.Color(255, 255, 255));
        Sonora.setText("Sonora");
        Sonora.setMaximumSize(new java.awt.Dimension(66, 30));
        Sonora.setMinimumSize(new java.awt.Dimension(66, 30));
        Sonora.setPreferredSize(new java.awt.Dimension(66, 30));
        Sonora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SonoraMouseClicked(evt);
            }
        });

        Tabasco.setBackground(new java.awt.Color(255, 255, 255));
        Tabasco.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Tabasco.setForeground(new java.awt.Color(255, 255, 255));
        Tabasco.setText("Tabasco");
        Tabasco.setMaximumSize(new java.awt.Dimension(66, 30));
        Tabasco.setMinimumSize(new java.awt.Dimension(66, 30));
        Tabasco.setPreferredSize(new java.awt.Dimension(66, 30));
        Tabasco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabascoMouseClicked(evt);
            }
        });

        Tamaulipas.setBackground(new java.awt.Color(255, 255, 255));
        Tamaulipas.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Tamaulipas.setForeground(new java.awt.Color(255, 255, 255));
        Tamaulipas.setText("Tamaulipas");
        Tamaulipas.setMaximumSize(new java.awt.Dimension(66, 30));
        Tamaulipas.setMinimumSize(new java.awt.Dimension(66, 30));
        Tamaulipas.setPreferredSize(new java.awt.Dimension(66, 30));
        Tamaulipas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TamaulipasMouseClicked(evt);
            }
        });

        Tlaxcala.setBackground(new java.awt.Color(255, 255, 255));
        Tlaxcala.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Tlaxcala.setForeground(new java.awt.Color(255, 255, 255));
        Tlaxcala.setText("Tlaxcala");
        Tlaxcala.setMaximumSize(new java.awt.Dimension(66, 30));
        Tlaxcala.setMinimumSize(new java.awt.Dimension(66, 30));
        Tlaxcala.setPreferredSize(new java.awt.Dimension(66, 30));
        Tlaxcala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TlaxcalaMouseClicked(evt);
            }
        });

        Veracruz.setBackground(new java.awt.Color(255, 255, 255));
        Veracruz.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Veracruz.setForeground(new java.awt.Color(255, 255, 255));
        Veracruz.setText("Veracruz");
        Veracruz.setMaximumSize(new java.awt.Dimension(66, 30));
        Veracruz.setMinimumSize(new java.awt.Dimension(66, 30));
        Veracruz.setPreferredSize(new java.awt.Dimension(66, 30));
        Veracruz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VeracruzMouseClicked(evt);
            }
        });

        Yucatan.setBackground(new java.awt.Color(255, 255, 255));
        Yucatan.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Yucatan.setForeground(new java.awt.Color(255, 255, 255));
        Yucatan.setText("Yucatan");
        Yucatan.setMaximumSize(new java.awt.Dimension(66, 30));
        Yucatan.setMinimumSize(new java.awt.Dimension(66, 30));
        Yucatan.setPreferredSize(new java.awt.Dimension(66, 30));
        Yucatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YucatanMouseClicked(evt);
            }
        });

        Zacatecas.setBackground(new java.awt.Color(255, 255, 255));
        Zacatecas.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Zacatecas.setForeground(new java.awt.Color(255, 255, 255));
        Zacatecas.setText("Zacatecas");
        Zacatecas.setMaximumSize(new java.awt.Dimension(66, 30));
        Zacatecas.setMinimumSize(new java.awt.Dimension(66, 30));
        Zacatecas.setPreferredSize(new java.awt.Dimension(66, 30));
        Zacatecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZacatecasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJudulHome, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addComponent(jLabelHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(BajaCaliforniaSur, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Mexico, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Guerrero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Campeche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(Chihuahua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(Chiapas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(Coahuila, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(Colima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(Durango, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(Guanajuato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Queretaro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Puebla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Oaxaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(NuevoLeon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(Nayarit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Morelos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(QuintanaRoo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(Michoacan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Aguascalientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Hidalgo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BajaCalifornia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jalisco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tamaulipas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tabasco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tlaxcala, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Veracruz, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Yucatan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Zacatecas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sonora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sinaloa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SLuisPotosi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelJudulHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHomePage)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aguascalientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hidalgo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SLuisPotosi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BajaCalifornia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jalisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Sinaloa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BajaCaliforniaSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mexico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sonora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campeche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Michoacan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tabasco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chihuahua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Morelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tamaulipas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chiapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nayarit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlaxcala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Coahuila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoLeon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Veracruz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Colima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Oaxaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Yucatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Durango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Puebla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Zacatecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Queretaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guanajuato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(QuintanaRoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Guerrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelImagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabelImageHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void jLabelAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAboutMouseClicked
        new DashboardFormAbout().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabelAboutMouseClicked

    private void mapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapaMouseClicked
        // TODO add your handling code here:
        JFrame marco = new JFrame();
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

    private void AguascalientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AguascalientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AguascalientesMouseClicked

    private void BajaCaliforniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BajaCaliforniaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BajaCaliforniaMouseClicked

    private void BajaCaliforniaSurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BajaCaliforniaSurMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BajaCaliforniaSurMouseClicked

    private void CampecheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampecheMouseClicked
        // TODO add your handling code here:
      new menuCampeche().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CampecheMouseClicked

    private void ChihuahuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChihuahuaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ChihuahuaMouseClicked

    private void ChiapasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChiapasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ChiapasMouseClicked

    private void CoahuilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoahuilaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CoahuilaMouseClicked

    private void ColimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColimaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ColimaMouseClicked

    private void DurangoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DurangoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DurangoMouseClicked

    private void GuanajuatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuanajuatoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GuanajuatoMouseClicked

    private void AguascalientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguascalientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AguascalientesActionPerformed

    private void BajaCaliforniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaCaliforniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BajaCaliforniaActionPerformed

    private void GuerreroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuerreroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GuerreroMouseClicked

    private void HidalgoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HidalgoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HidalgoMouseClicked

    private void JaliscoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JaliscoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JaliscoMouseClicked

    private void MexicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MexicoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MexicoMouseClicked

    private void MichoacanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MichoacanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MichoacanMouseClicked

    private void MorelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MorelosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MorelosMouseClicked

    private void NayaritMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NayaritMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NayaritMouseClicked

    private void NuevoLeonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoLeonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoLeonMouseClicked

    private void OaxacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OaxacaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OaxacaMouseClicked

    private void PueblaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PueblaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PueblaMouseClicked

    private void MichoacanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MichoacanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MichoacanActionPerformed

    private void QueretaroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QueretaroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_QueretaroMouseClicked

    private void QuintanaRooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuintanaRooMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_QuintanaRooMouseClicked

    private void SLuisPotosiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SLuisPotosiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SLuisPotosiMouseClicked

    private void SinaloaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SinaloaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SinaloaMouseClicked

    private void SonoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SonoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SonoraMouseClicked

    private void TabascoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabascoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabascoMouseClicked

    private void TamaulipasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TamaulipasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TamaulipasMouseClicked

    private void TlaxcalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TlaxcalaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TlaxcalaMouseClicked

    private void VeracruzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VeracruzMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VeracruzMouseClicked

    private void YucatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YucatanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_YucatanMouseClicked

    private void ZacatecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZacatecasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ZacatecasMouseClicked

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
    private javax.swing.JButton Aguascalientes;
    private javax.swing.JButton BajaCalifornia;
    private javax.swing.JButton BajaCaliforniaSur;
    private javax.swing.JButton Campeche;
    private javax.swing.JButton Chiapas;
    private javax.swing.JButton Chihuahua;
    private javax.swing.JButton Coahuila;
    private javax.swing.JButton Colima;
    private javax.swing.JButton Durango;
    private javax.swing.JButton Guanajuato;
    private javax.swing.JButton Guerrero;
    private javax.swing.JButton Hidalgo;
    private javax.swing.JButton Jalisco;
    private javax.swing.JButton Mexico;
    private javax.swing.JButton Michoacan;
    private javax.swing.JButton Morelos;
    private javax.swing.JButton Nayarit;
    private javax.swing.JButton NuevoLeon;
    private javax.swing.JButton Oaxaca;
    private javax.swing.JButton Puebla;
    private javax.swing.JButton Queretaro;
    private javax.swing.JButton QuintanaRoo;
    private javax.swing.JButton SLuisPotosi;
    private javax.swing.JButton Sinaloa;
    private javax.swing.JButton Sonora;
    private javax.swing.JButton Tabasco;
    private javax.swing.JButton Tamaulipas;
    private javax.swing.JButton Tlaxcala;
    private javax.swing.JButton Veracruz;
    private javax.swing.JButton Yucatan;
    private javax.swing.JButton Zacatecas;
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
