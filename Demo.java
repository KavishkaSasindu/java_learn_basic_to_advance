public class Demo {
    public static void main(String args[]) {
        System.out.println("Hello");
        String name = "Kavishka Sasindu";

        System.out.println(name);

        Hello obj = new Hello();

        System.out.println(obj.myName);


        // encapsulation

        Encap encap = new Encap();

        System.out.println(encap.getpNumber());
        encap.setpNumber(1926388);


    }

    public class User {

        public static void userName() {
            System.out.print("Hello User");
        }
    }
}