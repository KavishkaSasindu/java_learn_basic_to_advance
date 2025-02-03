import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingList {

    List<Integer> nums = new ArrayList<Integer>();

    Comparator<Integer> com = new Comparator<Integer>() {
        public int compare(int i,int j) {
            if(1%10 > j%10){
                return 1;
            }else {
                return -1; 
            }
        }
    };
    
    SortingList() {
        System.out.println("Sorting List Class");
        nums.add(20);
        nums.add(4);
        nums.add(6);
        nums.add(9);
        nums.add(10);

    }

    public void sortNumber() {
        Collections.sort(nums) ;
        System.out.println(nums);
    }




}
