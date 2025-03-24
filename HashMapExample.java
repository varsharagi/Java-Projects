import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add elements
        students.put(1, "Varsha");
        students.put(2, "Ravi");
        students.put(3, "Priya");

        // Display all elements
        System.out.println("Student Details:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Retrieve and display a specific element
        int searchID = 2;
        if (students.containsKey(searchID)) {
            System.out.println("Student with ID " + searchID + ": " + students.get(searchID));
        } else {
            System.out.println("Student not found.");
        }
    }
}
