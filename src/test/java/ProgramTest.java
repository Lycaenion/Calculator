import org.junit.jupiter.api.*;

import java.io.*;

public class ProgramTest {
    private static final String EOL = System.getProperty("line.separator");
    private static PrintStream console;
    private static ByteArrayOutputStream bytes;
    Main main = new Main();

    @BeforeAll
    public static void setup() {
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));

    }

    @AfterAll
    public static void tearDown() {
        System.setOut(console);
    }

    @Test
    @DisplayName("Should run program with file")
    public void runProgramTest() {
        File file = new File("src/main/resources/file1.txt");

        main.main(new String[] {String.valueOf(file)});

        Assertions.assertEquals("18", bytes.toString().trim());
    }

    @Test
    @DisplayName("Should run program with single line file")
    public void runProgramWithSingleLineFile() {
        File file = new File("src/main/resources/file3.txt");

        main.main(new String[] {String.valueOf(file)});

        Assertions.assertEquals("1", bytes.toString().trim());
    }
}
