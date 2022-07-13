/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemaps;

import java.awt.Color;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author ABC
 */
public class Quiz extends javax.swing.JFrame {
    Object [] opciones ={"Aceptar","Cancelar"};
    /**
     * Creates new form Quiz
     */
    public Quiz() {
        initComponents();
        jPanel64.setBackground(new Color(30,75,112));
        setIco(); 
        
        jButton31.setBorder(new LineBorder(Color.WHITE));
        jButton31.setBorder(new RoundedBorder(30));
        jButton31.setContentAreaFilled(false);
        
        Salir.setBorder(new LineBorder(Color.WHITE));
        Salir.setBorder(new RoundedBorder(30));
        Salir.setContentAreaFilled(false);
        Salir.setEnabled(true);
        
        advertencia.setBorder(new LineBorder(Color.WHITE));
        advertencia.setBorder(new RoundedBorder(30));
        advertencia.setContentAreaFilled(false);
        advertencia.setEnabled(true);
    }
    
    private void setIco() {
        Image imagen;

        try {
            imagen = ImageIO.read( getClass().getClassLoader().getResource( "gamemaps/resources/logo.png" ) );
            setIconImage(imagen);
        } catch( java.io.IOException e ){
        }
    }
public  double marks=0.0;
       public double Points=0.0;
       public void calPoint(){
           marks=0.0;
           if(jRadioButton3.isSelected()==true){
               marks+=10.0;
           }
           if(jRadioButton8.isSelected()==true){
               marks+=10.0;
           }
           if(jRadioButton11.isSelected()==true){
              marks+=10.0;
           }
           if(jRadioButton16.isSelected()==true){
               marks+=10.0;
           }
             if(jRadioButton18.isSelected()==true){
               marks+=10.0;
           }
             
           if(jRadioButton21.isSelected()==true){
                marks+=10.0;
           }
           if(jRadioButton26.isSelected()==true){
               marks+=10.0;
           }
           if(jRadioButton28.isSelected()==true){
               marks+=10.0;
           } 
            if(jRadioButton31.isSelected()==true){
               marks+=10.0;
           } 
                           
            if(jRadioButton35.isSelected()==true){
              marks+=10.0;
           } 
           if(jRadioButton40.isSelected()==true){
              marks+=10.0;
           }            
           if(jRadioButton43.isSelected()==true){
             marks+=10.0;
           }          
           if(jRadioButton46.isSelected()==true){
              marks+=10.0;
           }        
           if(jRadioButton51.isSelected()==true){
              marks+=10.0;
           } 
                                                                                                                       
           if(jRadioButton54.isSelected()==true){
               marks+=10.0;
           }   
                                                                                                                                                                           
           if(jRadioButton59.isSelected()==true){
             marks+=10.0;
           }
           if(jRadioButton62.isSelected()==true){
             marks+=10.0;
           }
           if(jRadioButton69.isSelected()==true){
              marks+=10.0;
           }                                                                                                          
           if(jRadioButton70.isSelected()==true){
              marks+=10.0;
           } 
                                                                                                                        
           if(jRadioButton75.isSelected()==true){
           marks+=10.0;
           }     
           if(jRadioButton81.isSelected()==true){
            marks+=10.0;
           }
           if(jRadioButton82.isSelected()==true){
            marks+=10.0;
           }
           if(jRadioButton86.isSelected()==true){
             marks+=10.0;}
           if(jRadioButton92.isSelected()==true){
           marks+=10.0;
           }     
           if(jRadioButton94.isSelected()==true){
            marks+=10.0;
           }  
           if(jRadioButton100.isSelected()==true){
             marks+=10.0;
           }                                           
           if(jRadioButton102.isSelected()==true){
              marks+=10.0;
           }
           if(jRadioButton106.isSelected()==true){
            marks+=10.0;
           } if(jRadioButton110.isSelected()==true){
             marks+=10.0;
           }
           if(jRadioButton117.isSelected()==true){
             marks+=20.0;
           }
           
           Points=marks;
       }
       
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        advertencia = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jRadioButton61 = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jRadioButton78 = new javax.swing.JRadioButton();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jRadioButton81 = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jRadioButton85 = new javax.swing.JRadioButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton86 = new javax.swing.JRadioButton();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jRadioButton89 = new javax.swing.JRadioButton();
        jPanel28 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton90 = new javax.swing.JRadioButton();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        jRadioButton97 = new javax.swing.JRadioButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton98 = new javax.swing.JRadioButton();
        jRadioButton99 = new javax.swing.JRadioButton();
        jRadioButton100 = new javax.swing.JRadioButton();
        jRadioButton101 = new javax.swing.JRadioButton();
        jPanel31 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton102 = new javax.swing.JRadioButton();
        jRadioButton103 = new javax.swing.JRadioButton();
        jRadioButton104 = new javax.swing.JRadioButton();
        jRadioButton105 = new javax.swing.JRadioButton();
        jPanel32 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jRadioButton106 = new javax.swing.JRadioButton();
        jRadioButton107 = new javax.swing.JRadioButton();
        jRadioButton108 = new javax.swing.JRadioButton();
        jRadioButton109 = new javax.swing.JRadioButton();
        jPanel33 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton110 = new javax.swing.JRadioButton();
        jRadioButton111 = new javax.swing.JRadioButton();
        jRadioButton112 = new javax.swing.JRadioButton();
        jRadioButton113 = new javax.swing.JRadioButton();
        jPanel34 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton114 = new javax.swing.JRadioButton();
        jRadioButton115 = new javax.swing.JRadioButton();
        jRadioButton116 = new javax.swing.JRadioButton();
        jRadioButton117 = new javax.swing.JRadioButton();
        jPanel64 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton31 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 75, 112));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(30, 75, 112));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.GridLayout(10, 0, 5, 5));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Q 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Q 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Q 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Q 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Q 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Q 6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Q 7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("Q 8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Q 9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Q 10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("Q 11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("Q 12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setText("Q 13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("Q 14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("Q 15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setText("Q 16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setText("Q 17");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setText("Q 18");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setText("Q 19");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setText("Q 20");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.setText("Q 21");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setText("Q 22");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.setText("Q 23");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.setText("Q 24");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton25.setText("Q 25");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25);

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setText("Q 26");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Q 27");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton28.setText("Q 28");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28);

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton29.setText("Q 29");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29);

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton30.setText("Q 30");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30);

        advertencia.setBackground(new java.awt.Color(255, 255, 255));
        advertencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        advertencia.setForeground(new java.awt.Color(255, 255, 255));
        advertencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamemaps/resources/attention.png"))); // NOI18N
        advertencia.setEnabled(false);
        advertencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advertenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(advertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(advertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Q 1 ) ¿En que año se celebra por primera vez el cristo negro de San Roman?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("1612");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("1570");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton3.setText("1565");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton4.setText("1423");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, "card2");

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Q2 ) Actualmente, en campeche se celebra el cristo negro de San Roman. ¿Cuando inicia y termina la celebracion?");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton5.setText("2 a 10 de Septiembre");

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton6.setText("20 a 29 de Octubre");

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton7.setText("16 a 20 de Julio");

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton8.setText("13 a 29 de Septiembre");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jRadioButton5)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton6)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton7)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton8)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, "card2");

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Q 3) ¿Cuantos años tiene Campeche celebrando el carnaval?");

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton9.setText("400 años");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton10.setText("350 años");

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton11.setText("450 años");

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton12.setText("300 años");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton12))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton9)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton10)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton11)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton12)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel7, "card2");

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Q4 ) ¿En que mes inicia y termina el carnaval de Campeche?");

        buttonGroup4.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton13.setText("Inicia en Septiembre y termina en Octubre");

        buttonGroup4.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton14.setText("Inicia en Junio y termina en Julio");

        buttonGroup4.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton15.setText("Inicia en Enero y termina en Febrero");

        buttonGroup4.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton16.setText("Inicia en Febrero y termina en Marzo");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton14)
                            .addComponent(jRadioButton13)
                            .addComponent(jRadioButton15)
                            .addComponent(jRadioButton16)))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton13)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton14)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton15)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton16)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, "card2");

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Q5 ) ¿Cual fue el primer nombre que recibio Ciudad del Carmen? ");

        buttonGroup5.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton17.setText("Ah Kim Pech");

        buttonGroup5.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton18.setText("Isla Tris");

        buttonGroup5.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton19.setText("Villa de Campeche");

        buttonGroup5.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton20.setText("Tinun");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton18)
                            .addComponent(jRadioButton17)
                            .addComponent(jRadioButton19)
                            .addComponent(jRadioButton20)))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel6)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton17)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton18)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton19)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton20)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel9, "card2");

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Q6 ) El platillo principal del estado de Campeche es el pescado. ¿Cierto o Falso?");

        buttonGroup6.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton21.setText("Cierto");

        buttonGroup6.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton22.setText("Falso");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton22)
                            .addComponent(jRadioButton21)))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton21)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton22)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel10, "card2");

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Q7 ) ¿En que mes se celebra la Festividad de San Juan?");

        buttonGroup7.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton23.setText("Mayo");

        buttonGroup7.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton24.setText("Agosto");

        buttonGroup7.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton25.setText("Julio");

        buttonGroup7.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton26.setText("Junio");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton24)
                            .addComponent(jRadioButton23)
                            .addComponent(jRadioButton25)
                            .addComponent(jRadioButton26)))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton23)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton24)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton25)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton26)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel11, "card2");

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Q8 )¿Que se celebra en el mes de octubre?");

        buttonGroup8.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton27.setText("Fiesta de la Guadalupana");

        buttonGroup8.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton28.setText("Fiesta del Barrio de San Fracisco");

        buttonGroup8.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton29.setText("Fiesta de la Virgen del Carmen");

        buttonGroup8.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton30.setText("Fiesta de San Juan");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton28)
                            .addComponent(jRadioButton27)
                            .addComponent(jRadioButton29)
                            .addComponent(jRadioButton30)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton27)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton28)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton29)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton30)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel12, "card2");

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Q9 ) ¿Que se celebra en el mes de Septiemre?");

        buttonGroup9.add(jRadioButton31);
        jRadioButton31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton31.setText("Fiesta de San Roman");

        buttonGroup9.add(jRadioButton32);
        jRadioButton32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton32.setText("Fiesta de la Guadalupana");

        buttonGroup9.add(jRadioButton33);
        jRadioButton33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton33.setText("Fiesta del Barrio de San Francisco");

        buttonGroup9.add(jRadioButton34);
        jRadioButton34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton34.setText("Fiesta de San Juan");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton32)
                            .addComponent(jRadioButton31)
                            .addComponent(jRadioButton33)
                            .addComponent(jRadioButton34)))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton31)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton32)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton33)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton34)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel13, "card2");

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Q10 ) ¿Que se celebra entre el 14 al 31 de Julio en Campeche?");

        buttonGroup10.add(jRadioButton35);
        jRadioButton35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton35.setText("Fiesta de la Virgen del Carmen");

        buttonGroup10.add(jRadioButton36);
        jRadioButton36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton36.setText("Fiesta del Barrio de San Francisco");

        buttonGroup10.add(jRadioButton37);
        jRadioButton37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton37.setText("Fiesta del Pan");

        buttonGroup10.add(jRadioButton38);
        jRadioButton38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton38.setText("Fiesta de San Juan");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton36)
                            .addComponent(jRadioButton35)
                            .addComponent(jRadioButton37)
                            .addComponent(jRadioButton38)))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton35)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton36)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton37)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton38)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel14, "card2");

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Q11 ) En que lugar del estado de Campeche se lleva a cabo la Fiesta del sombrero de \"Jipi\"?");

        buttonGroup12.add(jRadioButton39);
        jRadioButton39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton39.setText("Plaza de los Perros");

        buttonGroup12.add(jRadioButton40);
        jRadioButton40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton40.setText("Plaza del sombrero");

        buttonGroup12.add(jRadioButton41);
        jRadioButton41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton41.setText("Plaza del Sol");

        buttonGroup12.add(jRadioButton42);
        jRadioButton42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton42.setText("San Roman");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton40)
                            .addComponent(jRadioButton39)
                            .addComponent(jRadioButton41)
                            .addComponent(jRadioButton42)))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton39)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton40)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton41)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton42)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel15, "card2");

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Q12 ) ¿Cuando se lleva a cabo la primera festividad de la virgen de la Asuncion?");

        buttonGroup13.add(jRadioButton43);
        jRadioButton43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton43.setText("8 de agosto del 1742");

        buttonGroup13.add(jRadioButton44);
        jRadioButton44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton44.setText("8 de agosto del 1752");

        buttonGroup13.add(jRadioButton45);
        jRadioButton45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton45.setText("8 de agosto del  1732");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton44)
                    .addComponent(jRadioButton43)
                    .addComponent(jRadioButton45))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(93, 93, 93))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton43)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton44)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton45)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel16, "card2");

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Q13 ) ¿Que festividad se celebra en el 6 de Enero en Campeche? ");

        buttonGroup14.add(jRadioButton46);
        jRadioButton46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton46.setText("Danza del Gallo y del Cochino");
        jRadioButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton46ActionPerformed(evt);
            }
        });

        buttonGroup14.add(jRadioButton47);
        jRadioButton47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton47.setText("Fiesta de San Roman");

        buttonGroup14.add(jRadioButton48);
        jRadioButton48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton48.setText("Fiesta del sombrero");

        buttonGroup14.add(jRadioButton49);
        jRadioButton49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton49.setText("Fiesta de la virgen de asuncion");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton47)
                            .addComponent(jRadioButton46)
                            .addComponent(jRadioButton48)
                            .addComponent(jRadioButton49)))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton46)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton47)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton48)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton49)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel17, "card2");

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Q14  ) ¿En que mes se celebra el Festival cultural del Centro Historico?");

        buttonGroup15.add(jRadioButton50);
        jRadioButton50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton50.setText("Enero");

        buttonGroup15.add(jRadioButton51);
        jRadioButton51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton51.setText("Diciembre");

        buttonGroup15.add(jRadioButton52);
        jRadioButton52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton52.setText("Noviembre");

        buttonGroup15.add(jRadioButton53);
        jRadioButton53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton53.setText("Octubre");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton51)
                            .addComponent(jRadioButton50)
                            .addComponent(jRadioButton52)
                            .addComponent(jRadioButton53)))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton50)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton51)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton52)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton53)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel18, "card2");

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Q15  ) ¿En que mes se celebra la Feria del Pan?");

        buttonGroup16.add(jRadioButton54);
        jRadioButton54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton54.setText("Marzo");

        buttonGroup16.add(jRadioButton55);
        jRadioButton55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton55.setText("Enero");

        buttonGroup16.add(jRadioButton56);
        jRadioButton56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton56.setText("Diciembre");

        buttonGroup16.add(jRadioButton57);
        jRadioButton57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton57.setText("Noviembre");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton55)
                            .addComponent(jRadioButton54)
                            .addComponent(jRadioButton56)
                            .addComponent(jRadioButton57)))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton54)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton55)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton56)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton57)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel19, "card2");

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Q16  ) ¿En que dia se celebra la Fiesta de la Candelaria?");

        buttonGroup17.add(jRadioButton58);
        jRadioButton58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton58.setText("5 de Enero");

        buttonGroup17.add(jRadioButton59);
        jRadioButton59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton59.setText("2 de Febrero");

        buttonGroup17.add(jRadioButton60);
        jRadioButton60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton60.setText("8 de Abril");

        buttonGroup17.add(jRadioButton61);
        jRadioButton61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton61.setText("4 de Mayo");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton59)
                            .addComponent(jRadioButton58)
                            .addComponent(jRadioButton60)
                            .addComponent(jRadioButton61)))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton58)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton59)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton60)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton61)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel20, "card2");

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Q17  ) ¿Quienes Atacaban a la villa de Campeche?");

        buttonGroup18.add(jRadioButton62);
        jRadioButton62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton62.setText("Piratas, Corsarios y Filibusteros");

        buttonGroup18.add(jRadioButton63);
        jRadioButton63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton63.setText("Piratas del Caribe");

        buttonGroup18.add(jRadioButton64);
        jRadioButton64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton64.setText("Mayas");

        buttonGroup18.add(jRadioButton65);
        jRadioButton65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton65.setText("Piratas y Corsarios");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton63)
                            .addComponent(jRadioButton62)
                            .addComponent(jRadioButton64)
                            .addComponent(jRadioButton65)))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton62)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton63)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton64)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton65)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel21, "card2");

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Q18 ) ¿Cual es el Festival con el maximo exponente de las artes en Campeche?");

        buttonGroup19.add(jRadioButton66);
        jRadioButton66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton66.setText("Festival del Jazz");

        buttonGroup19.add(jRadioButton67);
        jRadioButton67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton67.setText("Festival del Carnaval");

        buttonGroup19.add(jRadioButton68);
        jRadioButton68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton68.setText("Festival de la Candelaria");

        buttonGroup19.add(jRadioButton69);
        jRadioButton69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton69.setText("Festival del Centro Historico");
        jRadioButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton69ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton67)
                            .addComponent(jRadioButton66)
                            .addComponent(jRadioButton68)
                            .addComponent(jRadioButton69)))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton66)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton67)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton68)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton69)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel22, "card2");

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Q19 ) ¿Donde se arribo la imagen de un cristo de manufactura italiana, tallada de madera?");

        buttonGroup21.add(jRadioButton70);
        jRadioButton70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton70.setText("Antiguo Barrio de San Roman");

        buttonGroup21.add(jRadioButton71);
        jRadioButton71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton71.setText("Champoton");

        buttonGroup21.add(jRadioButton72);
        jRadioButton72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton72.setText("Cd. del Carmen");

        buttonGroup21.add(jRadioButton73);
        jRadioButton73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton73.setText("Campeche");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton71)
                            .addComponent(jRadioButton70)
                            .addComponent(jRadioButton73)
                            .addComponent(jRadioButton72)))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton70)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton71)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton72)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton73)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel23, "card2");

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Q20 ) ¿En que año se arribo la imagen de un cristo de manufactura italiana, tallada de madera?");

        buttonGroup20.add(jRadioButton74);
        jRadioButton74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton74.setText("Año 1947");

        buttonGroup20.add(jRadioButton75);
        jRadioButton75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton75.setText("Año 1565");

        buttonGroup20.add(jRadioButton76);
        jRadioButton76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton76.setText("Año 1745");

        buttonGroup20.add(jRadioButton77);
        jRadioButton77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton77.setText("Año 1566");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton75)
                            .addComponent(jRadioButton74)
                            .addComponent(jRadioButton77)
                            .addComponent(jRadioButton76)))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton74)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton75)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton76)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton77)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel24, "card2");

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Q21 ) ¿Quienes fueron los Piratas mas sanguinarios a la Villa?");

        buttonGroup22.add(jRadioButton78);
        jRadioButton78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton78.setText("Sir Francis Drake y Henry Morgan");

        buttonGroup22.add(jRadioButton79);
        jRadioButton79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton79.setText("Barba Roja y Jack Rackham");

        buttonGroup22.add(jRadioButton80);
        jRadioButton80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton80.setText("Jack Sparrow y Barbanegra");

        buttonGroup22.add(jRadioButton81);
        jRadioButton81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton81.setText("Lauren Graff \"Lorencillo\" y Kornelius Jols \"Pie de Palo\"");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton79)
                            .addComponent(jRadioButton78)
                            .addComponent(jRadioButton81)
                            .addComponent(jRadioButton80)))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton78)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton79)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton80)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton81)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel25, "card2");

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Q22 ) ¿Cual es la capital del Estado de Campeche?");

        buttonGroup23.add(jRadioButton82);
        jRadioButton82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton82.setText("San Francisco de Campeche");

        buttonGroup23.add(jRadioButton83);
        jRadioButton83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton83.setText("Cd. del Carmen");

        buttonGroup23.add(jRadioButton84);
        jRadioButton84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton84.setText("Champoton");

        buttonGroup23.add(jRadioButton85);
        jRadioButton85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton85.setText("Calkini");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton83)
                            .addComponent(jRadioButton82)
                            .addComponent(jRadioButton85)
                            .addComponent(jRadioButton84)))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton82)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton83)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton84)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton85)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel26, "card2");

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Q23 ) ¿Cual fue el primer nombre del Estado de Campeche?");

        buttonGroup24.add(jRadioButton86);
        jRadioButton86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton86.setText("Ah Kim Pech");

        buttonGroup24.add(jRadioButton87);
        jRadioButton87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton87.setText("San Francisco");

        buttonGroup24.add(jRadioButton88);
        jRadioButton88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton88.setText("Villa de Kim");

        buttonGroup24.add(jRadioButton89);
        jRadioButton89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton89.setText("Hanal");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton87)
                            .addComponent(jRadioButton86)
                            .addComponent(jRadioButton89)
                            .addComponent(jRadioButton88)))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton86)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton87)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton88)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton89)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel27, "card2");

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Q24 ) ¿Fecha de la Fundacion de la villa de Campeche?");

        buttonGroup26.add(jRadioButton90);
        jRadioButton90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton90.setText("4 de Noviembre de 1540");

        buttonGroup26.add(jRadioButton91);
        jRadioButton91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton91.setText("3 de Octubre de 1540");

        buttonGroup26.add(jRadioButton92);
        jRadioButton92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton92.setText("4 de Octubre de 1540");

        buttonGroup26.add(jRadioButton93);
        jRadioButton93.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton93.setText("3 de Noviembre de 1540");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton91)
                            .addComponent(jRadioButton90)
                            .addComponent(jRadioButton93)
                            .addComponent(jRadioButton92)))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton90)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton91)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton92)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton93)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel28, "card2");

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Q25 ) ¿En que año se le otorga el titulo de Patrimonio \"Cultural de la Humanidad\" al Centro Historico?");

        buttonGroup25.add(jRadioButton94);
        jRadioButton94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton94.setText("Diciembre de 1999");

        buttonGroup25.add(jRadioButton95);
        jRadioButton95.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton95.setText("Diciembre 1998");

        buttonGroup25.add(jRadioButton96);
        jRadioButton96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton96.setText("Noviembre de 1999");

        buttonGroup25.add(jRadioButton97);
        jRadioButton97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton97.setText("Noviembre de 1998");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton95)
                            .addComponent(jRadioButton94)
                            .addComponent(jRadioButton97)
                            .addComponent(jRadioButton96)))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton94)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton95)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton96)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton97)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel29, "card2");

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Q26 )  ¿Qien fue el primer Gobernador del Estado de Campeche?");

        buttonGroup26.add(jRadioButton98);
        jRadioButton98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton98.setText("Carlos Perez Camara");

        buttonGroup26.add(jRadioButton99);
        jRadioButton99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton99.setText("Carlos Sansores Perez");

        buttonGroup26.add(jRadioButton100);
        jRadioButton100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton100.setText("Jose Ortiz Avila");

        buttonGroup26.add(jRadioButton101);
        jRadioButton101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton101.setText("Rafael Rodriguez Barrera");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton99)
                            .addComponent(jRadioButton98)
                            .addComponent(jRadioButton101)
                            .addComponent(jRadioButton100)))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton98)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton99)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton100)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton101)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel30, "card2");

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Q27 )  ¿En que año fue la primera invasion de Piratas que sufrio Campeche?");

        buttonGroup27.add(jRadioButton102);
        jRadioButton102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton102.setText("Año 1559");

        buttonGroup27.add(jRadioButton103);
        jRadioButton103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton103.setText("Año 1955");

        buttonGroup27.add(jRadioButton104);
        jRadioButton104.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton104.setText("Año de 1958");

        buttonGroup27.add(jRadioButton105);
        jRadioButton105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton105.setText("Año 1956");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton103)
                            .addComponent(jRadioButton102)
                            .addComponent(jRadioButton105)
                            .addComponent(jRadioButton104)))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton102)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton103)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton104)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton105)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel31, "card2");

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Q28 ) ¿Que Rey le otorga a Campeche el escudo de armas?");
        jLabel29.setToolTipText("");

        buttonGroup28.add(jRadioButton106);
        jRadioButton106.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton106.setText("Rey Carlos III");

        buttonGroup28.add(jRadioButton107);
        jRadioButton107.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton107.setText("Rey Magnus II");

        buttonGroup28.add(jRadioButton108);
        jRadioButton108.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton108.setText("Rey Carlos IV");

        buttonGroup28.add(jRadioButton109);
        jRadioButton109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton109.setText("Rey Magnus III");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton107)
                            .addComponent(jRadioButton106)
                            .addComponent(jRadioButton109)
                            .addComponent(jRadioButton108)))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton106)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton107)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton108)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton109)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel32, "card2");

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Q29 ) ¿Cual era el principal producto que los piratas buscaban en Campeche?");
        jLabel30.setToolTipText("");

        buttonGroup29.add(jRadioButton110);
        jRadioButton110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton110.setText("Palo Tinte");

        buttonGroup29.add(jRadioButton111);
        jRadioButton111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton111.setText("Cacao");

        buttonGroup29.add(jRadioButton112);
        jRadioButton112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton112.setText("Maiz");

        buttonGroup29.add(jRadioButton113);
        jRadioButton113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton113.setText("Oro");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton111)
                            .addComponent(jRadioButton110)
                            .addComponent(jRadioButton113)
                            .addComponent(jRadioButton112)))
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton110)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton111)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton112)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton113)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel33, "card2");

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Q30 ) ¿En que fecha se le otorga a Campeche un escudo de armas y el titulo de Ciudad?");
        jLabel31.setToolTipText("");

        buttonGroup30.add(jRadioButton114);
        jRadioButton114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton114.setText("1 de Octubre de 1778");

        buttonGroup30.add(jRadioButton115);
        jRadioButton115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton115.setText("2 de Octubre de 1777");

        buttonGroup30.add(jRadioButton116);
        jRadioButton116.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton116.setText("2 de Octubre de 1778");

        buttonGroup30.add(jRadioButton117);
        jRadioButton117.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton117.setText("1 de Octubre de 1777");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton115)
                            .addComponent(jRadioButton114)
                            .addComponent(jRadioButton117)
                            .addComponent(jRadioButton116)))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton114)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton115)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton116)
                .addGap(21, 21, 21)
                .addComponent(jRadioButton117)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel34, "card2");

        jPanel64.setBackground(new java.awt.Color(30, 75, 112));
        jPanel64.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox1.setBackground(new java.awt.Color(30, 75, 112));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mostrar resultado!");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(255, 255, 255));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Enviar");
        jButton31.setEnabled(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.setEnabled(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                    .addContainerGap(448, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel9);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel5);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel6);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel7);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel8);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel10);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel11);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel12);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel13);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel14);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel15);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel16);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel17);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel18);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel19);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel20);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel21);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel22);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel23);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel24);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel25
        );
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel26);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel27);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel28);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel29);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel30);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel31);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel32);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel33);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
         jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.revalidate();
        jPanel4.add(jPanel34);
         jPanel4.repaint();
        jPanel4.revalidate();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jRadioButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton69ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        
        try{
        this.calPoint();
        System.out.println(this.Points);
        Result obj=new Result();
        obj.setVisible(true);
        obj.getPoints(this.Points);
        this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        jButton31.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton46ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea cerrar la aplicacion, perdera su progreso","Mensaje de Confirmacion",
                                                    JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION){
            new menuCampeche().setVisible(true);
            this.dispose();
        }else{
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void advertenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advertenciaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Te sugiero que cada pregunta anotes su respuesta en una hoja");
    }//GEN-LAST:event_advertenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton advertencia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton101;
    private javax.swing.JRadioButton jRadioButton102;
    private javax.swing.JRadioButton jRadioButton103;
    private javax.swing.JRadioButton jRadioButton104;
    private javax.swing.JRadioButton jRadioButton105;
    private javax.swing.JRadioButton jRadioButton106;
    private javax.swing.JRadioButton jRadioButton107;
    private javax.swing.JRadioButton jRadioButton108;
    private javax.swing.JRadioButton jRadioButton109;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton110;
    private javax.swing.JRadioButton jRadioButton111;
    private javax.swing.JRadioButton jRadioButton112;
    private javax.swing.JRadioButton jRadioButton113;
    private javax.swing.JRadioButton jRadioButton114;
    private javax.swing.JRadioButton jRadioButton115;
    private javax.swing.JRadioButton jRadioButton116;
    private javax.swing.JRadioButton jRadioButton117;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JRadioButton jRadioButton97;
    private javax.swing.JRadioButton jRadioButton98;
    private javax.swing.JRadioButton jRadioButton99;
    // End of variables declaration//GEN-END:variables
}
