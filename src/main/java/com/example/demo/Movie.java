package com.example.demo;

public class Movie {

   private String title;
   private String genre;
   private int year;
   private String duration;

    public Movie() {
    }

    public Movie(String title, int year, String duration, String genre) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String description) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
