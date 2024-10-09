import java.util.Scanner;

public class SyedCypher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Would you like to (e)ncrypt or (d)ecrypt?");
        String question = input.nextLine();
        
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        String[] words = sentence.split("\\s+");
        StringBuilder newSentence = new StringBuilder();
        
        if (question.substring(0, 1).equals("e")) {
            char letter = 'a';
            
            for (String word : words) {
                String newWord = letter + word;
                letter++;

                int mid = newWord.length() / 2;
                String swappedWord = newWord.substring(mid) + newWord.substring(0, mid);

                newSentence.append(swappedWord).append(" ");
            }

            System.out.println("Encrypted sentence: " + newSentence.toString().trim());
        } else if (question.substring(0, 1).equals("d")) {char letter = 'a';
            
            for (String word : words) {
                if (letter > 'z') {
                    letter = 'a';
                }

                int mid = word.length() / 2;
                String swappedWord = word.substring(mid) + word.substring(0, mid);

                if (swappedWord.charAt(0) == letter) {
                    swappedWord = swappedWord.substring(1);
                }
                letter++;

                newSentence.append(swappedWord).append(" ");
            }
            System.out.println("Decrypted sentence: " + newSentence.toString().trim());
                } else {
            System.out.println("Invalid choice. Please enter 'e' to encrypt or 'd' to decrypt.");
            }
        
            input.close();
            }
        }