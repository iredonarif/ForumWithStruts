<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Authentification par formulaire</title>
		<style type="">
			div {
				position: relative;
				top: 40px;
				border: black solid 2px;
				padding-top: 20px;
				padding-bottom: 50px;
				margin-left: 450px;
				margin-right: 450px;
			}
		</style>
	</head>
	<body>
		<div align="center">
			<form method="POST" action="j_security_check">
			<table>
				<tr><td><label>Nom d'utilisateur :</label></td> 
					<td><input type="text" name="j_username" id="user"></td> 
				</tr>
				<tr><td><label>Mot de passe : </label></td>  
					<td><input type="password" name="j_password"></td>
				</tr>
				<tr>
					<td></td><td><input type="submit" value="login"></td>
				</tr>
			</table>
			</form>
		</div>
	</body>
</html>