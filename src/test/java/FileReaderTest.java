import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

public class FileReaderTest {

    FileReader fileReader;
    ArrayList<String> list;

    @BeforeEach
    void setup(){
        fileReader = new FileReader();
        list = new ArrayList<>();
    }

    @Test
    @DisplayName("Should open file and add a line to list as a string")
    public void openFileWithSingleLineAndSaveToListTest() {

        String filePath3 = "src/main/resources/file3.txt";
        File file3 = new File(filePath3);

        list = fileReader.readFile(file3);

        Assertions.assertEquals("apply 1", list.get(0));

    }

    @Test
    @DisplayName("Should open file and save multiple lines to list as strings")
    public void openFileWithMultipleLinesAndAddLinesToList(){
        String filePath1 = "src/main/resources/file1.txt";
        String filePath2 = "src/main/resources/file2.txt";
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        list = fileReader.readFile(file1);

        Assertions.assertEquals("add 2", list.get(0));
        Assertions.assertEquals("multiply 3", list.get(1));
        Assertions.assertEquals("apply 4", list.get(2));

        list = fileReader.readFile(file2);

        Assertions.assertEquals("multiply 9", list.get(0));
        Assertions.assertEquals("apply 5", list.get(1));

    }



}
