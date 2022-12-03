<jsp:include page="/header.jsp"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<jsp:useBean id="pessoa" scope="request" class="br.com.senacrs.bean.Pessoa"/>

<center>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Sobrenome</th>
                <th>Rua</th>
                <th>Bairro</th><!-- comment -->
                <th>CEP</th><!-- comment -->
                <th colspan="2">Ações</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pessoas}" var="pessoa">
            
                <tr>
                    <td>${pessoa.id}</td><!-- comment -->
                    <td>${pessoa.nome}</td>
                    <td>${pessoa.sobrenome}</td><!-- comment -->
                    <td>${pessoa.endereco.rua}</td><!-- comment -->
                    <td>${pessoa.endereco.bairro}</td><!-- comment -->
                    <td>${pessoa.endereco.cep}</td>
                    <td> <a href="Controller?classe=ControllerLogicPessoa&metodo=editarPopular=${pessoa.id}">Editar</a></td>
                    <td> <a href="Controller?classe=ControllerLogicPessoa&metodo=excluir=${pessoa.id}">Editar</a></td>
                </tr>
                
            </c:forEach>          
            
        </tbody>
        
        
    </table>
    
    
</center>


<jsp:include page="/footer.jsp"/>

