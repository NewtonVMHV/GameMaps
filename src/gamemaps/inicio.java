/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemaps;

import javax.swing.ImageIcon;
import clases.juego;
import clases.preguntas;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Estudiante
 */
public final class inicio extends javax.swing.JFrame {
    CardLayout card;
    boolean respuesta = false;
    int count = 0;
    juego j = new juego();
    ImageIcon piedraIcon = new ImageIcon(getClass().getResource("/img/piedra.png"));
    ImageIcon papelIcon = new ImageIcon(getClass().getResource("/img/papel.png"));
    ImageIcon tijeraIcon = new ImageIcon(getClass().getResource("/img/tijera.png"));
    Object [] opciones ={"Aceptar","Cancelar"};
    int resultadoPpt;

    
    public ImageIcon seleccionarIconoPpt(String eleccion){
        ImageIcon icon = piedraIcon;
    switch (eleccion){
        case "Piedra":
                icon = piedraIcon;
                break;
            case "Papel":
                icon = papelIcon;
                break;
            case "Tijera":
                icon = tijeraIcon;
                break;
    }
    return icon;
    }
    public void agregarPuntaje (int puntos){
        juego.puntaje += puntos;
        txtPuntajeI.setText(String.valueOf(juego.puntaje)+"XP");
    }
    public void quitarVida(){
        juego.vidas--; 
        if (juego.vidas >= 1) {
            if (juego.vidas == 2) {
                lblVidasI.setText("♥ ♥");
            }
            else if (juego.vidas == 1) {
                lblVidasI.setText("♥");
            }
        }
        else if(juego.vidas == 0){
            lblVidasI.setText("");
            card.show(panel, "GameOver");
            lblPuntajeFinal.setText("Tu puntaje final es de: " + String.valueOf(juego.puntaje)+"XP");
        }
        
    }
    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIco();
        
        btnReiniciarJuego.setBorder(new LineBorder(Color.BLUE));
        btnReiniciarJuego.setBorder(new RoundedBorder(30));
        btnReiniciarJuego.setContentAreaFilled(false);
        
        btnIniciarJuego.setBorder(new LineBorder(Color.BLUE));
        btnIniciarJuego.setBorder(new RoundedBorder(30));
        btnIniciarJuego.setContentAreaFilled(false);
        
        btnPiedra.setBorder(new LineBorder(Color.BLUE));
        btnPiedra.setBorder(new RoundedBorder(30));
        btnPiedra.setContentAreaFilled(false);
        
        btnPapel.setBorder(new LineBorder(Color.BLUE));
        btnPapel.setBorder(new RoundedBorder(30));
        btnPapel.setContentAreaFilled(false);
        
        btnTijera.setBorder(new LineBorder(Color.BLUE));
        btnTijera.setBorder(new RoundedBorder(30));
        btnTijera.setContentAreaFilled(false);
        
        btnContinuarPpt.setBorder(new LineBorder(Color.BLUE));
        btnContinuarPpt.setBorder(new RoundedBorder(30));
        btnContinuarPpt.setContentAreaFilled(false);
        
        siguiente.setBorder(new LineBorder(Color.BLUE));
        siguiente.setBorder(new RoundedBorder(30));
        siguiente.setContentAreaFilled(false);
        
        btnContinuar.setBorder(new LineBorder(Color.BLUE));
        btnContinuar.setBorder(new RoundedBorder(30));
        btnContinuar.setContentAreaFilled(false);
        
