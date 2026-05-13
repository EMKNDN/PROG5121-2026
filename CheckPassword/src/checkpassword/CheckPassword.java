package checkpassword;
import java.util.Scanner;
public class CheckPassword {
  
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password:");
        
        String password = scanner.nextLine();
        int length = password.length();
        
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

         for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        int strengthScore = calculateStrengthScore(length, hasUppercase, hasLowercase, hasDigit, hasSpecialChar);
      
        String strengthFeedback = determineStrengthFeedback(strengthScore);

        System.out.println("Password strength: " + strengthFeedback);

        scanner.close();
        
    }//method
    private static int calculateStrengthScore(int length, boolean hasUppercase, boolean hasLowercase, boolean hasDigit, boolean hasSpecialChar) {
        int score = 0;

        // Setup a password scoring system based on length
        if (length >= 8) {
            score += 2;
        } else if (length >= 6) {
            score += 1;
        }

        // Setup a password scoring system based on criteria
        if (hasUppercase) {
            score += 2;
        }
        if (hasLowercase) {
            score += 2;
        }
        if (hasDigit) {
            score += 2;
        }
        if (hasSpecialChar) {
            score += 2;
        }

        return score;
    }
    
    // How strong is your password?
    private static String determineStrengthFeedback(int score) {
        if (score >= 10) {
            return "Strong";
        } else if (score >= 7) {
            return "Moderate";
        } else {
            return "Weak";
        }
    }
}
