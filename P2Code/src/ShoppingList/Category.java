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
        categories.add("F�devare/Food");
        categories.add("N�dvendige Andet K�b/Necessary Other Buys");
        categories.add("Faste Udgifter/Known Expenses");
        categories.add("Impulsk�b/Impulse Buys");
    }
    
    // the constructor
    public Category(String item)
    {
        categories.add(item);
    }
    public Category()
    {
        categories.add("Sjov/Fun");
        categories.add("F�devare/Food");
        categories.add("N�dvendige Andet K�b/Necessary Other Buys");
        categories.add("Faste Udgifter/Known Expenses");
        categories.add("Impulsk�b/Impulse Buys");
        Save catname = new Save(categories);
    }
        
    // save array object/array to file
//    kartoffel categorysave = new kartoffel(categories);
    
        
    // load/read the saved object/array from file
    //Load categoryload = new Load(categories);
}
