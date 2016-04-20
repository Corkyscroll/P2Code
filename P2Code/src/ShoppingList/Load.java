package ShoppingList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Load
{    
    public Load(File test1) throws FileNotFoundException
    {
            FileReader fileReader = new FileReader("test1.txt");
            BufferedReader br = new BufferedReader(fileReader);
            ArrayList<String> loadedFile = new ArrayList<String>();
            String s;
            
            
            try {
                while((s = br.readLine()) != null)
                    loadedFile.add(s);
                
                System.out.println(loadedFile);
                fileReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
    
    public Load()
    {
        System.out.println("No file loaded");
    }
}
