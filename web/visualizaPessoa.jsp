<%-- 
    Document   : visualizaPessoa
    Created on : 2 de dez. de 2022, 17:54:34
    Author     : Celso
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="pessoa" scope="request"  class="br.com.senacrs.bean.Pessoa"/>
   
       
        <%--
        <jsp:getProperty name="pessoa" property="nome"/>
        <jsp:getProperty name="pessoa" property="sobrenome"/>
        --%>
        
        <c:if test="${!empty pessoa.nome}">
          Nome:  ${pessoa.nome} 
          ${pessoa.sobrenome}<br>
          </c:if>
        
        
        Rua: ${pessoa.endereco.rua}<br>
        Bairro: ${pessoa.endereco.bairro}<br>
        CEP: ${pessoa.endereco.cep} <br>
        
        
        
        
        
    </body>
</html>
