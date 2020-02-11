<%@ page import="com.bsuir.lab2.CountryHouse" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="commons/header.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form>
    <input type="checkbox" name="id" value="лоджия"> лоджия<BR>
    <input type="checkbox" name="id" value="монсарда"> монсарда<BR>
    <input type="checkbox" name="id" value="евро окна"> евро окна<BR>
    <input type="checkbox" name="id" value="окно в крыше"> окно в крыше<BR>
    <input type="checkbox" name="id" value="выход с балкона на улицу"> выход с балкона на улицу <BR>
    <BR><BR>
    <input type="radio" name="is" value="true" > индивидуальный дом <BR>
    <input type="radio" name="is" value="false" checked> дом на несколько семей <BR>
    <input type="submit" value="Submit">
</form>

<%
    if (request.getParameter("id") != null) {
        CountryHouse countryHouse = (CountryHouse) session.getAttribute("countryHouse");
        String select[] = request.getParameterValues("id");
        countryHouse.setCharacteristics(new ArrayList<String>(Arrays.asList(select)));
        if (select != null && select.length != 0) {
            out.println("You have selected: ");
            for (int i = 0; i < select.length; i++) {
                out.println(select[i]);
            }
        }

        Boolean is =  Boolean.valueOf(request.getParameter("is"));
        if(is){
            countryHouse.setIndividual(true);
        } else{
            countryHouse.setIndividual(false);
        }

        response.sendRedirect("additionalInfoPage.jsp");
    }
%>


</body>
</html>
