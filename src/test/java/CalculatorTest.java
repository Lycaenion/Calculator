import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class CalculatorTest {

    Calculator calculator;
    String testString1;
    String testString2;
    String testString3;
    ArrayList<String> listOfInstructions1;
    ArrayList<String> listOfInstructions2;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
        testString1 = "Apply 4";
        testString2 = "Apply 5";
        testString3 = "Apply 1";
        listOfInstructions1 = new ArrayList<>();
        listOfInstructions2 = new ArrayList<>();

        listOfInstructions1.add("multiply 2");
        listOfInstructions1.add("apply 2");

        listOfInstructions2.add("apply 3");


    }

    @Test
    @DisplayName("Should find the value of apply in a string")
    public void findApplyLineValueTest(){
        Assertions.assertEquals(4, calculator.getApply(testString1));
        Assertions.assertEquals(5, calculator.getApply(testString2));
        Assertions.assertEquals(1, calculator.getApply(testString3));
    }


    //Test is not finished as there is no functionality other than system.out.println() in the switch for now
    @Test
    @DisplayName("Should handle the instructions in the file")
    public void operationsTest(){

        calculator.operations(listOfInstructions1);
        calculator.operations(listOfInstructions2);

    }


}
