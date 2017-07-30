<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="user" class="com.shopcart.dto.User" />
<jsp:setProperty property="*" name="user"/>

<%
request.setAttribute("user", user);
%>

<jsp:forward page="user/register" />