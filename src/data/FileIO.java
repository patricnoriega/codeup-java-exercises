package data;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {
    public static void main(String[] args) throws IOException {


        String directory = "./src/data";
        String filename = "groceryList.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        System.out.println(dataFile);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectory(dataDirectory);
        }
        if (Files.notExists(dataFile)) {
            Files.createFile(dataFile);
        }

        Path groceriesTxtPath = Paths.get(directory, filename);
        System.out.println("groceriesTxtPath = " + groceriesTxtPath);
        System.out.println("Files.exists(groceriesTxtPath) = " + Files.exists(groceriesTxtPath));

        List<String> groceryList = Arrays.asList("chicken Nuggets", "coffee pods", "potatoes", "bread", "milk");
        System.out.println("groceryList = " + groceryList);

        Files.write(groceriesTxtPath, groceryList);

        List<String> printList = Files.readAllLines(groceriesTxtPath);
        System.out.println("printList = " + printList);

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }
        Files.write(groceriesTxtPath, Arrays.asList("eggs", "butter"), StandardOpenOption.APPEND);
        System.out.println();

        printList = Files.readAllLines(groceriesTxtPath);
        for (int i = 0; i < printList.size(); i++) {
            System.out.println((i + 1) + ": " + printList.get(i));
        }

        groceryList = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>();

        for (String line : groceryList) {
            if (line.equalsIgnoreCase("butter")) {
                newList.add("cheese");
                continue;
            }
            newList.add(line);
        }
        System.out.println("newList = " + newList);
        Files.write(groceriesTxtPath, newList);
    }

}
