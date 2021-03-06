<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="to.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Alterar Vôo</title>
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/grids-responsive-min.css">
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
<link rel="stylesheet" href="css/layouts/marketing.css">
</head>
<body>
	<div class="header">
		<div class="home-menu pure-menu pure-menu-horizontal pure-menu-fixed">
			<div align="right">
				<form class="pure-form">
    				<fieldset>
        				<input style="width:200px" type="email" placeholder="Login">
        				<input style="width:200px" type="password" placeholder="Senha">
        				<button style="margin-bottom:16px" type="submit" class="pure-button pure-button-primary">Acessar</button>
    				</fieldset>
				</form>
			</div>		
			<a class="pure-menu-heading" href="index.html" >Flight System</a>
			<ul class="pure-menu-list">
				<li class="pure-menu-item"><a href="filas.do" class="pure-menu-link">Cadastrar</a></li>
				<li class="pure-menu-item"><a href="filas.do" class="pure-menu-link">Consultar</a></li>
				<li class="pure-menu-item"><a href="filas.do" class="pure-menu-link">Excluir</a></li>
				<li class="pure-menu-item"><a href="lista.do" class="pure-menu-link">Ajuda</a></li>
			</ul>
		</div>
	</div>

	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<div>&nbsp;</div>
				<div>&nbsp;</div>			
				<h2 class="content-head is-center">Alterar Vôo</h2>
			</div>
			<div class="pure-g">
				<div class="l-box-lrg pure-u-1">
					<form class="pure-form pure-form-stacked" action="alterar_voo.do"
						method="post">
						<fieldset>
							<label>Código</label> <input type="number" name="cod_voo"
								placeholder="Código do Vôo" maxlength=100 required> 
							<label>Origem</label> <input type="text" name="origem"
								placeholder="Origem" maxlength=100 required disabled> 
							<label>Destino</label> <input type="text" name="destino"
								placeholder="Destino" maxlength=100 required disabled> 
							<label>Escala</label> <input type="text" name="escala"
								placeholder="Escala" maxlength=100 required disabled> 
							<label>Data</label> <input type="text" name="data_voo"
								placeholder="Data do Vôo" maxlength=14 required disabled> 
							<label>Hora</label> <input type="text" name="hora"
								placeholder="Hora" maxlength=100 required disabled> 
							<label>Tipo de Aeronave</label> <select style="width:300px" name="tipo_aeronave" disabled></select>
							<label>Situação</label> <input type="text" name="situacao"
								placeholder="Situação" maxlength=100 required disabled> 
							<label>Preço</label> <input type="text" name="preco"
								placeholder="Preço" maxlength=100 required disabled> 
								<%
								//	ListaFilasTO filas = (ListaFilasTO) request.getAttribute("filas");
								//	for (FilaTO fila : filas) {
								//		out.println("<option value=\"" + fila.id + "\">" + fila.nome
								//				+ "</option>");
								//	}
								%>
						</fieldset>
						<button type="submit" class="pure-button">Consultar</button>
						<button type="submit" class="pure-button">Alterar</button>						
					</form>
					<br><br><br><br>
				</div>
			</div>
			<div class="footer l-box is-center">Copyright 2015 Flight System</div>
		</div>
	</div>

</body>
</html>