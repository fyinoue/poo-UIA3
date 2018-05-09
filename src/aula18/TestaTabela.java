/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula18;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Felipe
 */
public class TestaTabela {
    public static void main(String[] args) {
        JTable tabela = new JTable(20, 5);
        
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(tabela);
        
        JFrame janela = new JFrame();
        janela.add(rolagem);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
