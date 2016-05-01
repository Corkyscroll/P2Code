package ShoppingList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
//import javax.swing.*;

public class Item {    
    //Instance variables
    private ArrayList<String> itemList = new ArrayList<String>();
    private ArrayList<String> categoryList = new ArrayList<String>();
    private ArrayList<String> shortList = new ArrayList<String>();
    private String itemName;
    private String category;
    private Double price;
    private Boolean isOnSale;
    private Double discountPrice;
    public static String[] dropDown;
//    private static JComboBox<String> categoryChooser = new JComboBox<String>(dropDown);;
    File itemFile = new File("items.txt");
    File categoryFile = new File("categories.txt");
    
    
    //Constructors
    public Item() throws FileNotFoundException {
        loadCategoryList();
        checkItemList();
        
        setItemName(null);
        setCategory(null);
        setPrice(null);
        setIsOnSale(null);
        setDiscountPrice(null);
        
        saveItemList();
    }
    
    public Item(String itemName, String category, Double price, Boolean isOnSale, Double discountPrice) throws FileNotFoundException {
        setItemName(itemName);
        setCategory(category);
        setPrice(price);
        setIsOnSale(isOnSale);
        setDiscountPrice(discountPrice);
        
        saveItemList();
    }
    
    public Item(String itemName, String category, Double price) {
        setItemName(itemName);
        setCategory(category);
        setPrice(price);
        
        shortList.add(itemName);
        shortList.add(category);
        shortList.add(price.toString());
        
        saveItem();
    }
    
    //Getters and setters
    public String getItemName()
    {
        return itemName;
    }
    public void setItemName(String item)
    {
        this.itemName = item;
    }
    
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category = category;
        // hent index fra categoryList dropdown menu
    }
    
    public Double getPrice()
    {
        return price;
    }
    public void setPrice(Double price)
    {
        this.price = price;
    }
    
    public Boolean getIsOnSale()
    {
        return isOnSale;
    }
    public void setIsOnSale (Boolean isOnSale)
    {
        this.isOnSale = isOnSale;
    }
    
    public Double getDiscountPrice()
    {
        return discountPrice;
    }
    public void setDiscountPrice(Double discountPrice)
    {
        this.discountPrice = discountPrice;
    }
    
    public void checkItemList() throws FileNotFoundException {
        try {
            new Load(itemFile, itemList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void loadCategoryList() throws FileNotFoundException {
        try {
            new Load(categoryFile, categoryList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void saveItemList() {
        new Save(itemList, itemFile);
    }
    
    public void saveItem() {
        new Save(shortList, itemFile);
    }
}
