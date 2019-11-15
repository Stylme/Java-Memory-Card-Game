/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Timer;
import javax.swing.JOptionPane;

/**
 *
 * @author Alonso
 */
public class View extends javax.swing.JFrame {

    private int vidas = 6;
    private int aciertos = 0;

    private int flippedCards = 1;

    private Card fSelected;

    private ArrayList<Card> frontSideCards = new ArrayList<>();

    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<JLabel> cartasTablero = new ArrayList<>();

    public ArrayList<ImageIcon> cartasAleatorias(ArrayList<ImageIcon> icons) {
        Random r = new Random();
        int num;
        ArrayList<ImageIcon> cartas = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            num = r.nextInt(52);
            if (!cartas.contains(icons.get(num))) {
                cartas.add(icons.get(num));
            } else {
                i--;
            }
        }
        return cartas;
    }

    public ArrayList<Card> cartasElegidas(ImageIcon backSide, ArrayList<ImageIcon> icons, ArrayList<JLabel> labels) {
        ArrayList<Card> cartas = new ArrayList<>();
        for (int i = 0; i < icons.size(); i++) {
            Card a = new Card(backSide, icons.get(i), labels.get(i));
            cartas.add(a);
        }
        return cartas;
    }

    public void iniciarTablero() {
        flippedCards = 1;
        frontSideCards = new ArrayList<>();
        fSelected = null;
        aciertos = 0;
        vidas = 6;
        aciertosLabel.setText(String.valueOf(aciertos));
        vidasLabel.setText(String.valueOf(vidas));
        ImageIcon icon = new ImageIcon("Back.jpg");
        ImageIcon backIcon = new ImageIcon(icon.getImage().getScaledInstance(j00.getWidth(),
                j00.getHeight(), Image.SCALE_SMOOTH));

        ArrayList<ImageIcon> icons = new ArrayList<>();

        icons.add(new ImageIcon("2_C.jpg"));
        icons.add(new ImageIcon("2_D.jpg"));
        icons.add(new ImageIcon("2_H.jpg"));
        icons.add(new ImageIcon("2_S.jpg"));

        icons.add(new ImageIcon("3_C.jpg"));
        icons.add(new ImageIcon("3_D.jpg"));
        icons.add(new ImageIcon("3_H.jpg"));
        icons.add(new ImageIcon("3_S.jpg"));

        icons.add(new ImageIcon("4_C.jpg"));
        icons.add(new ImageIcon("4_D.jpg"));
        icons.add(new ImageIcon("4_H.jpg"));
        icons.add(new ImageIcon("4_S.jpg"));

        icons.add(new ImageIcon("5_C.jpg"));
        icons.add(new ImageIcon("5_D.jpg"));
        icons.add(new ImageIcon("5_H.jpg"));
        icons.add(new ImageIcon("5_S.jpg"));

        icons.add(new ImageIcon("6_C.jpg"));
        icons.add(new ImageIcon("6_D.jpg"));
        icons.add(new ImageIcon("6_H.jpg"));
        icons.add(new ImageIcon("6_S.jpg"));

        icons.add(new ImageIcon("7_C.jpg"));
        icons.add(new ImageIcon("7_D.jpg"));
        icons.add(new ImageIcon("7_H.jpg"));
        icons.add(new ImageIcon("7_S.jpg"));

        icons.add(new ImageIcon("8_C.jpg"));
        icons.add(new ImageIcon("8_D.jpg"));
        icons.add(new ImageIcon("8_H.jpg"));
        icons.add(new ImageIcon("8_S.jpg"));

        icons.add(new ImageIcon("9_C.jpg"));
        icons.add(new ImageIcon("9_D.jpg"));
        icons.add(new ImageIcon("9_H.jpg"));
        icons.add(new ImageIcon("9_S.jpg"));

        icons.add(new ImageIcon("10_C.jpg"));
        icons.add(new ImageIcon("10_D.jpg"));
        icons.add(new ImageIcon("10_H.jpg"));
        icons.add(new ImageIcon("10_S.jpg"));

        icons.add(new ImageIcon("A_C.jpg"));
        icons.add(new ImageIcon("A_D.jpg"));
        icons.add(new ImageIcon("A_H.jpg"));
        icons.add(new ImageIcon("A_S.jpg"));

        icons.add(new ImageIcon("J_C.jpg"));
        icons.add(new ImageIcon("J_D.jpg"));
        icons.add(new ImageIcon("J_H.jpg"));
        icons.add(new ImageIcon("J_S.jpg"));

        icons.add(new ImageIcon("K_C.jpg"));
        icons.add(new ImageIcon("K_D.jpg"));
        icons.add(new ImageIcon("K_H.jpg"));
        icons.add(new ImageIcon("K_S.jpg"));

        icons.add(new ImageIcon("Q_C.jpg"));
        icons.add(new ImageIcon("Q_D.jpg"));
        icons.add(new ImageIcon("Q_H.jpg"));
        icons.add(new ImageIcon("Q_S.jpg"));

        ArrayList<ImageIcon> ca = cartasAleatorias(icons);

        ArrayList<ImageIcon> caa = new ArrayList<>();

        caa.addAll(ca);
        caa.addAll(ca);

        Collections.shuffle(caa);

        cartasTablero.add(j00);
        cartasTablero.add(j01);
        cartasTablero.add(j02);
        cartasTablero.add(j03);
        cartasTablero.add(j10);
        cartasTablero.add(j11);
        cartasTablero.add(j12);
        cartasTablero.add(j13);
        cartasTablero.add(j20);
        cartasTablero.add(j21);
        cartasTablero.add(j22);
        cartasTablero.add(j23);

        cards = cartasElegidas(backIcon, caa, cartasTablero);

        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).showBackSide();
        }
    }

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height - 50;
        int width = screenSize.width / 3;
        setLocation(width, 0);
        iniciarTablero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        aciertosLabel = new javax.swing.JLabel();
        vidasLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        j10 = new javax.swing.JLabel();
        j20 = new javax.swing.JLabel();
        j11 = new javax.swing.JLabel();
        j00 = new javax.swing.JLabel();
        j21 = new javax.swing.JLabel();
        j02 = new javax.swing.JLabel();
        j01 = new javax.swing.JLabel();
        j22 = new javax.swing.JLabel();
        j12 = new javax.swing.JLabel();
        j13 = new javax.swing.JLabel();
        j23 = new javax.swing.JLabel();
        j03 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Vidas Restantes:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Aciertos:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        aciertosLabel.setBackground(new java.awt.Color(255, 255, 255));
        aciertosLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        aciertosLabel.setForeground(new java.awt.Color(0, 0, 0));
        aciertosLabel.setText("0");
        aciertosLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vidasLabel.setBackground(new java.awt.Color(255, 255, 255));
        vidasLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        vidasLabel.setForeground(new java.awt.Color(0, 0, 0));
        vidasLabel.setText("0");
        vidasLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Mostrar tablero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Reiniciar partida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        j10.setText("jLabel5");
        j10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j10MouseClicked(evt);
            }
        });

        j20.setText("jLabel5");
        j20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j20MouseClicked(evt);
            }
        });

        j11.setText("jLabel5");
        j11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j11MouseClicked(evt);
            }
        });

        j00.setText("jLabel5");
        j00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j00MouseClicked(evt);
            }
        });

        j21.setText("jLabel5");
        j21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j21MouseClicked(evt);
            }
        });

        j02.setText("jLabel5");
        j02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j02MouseClicked(evt);
            }
        });

        j01.setText("jLabel5");
        j01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j01MouseClicked(evt);
            }
        });

        j22.setText("jLabel5");
        j22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j22MouseClicked(evt);
            }
        });

        j12.setText("jLabel5");
        j12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j12MouseClicked(evt);
            }
        });

        j13.setText("jLabel5");
        j13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j13MouseClicked(evt);
            }
        });

        j23.setText("jLabel5");
        j23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j23MouseClicked(evt);
            }
        });

        j03.setText("jLabel5");
        j03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j03MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j00, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j01, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(j02, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j03, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vidasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aciertosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(aciertosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(vidasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j00, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j02, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j01, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j03, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        iniciarTablero();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).showFrontSide();
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < cards.size(); i++) {
                    if (!(frontSideCards.contains(cards.get(i)))) {
                        cards.get(i).showBackSide();
                    }
                }
            }
        }, 5000);


    }//GEN-LAST:event_jButton1ActionPerformed

    public void verifyCard(Card a) {
        if (fSelected != null) {
            if (!(fSelected.equals(a))) {
                if (!(frontSideCards.contains(a) || frontSideCards.contains(fSelected))) {
                    if (!(fSelected.getFrontSide().equals(a.getFrontSide()))) {
                        JOptionPane.showMessageDialog(null, "Pareja incorrecta");
                        fSelected.showBackSide();
                        a.showBackSide();
                        --vidas;
                    } else {
                        ++aciertos;
                        frontSideCards.add(a);
                        frontSideCards.add(fSelected);
                    }
                } else {
                    if (frontSideCards.contains(a) && frontSideCards.contains(fSelected)) {
                        JOptionPane.showMessageDialog(null, "Cartas destapadas anteriormente");
                    }else if (frontSideCards.contains(a))
                     {

                        fSelected.showBackSide();
                    } else{

                        a.showBackSide();
                    }
                }

            } else {
                if (!(frontSideCards.contains(a) || frontSideCards.contains(fSelected))) {
                    fSelected.showBackSide();
                }
            }
            aciertosLabel.setText(String.valueOf(aciertos));
            vidasLabel.setText(String.valueOf(vidas));
            if (aciertos == 6) {
                JOptionPane.showMessageDialog(null, "Felicidades ha ganado la partida");
                iniciarTablero();
            } else if (vidas == 0) {
                JOptionPane.showMessageDialog(null, "Ha perdido, intentelo de nuevo");
                iniciarTablero();
            }
        }
    }

    private void j00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j00MouseClicked
        cards.get(0).showFrontSide();
        verifyCard(cards.get(0));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(0);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j00MouseClicked

    private void j01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j01MouseClicked
        // TODO add your handling code here:
        cards.get(1).showFrontSide();
        verifyCard(cards.get(1));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(1);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j01MouseClicked

    private void j02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j02MouseClicked
        // TODO add your handling code here:
        cards.get(2).showFrontSide();
        verifyCard(cards.get(2));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(2);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j02MouseClicked

    private void j03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j03MouseClicked
        // TODO add your handling code here:
        cards.get(3).showFrontSide();
        verifyCard(cards.get(3));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(3);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j03MouseClicked

    private void j10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j10MouseClicked
        // TODO add your handling code here:
        cards.get(4).showFrontSide();
        verifyCard(cards.get(4));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(4);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j10MouseClicked

    private void j11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j11MouseClicked
        // TODO add your handling code here:
        cards.get(5).showFrontSide();
        verifyCard(cards.get(5));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(5);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j11MouseClicked

    private void j12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j12MouseClicked
        // TODO add your handling code here:
        cards.get(6).showFrontSide();
        verifyCard(cards.get(6));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(6);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j12MouseClicked

    private void j13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j13MouseClicked
        // TODO add your handling code here:
        cards.get(7).showFrontSide();
        verifyCard(cards.get(7));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(7);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j13MouseClicked

    private void j20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j20MouseClicked
        // TODO add your handling code here:
        cards.get(8).showFrontSide();
        verifyCard(cards.get(8));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(8);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j20MouseClicked

    private void j21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j21MouseClicked
        // TODO add your handling code here:
        cards.get(9).showFrontSide();
        verifyCard(cards.get(9));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(9);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j21MouseClicked

    private void j22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j22MouseClicked
        // TODO add your handling code here:
        cards.get(10).showFrontSide();
        verifyCard(cards.get(10));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(10);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j22MouseClicked

    private void j23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j23MouseClicked
        // TODO add your handling code here:
        cards.get(11).showFrontSide();
        verifyCard(cards.get(11));
        if (!(flippedCards == 2)) {
            fSelected = cards.get(11);
        } else {
            fSelected = null;
            flippedCards = 0;
        }
        flippedCards++;
    }//GEN-LAST:event_j23MouseClicked

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
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aciertosLabel;
    private javax.swing.JLabel j00;
    private javax.swing.JLabel j01;
    private javax.swing.JLabel j02;
    private javax.swing.JLabel j03;
    private javax.swing.JLabel j10;
    private javax.swing.JLabel j11;
    private javax.swing.JLabel j12;
    private javax.swing.JLabel j13;
    private javax.swing.JLabel j20;
    private javax.swing.JLabel j21;
    private javax.swing.JLabel j22;
    private javax.swing.JLabel j23;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel vidasLabel;
    // End of variables declaration//GEN-END:variables
}
