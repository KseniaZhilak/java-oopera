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

        // Распределить актёров по спектаклям
        musicalShow.addNewActor(firstActor);
        musicalShow.addNewActor(secondActor);
        opera.addNewActor(secondActor);
        ballet.addNewActor(thirdActor);
        ballet.addNewActor(firstActor);

        // Для каждого спектакля выведите на экран список актёров
        musicalShow.printActors();
        opera.printActors();
        ballet.printActors();

        // Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров
        musicalShow.replaceActor(thirdActor, firstActor.getSurname());
        musicalShow.printActors();

        // Заменить в спектакле несуществующего актёра
        opera.replaceActor(firstActor, thirdActor.getSurname());

        // Для оперного и балетного спектакля выведите на экран текст либретто
        opera.printLibretto();
        ballet.printLibretto();


    }
}
