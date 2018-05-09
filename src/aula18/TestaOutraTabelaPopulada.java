/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula18;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class TestaOutraTabelaPopulada {
    public static void main(String[] args) {
        Object[][] dados = {};
        String[] colunas = {"Nome", "Email", "Data Nascimento"};
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        JTable tabela = new JTable();
        tabela.setModel(modelo);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        modelo.addRow(new String[]{"Ana", "ana@iesb.com", "1/1/89"});
        modelo.addRow(new String[]{"João", "joao@iesb.com", "2/7/90"});
        modelo.addRow(new String[]{"Pedro", "pedro@iesb.com", "5/4/92"});
        modelo.removeRow(0);
        modelo.addRow(new String[]{"Maria", "maria@iesb.com", "5/4/82"});
        
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(tabela);
        
        JButton btnIncluir = new JButton("Incluir");
        JButton btnAlterar = new JButton("Alterar");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnListar = new JButton("Listar");
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painel.add(btnIncluir);
        painel.add(btnAlterar);
        painel.add(btnExcluir);
        painel.add(btnListar);
        
        JFrame janela = new JFrame();
        janela.add(rolagem);
        janela.add(painel, BorderLayout.SOUTH);
        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
