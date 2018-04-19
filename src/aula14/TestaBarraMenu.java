package aula14;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class TestaBarraMenu {
    public static void main(String[] args) {
        JMenuBar barraMenu = new JMenuBar();
        
        JFrame janela = new JFrame();
        //não usar: janela.add(barraMenu);
        janela.setJMenuBar(barraMenu);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
