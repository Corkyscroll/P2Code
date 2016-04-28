package ShoppingList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Load
{    
    public Load(File file, ArrayList<String> loadedFile) throws FileNotFoundException
    {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String s;
            
            try {
                while((s = br.readLine()) != null)
                    loadedFile.add(s);
                
                fileReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
    
    public Load() throws FileNotFoundException
    {
        System.out.println("No file loaded");
    }
}
