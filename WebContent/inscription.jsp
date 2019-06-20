<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Inscription </title>
<s:head/>
<sx:head/>
</head>
<body>
	<h1> Bienvenue pour l'inscription </h1>
	<fieldset>
		<legend>Remplir puis valider le formulaire suivant :</legend>
		<s:form action="succesPersonne">
			<s:textfield name="personneBean.nom" label="Nom"/>
			<s:textfield name="personneBean.prenom" label="Prénom"/>
			<s:textfield name="personneBean.email" label="Email"/>
			<s:radio key="personneBean.sexe" label="Sexe" list="sexes"/>
			<sx:datetimepicker name="personneBean.dateNaissance" label="Date de naissance" displayFormat="dd/MM/yyyy"/>
			<!--s:reset value="Annuler"/--> 
			<s:submit value="Envoyer"/>
		</s:form>
	</fieldset>
	<br>
	<a href="accueil">Accueil</a>
</body>
</html>