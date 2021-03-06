package com.alex.entity;

import java.util.Arrays;

public class Book {

    private boolean edit;
    private long id;
    private String name;
    private byte[] content;
    private int pageCount;
    private String isbn;
    private long genreId;
    private long authorId;
    private int publishYear;
    private long publisherId;
    private byte[] image;
    private String descr;
    private String bookcol;
    private Genre genre;
    private Author author;
    private Publisher publisher;

    public Book() {
    }

    public Book(Author author, Genre genre, Publisher publisher, String name, int pageCount, String isbn, int publishYear) {
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.name = name;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.publishYear = publishYear;
    }

    public Book(Author author, Genre genre, Publisher publisher, String name, byte[] content, int pageCount, String isbn, int publishYear, byte[] image, String descr) {
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.name = name;
        this.content = content;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.image = image;
        this.descr = descr;
    }
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genreByGenreId) {
        this.genre = genreByGenreId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author authorByAuthorId) {
        this.author = authorByAuthorId;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getBookcol() {
        return bookcol;
    }

    public void setBookcol(String bookcol) {
        this.bookcol = bookcol;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (pageCount != book.pageCount) return false;
        if (genreId != book.genreId) return false;
        if (authorId != book.authorId) return false;
        if (publishYear != book.publishYear) return false;
        if (publisherId != book.publisherId) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (!Arrays.equals(content, book.content)) return false;
        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        if (!Arrays.equals(image, book.image)) return false;
        if (descr != null ? !descr.equals(book.descr) : book.descr != null) return false;
        if (bookcol != null ? !bookcol.equals(book.bookcol) : book.bookcol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + pageCount;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (int) (genreId ^ (genreId >>> 32));
        result = 31 * result + (int) (authorId ^ (authorId >>> 32));
        result = 31 * result + publishYear;
        result = 31 * result + (int) (publisherId ^ (publisherId >>> 32));
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + (descr != null ? descr.hashCode() : 0);
        result = 31 * result + (bookcol != null ? bookcol.hashCode() : 0);
        return result;
    }

}
