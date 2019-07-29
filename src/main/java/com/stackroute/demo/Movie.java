package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    private String movieName="Vijay";
    private Actor actor;


    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actor=" + actor +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Autowired
    public Actor getActor() {
        return actor;
    }


    public void setActor(Actor actor) {
        this.actor = actor;
    }
}