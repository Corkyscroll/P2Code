package ShoppingList;

import java.util.ArrayList;
    
public class Category
{
    // Attributes
    private ArrayList<String> categories = new ArrayList<String>();
    
    // Getters and Setters
    public ArrayList<String> getCategories()
    {
        return categories;
    }
    
    public void setCategories()
    {
        categories.add("Sjov/Fun");
        categories.add("Fødevare/Food");
        categories.add("Nødvendige Andet Køb/Necessary Other Buys");
        categories.add("Faste Udgifter/Known Expenses");
        categories.add("Impulskøb/Impulse Buys");
    }
    
    // the constructor
    public Category(String item)
    {
        categories.add(item);
    }
    public Category()
    {
        categories.add("Sjov/Fun");
        categories.add("Fødevare/Food");
        categories.add("Nødvendige Andet Køb/Necessary Other Buys");
        categories.add("Faste Udgifter/Known Expenses");
        categories.add("Impulskøb/Impulse Buys");
        Save catname = new Save(categories);
    }
        
    // save array object/array to file
//    kartoffel categorysave = new kartoffel(categories);
    
        
    // load/read the saved object/array from file
    //Load categoryload = new Load(categories);
}
