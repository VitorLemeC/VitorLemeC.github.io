<%@page import="vo.Body"%>
<%@page import="ctr.BodyProcess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar os aparelhos</title>
</head>
<body>
		<table>
		<tr>
			<th>Nome</th>
			<th>Aparelho de Peito</th>
			<th>Aparelho de Costas</th>
			<th>Aparelho de Perna</th>
		</tr>
		<%BodyProcess.teste();
		for (Body j : BodyProcess.bodys){
			out.print(j.toHTML());
		}
		out.print(BodyProcess.salvar());
		
		%>
	</table>
</body>
</html>