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

}
