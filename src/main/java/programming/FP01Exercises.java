package programming;

import java.util.List;
import java.util.stream.IntStream;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printAllOddNumbersInListFunctional(numbers);
        //printCubesOddNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes");

//        courses.stream()
//                .forEach(System.out::println);

//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);

//        courses.stream()
//                .filter(course -> course.length() >=4)
//                .forEach(System.out::println);

        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);

    }
        private static void printAllOddNumbersInListFunctional (List < Integer > numbers) {

            numbers.stream()
                    .filter(number -> number % 2 != 0) //Lamdba Expression
                    .forEach(System.out::println); //Method Reference
        }

        private static void printCubesOddNumbersInListFunctional (List < Integer > numbers) {

            numbers.stream()
                    .filter(number -> number % 2 != 0) //Lamdba Expression
                    .map(number -> number * number * number)
                    .forEach(System.out::println); //Method Reference
        }
    }

