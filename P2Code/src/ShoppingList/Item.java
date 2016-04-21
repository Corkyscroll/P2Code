package p2Item;

public class Item {
	//Instance variables
	private String itemName;
	private String category;
	private Double price;
	private Boolean isOnSale;
	private Double discountPrice;
	
	//Constructors
	public Item(){
		setItemName(null);
		setCategory(null);
		setPrice(null);
		setIsOnSale(null);
		setDiscountPrice(null);
		
	}
	
	public Item(String itemName, String category, Double price, Boolean isOnSale, Double discountPrice){
		setItemName(itemName);
		setCategory(category);
		setPrice(price);
		setIsOnSale(isOnSale);
		setDiscountPrice(discountPrice);
			
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
}