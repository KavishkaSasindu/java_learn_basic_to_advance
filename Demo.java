public class Demo {
    public static void main(String args[]) {
        
        int i =0;
        int j = 18;

        int result ;
        int sum = 0;

        try{
            result = j/i;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Something went Wrong");
        }catch(Exception e){
            System.out.println(e);
        }finally{
            sum = i+j;
            System.out.println(sum);
        }


    }
}