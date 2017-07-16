<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
    <%@ page import="java.util.*,com.shopcart.dto.Item" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to ShopCart...!</title>
</head>
<body>
<jsp:useBean id="itemDao" class="com.shopcart.dao.ItemDaoImpl" />
<%
List<Item> items = itemDao.getItems();
request.setAttribute("items", items);
%>

<c:forEach var="itm" items="${requestScope.items}">
<img alt="Item" src='resources/img/<c:out value="${itm.itemImageId }" />' width="10%" height="60px">
<br>
<c:out value="${itm.itemName }" />
</c:forEach>
</body>
</html>