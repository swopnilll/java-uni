import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a series of words:");
        String sentence = scanner.nextLine();

        Map<String, Integer> wordIndexMap = new HashMap<>();

        // Split the sentence into an array of words and populate the wordIndexMap
        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            wordIndexMap.put(sentenceArray[i], i);
        }

        System.out.println("Enter Search Sentence:");
        String searchSentence = scanner.nextLine();
        String[] searchSentenceArray = searchSentence.split(" ");

        int searchIndex = -1;


        for (String word : searchSentenceArray) {
            if (wordIndexMap.containsKey(word)) {
                searchIndex = wordIndexMap.get(word);
                break;
            }
        }

        System.out.println("The index of the first match is: " + searchIndex);

        scanner.close();
    }
}
