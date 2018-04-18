/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 1714290026
 */
public class TestaRotulo {

    public static void main(String[] args) {
        JLabel rotulo = new JLabel("Este texto foi adicionado na janela.");
        JLabel outro = new JLabel("Outro texto");
        //outro.setEnabled(false);
        outro.setToolTipText("Esta aqui a dica!");
        outro.setDisplayedMnemonic('E');
        
        JFrame janela = new JFrame();
        janela.add(rotulo, BorderLayout.NORTH);
        janela.add(outro);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
