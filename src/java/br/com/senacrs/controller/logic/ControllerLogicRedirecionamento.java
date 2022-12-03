/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class ControllerLogicRedirecionamento implements ControllerLogic{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
        String page = request.getParameter("page");
        
        request.getRequestDispatcher(page).forward(request, response);
        
    }
    
}
