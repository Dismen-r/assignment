package Assignment2;

public class Task {
public Task(int taskid, String task_description, Date date_of_allocation, Date deadline, Employee allocated_to) {
		super();
		this.taskid = taskid;
		this.task_description = task_description;
		this.date_of_allocation = date_of_allocation;
		this.deadline = deadline;
		this.allocated_to = allocated_to;
	}
public Task() {
	super();
}
public int getTaskid() {
	return taskid;
}
public void setTaskid(int taskid) {
	this.taskid = taskid;
}
public String getTask_description() {
	return task_description;
}
public void setTask_description(String task_description) {
	this.task_description = task_description;
}
public Date getDate_of_allocation() {
	return date_of_allocation;
}
public void setDate_of_allocation(Date date_of_allocation) {
	this.date_of_allocation = date_of_allocation;
}
public Date getDeadline() {
	return deadline;
}
public void setDeadline(Date deadline) {
	this.deadline = deadline;
}
public Employee getAllocated_to() {
	return allocated_to;
}
public void setAllocated_to(Employee allocated_to) {
	this.allocated_to = allocated_to;
}
int taskid;
String task_description;
Date date_of_allocation,deadline;
Employee allocated_to;

}
