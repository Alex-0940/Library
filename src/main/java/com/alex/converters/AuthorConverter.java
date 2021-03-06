package com.alex.converters;

import com.alex.controllers.AuthorController;
import com.alex.db.DataHelper;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class AuthorConverter implements Converter {

    private static AuthorController authorController;

    public AuthorConverter() {
        authorController = (AuthorController) FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get("authorController");
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return DataHelper.getInstance().getAuthor(Long.valueOf(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println(value);
        return "";//((Author)value).getFio();
    }
}
