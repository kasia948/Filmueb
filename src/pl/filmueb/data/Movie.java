package pl.filmueb.data;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private int premierYear;

    public Movie(String director, String title, String genre, int premierYear) {
        this.director = director;
        this.title = title;
        this.genre = genre;
        this.premierYear = premierYear;
    }

    public Movie() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPremierYear() {
        return premierYear;
    }

    public void setPremierYear(int premierYear) {
        this.premierYear = premierYear;
    }

    public void addMovie (Movie m){
    }
}