import java.util.List;
import java.util.stream.Stream;
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

    Stream<String> s1 = names.stream();
    Stream<String> s2 = names.stream();
    Stream<String> s3 = names.stream();

 

    public void displayListItems(){ 

        names.forEach((name)->{
            System.out.println("value is "+ name);
        });
    }

    public void displayStreamObject() {
       s2 =  s2.filter((name)->{
            return name.startsWith("K");
        });

        System.out.println();
        s2.forEach((name)->{
            System.out.println(name);
        });
        System.out.println();

        s1.forEach((name)->{
            System.out.println(name);
        });
    }


    public void newStreamNames() {

        System.out.println();
        s3 = s3.map((name)->{
            return name.toUpperCase();
        });
        
        s3.forEach((name)->{
            System.out.println(name);
        });
    }

}
