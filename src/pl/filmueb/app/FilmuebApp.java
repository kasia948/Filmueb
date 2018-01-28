package pl.filmueb.app;


import pl.filmueb.data.Actor;
import pl.filmueb.data.Movie;
import pl.filmueb.data.TVseries;

public class FilmuebApp {
    public static void main(String[] args) {
        System.out.println("Filmueb v.0.1");

        Movie movie1= new Movie("Frank Darabont", "Skazani na Shawshank", "Dramma", 1994);
        System.out.println(movie1.getTitle()+", "+movie1.getDirector()+", "+movie1.getGenre()+", "+movie1.getPremierYear());

        TVseries tvseries1= new TVseries("Stranger Things", "Horror", 2);
        System.out.println(tvseries1.getTitle()+", "+tvseries1.getGenre()+", "+tvseries1.getSesons());

        Actor actor1=new Actor("Winona Ryder", "USA", 1971);
        System.out.println(actor1.getName()+", "+actor1.getCountry()+", "+actor1.getYearOfBirght());

        Movie movie2 = new Movie();
        ConsoleDataReader consoleDataRead1= new ConsoleDataReader();
        consoleDataRead1.createMovie(movie2);
        System.out.println(movie2.title+", "+movie2.director+", "+movie2.genre+", "+movie2.premierYear);
    }
}
