import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FileReaderTest {

    FileReader fileReader;

    @BeforeEach
    void setup(){
        fileReader = new FileReader();
    }

    @Test
    @DisplayName("Opening file and add lines to list should work")
    public void openFileAndSaveToListTest(){
        String filePath1 = "src/main/resources/file1.txt";
        String filePath2 = "src/main/resources/file2.txt";
        String filePath3 = "src/main/resources/file3.txt";

        ArrayList<String> list = new ArrayList<>();
        list = fileReader.readFile(filePath1);

        Assertions.assertEquals("add 2", list.get(0));
        Assertions.assertEquals("multiply 3", list.get(1));
        Assertions.assertEquals("apply 4", list.get(2));

        list = fileReader.readFile(filePath2);

        Assertions.assertEquals("multiply 9", list.get(0));
        Assertions.assertEquals("apply 5", list.get(1));

        list = fileReader.readFile(filePath3);

        Assertions.assertEquals("apply 1", list.get(0));

    }

}
