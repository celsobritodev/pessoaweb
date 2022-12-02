<%-- 
    Document   : CadPessoa
    Created on : 2 de dez. de 2022, 17:27:12
    Author     : Celso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="formulario" action="PessoaServlet" method="POST">
            <table border="0">
                <thead>
                    <tr>
                        <th>Cadastro de Pessoa</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nome: </td>
                        <td><input type="text" name="nome" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Sobrenome: </td>
                        <td><input type="text" name="sobrenome" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Rua: </td>
                         <td><input type="text" name="rua" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Bairro: </td>
                        <td><input type="text" name="bairro" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>CEP: </td>
                        <td><input type="text" name="cep" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Enviar" name="enviar" /></td>
                        <td><input type="reset" value="Limpar" name="limpar" /></td>
                    </tr>
                </tbody>
            </table>

            
            
            
            
        </form>
    </body>
</html>
