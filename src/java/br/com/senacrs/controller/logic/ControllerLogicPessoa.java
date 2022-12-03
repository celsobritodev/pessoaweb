/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senacrs.controller.logic;

import br.com.senacrs.bean.Pessoa;
import br.com.senacrs.dao.JDBCPessoaDAO;
import br.com.senacrs.dao.PessoaDAO;
import br.com.senacrs.util.DAOFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class ControllerLogicPessoa implements ControllerLogic {

    @Override
    public void adicionar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome(request.getParameter("nome"));
        pessoa.setSobrenome(request.getParameter("sobrenome"));

        pessoa.getEndereco().setBairro(request.getParameter("bairro"));
        pessoa.getEndereco().setCep(request.getParameter("cep"));
        pessoa.getEndereco().setRua(request.getParameter("rua"));

        //request.getSession().setAttribute("pessoa", pessoa);
        PessoaDAO pd = DAOFactory.createPessoaDAO();
        pd.inserir(pessoa);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    public void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(request.getParameter("nome"));
                pessoa.setSobrenome(request.getParameter("sobrenome"));

                pessoa.getEndereco().setBairro(request.getParameter("bairro"));
                pessoa.getEndereco().setCep(request.getParameter("cep"));
                pessoa.getEndereco().setRua(request.getParameter("rua"));

                request.getSession().setAttribute("pessoa", pessoa);
                request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    public void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
               int id =Integer.parseInt(request.getParameter("id"));
               PessoaDAO pd = new JDBCPessoaDAO();
               pd.remover(id);
               request.getRequestDispatcher("index.jsp").forward(request, response);
       
    }

    @Override
    public void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       

       PessoaDAO p = new JDBCPessoaDAO();
       request.setAttribute("pessoas", p.listar());
       request.getRequestDispatcher("listapessoa").forward(request, response);
     
    }

    @Override
    public void editarPopular(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
         int id =Integer.parseInt(request.getParameter("id"));
         PessoaDAO pd = new JDBCPessoaDAO();
        Pessoa p = pd.buscar(id);
        request.setAttribute("pessoa", p);
        request.getRequestDispatcher("editPessoa").forward(request, response);
    }

}
