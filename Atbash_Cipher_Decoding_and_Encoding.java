import java.util.Scanner;

public class AtbashCipher {

    // Method to encrypt or decrypt text using Atbash Cipher
    public static String atbash(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Calculate the new character
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                char newChar = (char) (base + ('z' - Character.toLowerCase(ch)));
                result.append(newChar);
            } else {
                // Non-alphabetic characters remain unchanged
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter text to encrypt or decrypt using Atbash Cipher:");
        String input = scanner.nextLine();
        
        String encryptedText = atbash(input);
        System.out.println("Encrypted/Decrypted text: " + encryptedText);
        
        scanner.close();
    }
}