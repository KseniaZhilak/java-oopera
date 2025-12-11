package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {

    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void addNewActor(Actor newActor) {
        if(listOfActors.isEmpty()) {
            listOfActors.add(newActor);
            return;
        }

        for (Actor actor : listOfActors) {
            if(newActor.equals(actor)) {
                System.out.println("Данный актер уже добавлен в группу");
                return;
            } else {
                listOfActors.add(newActor);
                return;
            }
        }
    }

    public void printAuthorInfo() {
        System.out.println(director);
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void replaceActor(Actor newActor, String surname) {
        for (Actor actor : listOfActors) {
            if(surname.equals(actor.getSurname())) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }
        System.out.println("Актер с данной фамилией отсутствует, замена не будет произведена");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
