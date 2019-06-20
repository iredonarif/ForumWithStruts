<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Ajout question </title>
<s:head/>
<sx:head/>
</head>
<body>
	<h1>Ajout Question</h1>
	<fieldset>
	<legend><h3> Remplir le formulaire suivant</h3></legend>
	<s:form action="succesQuestion">
		<s:select name="questionBean.id_personne" label="Personne" list="personnes" listKey="id"/>
		<s:select name="questionBean.id_categorie" label="Catégorie" list="categories" listKey="id"/>
		<s:textarea name="questionBean.texte" label="Question" cols="50" rows="5"/>
		<s:submit value="Submit"/>
	</s:form>
	</fieldset>
	<a href="accueil">Accueil</a>
</body>
</html>