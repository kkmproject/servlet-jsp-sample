<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="./fragments/headFragment.jsp" %>
<body>
<%! public String sampleMessage() { return "sample message"; } %>
<%= sampleMessage() %>
</body>
</html>