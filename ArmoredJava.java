import java.util.Scanner;

public class ArmoredJava {

    // Print characters from integer array
    public static void printEggs(int[] input, boolean newline) {
        for (int x : input) {
            System.out.print((char) x);
        }
        if (newline) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] s1 = {
            72,101,108,108,111,32,116,104,101,114,101,33,32,
            73,32,97,109,32,97,32,74,97,118,97,32,112,114,
            111,103,114,97,109,33
        };

        int[] s2 = {
            80,108,101,97,115,101,32,116,121,112,101,32,97,32,
            110,117,109,98,101,114,32,97,110,100,32,112,114,
            101,115,115,32,69,78,84,69,82,58,32
        };

        int[] s3 = {
            73,32,100,111,110,39,116,32,116,104,105,110,107,
            32,116,104,97,116,32,119,97,115,32,97,32,110,
            117,109,98,101,114,46
        };

        int[] sPositive = {
            84,104,105,115,32,105,115,32,97,32,112,111,115,
            105,116,105,118,101,32,110,117,109,98,101,114,46
        };

        int[] sNegative = {
            84,104,105,115,32,105,115,32,97,32,110,101,103,
            97,116,105,118,101,32,110,117,109,98,101,114,46
        };

        int[] sZero = {
            84,104,105,115,32,110,117,109,98,101,114,32,105,
            115,32,122,101,114,111,46
        };

        int[] sEntered = {
            89,111,117,32,101,110,116,101,114,101,100,58,32
        };

        printEggs(s1, true);
        printEggs(s2, false);

        String input = scanner.nextLine();
        int value;

        try {
            value = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            printEggs(s3, true);
            scanner.close();
            return;
        }

        printEggs(sEntered, false);
        System.out.println(value);

        if (value > 0) {
            printEggs(sPositive, true);
        } else if (value < 0) {
            printEggs(sNegative, true);
        } else {
            printEggs(sZero, true);
        }

        scanner.close();
    }
}
