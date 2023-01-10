package io.vk.functional;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

    static Predicate<String> predicate = p -> p.startsWith("A");
    static BiPredicate<String,String> biPredicate = String::startsWith;

    public static void main(String[] args) {

        List<String> clubs = new ArrayList<>();
        clubs.add("Arsenal");
        clubs.add("Chelsea");
        clubs.add("Liverpool");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a character :: ");
        clubs.stream().filter(PredicateContains.containsTheseCharacters(scanner.nextLine())).forEachOrdered(System.out::println);

        clubs.stream().filter(predicate).forEach(System.out::println);
    }
}

class PredicateContains {
    static Predicate<String> containsTheseCharacters(String s) {
        return p -> p.toLowerCase().contains(s.toLowerCase());
    }
}