import java.util.Scanner;

public class DuplicateCharacters {

    public static void findDuplicateCharacters(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Convert the string to lowercase to treat uppercase and lowercase characters as the same
        str = str.toLowerCase();

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Ignore whitespace and non-alphabetic characters
            if (Character.isWhitespace(c) || !Character.isAlphabetic(c)) {
                continue;
            }

            // Increment the count for the character
            charCount[c]++;
        }

        // Display the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        findDuplicateCharacters(input);
    }
}
