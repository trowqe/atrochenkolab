package com.bsuir.lab2;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class CountryHouseTag extends SimpleTagSupport {

    private CountryHouse countryHouse;


    public void doTag() throws IOException {
        countryHouse = (CountryHouse) getJspContext().getAttribute("countryHouse", PageContext.SESSION_SCOPE);
        JspWriter out = getJspContext().getOut();
        out.println("<h2>district: "+ countryHouse.getDistrict() + "</h2>");
        for (String characteristic : countryHouse.getCharacteristics()
        ) {
            out.println("<h2> "+ characteristic + "</h2>");
        }

        if (countryHouse.isIndividual()) {
            out.println("<h2>individual</h2>");
        } else {
            out.print("<h2>semi-detached<h2>");
        }

        if (countryHouse.getAdditionalInfo() != null) {
            out.println("<h2> "+ countryHouse.getAdditionalInfo() + "</h2>");
        }
    }
}
