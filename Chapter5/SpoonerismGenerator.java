import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();
    }

    // Method to get a word from the user
    private String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    // Method to find the index of the first vowel in a word
    private int vowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; // No vowel found
    }

    // Method to run the main logic of the program
    private void run() {
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");

        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        // Check if both words are valid for spoonerism
        if (index1 <= 0 || index2 <= 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            return;
        }

        // Extract initial consonants and the rest of the words
        String initialConsonant1 = word1.substring(0, index1);
        String restOfWord1 = word1.substring(index1);
        String initialConsonant2 = word2.substring(0, index2);
        String restOfWord2 = word2.substring(index2);

        // Create the spoonerized version
        String spoonerizedWord1 = initialConsonant2 + restOfWord1;
        String spoonerizedWord2 = initialConsonant1 + restOfWord2;

        // Output the result
        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
    }
}
