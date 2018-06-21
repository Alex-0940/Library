package com.alex.controllers;

import com.alex.db.DataHelper;
import com.alex.entity.Genre;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManagedBean(eager = false)
@ApplicationScoped
public class GenreController implements Serializable, Converter {

    private List<SelectItem> selectItems = new ArrayList<SelectItem>();
    private Map<Long, Genre> genreMap;
    private List<Genre> genreList;

    public GenreController() {

        genreMap = new HashMap<Long, Genre>();
        genreList = DataHelper.getInstance().getAllGenres();

        for (Genre genre : genreList) {
            genreMap.put(genre.getId(), genre);
            selectItems.add(new SelectItem(genre, genre.getName()));
        }

    }

    public List<SelectItem> getSelectItems() {
        return selectItems;
    }

    // 
    public List<Genre> getGenreList() {
        return genreList;
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return genreMap.get(Long.valueOf(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Genre) value).getId().toString();
    }
}
