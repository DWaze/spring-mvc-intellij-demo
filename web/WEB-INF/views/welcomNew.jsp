<%--
  Created by IntelliJ IDEA.
  User: lhadj
  Date: 10/4/2018
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset-UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <title>Welcome!</title>
  </head>
  <body>
    <c:forEach var="messageitem" items="${myWelcomeMessage}">
      <c:out value="${messageItem}"></c:out>
    </c:forEach>
  </body>
</html>
