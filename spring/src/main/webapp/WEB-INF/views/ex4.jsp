<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 2024-04-16
  Time: 오전 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${message}</h1>
<h1><c:out value="${message}"></c:out> </h1>
</body>
</html>
