package io.vk.core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the lines :: \n");

        List<String> strings = new ArrayList<>();
        while (scanner.hasNext()) {
            strings.add(scanner.nextLine());
            if (strings.size() == 3)
                break;
        }
        System.out.println(strings);

        try {
            System.out.println("Using NIO Files");
            String s = Files.readString(Paths.get("src/main/resources/if.txt"));
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            scanner = new Scanner(new FileReader("src/main/resources/if.txt"));
            System.out.println("\n Using FileReader");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
