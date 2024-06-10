package pl.pp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = "";
        String outputFilePath;

        while (true) {
            System.out.print("Enter the path to the input text file: ");
            inputFilePath = scanner.nextLine();
            Path path = Paths.get(inputFilePath);
            if (Files.exists(path)) {
                break;
            } else {
                System.out.println("The file does not exist. Please provide a valid file path.");
            }
        }

        System.out.print("Enter the path to the output file: ");
        outputFilePath = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String line;
            int totalWordCount = 0;
            Map<String, Integer> wordCounts = new HashMap<>();

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                totalWordCount += words.length;

                for (String word : words) {
                    if (word.isEmpty()) continue;
                    word = word.toLowerCase();
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
            reader.close();

            System.out.println("Total number of words: " + totalWordCount);

            FileWriter writer = new FileWriter(outputFilePath);
            writer.write("Input file: " + inputFilePath + "\n");
            writer.write("Total number of words: " + totalWordCount + "\n\n");
            writer.write("Word occurrences:\n");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file: " + e.getMessage());
        }
    }
}
