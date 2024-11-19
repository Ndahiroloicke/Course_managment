import java.util.ArrayList;
import java.util.List;

public class generic {
    public static void main(String[] args) {
        // Create a list of Strings
        List<String> stringList = new ArrayList<>();
        addElementsToList(stringList, "Apple", "Banana", "Cherry");
        System.out.println("String List: " + stringList);

        // Create a list of Integers
        List<Integer> intList = new ArrayList<>();
        addElementsToList(intList, 1, 2, 3, 4, 5);
        System.out.println("Integer List: " + intList);
    }

    // Generic method to add elements to a list
    @SafeVarargs
    public static <T> void addElementsToList(List<T> list, T... elements) {
        for (T element : elements) {
            list.add(element);
        }
    }
}
