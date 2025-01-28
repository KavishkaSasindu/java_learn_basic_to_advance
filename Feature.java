public class Feature extends Calc {

    Feature() {
        System.out.println("This is new feature");
    }

    Feature(int number1 , int number2) {
        super(number1,number2);
    }

    public int multi() {
        return number1 + number2 ;
    }

    public int division() {
        int result = 0;
        try {
            result = number1 / number2;
        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }

}
