<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--
  Created by IntelliJ IDEA.
  User: andrei
  Date: 09.03.2020
  Time: 3:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>


<fmt:setLocale value="${param.locale}" />
<fmt:setBundle basename="messages"/>

<html >
<head>

    <title>Title</title>

</head>
<body>


<table>

    <thead>
    <tr>
    <tr><th><h1><fmt:message key="car"/></h1></th>
        </tr>
        <th>Модель</th>
        <th>Версия</th>
        <th>Цена</th>
    </tr>
    </thead>
    <tbody>
<c:forEach var="car" items="${requestScope.cars}">
<tr>
    <td><strong> <c:out value="${car.model}"/></strong></td>

    <td><c:out value="${car.version}"/></td>
    <td><c:out value="${car.price}"/></td>
</tr>
</c:forEach>
    </tbody>
</table>

</body>
</html>
