public class Demo {
    public static void main(String args[]) {
        DefineInterface defineInterface = new DefineInterface();
        defineInterface.show();



        // functional interface with lambda expression
        InterfaceA obj1 = ()->System.out.println("This is display method in functional interface in InterfaceA");

        obj1.display();
    }
}