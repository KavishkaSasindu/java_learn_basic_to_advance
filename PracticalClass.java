import java.util.List;
import java.util.ArrayList;

public class PracticalClass {
    
    List<String> names = new ArrayList<String>();

    PracticalClass() {
        names.add("Kavishka");
        names.add("Methma");
        names.add("Thakshila");
        names.add("Mudithananda");
        names.add("Kanishka");
        names.add("Hashini");
    }

    public void displayListItems() {

        names.forEach((name)->{
            System.out.println("value is "+ name);
        });
    }

}
