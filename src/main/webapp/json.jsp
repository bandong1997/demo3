<%--
  Created by IntelliJ IDEA.
  User: INS
  Date: 2020/4/11
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSON数据交换</title>
</head>
<body>


    <button type="button" id="btn1">点击有惊喜</button>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
    $("#btn1").click(function () {
        $.ajax({
            url:"${pageContext.request.contextPath}/user/testRequestJson4",
            //data:{"id":1,"name":"仲谋","age":18},
            data:{},
            dataType:"json",
            type:"post",
            success:function (data) {
                alert(data[0].name);
                alert(data[1].name);
            }
        });
    });
</script>





</html>
