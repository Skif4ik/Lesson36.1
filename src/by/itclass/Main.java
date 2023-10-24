package by.itclass;

import by.itclass.model.Cat;
import by.itclass.model.Dog;
import by.itclass.utils.CompetitionUtils;

import java.util.*;

import static by.itclass.utils.CompetitionUtils.*; //статический импорт всех
// методов теперь можно вызывать методы без CompetitionUtils.

public class Main {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Map<String, String> error = new HashMap<>();

        parseFile(cats, dogs, error);

        //CompetitionUtils.printResults(cats, dogs, error);
        //List<Cat> sortedCat = CompetitionUtils.sortByBirthDate(cats);
        //List<Dog> sortedDogs = CompetitionUtils.sortByBirthDate(dogs);

        // List<Cat> sortedCat = sortByBirthDate(cats);
        // List<Dog> sortedDogs = sortByBirthDate(dogs);

        //CompetitionUtils.printResults(sortedCat, sortedDogs, error);

        List<Cat> youngSortedCats = filterAnimals(sortByBirthDate(cats), true);//молодые коты
        List<Cat> oldSortedCats = filterAnimals(sortByBirthDate(cats), false);//коты старше 2 лет
        List<Dog> youngSortedDogs = filterAnimals(sortByBirthDate(dogs), true);//молодые собаки
        List<Dog> oldSortedDogs = filterAnimals(sortByBirthDate(dogs), false);//собаки старше 2лет


        //выводим 5 списков вместе
        printResults(youngSortedCats, youngSortedDogs, oldSortedCats, oldSortedDogs, error);


    }
}
