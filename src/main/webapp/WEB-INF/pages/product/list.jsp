<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/21
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/pages/common/header.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${path}
<script src="${path}/js/jquery-3.3.1.min.js"></script>
<script>
    $(function(){
        let a;
        $.ajax({
            "url":"http://127.0.0.1:8080/product/ajax",
            "type":"get",
            "data":{"id":100},
            "async":false,
            "dataType":"text",
            "success":function(result){
                a=result;

            }
        });
        alert(a);
    })
</script>
</body>
</html>
