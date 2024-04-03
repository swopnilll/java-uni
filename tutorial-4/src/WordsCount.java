import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the paragraph in one line:");
        String paragraph = scanner.nextLine();

        Map<String, Integer> wordCounts = new HashMap<>();

        String[] words = paragraph.split("\\s+|(?=[.,!?])|(?<=[.,!?])");

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println("Enter the word to search:");
        String searchWord = scanner.next();


        if (wordCounts.containsKey(searchWord)) {
            System.out.println("Number of occurrences of '" + searchWord + "' in the paragraph: " + wordCounts.get(searchWord));
        } else {
            System.out.println("The word '" + searchWord + "' is not present in the paragraph.");
        }

        scanner.close();
    }
}
