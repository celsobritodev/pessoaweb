/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.senacrs.testes;

import br.com.senacrs.util.ConnectionFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
       ConnectionFactory.getConnection();
        } catch (Exception ex ){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            JOptionPane.showMessageDialog(null,ex.getCause());
        }
    }
    
}
