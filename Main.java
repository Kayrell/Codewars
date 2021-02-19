package kataExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        int a = 3;
//        int  b = 4;
//        int c = a + b;
//        System.out.println(c);
//        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\designPatterns\\src\\kataExercises\\Printer.java");
//        try (Stream<String> lines = Files.lines(path)) {
//            lines.forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        do{
            int x = 1;
            System.out.println(x++ + " ");
        } while(x <= 10);
    }
}

