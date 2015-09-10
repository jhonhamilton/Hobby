<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Loguin Informacion</h2>
	<form method="post" action="addlogin">
		<table>
			<tr>
				<td><label>User</label></td>
				<td><input type="text" name="user" /></td>
			</tr>
			<tr>
				<td><label>Clave</label></td>
				<td><input type="text" name="clave" /></td>
			</tr>
			<tr>
				<td><label>Id</label></td>
				<td><input type="text" name="session" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value = "submit" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>