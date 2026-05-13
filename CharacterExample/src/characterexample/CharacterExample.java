package characterexample;
import java.util.Scanner;
public class CharacterExample {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.nextLine().charAt(0);
        
        if (Character.isDigit(input)) 
        {
            System.out.println(input + " is a digit entered.");
        } 
        else if (Character.isLetter(input)) 
        {
            System.out.println(input + " is a letter entered.");
        } 
        else if (Character.isWhitespace(input)) 
        {
            System.out.println(input + " is a whitespace character.");
        } 
        else 
        {
            System.out.println(input + " Unknown character");
        }
        scanner.close();
    }
    
}
