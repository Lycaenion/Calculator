import java.io.File;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        FileReader fileReader = new FileReader();
        //I am assuming that only one file will be calculated at a time
        File file = new File(args[0]);
        calculator.operations(fileReader.readFile(file));
    }
}
