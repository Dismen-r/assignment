package Assignment3;

public class Product {
public Product(int id, int rating, String name, String description, Review review) {
		super();
		this.id = id;
		this.rating = rating;
		this.name = name;
		this.description = description;
		this.review = review;
	}
public Product() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Review getReview() {
	return review;
}
public void setReview(Review review) {
	this.review = review;
}
int id,rating;
String name,description;
Review review;
}
