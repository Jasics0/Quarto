/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Entities.GameBoard;
import Entities.GamePiece;
import Entities.User;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author henry
 */
public class Board extends javax.swing.JFrame {

    /**
     * Creates new form Board
     */
    GameBoard t = new GameBoard();
    User usuarios[] = new User[2];
    String j1 = "";
    String j2 = "";
    int np = 1;
    int shift = 0;
    int numberPiece = 0;
    int numberBox = 0;
    int status = 0;
    boolean aux = false;
    JFrame f = new JFrame();
    
    public Board() {
        initComponents();
        while (j1.equals("")) {
            j1 = JOptionPane.showInputDialog(f, "Ingresa el nombre del jugador 1:", "Bienvenido!",
                    JOptionPane.QUESTION_MESSAGE);
            if (j1.equals("")) {
                JOptionPane.showMessageDialog(f, "Debe ingresar un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        while (j2.equals("") || j2.equals(j1)) {
            j2 = JOptionPane.showInputDialog(f, "Ingresa el nombre del jugador 2:", "Bienvenido!",
                    JOptionPane.QUESTION_MESSAGE);
            if (j2.equals("")) {
                JOptionPane.showMessageDialog(f, "Debe ingresar un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (j2.equals(j1)) {
                JOptionPane.showMessageDialog(f, "Nombre de usuario ya existente, por favor digite otro nombre.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }
        jLabel13.setText("Jugador 1: " + j1);
        jLabel14.setText("Jugador 2: " + j2);
        jLabel15.setText("Número de partida: " + np);
        usuarios[0] = new User(j1, 0);
        usuarios[1] = new User(j2, 0);
        jLabel12.setText("Turno: " + usuarios[shift]);
        deshabilitar();
    }
    
    public void auxBoard() {
        table[0] = R37;
        table[1] = R41;
        table[2] = R38;
        table[3] = R34;
        table[4] = R31;
        table[5] = R26;
        table[6] = R32;
        table[7] = R35;
        table[8] = R28;
        table[9] = R30;
        table[10] = R39;
        table[11] = R36;
        table[12] = R29;
        table[13] = R27;
        table[14] = R33;
        table[15] = R58;
    }
    
    public void updateBoard() {
        R37 = table[0];
        R41 = table[1];
        R38 = table[2];
        R34 = table[3];
        R31 = table[4];
        R26 = table[5];
        R32 = table[6];
        R35 = table[7];
        R28 = table[8];
        R30 = table[9];
        R39 = table[10];
        R36 = table[11];
        R29 = table[12];
        R27 = table[13];
        R33 = table[14];
        R58 = table[15];
    }
    
    public void habilitar() {
        R26.setEnabled(true);
        R27.setEnabled(true);
        R28.setEnabled(true);
        R29.setEnabled(true);
        R30.setEnabled(true);
        R31.setEnabled(true);
        R32.setEnabled(true);
        R33.setEnabled(true);
        R34.setEnabled(true);
        R35.setEnabled(true);
        R36.setEnabled(true);
        R37.setEnabled(true);
        R38.setEnabled(true);
        R39.setEnabled(true);
        R41.setEnabled(true);
        R58.setEnabled(true);
    }
    
    public void deshabilitar() {
        R26.setEnabled(false);
        R27.setEnabled(false);
        R28.setEnabled(false);
        R29.setEnabled(false);
        R30.setEnabled(false);
        R31.setEnabled(false);
        R32.setEnabled(false);
        R33.setEnabled(false);
        R34.setEnabled(false);
        R35.setEnabled(false);
        R36.setEnabled(false);
        R37.setEnabled(false);
        R38.setEnabled(false);
        R39.setEnabled(false);
        R41.setEnabled(false);
        R58.setEnabled(false);
    }
    
    public void putPiece() {
        while (status != 200) {
            switch (status = t.putPiece(numberPiece, numberBox)) {
                case 200:
                    showBoard();
                    break;
                default:
                    System.out.println("Error!" + status);
                    break;
            }
        }
    }
    
    public void showBoard() {
        int c = 0;
        GamePiece board[][] = t.getBoardArr();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] != null) {
                    table[c].setIcon(
                            new javax.swing.ImageIcon(getClass().getResource("/img/" + board[i][j].getNp() + ".png")));
                }
                c++;
            }
        }
        updateBoard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        R26 = new javax.swing.JButton();
        R27 = new javax.swing.JButton();
        R28 = new javax.swing.JButton();
        R29 = new javax.swing.JButton();
        R30 = new javax.swing.JButton();
        R31 = new javax.swing.JButton();
        R32 = new javax.swing.JButton();
        R33 = new javax.swing.JButton();
        R34 = new javax.swing.JButton();
        R35 = new javax.swing.JButton();
        R36 = new javax.swing.JButton();
        R37 = new javax.swing.JButton();
        R38 = new javax.swing.JButton();
        R39 = new javax.swing.JButton();
        R40 = new javax.swing.JButton();
        R41 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        R42 = new javax.swing.JButton();
        R43 = new javax.swing.JButton();
        R44 = new javax.swing.JButton();
        R45 = new javax.swing.JButton();
        R46 = new javax.swing.JButton();
        R47 = new javax.swing.JButton();
        R48 = new javax.swing.JButton();
        R49 = new javax.swing.JButton();
        R50 = new javax.swing.JButton();
        R51 = new javax.swing.JButton();
        R52 = new javax.swing.JButton();
        R53 = new javax.swing.JButton();
        R54 = new javax.swing.JButton();
        R55 = new javax.swing.JButton();
        R56 = new javax.swing.JButton();
        R57 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        R58 = new javax.swing.JButton();
        auxBoard();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(51, 204, 255));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Jugador 1:");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Jugador 2:");

        R26.setActionCommand("R1");
        R26.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R26ActionPerformed(evt);
            }
        });

        R27.setActionCommand("R1");
        R27.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R27ActionPerformed(evt);
            }
        });

        R28.setActionCommand("R1");
        R28.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R28ActionPerformed(evt);
            }
        });

        R29.setActionCommand("R1");
        R29.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R29ActionPerformed(evt);
            }
        });

        R30.setActionCommand("R1");
        R30.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R30ActionPerformed(evt);
            }
        });

        R31.setActionCommand("R1");
        R31.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R31ActionPerformed(evt);
            }
        });

        R32.setActionCommand("R1");
        R32.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R32ActionPerformed(evt);
            }
        });

        R33.setActionCommand("R1");
        R33.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R33ActionPerformed(evt);
            }
        });

        R34.setActionCommand("R1");
        R34.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R34ActionPerformed(evt);
            }
        });

        R35.setActionCommand("R1");
        R35.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R35ActionPerformed(evt);
            }
        });

        R36.setActionCommand("R1");
        R36.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R36ActionPerformed(evt);
            }
        });

        R37.setActionCommand("R1");
        R37.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R37ActionPerformed(evt);
            }
        });

        R38.setActionCommand("R1");
        R38.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R38ActionPerformed(evt);
            }
        });

        R39.setActionCommand("R1");
        R39.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R39ActionPerformed(evt);
            }
        });

        R40.setActionCommand("R1");
        R40.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R40ActionPerformed(evt);
            }
        });

        R41.setActionCommand("R1");
        R41.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R41ActionPerformed(evt);
            }
        });

        jLabel1.setText("A");

        jLabel2.setText("1");

        jLabel3.setText("2");

        jLabel4.setText("3");

        jLabel5.setText("2");

        jLabel7.setText("4");

        jLabel8.setText("3");

        jLabel9.setText("1");

        jLabel10.setText("B");

        jLabel11.setText("4");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fichas Disponibles:");

        R42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        R42.setActionCommand("R1");
        R42.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R42ActionPerformed(evt);
            }
        });

        R43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/9.png"))); // NOI18N
        R43.setActionCommand("R1");
        R43.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R43ActionPerformed(evt);
            }
        });

        R44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8.png"))); // NOI18N
        R44.setActionCommand("R1");
        R44.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R44ActionPerformed(evt);
            }
        });

        R45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png"))); // NOI18N
        R45.setActionCommand("R1");
        R45.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R45ActionPerformed(evt);
            }
        });

        R46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png"))); // NOI18N
        R46.setActionCommand("R1");
        R46.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R46ActionPerformed(evt);
            }
        });

        R47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/15.png"))); // NOI18N
        R47.setActionCommand("R1");
        R47.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R47ActionPerformed(evt);
            }
        });

        R48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/0.png"))); // NOI18N
        R48.setActionCommand("R1");
        R48.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R48.setFocusPainted(false);
        R48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R48ActionPerformed(evt);
            }
        });

        R49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6.png"))); // NOI18N
        R49.setActionCommand("R1");
        R49.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R49ActionPerformed(evt);
            }
        });

        R50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10.png"))); // NOI18N
        R50.setActionCommand("R1");
        R50.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R50ActionPerformed(evt);
            }
        });

        R51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.png"))); // NOI18N
        R51.setActionCommand("R1");
        R51.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R51ActionPerformed(evt);
            }
        });

        R52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7.png"))); // NOI18N
        R52.setActionCommand("R1");
        R52.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R52ActionPerformed(evt);
            }
        });

        R53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/12.png"))); // NOI18N
        R53.setActionCommand("R1");
        R53.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R53ActionPerformed(evt);
            }
        });

        R54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/13.png"))); // NOI18N
        R54.setActionCommand("R1");
        R54.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R54ActionPerformed(evt);
            }
        });

        R55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14.png"))); // NOI18N
        R55.setActionCommand("R1");
        R55.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R55ActionPerformed(evt);
            }
        });

        R56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        R56.setActionCommand("R1");
        R56.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R56ActionPerformed(evt);
            }
        });

        R57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png"))); // NOI18N
        R57.setActionCommand("R1");
        R57.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R57ActionPerformed(evt);
            }
        });

        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Numero de partida: ");

        jButton4.setText("Jugar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Ganar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Turno: ");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ficha:");

        R58.setActionCommand("R1");
        R58.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        R58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R58ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1).addComponent(jLabel8).addComponent(jLabel5)
                                        .addComponent(jLabel9).addComponent(jLabel11))
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(R29,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R27,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(R31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                55,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(R37,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                55,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(R26,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                55,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(R41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                55,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(R38,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R34,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(R32,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R35,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(R33,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R58,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(R28,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(R30,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(R39,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(R36,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jButton1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        117,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton2,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        117,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(61, 61, 61))))
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(50, 50, 50)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3).addGap(55, 55, 55).addComponent(jLabel4)
                                                .addGap(57, 57, 57).addComponent(jLabel7).addGap(22, 22, 22)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23)
                                                .addComponent(jLabel10))
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(68, 68, 68)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(R45,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(R48,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(R44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(R53,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(R46,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R49,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R52,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(R43,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R50,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R51,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(R54,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R47,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(R42,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R56,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(R57,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        55,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                145,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(80, 80, 80)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel12,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                145,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                145,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(R40,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(99, 99, 99).addComponent(
                                                jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 233,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 233,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(77, Short.MAX_VALUE)));
        jPanel1Layout
                .setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel13).addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14).addGap(25, 25, 25))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup().addContainerGap()
                                                        .addComponent(jLabel6).addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4)
                                        .addComponent(jLabel7).addComponent(jLabel1).addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20)
                                                .addComponent(jLabel9).addGap(35, 35, 35).addComponent(jLabel5)
                                                .addGap(40, 40, 40).addComponent(jLabel8).addGap(43, 43, 43)
                                                .addComponent(jLabel11))
                                        .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(R34, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R37, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                R41, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(R26,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(
                                                                        R31, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(
                                                                        R32, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(R35,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(R38, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(R28, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R30, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R36, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R39, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(R29, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R27, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R33, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R58, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(R42, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R48, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R56, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R57, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(R45, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R46, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R49, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R52, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(R44, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R43, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R50, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R51, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(R53, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R54, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R55, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(R47, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton5).addComponent(jButton4,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(R40, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel16).addComponent(jButton2,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void R58ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R58ActionPerformed
        numberBox = 15;
        putPiece();
        R58.setEnabled(false);
    }// GEN-LAST:event_R58ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        habilitar();
        if (shift == 0) {
            shift++;
        } else {
            shift--;
        }
        jLabel12.setText("Turno: " + usuarios[shift]);
        String url = "/img/" + numberPiece + ".png";
        R40.setIcon(new javax.swing.ImageIcon(getClass().getResource(url)));
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        System.exit(0);
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        np++;
        jLabel15.setText("Número de partida: " + np);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void R57ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R57ActionPerformed
        numberPiece = 3;
    }// GEN-LAST:event_R57ActionPerformed

    private void R56ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R56ActionPerformed
        numberPiece = 2;
    }// GEN-LAST:event_R56ActionPerformed

    private void R55ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R55ActionPerformed
        numberPiece = 14;
    }// GEN-LAST:event_R55ActionPerformed

    private void R54ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R54ActionPerformed
        numberPiece = 13;
    }// GEN-LAST:event_R54ActionPerformed

    private void R53ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R53ActionPerformed
        numberPiece = 12;
    }// GEN-LAST:event_R53ActionPerformed

    private void R52ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R52ActionPerformed
        numberPiece = 7;
    }// GEN-LAST:event_R52ActionPerformed

    private void R51ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R51ActionPerformed
        numberPiece = 11;
    }// GEN-LAST:event_R51ActionPerformed

    private void R50ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R50ActionPerformed
        numberPiece = 10;
    }// GEN-LAST:event_R50ActionPerformed

    private void R49ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R49ActionPerformed
        numberPiece = 6;
    }// GEN-LAST:event_R49ActionPerformed

    private void R48ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R48ActionPerformed
        numberPiece = 0;
    }// GEN-LAST:event_R48ActionPerformed

    private void R47ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R47ActionPerformed
        numberPiece = 15;
    }// GEN-LAST:event_R47ActionPerformed

    private void R46ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R46ActionPerformed
        numberPiece = 5;
    }// GEN-LAST:event_R46ActionPerformed

    private void R45ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R45ActionPerformed
        numberPiece = 4;
    }// GEN-LAST:event_R45ActionPerformed

    private void R44ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R44ActionPerformed
        numberPiece = 8;
    }// GEN-LAST:event_R44ActionPerformed

    private void R43ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R43ActionPerformed
        numberPiece = 9;
    }// GEN-LAST:event_R43ActionPerformed

    private void R42ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R42ActionPerformed
        numberPiece = 1;
    }// GEN-LAST:event_R42ActionPerformed

    private void R41ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R41ActionPerformed
        numberBox = 1;
        putPiece();
        R41.setEnabled(false);
        
    }// GEN-LAST:event_R41ActionPerformed

    private void R40ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R40ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_R40ActionPerformed

    private void R39ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R39ActionPerformed
        numberBox = 10;
        putPiece();
        R39.setEnabled(false);
        
    }// GEN-LAST:event_R39ActionPerformed

    private void R38ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R38ActionPerformed
        numberBox = 2;
        putPiece();
        R38.setEnabled(false);
        
    }// GEN-LAST:event_R38ActionPerformed

    private void R37ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R37ActionPerformed
        numberBox = 0;
        putPiece();
        R37.setEnabled(false);
    }// GEN-LAST:event_R37ActionPerformed

    private void R36ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R36ActionPerformed
        numberBox = 11;
        putPiece();
        R36.setEnabled(false);
        
    }// GEN-LAST:event_R36ActionPerformed

    private void R35ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R35ActionPerformed
        numberBox = 7;
        putPiece();
        R35.setEnabled(false);
        
    }// GEN-LAST:event_R35ActionPerformed

    private void R34ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R34ActionPerformed
        numberBox = 3;
        putPiece();
        R34.setEnabled(false);
    }// GEN-LAST:event_R34ActionPerformed

    private void R33ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R33ActionPerformed
        numberBox = 14;
        putPiece();
        R33.setEnabled(false);
        
    }// GEN-LAST:event_R33ActionPerformed

    private void R32ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R32ActionPerformed
        numberBox = 6;
        putPiece();
        R32.setEnabled(false);
        
    }// GEN-LAST:event_R32ActionPerformed

    private void R31ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R31ActionPerformed
        numberBox = 4;
        putPiece();
        R31.setEnabled(false);
        
    }// GEN-LAST:event_R31ActionPerformed

    private void R26ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R26ActionPerformed
        numberBox = 5;
        putPiece();
        R26.setEnabled(false);
        
    }// GEN-LAST:event_R26ActionPerformed

    private void R28ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R28ActionPerformed
        numberBox = 8;
        putPiece();
        R28.setEnabled(false);
        
    }// GEN-LAST:event_R28ActionPerformed

    private void R30ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R30ActionPerformed
        numberBox = 9;
        putPiece();
        R30.setEnabled(false);
        
    }// GEN-LAST:event_R30ActionPerformed

    private void R29ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R29ActionPerformed
        numberBox = 12;
        putPiece();
        R29.setEnabled(false);
        
    }// GEN-LAST:event_R29ActionPerformed

    private void R27ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_R27ActionPerformed
        numberBox = 13;
        putPiece();
        R27.setEnabled(false);
        
    }// GEN-LAST:event_R27ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton table[] = new javax.swing.JButton[16];
    private javax.swing.JButton R26; //
    private javax.swing.JButton R27;
    private javax.swing.JButton R28;
    private javax.swing.JButton R29;
    private javax.swing.JButton R30;
    private javax.swing.JButton R31;
    private javax.swing.JButton R32;
    private javax.swing.JButton R33;
    private javax.swing.JButton R34;
    private javax.swing.JButton R35;
    private javax.swing.JButton R36;
    private javax.swing.JButton R37;
    private javax.swing.JButton R38;
    private javax.swing.JButton R39; //
    private javax.swing.JButton R40;
    private javax.swing.JButton R41;//
    private javax.swing.JButton R42;
    private javax.swing.JButton R43;
    private javax.swing.JButton R44;
    private javax.swing.JButton R45;
    private javax.swing.JButton R46;
    private javax.swing.JButton R47;
    private javax.swing.JButton R48;
    private javax.swing.JButton R49;
    private javax.swing.JButton R50;
    private javax.swing.JButton R51;
    private javax.swing.JButton R52;
    private javax.swing.JButton R53;
    private javax.swing.JButton R54;
    private javax.swing.JButton R55;
    private javax.swing.JButton R56;
    private javax.swing.JButton R57;
    private javax.swing.JButton R58;//
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
