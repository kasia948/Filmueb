package pl.filmueb.data;


public class TVseries {
    String title;
    String genre;
    int sesons;

    public TVseries() {
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

    public int getSesons() {
        return sesons;
    }

    public void setSesons(int sesons) {
        this.sesons = sesons;
    }

    public TVseries(String title, String genre, int sesons) {
        this.title = title;
        this.genre = genre;
        this.sesons = sesons;
    }
}
