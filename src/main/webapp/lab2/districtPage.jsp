<%@ page import="com.bsuir.lab2.CountryHouse" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="commons/header.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    CountryHouse countryHouse=new CountryHouse();
    session.setAttribute("countryHouse", countryHouse);
%>
<form>
    <select name="district">
        <option>Minsk</option>
        <option selected>Luban</option>
        <option>Bitebsk</option>
    </select>
    <input type="submit" value="Submit selected district">
</form>

<%
    if(request.getParameter("district")!=null) {
        String district = request.getParameter("district");
        countryHouse.setDistrict(district);
        response.sendRedirect("lab2/characteristicsPage.jsp");
    }
%>


</body>
</html>
