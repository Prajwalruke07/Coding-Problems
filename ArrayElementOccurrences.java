import java.util.HashMap;
import java.util.Map;

public class ArrayElementOccurrences {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Alice", "Charlie", "Bob"};

        // Create a HashMap to store name occurrences
        Map<String, Integer> nameOccurrences = new HashMap<>();

        // Count occurrences of each name
        for (String name : names) {
            if (nameOccurrences.containsKey(name)) {
                nameOccurrences.put(name, nameOccurrences.get(name) + 1);
            } else {
                nameOccurrences.put(name, 1);
            }
        }

        // Display name occurrences
        for (Map.Entry<String, Integer> entry : nameOccurrences.entrySet()) {
            String name = entry.getKey();
            int occurrences = entry.getValue();
            System.out.println(name + " occurs " + occurrences + " times.");
        }
    }
}
    //Replace the names array with your own list of names. This code uses a HashMap to keep track of the occurrences of each name. It iterates through the array and updates the count in the HashMap. Finally, it prints out the name and its occurrences.

