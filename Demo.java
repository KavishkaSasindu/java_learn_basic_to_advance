public class Demo {
    public static void main(String args[]) {
        
        int num = 7;

        // wrapper classes (Integer,Float,Double etc) those are classes and create object below example

        Integer number  = num;   // autoboxing

        System.out.println(number);

        String str = "12";
        int stringNumber = Integer.parseInt(str);
        System.out.println(stringNumber*2);
    }
}