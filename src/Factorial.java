public class Factorial{
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int calculateFactorial(int number) throws NegativeException{
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
