public class Demo {
    public static void main(String args[]) {
        
        Hello hello = new Hello();
        
        Hello hello1 = new Hello("GitHub","github@gmail.com");

        System.out.println(hello1.getName());
        System.out.println(hello1.getUserEmail());
    }
}