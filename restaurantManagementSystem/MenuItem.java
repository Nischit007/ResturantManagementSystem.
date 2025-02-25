package restaurantManagementSystem;
//Class for Menu Item
public class MenuItem {
	
private int itemNumber;

private String itemName;
private String description;
private double itemPrice;

// Default Constructor
MenuItem()
{
	itemNumber=0;
	itemPrice= 200;
	itemName= "unknown";
	description=null;
}
// Parameterized Constructor
MenuItem(int itemNumber,String name,String description,double basicPrice)
{
	this.itemNumber = itemNumber;
	this.itemName = name;
	this.description = description;
	this.itemPrice = basicPrice;
}
//getter for number
 public int getItemNumber()
{
	return itemNumber;
}
//setter for number
 public void setItemNumber(int itemNumber)
{
	this.itemNumber = itemNumber;
}
//getter for name 
 public String getItemName()
 {
	 return itemName;
 }
 //setter for name
 public void setItemName(String name)
 {
	 this.itemName = name;
 }
 //getter for description
 public String getDescription()
 {
	 return description;
 }
 //setter for description
 public void setDescription(String description)
 {
	 this.description = description;
 }
 //getter for price
 public double getItemPrice()
 {
	 return itemPrice;
	 
 }
 //setter for price
 public void setItemPrice(double basicPrice)
 {
	 this.itemPrice = basicPrice;
 }

 // Customized toString method
 @Override
 public String toString()
 {
	 return "Menu Item => "+"\nItem Number : "+getItemNumber()+"\nItem Name : "+getItemName()+"\nItem Price : "+getItemPrice()+"\nItem Description : "+getDescription()+"\n\n";
 }
 
}
