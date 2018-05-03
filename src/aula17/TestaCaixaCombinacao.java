/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17;

import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Felipe
 */
public class TestaCaixaCombinacao {
    public static void main(String[] args) {
        JLabel rotuloUF = new JLabel("UF");
        JLabel rotuloMunicipio = new JLabel("Municipio");
        
        String[] itens = {"DF", "GO"};
        JComboBox comboUF = new JComboBox(itens);
        comboUF.setSelectedIndex(comboUF.getItemCount()-1);
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Brasilia");
        modelo.addElement("Goiânia");
        JComboBox comboMunicipio = new JComboBox();
        comboMunicipio.setModel(modelo);
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotuloUF);
        painel.add(comboUF);
        painel.add(rotuloMunicipio);
        painel.add(comboMunicipio);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
