package homework_week3_java_nb;
/**
 * 08. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
import java.util.Scanner;

public class Programme08 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get alphabet from the User
        System.out.print("Enter an alphabet from A to F : ");
        char alphabet = sc.next().charAt(0);
        alphabet(alphabet);
    }

    public static void alphabet(char alphabet){

        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("The city name is Ahmedabad.");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("The city name is Bangalore.");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("The city name is Chennai.");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("The city name is Delhi.");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("The city name is Elora.");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("The city name is Faridabad.");
        } else {
            System.out.println("Invalid entry.");
        }
    }
}