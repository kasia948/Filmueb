package pl.filmueb.app;
import pl.filmueb.data.ApplicationDatabase;

public class ApplicationController {
    public final int exit=0;
    public final int addMovie=1;
    public final int printMovies=2;
    public final int addActor=3;
    public final int printActors=4;
    public final int addTVserie=5;
    public final int printTVseries=6;

    private ConsoleDataReader dataReader;

    private ApplicationDatabase applicationDatabase;

    public ApplicationController(){
        dataReader= new ConsoleDataReader();
        applicationDatabase= new ApplicationDatabase();
    }

    public void controlLoop() {
        int option;
        printOptions();
        while ((option = dataReader.getInt()) != exit) {
            switch (option) {
                case addMovie:
                    applicationDatabase.addMovie();
                    break;
                case printMovies:
                    applicationDatabase.printMovies();
                    break;
                case addActor:
                    applicationDatabase.addActor();
                    break;
                case printActors:
                    applicationDatabase.printActors();
                    break;
                case addTVserie:
                    applicationDatabase.addTVserie();
                    break;
                case printTVseries:
                    applicationDatabase.printTVseries();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
            printOptions();
        }
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodaj film");
        System.out.println("2 - wyświetl wszsytkie filmy");
        System.out.println("3 - dodaj aktora");
        System.out.println("4 - wyświetl wszsytkich aktorów");
        System.out.println("5 - dodaj serial");
        System.out.println("6 - wyświetl wszsytkie seriale");
    }
}
