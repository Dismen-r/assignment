package Assignment3;

import java.util.List;

public class Review {
public Review(int reviewid, Product product_reviewed, String review_text, List<Comment> comments) {
		super();
		this.reviewid = reviewid;
		this.product_reviewed = product_reviewed;
		this.review_text = review_text;
		this.comments = comments;
	}
public Review() {
	super();
}
public int getReviewid() {
	return reviewid;
}
public void setReviewid(int reviewid) {
	this.reviewid = reviewid;
}
public Product getProduct_reviewed() {
	return product_reviewed;
}
public void setProduct_reviewed(Product product_reviewed) {
	this.product_reviewed = product_reviewed;
}
public String getReview_text() {
	return review_text;
}
public void setReview_text(String review_text) {
	this.review_text = review_text;
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}
int reviewid;
Product product_reviewed;
String review_text;
List<Comment> comments;
}
