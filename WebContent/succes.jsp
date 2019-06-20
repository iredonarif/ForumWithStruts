<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Succes</title>
</head>
<body>
	
	<h3>Enregistrée avec succes. Voici vos informations : </h3>
	<s:if test="getPersonneBean()!=null">
		<s:property value="personneBean"/></br>
	</s:if>

	<s:if test="getQuestionBean()!=null">
		<s:property value="questionBean"/></br>
	</s:if>

	<s:if test="getReponseBean()!=null">
		<s:property value="reponseBean"/></br>
	</s:if>
	<a href="accueil">Accueil</a>
</body>
</html>