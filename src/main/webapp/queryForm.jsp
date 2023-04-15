<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>servlet-jsp-sample</title>
</head>
<body>
<form action="queryservlet" method="post">
	<h3><label for="inputForm">inputForm</label></h3>
	<input type="text" id="inputForm" name="inputForm" maxlength="10"/>
	<br/>
	
	<h3><label for="passwordForm">passwordForm</label></h3>
	<input type="password" id="passwordForm" name="passwordForm"/>
	<br/>
	
	<h3><span>checkForm</span></h3>
	<input type="checkbox" name="checkForm" value="1"/>1
	<input type="checkbox" name="checkForm" value="2"/>2
	<br/>
	
	<h3><label for="selectForm">selectForm</label></h3>
	<select id="selectForm" name="selectForm">
		<option value="1">1
		<option value="2">2
	</select>
	<br/>
	
	<h3><label for="textareaForm">textareaForm</label></h3>
	<textarea cols="30" rows="10" id="textareaFrom" name="textareaForm"></textarea>
	
	<h3>reset</h3>
	<input type="reset" value="reset"/>
	
	<h3>submit</h3>
	<input type="submit" value="submit"/>
</form>
</body>
</html>