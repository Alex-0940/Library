package com.alex.entity;

import java.util.Set;

public class Genre {

    private Long id;
    private String name;
    private Set<Book> booksById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genre genre = (Genre) o;

        if (id != genre.id) return false;
        if (name != null ? !name.equals(genre.name) : genre.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Set<Book> getBooksById() {
        return booksById;
    }

    public void setBooksById(Set<Book> booksById) {
        this.booksById = booksById;
    }
}
