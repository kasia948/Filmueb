package pl.filmueb.app;
import java.util.Scanner;
import pl.filmueb.data.Actor;
import pl.filmueb.data.Movie;
import pl.filmueb.data.TVseries;

public class ConsoleDataReader {

    public Movie createMovie() {
        Scanner input = new Scanner(System.in);
        Movie mov = new Movie();
        System.out.println("Podaj tutuł filmu");
        mov.setTitle(input.nextLine());
        System.out.println("Podaj reżysera filmu");
        mov.setDirector(input.nextLine());
        System.out.println("Podaj gatunek filmu");
        mov.setGenre(input.nextLine());
        System.out.println("Podaj rok produkcji filmu");
        mov.setPremierYear(input.nextInt());
        System.out.println();
        return mov;
    }

    public TVseries createTvSeries() {
        Scanner input = new Scanner(System.in);
        TVseries TVser = new TVseries();
        System.out.println("Podaj tutuł serialu");
        TVser.setTitle(input.nextLine());
        System.out.println("Podaj gatunek serialu");
        TVser.setGenre(input.nextLine());
        System.out.println("Podaj sezon serialu");
        TVser.setSesons(input.nextInt());
        System.out.println();
        return TVser;
    }

    public Actor createActor() {
        Scanner input = new Scanner((System.in));
        Actor act = new Actor();
        System.out.println("Podaj imię i nazwisko aktora");
        act.setName(input.nextLine());
        System.out.println("Podaj kraj pochodzenia aktora");
        act.setCountry(input.nextLine());
        System.out.println("Podaj rok urodzenia aktora");
        act.setYearOfBirght(input.nextInt());
        System.out.println();
        return act;
    }

    public int getInt() {
        Scanner input = new Scanner((System.in));
        int number = input.nextInt();
        input.nextLine();
        return number;
    }
}

