/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senacrs.dao;

import br.com.senacrs.bean.Pessoa;
import br.com.senacrs.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class JDBCPessoaDAO implements PessoaDAO {

    Connection connection;

    public JDBCPessoaDAO() {
        connection = ConnectionFactory.getConnection();
    }

    @Override
    public void inserir(Pessoa pessoa) {

        String SQL = "INSERT INTO Pessoa (nome,sobrenome,rua,bairro,cep) VALUES (?,?,?,?,?)";
        try {
            try ( PreparedStatement ps = connection.prepareStatement(SQL)) {
                ps.setString(1, pessoa.getNome());
                ps.setString(2, pessoa.getSobrenome());
                ps.setString(3, pessoa.getEndereco().getRua());
                ps.setString(4, pessoa.getEndereco().getBairro());
                ps.setString(5, pessoa.getEndereco().getCep());

                ps.executeUpdate();

                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao inserir pessoa", ex);
        }
    }

    @Override
    public void remover(int id) {
        try {
            String SQL = "DELETE FROM pessoa WHERE id=?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro ao remover pessoa", ex);
        }
    }

    @Override
    public List<Pessoa> listar() {
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM pessoa";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSobrenome(rs.getString("sobrenome"));
                pessoa.getEndereco().setBairro(rs.getString("bairro"));
                pessoa.getEndereco().setRua(rs.getString("rua"));
                pessoa.getEndereco().setCep(rs.getString("cep"));
                pessoas.add(pessoa);
            }

            ps.close();
            rs.close();
            return pessoas;

        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao listas pessoas em JDBCPessoaDAO", ex);
        }
    }

    @Override
    public Pessoa buscar(int id) {
        Pessoa pessoa = null;
        try {
            String SQL = "SELECT * FROM pessoa WHERE id=?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            rs.next();
            pessoa = new Pessoa();
            pessoa.setNome(rs.getString("nome"));
            pessoa.setSobrenome(rs.getString("sobrenome"));
            pessoa.getEndereco().setBairro(rs.getString("bairro"));
            pessoa.getEndereco().setRua(rs.getString("rua"));
            pessoa.getEndereco().setCep(rs.getString("cep"));
        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao buscar pessoa em JDBCPessoaDAO", ex);
        }
        return pessoa;
    }

    @Override
    public void editar(Pessoa pessoa) {
        try {
            String SQL = "UPDATE pessoa SET nome=?, sobrenome=?, cep=?,rua=?,bairro=?  WHERE id=?";
            try (PreparedStatement ps = connection.prepareStatement(SQL)) {
                ps.setString(1, pessoa.getNome());
                ps.setString(2, pessoa.getSobrenome());
                ps.setString(3, pessoa.getEndereco().getCep());
                ps.setString(3, pessoa.getEndereco().getRua());
                ps.setString(3, pessoa.getEndereco().getBairro());
                ps.setInt(6, pessoa.getId());
                
                ps.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao buscar pessoa em JDBCPessoaDAO", ex);
        }
    }

}
