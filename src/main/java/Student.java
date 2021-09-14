import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Student {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id",length = 1000)
	 private int id;
	
	@Column(name = "Student_Name")
	 private String name;
	
	@Column(name = "Student_Department")
	 private String department;
	
	@Column(name = "Course")
	 private String course;
	 
	 @Column(name = "Registration_Date")
	 @Temporal(TemporalType.DATE)
	 private Date registration;
	 
	 @Transient
	 private double ign;
	 
	 
	 
 public Student() {
		//super();
	}

public Student(int id, String name, String department, String course, Date registration, double ign) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.course = course;
		this.registration = registration;
		this.ign = ign;
	}

// generating getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getRegistration() {
		return registration;
	}

	public void setRegistration(Date registration) {
		this.registration = registration;
	}

	public double getIgn() {
		return ign;
	}

	public void setIgn(double ign) {
		this.ign = ign;
	}
	 
	
	
}
