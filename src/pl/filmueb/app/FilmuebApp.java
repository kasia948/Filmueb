package pl.filmueb.app;

public class FilmuebApp {
    public static void main(String[] args) {
        System.out.println("Filmueb v.0.1");

        ApplicationController applicationController= new ApplicationController();
        applicationController.controlLoop();

    }
}
