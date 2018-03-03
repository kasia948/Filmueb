package pl.filmueb.data;

public class Actor {
    private String name;
    private String country;
    private int yearOfBirght;

    public Actor(String name, String country, int yearOfBirght) {
        this.name = name;
        this.country = country;
        this.yearOfBirght = yearOfBirght;
    }

    public Actor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearOfBirght() {
        return yearOfBirght;
    }

    public void setYearOfBirght(int yearOfBirght) {
        this.yearOfBirght = yearOfBirght;
    }

}