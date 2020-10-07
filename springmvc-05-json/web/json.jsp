<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json test</title>
    <script type="text/javascript">
        var user = {
            name: "huangao",
            age: 18,
            gender: "man"
        }
        console.log(user);
        //js对象转json字符串
        var json = JSON.stringify(user);
        console.log("============");
        console.log(json);
        //json字符串转js对象
        var jsObject = JSON.parse(json);
        console.log("============");
        console.log(jsObject);

    </script>
</head>
<body>

</body>
</html>
