<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="forum.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Ajout réponse </title>
<s:head/>
<sx:head/>
</head>
<body>
	<h1>Ajout Réponse</h1>
	<fieldset>
	<legend><h3> Remplir le formulaire suivant</h3></legend>
	<s:form action="succesReponse">
		<s:select key="reponseBean.id_personne" label="Personne" list="personnes" listKey="id"/>
		<s:textarea name="reponseBean.texte" label="Réponse" cols="50" rows="5"/>
		<s:hidden name="reponseBean.id_question" value="%{#parameters.id_de_quest}"/>
		<s:submit value="Submit"/>
	</s:form>
	</fieldset>
	<a href="accueil">Accueil</a>
	
</body>
</html>