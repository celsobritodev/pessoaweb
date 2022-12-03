/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senacrs.util;

import br.com.senacrs.dao.JDBCPessoaDAO;
import br.com.senacrs.dao.PessoaDAO;

/**
 *
 * @author Usuario
 */
public class DAOFactory {
    
    public static PessoaDAO createPessoaDAO() {
        return new JDBCPessoaDAO();    }
    
}
