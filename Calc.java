public class Calc {

    int number1;
    int number2;

    Calc() {
        number1 = 0;
        number2 = 0;
        System.out.println("This is calculator");
    }

    Calc(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        System.out.println(number1);
        System.out.println(number2);
    }

    public int addNumber() {
        return number1 + number2 ;
    }

    public int subNumber() {
        return number1 - number2;
    }
}
