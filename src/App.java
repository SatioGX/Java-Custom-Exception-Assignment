import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Enter a number that is more than 0");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            System.out.println(calculateFactorial(number));

            // Calling with object
            //*********************************
            // Factorial calculate = new Factorial(number);
            // System.out.println(calculate.calculateFactorial(number));

        } catch (Exception e) {
            System.out.println(e);
        }


        
        
    }

        public static int calculateFactorial(int number) throws NegativeException{
        int result = 1;
        if(number < 0 ){
            throw new NegativeException("Number cannot be negative");
        }else{
            for(int i = number;i>0;i--){
            result *= i;
            }
        }        
        return result;
    }
    
}
