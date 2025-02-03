import java.util.HashMap;
import java.util.Map;

public class MapClass {

    Map<String,Integer> students = new HashMap<>();

    MapClass() {
        students.put("Age",24);
        students.put("Count",20);
        students.put("Item",2);
        students.put("Kavishka",29);
    }

    public void displayMap() {
        students.get("Age"); // can access key with value

        System.out.println(students);
    }
}
