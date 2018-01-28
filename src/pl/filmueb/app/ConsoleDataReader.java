package pl.filmueb.app;


import java.util.Scanner;
import pl.filmueb.data.Movie;

    public class ConsoleDataReader {
        public void createMovie (Movie mov){
            Scanner input = new Scanner(System.in);
            mov= new Movie();
            System.out.println("Podaj tutuł filmu");
            mov.title=input.nextLine();
            System.out.println("Podaj reżysera filmu");
            mov.director=input.nextLine();
            System.out.println("Podaj gatunek filmu");
            mov.genre=input.nextLine();
            System.out.println("Podaj rok produkcji filmu");
            mov.premierYear=input.nextInt();
            System.out.println();
        }
}
