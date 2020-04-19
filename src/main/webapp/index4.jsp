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
        <input type="text" name="age"/><br/>
        <%--给List集合中的元素赋值,使用下标--%>
        list集合：<input type="text" name="list[0]"/>
                  <input type="text" name="list[1]"/><br/>
        一个对象：<input type="text" name="role.id">
                 <input type="text" name="role.roleName"><br/>
        多个对象：<input type="text" name="roleList[0].id"/>
                 <input type="text" name="roleList[0].roleName"/>
                 <input type="text" name="roleList[1].id"/>
                 <input type="text" name="roleList[1].roleName"/><br/>
        map集合：<input type="text" name="map[one]">
                 <input type="text" name="map[two]"><br/>
        roleMap：<input type="text" name="roleMap[one].id"/>
                 <input type="text" name="roleMap[one].roleName"/>
                 <input type="text" name="roleMap[two].id"/>
                 <input type="text" name="roleMap[two].roleName"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
