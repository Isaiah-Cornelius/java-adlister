package com.codeup.adlister.dao;

import java.io.Serializable;

public class Quote implements Serializable {
    private int id;
    private Author author;
    private String quote;

    public Quote(){}

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Author getAuthor(){
        return this.author;
    }

    public void  setAuthor(Author author){
        this.author = author;
    }

    public String getQuote(){
        return this.quote;
    }

    public void setQuote(String quote){
        this.quote = quote;
    }
}
