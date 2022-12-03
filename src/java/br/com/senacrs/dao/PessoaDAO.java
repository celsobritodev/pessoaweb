/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senacrs.dao;

import br.com.senacrs.bean.Pessoa;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface PessoaDAO {
    public void inserir(Pessoa pessoa);
    public void remover(int id);
    public List<Pessoa> listar();
    public Pessoa buscar(int id);
    public void editar(Pessoa pessoa);
    
}
