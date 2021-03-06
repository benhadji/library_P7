package org.WebService.webapp.action;

import org.WebService.resource.AbstractResource;
import org.apache.struts2.interceptor.SessionAware;
import org.webservice.service.services.Author;
import org.webservice.service.services.Book;
import org.webservice.service.services.Editor;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookListAction extends AbstractResource implements SessionAware{


    private List<Book> books = new ArrayList<>();
    private Author author;
    private Editor editor;
    private Map<String, Object> session;
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }



    public String execute(){

        if(session.containsKey("sessionUserAccount")){
            books = getManagerFactory().getBookManager().getAllBooks();

            for (Book book : books){
                author = getManagerFactory().getAuthorManager().getAuthorByBookTitle(book.getTitle());
                editor = getManagerFactory().getEditorManager().getByBookTitle(book.getTitle());
                book.setAuthor(author);
                book.setEditor(editor);
            }


            return "success";
        }
        else
            return LOGIN;


    }


    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
