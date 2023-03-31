<%--
  Created by IntelliJ IDEA.
  User: 29662
  Date: 2023/3/16
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>跨域请求</title>
</head>
<body>
<button id="btn">跨域请求</button>
<script src="js/jquery.form.js"></script>
<script>
    $(function(){
        $("#btn").click(function (){
           $.get("http://localhost:8080/m3",function (data){
               console.log(data)
           })
        })
    })
</script>
</body>

</html>
