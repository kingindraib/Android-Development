package edu.divyagyan.listviewexampleall.model;

public class Movie {
    private String title;
    private String genre;
    private String duration;
    private String movieDate;
    private String imageUrl;

    public Movie(String title, String genre, String duration, String movieDate, String imageUrl){
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.movieDate = movieDate;
        this.imageUrl = imageUrl;
    }

    public String getTitle(){
        return  title;
    }
    public  void setTitle(String title){
        this.title = title;
    }

    public String getDuration(){
        return  duration;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getMovieDate(){
        return movieDate;
    }
    public void setMovieDate(String movieDate){
        this.movieDate = movieDate;
    }
    public String getImageUrl(){
        return  imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
}
