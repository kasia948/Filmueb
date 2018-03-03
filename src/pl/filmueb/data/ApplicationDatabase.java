package pl.filmueb.data;
import pl.filmueb.app.ConsoleDataReader;
public class ApplicationDatabase {

    ConsoleDataReader cdr = new ConsoleDataReader();

    int MOVIES_NUMBER = 1;
    int movieNum = 0;

    Movie[] filmy = new Movie[MOVIES_NUMBER]; //tablica z filmami

    public Movie[] addMovie() {
        Movie movCDR = cdr.createMovie();//tworzy nowy film
        filmy[movieNum] = movCDR; //przypisuje do tablicy
        movieNum++;
        MOVIES_NUMBER++;
        return filmy;
    }

    public void printMovies() { //wyświetla tablicę z filmami
        for (int i = 0; i < filmy.length; i++) {
            System.out.println("Tutuł filmu: " + filmy[i].getTitle() + ", reżyser: " + filmy[i].getDirector() + ", gatunek: "
                    + filmy[i].getGenre() + ", rok premiery: " + filmy[i].getPremierYear());
        }
    }

    int ACTORS_NUMBER = 1;
    int actorNum = 0;

    Actor[] aktorzy = new Actor[ACTORS_NUMBER]; //tablica z aktorami

    public Actor[] addActor() {
        Actor actCDR = cdr.createActor();//tworzy nowego aktora
        aktorzy[actorNum] = actCDR; //przypisuje aktora do tablicy
        actorNum++;
        ACTORS_NUMBER++;
        return aktorzy;
    }

    public void printActors() { //wyświetla tablicę z aktorami
        for (int i = 0; i < aktorzy.length; i++) {
            System.out.println("Imię i nazwisko: " + aktorzy[i].getName() + ", kraj: " + aktorzy[i].getCountry()
                    + ", rok urodzenia: " + aktorzy[i].getYearOfBirght());
        }
    }

    int TVSERIES_NUMBER = 1;
    int tvSeriesNum = 0;

    TVseries[] seriale = new TVseries[TVSERIES_NUMBER]; //tablica z serialami

    public TVseries[] addTVserie() {
        TVseries tvserCDR = cdr.createTvSeries();//tworzy nowy serial
        seriale[tvSeriesNum] = tvserCDR; //przypisuje aktora do tablicy
        tvSeriesNum++;
        TVSERIES_NUMBER++;
        return seriale;
    }

    public void printTVseries() { //wyświetla tablicę z serialami
        for (int i = 0; i < seriale.length; i++) {
            System.out.println("Tutuł: " + seriale[i].getTitle() + ", gatunek: " + seriale[i].getGenre()
                    + ", sezon: " + seriale[i].getSesons());
        }
    }
}


