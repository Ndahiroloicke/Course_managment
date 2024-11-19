// Save this file with any name (e.g., Main.java)
import java.util.ArrayList;
import java.util.List;

class Updatelist { // Removed 'public'
    public static void main(String[] args) {
        // Create a list of fruits
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // Add "Pineapple" between "Apple" and "Banana"
        fruits.add(1, "Pineapple");

        // Remove "Mango" from the list
        fruits.remove("Mango");

        // Display the updated list
        System.out.println("Updated List: " + fruits);
    }
}
