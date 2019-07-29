package com.stackroute.demo;

public class Movie {
    public Movie() {
    }
    private String movieName;
    private String actor;
    public Movie(String movieName, String actor) {
        this.movieName = movieName;
        this.actor = actor;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }


}
