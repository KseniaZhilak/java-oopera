import persons.Actor;
import persons.Director;
import persons.Gender;
import shows.Ballet;
import shows.MusicalShow;
import shows.Opera;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor firstActor = new Actor("Иван", "Петров", Gender.MALE, 175);
        Actor secondActor = new Actor("Егор", "Иванов", Gender.MALE, 190);
        Actor thirdActor = new Actor("Анна", "Сидорова", Gender.FEMALE, 150);

        Director firstDirector = new Director("Илья", "Лаптев", Gender.MALE, 20);
        Director secondDirector = new Director("Мария", "Сергеева", Gender.FEMALE, 43);

        MusicalShow musicalShow = new MusicalShow("Щелкунчик",30, firstDirector, new ArrayList<>(),"Чайковский", "Постановка Щелкунчика");
        Opera opera = new Opera("Опера",84, secondDirector, new ArrayList<>(),"Автор оперы", "Интересная опера", 15);
        Ballet ballet = new Ballet("Балет",175, firstDirector, new ArrayList<>(),"Автор балета", "Интересный балет", "Хореограф балета");

        System.out.println("Распределить актёров по спектаклям");
        musicalShow.addNewActor(firstActor);
        musicalShow.addNewActor(secondActor);
        opera.addNewActor(secondActor);
        ballet.addNewActor(thirdActor);
        ballet.addNewActor(firstActor);

        System.out.println("Cписок актёров musicalShow");
        musicalShow.printActors();

        System.out.println("Cписок актёров opera");
        opera.printActors();

        System.out.println("Cписок актёров ballet");
        ballet.printActors();

        System.out.println("Замена актера в спектакле musicalShow");
        musicalShow.replaceActor(thirdActor, firstActor.getSurname());
        musicalShow.printActors();

        System.out.println("Заменить в opera на несуществующего актёра");
        opera.replaceActor(firstActor, thirdActor.getSurname());

        opera.printLibretto();
        ballet.printLibretto();


    }
}
