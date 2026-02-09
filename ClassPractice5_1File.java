/*
ClassPractice5_1File
This program reads data from a file, filters the data based on specific criteria,
 and writes the filtered results to a new file. 
 The program consists of four methods: printMessage(), readData(), filterData(), and writeResults(). 
The main method calls these methods in sequence.
date:2026-2-9 name: Nanxin Gao
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class ClassPractice5_1File {
    static final int MAX_SIZE = 1000;

    static void printMessage() {
        // receive no parameter, return None, print a welcome message to the user
        System.out.println("welcome the file filtering program.");
    }

    static String[] readData() throws FileNotFoundException {
        // receive no parameter, return a String array, read data from a file and store it in the array
        Scanner scanner = new Scanner(new File("input_data.txt"));
        String[] data = new String[MAX_SIZE];
        int index = 0;
        while (scanner.hasNextLine()) {
            data[index++] = scanner.nextLine();
        }
        scanner.close();
        return data;
    }

    static String[] filterData(String[] data) {
        // receive a String array, return a String array, filter the data based on specific criteria (lines containing the word "humpty")
        String[] filteredData = new String[MAX_SIZE];
        int index = 0;
        for (String line : data) {
            if (line != null && line.contains("Humpty")) {
                filteredData[index++] = line;
            }
        }
        return filteredData;
    }

    static void writeResults(String[] filteredLines) throws FileNotFoundException {
        // receive a String array, return None, write the filtered results to a new file
        PrintWriter writer = new PrintWriter("output_data.txt");
        for (String line : filteredLines) {
            if(line != null)
                writer.println(line);
        }
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        printMessage();
        String[] data = readData();
        String[] filteredData = filterData(data);
        writeResults(filteredData);
    }
}
