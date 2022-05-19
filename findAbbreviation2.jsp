<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find State Abbreviation</title>
</head>
<body>
<div align="center">
table class="title">
<tr><th>Find State Abbreviation</th></tr>
</table>
<p/>
<fieldset>
<legend> Mapping US State Names to Post Office Abbreviations</legend>
<form action="show-Abbreviation-2">
Full State Name :
<input type="text" name="state-name" value="${stateinfo2.stateName}"/></br>
<input type="SUBMIT" value="Show Abbreviation"/>
</form>
</fieldset>
</div>
</body>
</html>

