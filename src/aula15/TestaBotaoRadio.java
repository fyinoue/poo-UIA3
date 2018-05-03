/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Felipe
 */
public class TestaBotaoRadio {
    public static void main(String[] args) {
        JLabel rotulo = new JLabel("Informe seu nível escolar:");
        JRadioButton nivelFundamental = new JRadioButton("Fundamental");
        JRadioButton nivelMedio = new JRadioButton("Médio");
        JRadioButton nivelSuperior = new JRadioButton("Superior");
        JRadioButton nivelMestrado = new JRadioButton("Mestrado");
        JRadioButton nivelDoutorado = new JRadioButton("Doutorado");
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(nivelFundamental);
        grupo.add(nivelMedio);
        grupo.add(nivelSuperior);
        grupo.add(nivelMestrado);
        grupo.add(nivelDoutorado);
        
        GridLayout leiaute = new GridLayout(10, 5);
        
        JPanel painel = new JPanel();
        painel.setLayout(leiaute);
        painel.add(nivelFundamental);
        painel.add(nivelMedio);
        painel.add(nivelSuperior);
        painel.add(nivelMestrado);
        painel.add(nivelDoutorado);
        
        JFrame janela = new JFrame();
        janela.add(rotulo, BorderLayout.NORTH);
        janela.add(painel, BorderLayout.CENTER);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
