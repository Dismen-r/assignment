package Assignment1;

public class Product {
	String product_name, imagelocation;
	double price;
	int quantity_in_stock;

	public Product(String product_name, String imagelocation, double price, int quantity_in_stock) {
		super();
		this.product_name = product_name;
		this.imagelocation = imagelocation;
		this.price = price;
		this.quantity_in_stock = quantity_in_stock;
	}

	public Product() {
		super();
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getImagelocation() {
		return imagelocation;
	}

	public void setImagelocation(String imagelocation) {
		this.imagelocation = imagelocation;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}

	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}

}
