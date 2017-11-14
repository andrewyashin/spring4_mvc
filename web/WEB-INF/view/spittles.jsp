<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"/>
</head>
<body>
<h1>Spittles</h1>
<c:forEach items="${spittleList}" var="spittles">
    <p>${spittles.user} - ${spittles.message}</p>
</c:forEach>

</body>
</html>