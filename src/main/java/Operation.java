import static java.lang.Integer.parseInt;

public class Operation {

    public int add(int result, int term) {
        return result + term;
    }

    public int multiply(int result, int term) {
        return  result * term;
    }

    public int subtract(int result, int term) {
        return result - term;
    }


    //I assume that the instruction file will always contain only integers, so the division will round the result
    public int divide(int result, int term) {
        return result / term;
    }
}
