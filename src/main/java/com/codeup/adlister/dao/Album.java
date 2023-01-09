package com.codeup.adlister.dao;

import java.io.Serializable;
import java.util.*;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String name;
    private Date release_date;
    private float sales;
    private String genre;

    public Album() {}

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getRelease_date(){
        return this.release_date;
    }

    public void setRelease_date(Date release_date){
        this.release_date = release_date;
    }

    public float getSales(){
        return this.sales;
    }

    public void setSales(float sales){
        this.sales = sales;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

}
