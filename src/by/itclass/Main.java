package by.itclass;

import by.itclass.model.Cat;
import by.itclass.model.Dog;
import by.itclass.utils.CompetitionUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Map<String, String > error = new HashMap<>();

        CompetitionUtils.parseFile(cats, dogs, error);

    }
}
