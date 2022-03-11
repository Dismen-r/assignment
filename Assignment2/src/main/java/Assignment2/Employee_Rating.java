package Assignment2;

public class Employee_Rating {
public Employee_Rating(Task task, Rating rating) {
		super();
		this.task = task;
		this.rating = rating;
	}
public Employee_Rating() {
	super();
}
public Task getTask() {
	return task;
}
public void setTask(Task task) {
	this.task = task;
}
public Rating getRating() {
	return rating;
}
public void setRating(Rating rating) {
	this.rating = rating;
}
Task task;
Rating rating;
}
