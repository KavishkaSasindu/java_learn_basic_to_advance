public class Demo {
    public static void main(String args[]) {
        
        int i =0;
        int j = 18;

        int result ;
        int sum = 0;

        try{
            result = j/i;
            if(i == 0) {
                throw new ArithmeticException("You can not divide by zero");
            }
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Something went Wrong "+ e.getMessage());
        }catch(Exception e){
            System.out.println(e);
        }finally{
            sum = i+j;
            System.out.println(sum);
        }


        int number1 = 0;
        int number2 = 20;

        int division; 
        try {
            if( number1 == 0) {
                throw new CustomException("You can not divided by zero");
            }else {
                division = number2/ number1;
                System.out.println(division); 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if( number1 == 0) {
                throw new CustomException("You can not divided by zero");
            }else {
                division = number2/ number1;
                System.out.println(division); 
            }
        } catch (CustomException e) {
            System.out.println(e);
        }


    }
}