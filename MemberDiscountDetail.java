package tw.com.ispan.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "MemberDiscountDetail")  
public class MemberDiscountDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mdd_id")
	private Integer mddId;
	
	@Column(name = "begin_date ")
	private LocalDate beginDate;
	
	@Column(name = "last_date")
	private LocalDate lastDate;
	
	@Column(name="discount_rate")
	private Integer discountRate;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "remark")
	private String remark;
	
	@Column(name = "last_modified_date")
	private LocalDate lastModifiedDate;
	
	@Column(name = "last_modified_emp")
	private String lastModifiedEmp;
	
	@OneToMany(mappedBy="memberDiscountDetail",cascade= {CascadeType.PERSIST, CascadeType.REFRESH})  //PERSIST保存 REMOVE
	private Set<MemberDiscount> memberDiscounts;



	public Integer getMddId() {
		return mddId;
	}



	public void setMddId(Integer mddId) {
		this.mddId = mddId;
	}



	public LocalDate getBeginDate() {
		return beginDate;
	}



	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}



	public LocalDate getLastDate() {
		return lastDate;
	}



	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}



	public Integer getDiscountRate() {
		return discountRate;
	}



	public void setDiscountRate(Integer discountRate) {
		this.discountRate = discountRate;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
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



	public Set<MemberDiscount> getMemberDiscounts() {
		return memberDiscounts;
	}



	public void setMemberDiscounts(Set<MemberDiscount> memberDiscounts) {
		this.memberDiscounts = memberDiscounts;
	}



	public MemberDiscountDetail(Integer mddId, LocalDate beginDate, LocalDate lastDate, Integer discountRate,
			String name, String status, String remark, LocalDate lastModifiedDate, String lastModifiedEmp,
			Set<MemberDiscount> memberDiscounts) {
		super();
		this.mddId = mddId;
		this.beginDate = beginDate;
		this.lastDate = lastDate;
		this.discountRate = discountRate;
		this.name = name;
		this.status = status;
		this.remark = remark;
		this.lastModifiedDate = lastModifiedDate;
		this.lastModifiedEmp = lastModifiedEmp;
		this.memberDiscounts = memberDiscounts;
	}



	public MemberDiscountDetail() {}
	

}
