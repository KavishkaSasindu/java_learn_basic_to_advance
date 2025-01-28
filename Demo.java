public class Demo {
    public static void main(String args[]) {
        
        Calc calc = new Calc();

        Feature calc1 =  new Feature(30,25);
        System.out.println(calc1.addNumber());
        System.out.println(calc1.subNumber());
        System.out.println(calc1.multi());
        System.out.println(calc1.division());

    }
}