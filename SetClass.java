import java.util.HashSet;
import java.util.Set;

public class SetClass {
    
    Set<Integer> ages = new HashSet<Integer>();  // only allow unique values  

    SetClass() {
        System.out.println("This is hashSet");
        ages.add(24);
        ages.add(23);
        ages.add(45);
    }

    public void displayAges() {
        for(int age : ages) {
            System.out.println(age); // give unsorted 
        }
    }
}
