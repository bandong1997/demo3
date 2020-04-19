<%--
  Created by IntelliJ IDEA.
  User: INS
  Date: 2020/4/10
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <input type="text" name="username"/>
        <input type="password" name="password"/>
        <input type="text" name="age"/>
        <input type="submit" value="提交"/>
    </form>
    <a href="index2.jsp">index2</a><br/>
    <a href="index3.jsp">index3</a><br/>
    <a href="index4.jsp">index4</a><br/>
    <a href="index5.jsp">index5</a><br/>
</body>
</html>
