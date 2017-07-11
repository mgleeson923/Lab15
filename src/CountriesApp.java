import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/11/17.
 */
public class CountriesApp {
    public static void main(String[] args) {

        boolean userContinue = true;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the List of Country Program");
        do {
            System.out.print("Option 1: Display a list of countries.\nOption 2: Add a country" +
                    "to the list.\nOption 3: Exit the Program\n");
            System.out.print("What would you like to do? 1,2, or 3: ");
            int userChoice = scnr.nextInt();
            userChoice = Validation.menuNumValidation(userChoice);
            System.out.println();

            switch (userChoice) {
                case 1:
                    CountriesTextFile.readFromFile();
                    System.out.println();
                    break;
                case 2:
                    CountriesTextFile.writeToFile();
                    System.out.println("This country has been added to the list!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    userContinue = false;
                    break;
            }
        }while (userContinue);
    }
}
