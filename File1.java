import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("weather.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter writer = new PrintWriter("weather_output.txt");

        double temp = 0, prev = 0;
        if(scanner.hasNext()){
            temp = scanner.nextDouble(); 
        }

        while(scanner.hasNext()){
            prev = temp;
            if(scanner.hasNext()){
                temp = scanner.nextDouble();
                System.out.println( prev + " to " + temp + ", change: "+ (temp - prev));
                writer.println( prev + " to " + temp + ", change: "+ (temp - prev));
            }
        }

        scanner.close();
        writer.close();
    }
}
