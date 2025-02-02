public class Demo {
    public static void main(String args[]) {
        DefineInterface defineInterface = new DefineInterface();
        defineInterface.show();



        // functional interface with lambda expression
        InterfaceA obj1 = (String name)->System.out.println("This is display method in functional interface in InterfaceA "+name);

        obj1.display("Kavishka Sasindu");
    }
}