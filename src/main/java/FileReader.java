import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {

    public ArrayList<String> readFile(String filePath){
        BufferedReader reader;
        ArrayList<String> list = new ArrayList<>();

        try{
            reader = new BufferedReader(new java.io.FileReader(
                    filePath));
            String line = reader.readLine();
            while (line != null){
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }

}
