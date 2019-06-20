<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Forum</title>
</head>
<body>
	<div align="center">
	<h1>Bienvenue sur notre Forum</h1>
	<hr>
	<h3> <a href="ajouterQuestion" align="left">Ajouter Question</a></h3>
	<h3> <a href="inscription" align="left">Inscription</a></h3>
	<hr>

	<s:if test="%{!getQuestions().isEmpty()}">
		<legend><h2>Liste des questions existantes par catégorie</h2></legend>
		
			<s:iterator value="categories">
				<s:set var="cat" value="%{id}"/>
				<s:set var = "breakLoop" value = "%{false}" />

				<s:iterator value="questions">
					<s:if test="%{id_categorie == #cat && !#breakLoop}">
						<strong><s:property value="nom"/> </strong><br/><br>
						<s:set var = "breakLoop" value = "%{true}" />
					</s:if>
				</s:iterator>
				<ul>
				<s:iterator value="questions">
					<s:if test="%{ id_categorie == #cat}">
						<s:url action="question" var="lienquestion">
							<s:param name="letexte"><s:property value="texte"/></s:param>
							<s:param name="id_pers"><s:property value="id_personne"/></s:param>
							<s:param name="id_cat"><s:property value="id_categorie"/></s:param>
							<s:param name="id_quest"><s:property value="id"/></s:param>
							<s:param name="date"><s:date name="date" format="dd/MM/yyyy HH:mm:ss"/></s:param>
						</s:url>
						<li align="left"><s:a href="%{lienquestion}"><s:property value="texte"/></s:a></li></br>
					</s:if>
				</s:iterator>
				</ul>
			</s:iterator>
	</s:if>
	<br>
	
	</div>
</body>
</html>