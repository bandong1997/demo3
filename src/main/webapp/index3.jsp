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
    <form action="${pageContext.request.contextPath}/user/login3" method="post">
        <input type="text" name="username"/>
        <input type="password" name="password"/>
        <input type="text" name="age"/>
        <%--给List集合中的元素赋值,使用下标--%>
        list集合：<input type="text" name="list[0]"/>
                  <input type="text" name="list[1]"/>
        <input type="submit" value="提交"/>
    </form>

</body>
</html>
