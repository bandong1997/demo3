<%--
  Created by IntelliJ IDEA.
  User: INS
  Date: 2020/4/15
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>自定义类型转换器</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/converter" method="post">
        <input type="text" name="datetime"/><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
