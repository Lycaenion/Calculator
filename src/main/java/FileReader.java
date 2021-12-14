import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {

    public ArrayList<String> readFile(File file) {
        BufferedReader reader;
        ArrayList<String> list = new ArrayList<>();

        //I am assuming that there will always be at least one line with text in the file
        try{
            reader = new BufferedReader(new java.io.FileReader(file));
            String line = reader.readLine();
            while (line != null){
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("There appears to be something wrong with the file. Shutting down.");
            System.exit(1);
        }
        return list;
    }

}
