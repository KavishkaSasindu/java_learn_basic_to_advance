import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    
    Set<Integer> numbers = new TreeSet<Integer>();

    TreeSetClass() {
        System.out.println("This is TreeSet ");
        numbers.add(21);
        numbers.add(95);
        numbers.add(79);
        numbers.add(3);
    }

    public void displayNumber() {
        for(int number : numbers) {
            System.out.println(number); // display with sorterd list 
        }
    }
}
