<%@ page import="com.bsuir.lab2.CountryHouse" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="commons/header.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form>
    <table width="75%">
        <tr>
            <td width="48%">Additional info?</td>
            <td width="52%">
                <input type="text" name="additionalInfo"/>
            </td>
        </tr>
    </table>
    <p>
        <input type="submit" value="Submit">
    </p>
</form>

<%
    if (request.getParameter("additionalInfo") != null) {
        String additionalInfo = request.getParameter("additionalInfo");
        out.println("additionalInfo " + additionalInfo);
        CountryHouse countryHouse = (CountryHouse) session.getAttribute("countryHouse");
        countryHouse.setAdditionalInfo(additionalInfo);
        response.sendRedirect("orderPage.jsp");
    }
%>

</body>
</html>
