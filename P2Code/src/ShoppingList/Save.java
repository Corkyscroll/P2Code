package ShoppingList;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
//import java.util.List;
import java.io.File;
import java.io.FileWriter;

public class Save implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Save(ArrayList<String> item)
	{
		try {
			File file = new File("test1.txt");
			FileWriter fileWriter = new FileWriter(file);
			
			for (String n : item) {
				fileWriter.write(n +"\r\n");
			}
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Save (ArrayList<String> item, File file)
	{
        try {
            FileWriter fileWriter = new FileWriter(file);
            
            for (String n : item) {
                fileWriter.write(n +"\r\n");
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public Save()
	{
		System.out.println("No items");
	}

}
	
