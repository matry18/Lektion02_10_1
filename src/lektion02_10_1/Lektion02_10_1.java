package lektion02_10_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Mathias
 */
public class Lektion02_10_1 {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "out.txt";
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }
        System.out.println("Enter three lines of text: \n>");
        Scanner keybord = new Scanner(System.in);
        for (int count = 1; count <=3; count++) {
            String line = keybord.nextLine();
            outputStream.println(count + " "+line);
        }
        /*outputStream.println("This is line 1."); //Instead of the Scanner keybord 
        outputStream.println("Here is line 2.");*/
        outputStream.close();
        System.out.println("Those lines were written to "+fileName);

    }

}
