/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senacrs.controller.logic;

import br.com.senacrs.bean.Pessoa;
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
public class ControllerLogicPessoaCadastrar implements ControllerLogic {

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
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
    
}
