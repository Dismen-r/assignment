package Assignment2;

public class Attendence {
public Attendence(int attendence_id, Date attendence_date, Attendence_Types status) {
		super();
		this.attendence_id = attendence_id;
		this.attendence_date = attendence_date;
		this.status = status;
	}
public Attendence() {
	super();
}
public int getAttendence_id() {
	return attendence_id;
}
public void setAttendence_id(int attendence_id) {
	this.attendence_id = attendence_id;
}
public Date getAttendence_date() {
	return attendence_date;
}
public void setAttendence_date(Date attendence_date) {
	this.attendence_date = attendence_date;
}
public Attendence_Types getStatus() {
	return status;
}
public void setStatus(Attendence_Types status) {
	this.status = status;
}
int attendence_id;
Date attendence_date;
Attendence_Types status;
}
