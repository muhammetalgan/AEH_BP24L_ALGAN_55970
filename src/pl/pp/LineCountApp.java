package pl.pp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LineCountApp {
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

        System.out.print("Enter the path to the output text file: ");
        outputFilePath = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
            reader.close();

            System.out.println("Total number of lines: " + lineCount);

            FileWriter writer = new FileWriter(outputFilePath);
            writer.write("Input file: " + inputFilePath + "\n");
            writer.write("Total number of lines: " + lineCount + "\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file: " + e.getMessage());
        }
    }
}
