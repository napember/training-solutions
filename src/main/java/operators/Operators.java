package operators;

public class Operators {
    public boolean isEven(int n){
        return n%2 == 0;
    }

    public String getResultOfDivision(int number, int divisor) {
        if (divisor == 0) {
            return "Devide by zero error!";
        }
        int iRet = number/divisor;
        int rest = number%divisor;
        return Integer.toString(number) + "/" + Integer.toString(divisor) + "=" +
        Integer.toString(iRet) + ", maradék: " + rest;

    }
}
