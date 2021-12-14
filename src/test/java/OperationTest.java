import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperationTest {

    Operation operation;

    @BeforeEach
    void setup(){
        operation = new Operation();
    }

    @Test
    @DisplayName("Should add 2 integers")
    public void addTermsTest() {

        Assertions.assertEquals(10, operation.add(5, 5));
        Assertions.assertEquals(15, operation.add(10, 5));
        Assertions.assertEquals(2, operation.add(1, 1));

    }

    @Test
    @DisplayName("Should add 2 negative integers")
    public void addNegativeTermsTest() {

        Assertions.assertEquals(-10, operation.add(-5, -5));
        Assertions.assertEquals(-2, operation.add(-1, -1));

    }

    @Test
    @DisplayName("Should add one negative integer and one positive")
    public void addNegativeTermAndPositiveTermTest() {
        Assertions.assertEquals(18, operation.add(-10, 28));
        Assertions.assertEquals(-6, operation.add(10, -16));
    }


    @Test
    @DisplayName("Should multiply two integers ")
    public void multiplyTermsTest() {
        Assertions.assertEquals(25, operation.multiply(5, 5));
        Assertions.assertEquals(10, operation.multiply(2, 5));
        Assertions.assertEquals(100,  operation.multiply(10, 10));
        Assertions.assertEquals(2000, operation.multiply(200, 10));
    }

    @Test
    @DisplayName("Should multiply two negative integers ")
    public void multiplyNegativeTermsTest() {
        Assertions.assertEquals(25, operation.multiply(-5, -5));
        Assertions.assertEquals(42, operation.multiply(-6, -7));

    }

    @Test
    @DisplayName("Should multiply one negative integer and one positive")
    public void multiplyNegativeAndPositiveTermTest(){
        Assertions.assertEquals(-25, operation.multiply(-5, 5));
        Assertions.assertEquals(-42, operation.multiply(6, -7));
    }

    @Test
    @DisplayName("Should subtract one integer from another integer")
    public void subtractTermsTest() {
        Assertions.assertEquals(10, operation.subtract(15, 5));
        Assertions.assertEquals(33, operation.subtract(34, 1));
        Assertions.assertEquals(0, operation.subtract(5, 5));
    }

    @Test
    @DisplayName("Should subtract a negative integer from another negative integer")
    public void subtractNegativeTermsTest() {
        Assertions.assertEquals(-7, operation.subtract(-15, -8));
        Assertions.assertEquals(0, operation.subtract(-5, -5));
    }

    @Test
    @DisplayName("Should subtract a negative integer from a positive integer")
    public void SubtractNegativeTermFromPositiveTermTest() {
        Assertions.assertEquals(17, operation.subtract(10, -7));
        Assertions.assertEquals(53, operation.subtract(35, -18));
    }

    @Test
    @DisplayName("Should subtract a positive integer from a negative integer")
    public void subtractPositiveTermFromNegativeTermTest() {
        Assertions.assertEquals(-53, operation.subtract(-18, 35));
        Assertions.assertEquals(-9, operation.subtract(-3, 6));
    }

    @Test
    @DisplayName("Should divide one integer and one string and return an integer")
    public void divideTermsTest() {
        Assertions.assertEquals(5, operation.divide(10, 2));
        Assertions.assertEquals(21, operation.divide(546, 26));
        Assertions.assertEquals(0, operation.divide(10, 11));
    }

    @Test
    @DisplayName("Should divide a positive integer by a negative integer")
    public void dividePositiveTermByNegativeTermTest() {
        Assertions.assertEquals(-5, operation.divide(10, -2));
        Assertions.assertEquals(-20, operation.divide(200, -10));
    }

    @Test
    @DisplayName("Should divide a negative integer by a positive integer")
    public void divideNegativeTermByPositiveTermTest() {
        Assertions.assertEquals(-7, operation.divide(-35, 5));
        Assertions.assertEquals(-4, operation.divide(-8, 2));
    }

    @Test
    @DisplayName("Should divide two negative integers")
    public void divideNegativeTerms(){
        Assertions.assertEquals(4, operation.divide(-16, -4));
        Assertions.assertEquals(3, operation.divide(-6, -2));
    }
}
