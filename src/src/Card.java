/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Alonso
 */
public class Card implements Comparable<ImageIcon>{
    
    private int vidas = 6;
    
    private int aciertos = 0;
    
    private ImageIcon backSide;
    
    private ImageIcon frontSide;
    
    private JLabel label;
    
    public Card(ImageIcon backSide, ImageIcon frontSide, JLabel label) {
        this.backSide = backSide;
        this.frontSide = frontSide;
        this.label = label;
    }

    public void showFrontSide(){
        ImageIcon front = new ImageIcon(frontSide.getImage().getScaledInstance(label.getWidth(),
            label.getHeight(), Image.SCALE_SMOOTH));
        this.label.setIcon(front);
    }
    
    public void showBackSide(){
        ImageIcon back = new ImageIcon(backSide.getImage().getScaledInstance(label.getWidth(),
            label.getHeight(), Image.SCALE_SMOOTH));
        this.label.setIcon(back);
    }

    public JLabel getLabel() {
        return label;
    }
    
    public int flippedCards = 0;
    
    public void labelMouseClicked(java.awt.event.MouseEvent evt){
        if (flippedCards == 2) {
            int d = compareTo(frontSide);
            if (d == -1) {
                vidas--;
                showBackSide();
            } else if (d == 0) {
                aciertos++;
            }
        } else {
            flippedCards++;
            showFrontSide();
        }
    }

    public int getVidas() {
        return vidas;
    }

    public int getAciertos() {
        return aciertos;
    }
    
    @Override
    public int compareTo(ImageIcon o) {
        if (!frontSide.equals(o)){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return frontSide.getDescription();
    }
    
    
    
    
}
