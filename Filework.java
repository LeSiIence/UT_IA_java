import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filework {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("data.txt"));
        String text = input.next();
        System.out.println(text);
        text = input.next();
        System.out.println(text);
        input.close();
    }
}
