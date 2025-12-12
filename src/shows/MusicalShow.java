package shows;

import persons.Actor;
import persons.Director;
import persons.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {

    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, double duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Текст либретто " + librettoText);
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}
