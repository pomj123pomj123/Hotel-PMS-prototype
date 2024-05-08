package tw.com.ispan.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "e_id")
	private Integer eId;
	
	@ManyToOne
	@JoinColumn(name="dept_id", referencedColumnName = "dept_id")
	private Dept dept;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "birthday")
	private LocalDate birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "hire_date")
	private LocalDate hireDate;
	
	@Column(name = "leave_date")
	private LocalDate leaveDate;
	
	@Column(name = "superior")
	private String superior;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "salary")
	private Integer salary;
	
	@Column(name = "title_of_courtesy")
	private String titleOfCourtesy;
	
	@Column(name = "last_modified_date")
	private LocalDate lastModifiedDate;
	
	@Column(name = "last_modified_emp")
	private String lastModifiedEmp;

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public LocalDate getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(LocalDate leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getSuperior() {
		return superior;
	}

	public void setSuperior(String superior) {
		this.superior = superior;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getTitleOfCourtesy() {
		return titleOfCourtesy;
	}

	public void setTitleOfCourtesy(String titleOfCourtesy) {
		this.titleOfCourtesy = titleOfCourtesy;
	}
	
	public LocalDate getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDate lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedEmp() {
		return lastModifiedEmp;
	}

	public void setLastModifiedEmp(String lastModifiedEmp) {
		this.lastModifiedEmp = lastModifiedEmp;
	}

	public Employee() {
		super();
	}
	


}
