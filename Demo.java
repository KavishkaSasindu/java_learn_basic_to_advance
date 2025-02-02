public class Demo {
    public static void main(String args[]) {
       
        // can accss like an object
        Status s = Status.Running;

        System.out.println(s);

        // enum give all values as an array also it has order value.we can access using ordinal() method
        Status ss[] = Status.values();

        for(Status status: ss) {
            System.out.println(status+ " : "+status.ordinal() );
        }

        for(EnumClass enumClass : EnumClass.values()) {
            System.out.println(enumClass);
        }
    }
}