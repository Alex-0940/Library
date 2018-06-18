package com.alex.entity;

import java.sql.Date;
import java.util.Collection;

public class Author {
    private long id;
    private String fio;
    private Date birthday;
    private Collection<Book> booksById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (id != author.id) return false;
        if (fio != null ? !fio.equals(author.fio) : author.fio != null) return false;
        if (birthday != null ? !birthday.equals(author.birthday) : author.birthday != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }

    public Collection<Book> getBooksById() {
        return booksById;
    }

    public void setBooksById(Collection<Book> booksById) {
        this.booksById = booksById;
    }
}
