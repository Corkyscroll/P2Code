package ShoppingList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
    
public class Category 
{
    // Attributes
    private ArrayList<String> categories = new ArrayList<String>();
    File file = new File("categories.txt");
    
    // Getters and Setters
    public ArrayList<String> getCategories()
    {
        return categories;
    }
    
    public void setCategories(String item) throws FileNotFoundException
    {
        checkList();
        categories.add(item);
    }
    
    // the constructor
    public Category(ArrayList<String> returner) throws FileNotFoundException
    {
        checkList();
        returner = categories;
        saveList();
    }
    
    public Category(String givenString) throws FileNotFoundException
    {
        setCategories(givenString);
        saveList();
    }
    
    public Category () throws FileNotFoundException
    {
        checkList();
        saveList();
    }
    
    public void checkList() throws FileNotFoundException {
        try {
        new Load(file, categories);
        if (categories.isEmpty() == true)
        {
            categories.add("Nødvendigt/Necessary");
            categories.add("Unødvendigt/Unnecessary");
            categories.add("Planlagt/Planned");
            categories.add("Uplanlagt/Unplanned");
            saveList();
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void saveList() {
        new Save(categories, file);
    }    
        
    // load/read the saved object/array from file
    //Load categoryload = new Load(categories);
}
