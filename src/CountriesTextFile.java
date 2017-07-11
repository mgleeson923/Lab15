import java.io.*;
import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/11/17.
 */
public class CountriesTextFile {

    public static void readFromFile() {
        try {
            File myFile = new File("countries.txt");
            FileReader reader = new FileReader(myFile);
            BufferedReader buff = new BufferedReader(reader);
            String line = null;
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }
            buff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeToFile() {
        // write to file
        try {
            Scanner scnr = new Scanner(System.in);
            FileWriter writer = new FileWriter("countries.txt", true);
            System.out.println("Add a country: ");
            String userCountry = scnr.nextLine();
            if (!Validation.dublicateCountry(userCountry)) {
                writer.write(userCountry + "\n");
                writer.close();
            }else {
                System.out.println("Country already in list!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}