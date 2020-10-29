<%--
  Created by IntelliJ IDEA.
  User: X1 Carbon
  Date: 29/10/2020
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/DiscountCalculator" method="post">
    <lable>Product Description: </lable><br/>
    <input type="text" name="ProductDescription"/><br/>
    <lable>List Price: </lable><br/>
    <input type="text" name="listprice"/><br/>
    <Lable>Discount Price (%): </Lable><br/>
    <input type="text" name="discountPrice"/><br/>
    <input type="submit" value="Calculate Discount "></input>
</form>
</body>
</html>
