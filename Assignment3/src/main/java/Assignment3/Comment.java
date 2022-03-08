package Assignment3;

public class Comment {
public Comment(int comment_id, int likes, int dislikes, String comment_text, boolean report) {
		super();
		this.comment_id = comment_id;
		Likes = likes;
		Dislikes = dislikes;
		this.comment_text = comment_text;
		this.report = report;
	}
public Comment() {
	super();
}
public int getComment_id() {
	return comment_id;
}
public void setComment_id(int comment_id) {
	this.comment_id = comment_id;
}
public int getLikes() {
	return Likes;
}
public void setLikes(int likes) {
	Likes = likes;
}
public int getDislikes() {
	return Dislikes;
}
public void setDislikes(int dislikes) {
	Dislikes = dislikes;
}
public String getComment_text() {
	return comment_text;
}
public void setComment_text(String comment_text) {
	this.comment_text = comment_text;
}
public boolean isReport() {
	return report;
}
public void setReport(boolean report) {
	this.report = report;
}
int comment_id,Likes,Dislikes;
String comment_text;
boolean report;
}
