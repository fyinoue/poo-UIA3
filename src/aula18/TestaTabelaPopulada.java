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
public class TestaTabelaPopulada {
    public static void main(String[] args) {
        Object[][] dados = {
            {"Ana", "ana@iesb.com", "01/01/1989"},
            {"João", "joao@iesb.com", "02/07/1990"}, 
            {"Pedro", "pedro@iesb.com", "05/04/1992"}
        };
        String[] colunas = {"Nome", "Email", "Data Nascimento"};
        
        JTable tabela = new JTable(dados, colunas);
        JScrollPane painel = new JScrollPane(tabela);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
