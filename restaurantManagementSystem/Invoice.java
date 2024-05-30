
package restaurantManagementSystem;
//Class for Invoice 
public class Invoice {

	private Order order;
	//Default Counstructor
	Invoice()
	{
		order = new Order();
	}
	//Parameterized Constructor
	Invoice(Order order)
	{
		this.order = order;
	}
	//method to generate invoice
	public String generateInvoice()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Invoice : \n").append(order+"\n");
		sb.append("Total Amount : ").append(order.getTotalAmount()+"\n");
		sb.append("Discounted Amount for Status: ").append(order.getdiscountedAmount()+"\n");
		sb.append("Total Payable Amount : ").append(order.getPayableAmount());
		
		
		return sb.toString();
		
	}
	
}
