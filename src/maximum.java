import java.util.List;
import java.util.ArrayList;

public class maximum {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(56);
        numbers.add(42);

        // Find the maximum value
        Integer maxValue = findMax(numbers);
        System.out.println("Maximum Value: " + maxValue);
    }

    // Generic method to find the maximum value in a list of integers
    public static Integer findMax(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be null or empty");
        }

        Integer max = list.get(0); // Initialize max with the first element
        for (Integer value : list) {
            if (value > max) {
                max = value; // Update max if a larger value is found
            }
        }
        return max;
    }
}
