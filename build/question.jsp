<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.*" %>
<%@ page import="forum.dao.*" %>
<%@ page import="forum.model.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Detail question</title>
</head>
<body>
	<% PersonneDAO personnedao = new PersonneDAO(Connexion.getInstance()); 
	   CategorieDAO categoriedao = new CategorieDAO(Connexion.getInstance());
	%>
	<strong>Question : </strong><s:property value="%{#parameters.letexte}"/><br>
	<strong>Catégorie : </strong> <%= categoriedao.find(Integer.parseInt(request.getParameter("id_cat"))) %> <br>
	<strong>Auteur : </strong> <%= personnedao.find(Integer.parseInt(request.getParameter("id_pers")))%> <br>
	<strong>Date : </strong> <s:property value="%{#parameters.date}"/><br>

	<s:url action="ajouterReponse" var="lienAjouterRep"> 
		<s:param name="id_de_quest"> <s:property value="%{#parameters.id_quest}"/> </s:param>
	</s:url>
	<a href="${lienAjouterRep}">Ajouter Reponse</a></br>
	<hr>
	
	<s:if test="%{!getReponses().isEmpty()}">

		<s:set var = "breakLoop" value = "%{false}" />
		<s:iterator value="reponses" var="uneRep">

			<s:if test="%{#uneRep.id_question == (#parameters.id_quest[0])}">
			   <s:if test="%{!#breakLoop}">
		        	<h3>Liste des réponses</h3>
		        	<s:set var="breakLoop" value="%{true}" />
				</s:if>
				<table border = "1pt">
					<tr>
						<s:set var="id" value="#uneRep.id_personne"/>
						<jsp:useBean id="id" type="java.lang.Integer"/>
						<td><%= personnedao.find(id)%></td>
						<td><s:date name="#uneRep.date" format="dd/MM/yyyy HH:mm:ss"/></td>
					</tr>
					<tr>
						<td colspan="2">
							<pre>
				<s:property value="#uneRep.texte"/>
							</pre>
						</td>
					</tr>
				</table>
				<br>
			</s:if>
		</s:iterator>
	</s:if>
	<a href="accueil">Accueil</a>
</body>
</html>