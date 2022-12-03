/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.senacrs.controller.logic;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public interface ControllerLogic {
    
    public void adicionar(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException;
    public void editar(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException;
    public void editarPopular(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException;
    public void excluir(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException;
    public void listar(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException;
   
    //public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    
}
