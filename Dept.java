package tw.com.ispan.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dept")
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	private Integer deptId;
	
	@ManyToOne
	@JoinColumn(name="h_id", referencedColumnName = "h_id")
	private Hotel hotel;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "leader")
	private String leader;
	
	@Column(name = "last_modified_date")
	private LocalDate lastModifiedDate;
	
	@Column(name = "last_modified_emp")
	private String lastModifiedEmp;
	
	@OneToMany(mappedBy="dept",cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REFRESH})  //PERSIST保存 
	private Set<Employee> employees;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}



	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Dept() {
		super();

	}

}
