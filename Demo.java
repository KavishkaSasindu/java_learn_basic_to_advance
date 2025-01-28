public class Demo {
    public static void main(String args[]) {

        // First object from ArrayObject Class
        ArrayObject obj1 = new ArrayObject();
        obj1.indexNumber = 12345;
        obj1.name = "Kavishka Sasindu";
        obj1.email = "user@gmail.com";

        // Second object from ArrayObject Class
        ArrayObject obj2 = new ArrayObject();
        obj2.indexNumber = 654321;
        obj2.name = "Methma Manthini";
        obj2.email = "user1@gmail.com";

        ArrayObject myObjectArray[] = new ArrayObject[2];
        myObjectArray[0] = obj1;
        myObjectArray[1] = obj2;

        for (int i=0;i < myObjectArray.length;i++) {
            System.out.println(myObjectArray[i]);
        }


    }
}