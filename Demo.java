public class Demo {
    public static void main(String args[]) {
        
        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(6);

        // for(int n : nums) {
        //     System.out.println(n);
        // }
        

        // List Practical
        ArrayListClass arrayListClass = new ArrayListClass();
        arrayListClass.displayNames();


        // HashSet Practical (Print without sorted)
        SetClass setClass = new SetClass();
        setClass.displayAges();

        // TreeSet Practical (Print after sorted default)
        TreeSetClass treeSetClass = new TreeSetClass();
        treeSetClass.displayNumber();

        // Map Practical
        MapClass mapClass = new MapClass();
        mapClass.displayMap();


        // sorting 
        SortingList sortingList = new SortingList();
        sortingList.sortNumber();
    }
}