        btnRegresarInicio.setBorder(new LineBorder(Color.BLUE));
        btnRegresarInicio.setBorder(new RoundedBorder(30));
        btnRegresarInicio.setContentAreaFilled(false);
        
        
        this.card = (CardLayout)(panel.getLayout());
        lblPuntaje.setVisible(false);
        txtPuntajeI.setVisible(false);
        lblVida.setVisible(false);
        lblVidasI.setVisible(false);
        resetearJuego();
        card.show(panel, "Inicio");
    }
    public void resetearJuego(){
        lblVidasI.setText("♥ ♥ ♥ ");
        txtPuntajeI.setText("0XP");
        juego.puntaje = 0;
        juego.vidas = 3;
        juego.nivel = 0;
        count = 0;
    }
    private void enableRespuestas(){
    btnResp1.setEnabled(true);
    btnResp2.setEnabled(true);
    btnResp3.setEnabled(true);
    btnResp4.setEnabled(true);
    }
    private void disableRespuestas(){
    btnResp1.setEnabled(false);
    btnResp2.setEnabled(false);
    btnResp3.setEnabled(false);
    btnResp4.setEnabled(false);
    }
    private void setIco() {
        Image imagen;

        try {
            imagen = ImageIO.read( getClass().getClassLoader().getResource( "gamemaps/resources/logo.png" ) );
            setIconImage(imagen);
        } catch( java.io.IOException e ){
        }
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
        lblPuntaje = new javax.swing.JLabel();
        txtPuntajeI = new javax.swing.JTextField();
        lblVida = new javax.swing.JLabel();
        lblVidasI = new javax.swing.JLabel();
        jLabelFormClose = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIniciarJuego = new javax.swing.JButton();
        pnlPpt = new javax.swing.JPanel();
        btnPiedra = new javax.swing.JButton();
        btnPapel = new javax.swing.JButton();
        btnTijera = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlResultadoPpt = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEleccionPptJ = new javax.swing.JLabel();
        lblEleccionPptC = new javax.swing.JLabel();
        btnContinuarPpt = new javax.swing.JButton();
        lblAcccionPpt = new javax.swing.JLabel();
        pnlPregunta = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblEnunciado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnResp1 = new javax.swing.JButton();
        btnResp3 = new javax.swing.JButton();
        btnResp4 = new javax.swing.JButton();
        btnResp2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        lblTiempo = new javax.swing.JLabel();
        pnlSiguienteNivel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblSiguienteNivel = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        pnlGameOver = new javax.swing.JPanel();
        btnRegresarInicio = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblPuntajeFinal = new javax.swing.JLabel();
        pnlFinalizarJuego = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblResultadoFinal = new javax.swing.JLabel();
        btnReiniciarJuego = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(30, 75, 112));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 100));

        lblPuntaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPuntaje.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntaje.setText("Puntaje:");

        txtPuntajeI.setEditable(false);
        txtPuntajeI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPuntajeI.setText("500XP");

        lblVida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblVida.setForeground(new java.awt.Color(255, 255, 255));
        lblVida.setText("Vida:");

        lblVidasI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblVidasI.setForeground(new java.awt.Color(204, 0, 0));
        lblVidasI.setText("♥ ♥ ♥ ");

        jLabelFormClose.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelFormClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFormClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFormClose.setText("X");
        jLabelFormClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFormCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPuntajeI, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblVida, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVidasI, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, Short.MAX_VALUE)
                .addComponent(jLabelFormClose)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPuntajeI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVidasI, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFormClose))
                        .addComponent(lblVida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.setPreferredSize(new java.awt.Dimension(0, 400));
        panel.setLayout(new java.awt.CardLayout());

        pnlInicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 75, 112));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADIVINA EL MUNICIPIO");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Desafía a tus conocimientos");

        btnIniciarJuego.setText("Iniciar");
        btnIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(374, 374, 374))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInicioLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(75, 75, 75)
                .addComponent(btnIniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        panel.add(pnlInicio, "Inicio");

        pnlPpt.setBackground(new java.awt.Color(255, 255, 255));

        btnPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piedra.png"))); // NOI18N
        btnPiedra.setBorderPainted(false);
        btnPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiedraActionPerformed(evt);
            }
        });

        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel.png"))); // NOI18N
        btnPapel.setBorderPainted(false);
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        btnTijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tijera.png"))); // NOI18N
        btnTijera.setBorderPainted(false);
        btnTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTijeraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Juega piedra papel o tijera. Si ganas, obtendras 10XP, si pierdes tendras que responder una pregunta.");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 75, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Piedra, papel o tijera...");

        javax.swing.GroupLayout pnlPptLayout = new javax.swing.GroupLayout(pnlPpt);
        pnlPpt.setLayout(pnlPptLayout);
        pnlPptLayout.setHorizontalGroup(
            pnlPptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPptLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        pnlPptLayout.setVerticalGroup(
            pnlPptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPptLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(pnlPptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.add(pnlPpt, "Ppt");

        pnlResultadoPpt.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Juega piedra papel o tijera. Si ganas, obtendras 10XP, si pierdes tendras que responder una pregunta.");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(30, 75, 112));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Piedra, papel o tijera...");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VS");

        lblEleccionPptJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piedra.png"))); // NOI18N

        lblEleccionPptC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piedra.png"))); // NOI18N

        btnContinuarPpt.setText("CONTINUAR");
        btnContinuarPpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarPptActionPerformed(evt);
            }
        });

        lblAcccionPpt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAcccionPpt.setForeground(new java.awt.Color(0, 51, 255));
        lblAcccionPpt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcccionPpt.setText("GANASTE +10XP");

        javax.swing.GroupLayout pnlResultadoPptLayout = new javax.swing.GroupLayout(pnlResultadoPpt);
        pnlResultadoPpt.setLayout(pnlResultadoPptLayout);
        pnlResultadoPptLayout.setHorizontalGroup(
            pnlResultadoPptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResultadoPptLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlResultadoPptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResultadoPptLayout.createSequentialGroup()
                        .addComponent(lblEleccionPptJ)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80)
                        .addComponent(lblEleccionPptC)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResultadoPptLayout.createSequentialGroup()
                        .addComponent(lblAcccionPpt, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
            .addGroup(pnlResultadoPptLayout.createSequentialGroup()
                .addGroup(pnlResultadoPptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResultadoPptLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlResultadoPptLayout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(btnContinuarPpt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlResultadoPptLayout.setVerticalGroup(
            pnlResultadoPptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoPptLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlResultadoPptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResultadoPptLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9))
                    .addComponent(lblEleccionPptC)
                    .addComponent(lblEleccionPptJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(lblAcccionPpt)
                .addGap(18, 18, 18)
                .addComponent(btnContinuarPpt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel.add(pnlResultadoPpt, "ResultadoPpt");

        pnlPregunta.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 189, 157), 2, true), "Pregunta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        lblEnunciado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnunciado.setText("Enunciado");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnResp1.setBackground(new java.awt.Color(153, 153, 153));
        btnResp1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnResp1.setForeground(new java.awt.Color(255, 255, 255));
        btnResp1.setText("Respuesta");
        btnResp1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResp1.setBorderPainted(false);
        btnResp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp1ActionPerformed(evt);
            }
        });

        btnResp3.setBackground(new java.awt.Color(153, 153, 153));
        btnResp3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnResp3.setForeground(new java.awt.Color(255, 255, 255));
        btnResp3.setText("Respuesta");
        btnResp3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResp3.setBorderPainted(false);
        btnResp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp3ActionPerformed(evt);
            }
        });

        btnResp4.setBackground(new java.awt.Color(153, 153, 153));
        btnResp4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnResp4.setForeground(new java.awt.Color(255, 255, 255));
        btnResp4.setText("Respuesta");
        btnResp4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResp4.setBorderPainted(false);
        btnResp4.setPreferredSize(new java.awt.Dimension(400, 17));
        btnResp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp4ActionPerformed(evt);
            }
        });

        btnResp2.setBackground(new java.awt.Color(153, 153, 153));
        btnResp2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnResp2.setForeground(new java.awt.Color(255, 255, 255));
        btnResp2.setText("Respuesta");
        btnResp2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResp2.setBorderPainted(false);
        btnResp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResp1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(btnResp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnResp2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResp4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnResp1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResp3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(30, 75, 112));
        jLabel13.setText("Nivel:");

        lblNivel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNivel.setText("1");

        estado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(0, 51, 255));
        estado.setText("Correcta +20XP");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("La respuesta es: ");

        siguiente.setText("Siguiente");
        siguiente.setEnabled(false);
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        lblTiempo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTiempo.setText("0:30");

        javax.swing.GroupLayout pnlPreguntaLayout = new javax.swing.GroupLayout(pnlPregunta);
        pnlPregunta.setLayout(pnlPreguntaLayout);
        pnlPreguntaLayout.setHorizontalGroup(
            pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreguntaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPreguntaLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlPreguntaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(pnlPreguntaLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTiempo)
                        .addGap(38, 38, 38))))
        );
        pnlPreguntaLayout.setVerticalGroup(
            pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPreguntaLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblNivel)
                    .addComponent(lblTiempo))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(estado)))
                .addGap(55, 55, 55))
        );

        panel.add(pnlPregunta, "Pregunta");

        pnlSiguienteNivel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(30, 75, 112));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("¡Has subido al siguiente nivel!");

        lblSiguienteNivel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSiguienteNivel.setForeground(new java.awt.Color(255, 102, 102));
        lblSiguienteNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSiguienteNivel.setText("Nivel 2");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSiguienteNivelLayout = new javax.swing.GroupLayout(pnlSiguienteNivel);
        pnlSiguienteNivel.setLayout(pnlSiguienteNivelLayout);
        pnlSiguienteNivelLayout.setHorizontalGroup(
            pnlSiguienteNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSiguienteNivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSiguienteNivelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
        );
        pnlSiguienteNivelLayout.setVerticalGroup(
            pnlSiguienteNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSiguienteNivelLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSiguienteNivel)
                .addGap(75, 75, 75)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        panel.add(pnlSiguienteNivel, "SiguienteNivel");

        pnlGameOver.setBackground(new java.awt.Color(255, 255, 255));

        btnRegresarInicio.setText("Ir a Inicio");
        btnRegresarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarInicioActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Has perdido todas tus vidas, intentalo de nuevo");

        lblPuntajeFinal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPuntajeFinal.setForeground(new java.awt.Color(102, 102, 102));
        lblPuntajeFinal.setText("Tu puntaje final es de: 100XP");

        javax.swing.GroupLayout pnlGameOverLayout = new javax.swing.GroupLayout(pnlGameOver);
        pnlGameOver.setLayout(pnlGameOverLayout);
        pnlGameOverLayout.setHorizontalGroup(
            pnlGameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlGameOverLayout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addGroup(pnlGameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPuntajeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGameOverLayout.setVerticalGroup(
            pnlGameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGameOverLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(lblPuntajeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnRegresarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        panel.add(pnlGameOver, "GameOver");

        pnlFinalizarJuego.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(30, 75, 112));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("¡Felicidades, has superado todos los niveles!");

        lblResultadoFinal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblResultadoFinal.setForeground(new java.awt.Color(255, 102, 102));
        lblResultadoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultadoFinal.setText("Tu puntaje final fue de: 100XP");

        btnReiniciarJuego.setText("Recoge el premio");
        btnReiniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarJuegoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Has demostrado tener conocimientos muy sólidos en el campo de Campeche");

        javax.swing.GroupLayout pnlFinalizarJuegoLayout = new javax.swing.GroupLayout(pnlFinalizarJuego);
        pnlFinalizarJuego.setLayout(pnlFinalizarJuegoLayout);
        pnlFinalizarJuegoLayout.setHorizontalGroup(
            pnlFinalizarJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResultadoFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFinalizarJuegoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFinalizarJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFinalizarJuegoLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFinalizarJuegoLayout.createSequentialGroup()
                        .addComponent(btnReiniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(356, 356, 356))))
        );
        pnlFinalizarJuegoLayout.setVerticalGroup(
            pnlFinalizarJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFinalizarJuegoLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(3, 3, 3)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblResultadoFinal)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        panel.add(pnlFinalizarJuego, "FinalizarJuego");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respuestaCorrecta(){
    agregarPuntaje(20);
    estado.setText("Correcta +20px");
    }
    private void respuestaIncorrecta(){
        quitarVida();
        siguiente.setEnabled(true);
        estado.setText("Respuesta incorrecta, pierdes una vida");
    }
    private void subirNivel(int nivel){
        juego.nivel=nivel;
        lblNivel.setText(String.valueOf(juego.nivel));
        lblSiguienteNivel.setText("Nivel " + String.valueOf(juego.nivel));
    }
    private void finalizarJuego(){
    lblResultadoFinal.setText("Tu puntaje final fue de: "+ String.valueOf(juego.puntaje)+ "XP");
    card.show(panel, "FinalizarJuego");
    }
    private void btnIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarJuegoActionPerformed
        resetearJuego();
        card.show(panel, "Ppt");
        lblPuntaje.setVisible(true);
        txtPuntajeI.setVisible(true);
        lblVida.setVisible(true);
        lblVidasI.setVisible(true);
    }//GEN-LAST:event_btnIniciarJuegoActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        String eleccionJugador = j.pptEleccion[1];
        String eleccionCompu = juego.eleccionJuegoPpt();
        lblEleccionPptJ.setIcon(papelIcon);
        lblEleccionPptC.setIcon(seleccionarIconoPpt(eleccionCompu));
        CardLayout cl = (CardLayout)(panel.getLayout());
        switch (juego.resultadoPpt(eleccionJugador, eleccionCompu)) {
            case 1:
                resultadoPpt = 1;
                lblAcccionPpt.setText("GANASTE +10XP");
                agregarPuntaje(10);
                break;
            case -1:
                resultadoPpt = -1;
                lblAcccionPpt.setText("RESPONDE LA SIGUIENTE PREGUNTA");
                break;
            case 0:
                resultadoPpt = 0;
                lblAcccionPpt.setText("EMPATE, INTENTA DE NUEVO");
                break;
        }
        cl.show(panel, "ResultadoPpt");
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnResp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp1ActionPerformed
            juego.setEleccion("1");
            respuesta = juego.comprobarRespuesta();
            disableRespuestas();
            if (respuesta) {
                respuestaCorrecta();
            }
            else{
                respuestaIncorrecta();
            }
            siguiente.setEnabled(true);
    }//GEN-LAST:event_btnResp1ActionPerformed

    private void btnResp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp3ActionPerformed
            juego.setEleccion("3");
            respuesta = juego.comprobarRespuesta();
            disableRespuestas();
            if (respuesta) {
                respuestaCorrecta();
            }
            else{
                respuestaIncorrecta();
            }
            siguiente.setEnabled(true);
    }//GEN-LAST:event_btnResp3ActionPerformed

    private void btnResp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp4ActionPerformed
            juego.setEleccion("4");
            respuesta = juego.comprobarRespuesta();
            disableRespuestas();
            if (respuesta) {
                respuestaCorrecta();
            }
            else{
                respuestaIncorrecta();
            }
            siguiente.setEnabled(true);
    }//GEN-LAST:event_btnResp4ActionPerformed

    private void btnResp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp2ActionPerformed
            juego.setEleccion("2");
            respuesta = juego.comprobarRespuesta();
            disableRespuestas();
            if (respuesta) {
                respuestaCorrecta();
            }
            else{
                respuestaIncorrecta();
            }
            siguiente.setEnabled(true);
    }//GEN-LAST:event_btnResp2ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        card.show(panel, "Ppt");
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnRegresarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInicioActionPerformed
        resetearJuego();
        card.show(panel, "Inicio");
    }//GEN-LAST:event_btnRegresarInicioActionPerformed

    private void btnPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiedraActionPerformed
        String eleccionJugador = j.pptEleccion[0];
        String eleccionCompu = juego.eleccionJuegoPpt();
        lblEleccionPptJ.setIcon(piedraIcon);
        lblEleccionPptC.setIcon(seleccionarIconoPpt(eleccionCompu));
        CardLayout cl = (CardLayout)(panel.getLayout());
        switch (juego.resultadoPpt(eleccionJugador, eleccionCompu)) {
            case 1:
                resultadoPpt = 1;
                lblAcccionPpt.setText("GANASTE +10XP");
                agregarPuntaje(10);
                break;
            case -1:
                resultadoPpt = -1;
                lblAcccionPpt.setText("RESPONDE LA SIGUIENTE PREGUNTA");
                break;
            case 0:
                resultadoPpt = 0;
                lblAcccionPpt.setText("EMPATE, INTENTA DE NUEVO");
                break;
        }
        cl.show(panel, "ResultadoPpt");
        
    }//GEN-LAST:event_btnPiedraActionPerformed
    /*void correcta(int i){
        switch(i){
            case 1:
                btnResp1.setForeground(Color.green);
                break;
            case 2:
                btnResp2.setForeground(Color.green);
                break;
            case 3:
                btnResp3.setForeground(Color.green);
                break;
            case 4:
                btnResp4.setForeground(Color.green);
                break;
        }
    }
    public void colorCorrecta(){
        correcta(Integer.parseInt(juego.getEleccion()));
        siguiente.setEnabled(true);
    }*/
    private void btnContinuarPptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarPptActionPerformed
        switch (resultadoPpt) {
            case 1:
            case 0:
                card.show(panel, "Ppt");
                break;
            case -1:
                preguntas p =  new preguntas();
                estado.setText("");
                juego.setCorrecta(p.preguntas[count][1]);
                lblEnunciado.setText(p.preguntas[count][0]);
                btnResp1.setText(p.respuestas[count][1]);
                btnResp2.setText(p.respuestas[count][2]);
                btnResp3.setText(p.respuestas[count][3]);
                btnResp4.setText(p.respuestas[count][4]);
                enableRespuestas();
                if (count<= 5) {
                    lblNivel.setText("1");
                }
                else if (count > 5 && count <= 11) {
                    lblNivel.setText("2");
                }            
                card.show(panel, "Pregunta");
                break;
        }
    }//GEN-LAST:event_btnContinuarPptActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        count++;
        switch (count) {
            case 6:
                subirNivel(2);
                card.show(panel, "SiguienteNivel");
                break;
            case 12:
                finalizarJuego();
                break;
            default:
                card.show(panel, "Ppt");
                break;
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void btnReiniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarJuegoActionPerformed
                 new DashboardFormAbout().setVisible(true);
                 this.dispose();
                 JOptionPane.showMessageDialog(null, "Felicidades, ganaste la insignia de Adivinanza!");
    }//GEN-LAST:event_btnReiniciarJuegoActionPerformed

    private void btnTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTijeraActionPerformed
        String eleccionJugador = j.pptEleccion[2];
        String eleccionCompu = juego.eleccionJuegoPpt();
        lblEleccionPptJ.setIcon(tijeraIcon);
        lblEleccionPptC.setIcon(seleccionarIconoPpt(eleccionCompu));
        CardLayout cl = (CardLayout)(panel.getLayout());
        switch (juego.resultadoPpt(eleccionJugador, eleccionCompu)) {
            case 1:
                resultadoPpt = 1;
                lblAcccionPpt.setText("GANASTE +10XP");
                agregarPuntaje(10);
                break;
            case -1:
                resultadoPpt = -1;
                lblAcccionPpt.setText("RESPONDE LA SIGUIENTE PREGUNTA");
                break;
            case 0:
                resultadoPpt = 0;
                lblAcccionPpt.setText("EMPATE, INTENTA DE NUEVO");
                break;
        }
        cl.show(panel, "ResultadoPpt");
    }//GEN-LAST:event_btnTijeraActionPerformed

    private void jLabelFormCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFormCloseMouseClicked
         int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea cerrar la aplicacion, perdera su progreso","Mensaje de Confirmacion",
                                                    JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION){
            new menuCampeche().setVisible(true);
            this.dispose();
        }else{
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabelFormCloseMouseClicked

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnContinuarPpt;
    private javax.swing.JButton btnIniciarJuego;
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnRegresarInicio;
    private javax.swing.JButton btnReiniciarJuego;
    private javax.swing.JButton btnResp1;
    private javax.swing.JButton btnResp2;
    private javax.swing.JButton btnResp3;
    private javax.swing.JButton btnResp4;
    private javax.swing.JButton btnTijera;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFormClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAcccionPpt;
    private javax.swing.JLabel lblEleccionPptC;
    private javax.swing.JLabel lblEleccionPptJ;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblPuntajeFinal;
    private javax.swing.JLabel lblResultadoFinal;
    private javax.swing.JLabel lblSiguienteNivel;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblVida;
    private javax.swing.JLabel lblVidasI;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnlFinalizarJuego;
    private javax.swing.JPanel pnlGameOver;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlPpt;
    private javax.swing.JPanel pnlPregunta;
    private javax.swing.JPanel pnlResultadoPpt;
    private javax.swing.JPanel pnlSiguienteNivel;
    private javax.swing.JButton siguiente;
    private javax.swing.JTextField txtPuntajeI;
    // End of variables declaration//GEN-END:variables
}
