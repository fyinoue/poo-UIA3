/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Felipe
 */
public class TestaCampoTexto {
    public static void main(String[] args) {
        JTextField campoNome = new JTextField(30);
        JTextField campoDataNascimento = new JTextField(10);
        
        //campoDataNascimento.setEditable(false);
        campoDataNascimento.setText("01/01/1990");
        
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel rotuloNome = new JLabel("Nome:");
        rotuloNome.setDisplayedMnemonic('N');
        rotuloNome.setLabelFor(campoNome);
        painel.add(rotuloNome);
        painel.add(campoNome);
        painel.add(new JLabel("Data de Nascimento"));
        painel.add(campoDataNascimento);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
