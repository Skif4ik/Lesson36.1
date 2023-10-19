package by.itclass.utils;

import by.itclass.model.Cat;
import by.itclass.model.Dog;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@UtilityClass
public class CompetitionUtils {
    private static final String PATH_TO_FILE ="src/by/itclass/resurses/animals.txt";

    public static void parseFile(List<Cat> cats, List<Dog> dogs, Map<String, String> errors){

        try(Scanner sc = new Scanner(new FileReader(PATH_TO_FILE))){
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.printf("File hasn't found by path %s %n", PATH_TO_FILE);
            System.exit(1);
        }
    }
}
