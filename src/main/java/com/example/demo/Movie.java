package com.example.demo;

public class Movie {

   private String title;
   private String description;
   private int year;
   private int duration;

    public Movie() {
    }

    public Movie(String title, String description, int year, int duration) {
        this.title = title;
        this.description = description;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
