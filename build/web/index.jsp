<jsp:include page="header.jsp"/>

<h1> Menu Pessoa</h1>
<%-- Cadastrar, Editar, Excluir e Listar--%>
<h2> <a href="/PessoaWeb/Redirect?page=cadPessoa">Cadastrar</a> </h2>
<h2> <a href="/PessoaWeb/Redirect?page=editPessoa">Editar</a> </h2>
<h2> <a href="/PessoaWeb/Controller?classe=ControllerLogicPessoa&metodo=listar">Visualizar</a> </h2>

<jsp:include page="footer.jsp"/>
