import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Java";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String input) {
        // Use LinkedHashSet to maintain the order of characters
        Set<Character> charSet = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            // Add character to set if not already present
            if (charSet.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
