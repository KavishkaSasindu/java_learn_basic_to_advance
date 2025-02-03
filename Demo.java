public class Demo {
    public static void main(String args[]) {
        

        // List<String> names = Arrays.asList("Kavishka","Sasindu","Mudithananda","Methma","Manthini");

        // names.forEach((name)->{
        //     System.out.println(name);
        // });


        // forEach use for ArrayList
        PracticalClass practicalClass = new PracticalClass();
        practicalClass.displayListItems();

        //  display using stream objct 
        practicalClass.displayStreamObject();
    }
}