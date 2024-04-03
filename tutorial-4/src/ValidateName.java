import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidateName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validNames = new ArrayList<>();

        System.out.println("Enter names separated by spaces:");
        String inputLine = scanner.nextLine();

        String[] names = inputLine.split("\\s+");

        for (String name : names) {
            if (isValidName(name)) {
                validNames.add(name);
            } else {
                System.out.println("'" + name + "' is not a valid name.");
            }
        }

        if (!validNames.isEmpty()) {
            System.out.println("Valid names:");
            validNames.forEach(System.out::println);
        } else {
            System.out.println("No valid names found.");
        }

        scanner.close();
    }

    private static boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*");
    }
}
