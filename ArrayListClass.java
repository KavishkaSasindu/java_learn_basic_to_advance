import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

    List<String> names = new ArrayList<String>();  // can duplicate elements 

    ArrayListClass() {
        System.out.println("This is arrayList");

        names.add("Kavishka");
        names.add("Thakshila");
        names.add("Methma");
        names.add("Methma");
    }

    public void displayNames() {
        for(String name : names) {
            System.out.println(name);
        }
    }

}
