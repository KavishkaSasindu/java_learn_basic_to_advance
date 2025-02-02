import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String args[]) {
        
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);

        for(int n : nums) {
            System.out.println(n);
        }
        

        List<String> names = new ArrayList<String>();
        names.add("Kavishka Sasindu");
        names.add("Methma Manthini");
        names.add("Thakshila Pathirana");

        for(String name : names) {
            System.out.println(name);
        }
        System.out.println(names.iterator());
    }
}