package tw.com.ispan.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "h_id")
	private Integer hId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "fax")
	private String fax;
	
	@Column(name = "checkin_time")
	private String checkinTime;
	
	@Column(name = "checkout_time")
	private String checkoutTime;
	
	@Column(name = "contact_email")
	private String contactEmail;
	
	@Column(name = "introduction")
	private String introduction;
	
	@Column(name = "last_modified_date")
	private String lastModifiedDate;
	
	@Column(name = "last_modified_emp")
	private String lastModifiedEmp;

	@OneToMany(mappedBy="hotel", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
	private List<HotelPhoto> hotelPhoto;
	
//	@OneToMany(mappedBy="hotel", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
//	private List<RoomType> roomType;
//	
//	@OneToMany(mappedBy="hotel", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
//	private List<BookingDetail> bookingDetail;
//	
//	@OneToMany(mappedBy="hotel", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
//	private List<DiscountDetail> discountDetail;
	
	
	public Hotel(Integer hId, String name, String address, String tel, String fax, String checkinTime, String checkoutTime,
		String contactEmail, String introduction, String lastModifiedDate, String lastModifiedEmp) {
	super();
	this.hId = hId;
	this.name = name;
	this.address = address;
	this.tel = tel;
	this.fax = fax;
	this.checkinTime = checkinTime;
	this.checkoutTime = checkoutTime;
	this.contactEmail = contactEmail;
	this.introduction = introduction;
	this.lastModifiedDate = lastModifiedDate;
	this.lastModifiedEmp = lastModifiedEmp;
}



	public Integer gethId() {
		return hId;
	}



	public void sethId(Integer hId) {
		this.hId = hId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getFax() {
		return fax;
	}



	public void setFax(String fax) {
		this.fax = fax;
	}



	public String getCheckinTime() {
		return checkinTime;
	}



	public void setCheckinTime(String checkinTime) {
		this.checkinTime = checkinTime;
	}



	public String getCheckoutTime() {
		return checkoutTime;
	}



	public void setCheckoutTime(String checkoutTime) {
		this.checkoutTime = checkoutTime;
	}



	public String getContactEmail() {
		return contactEmail;
	}



	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}



	public String getIntroduction() {
		return introduction;
	}



	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}



	public String getLastModifiedDate() {
		return lastModifiedDate;
	}



	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}



	public String getLastModifiedEmp() {
		return lastModifiedEmp;
	}



	public void setLastModifiedEmp(String lastModifiedEmp) {
		this.lastModifiedEmp = lastModifiedEmp;
	}



	public Hotel() {
	}
	
	
	
	
	
	//連結LatestNews
	@OneToMany(mappedBy="hotel",cascade= {CascadeType.PERSIST, CascadeType.REFRESH})
	private List<LatestNews> latestNews;

	public List<LatestNews> getLatestNews() {
		return latestNews;
	}
	public void setLatestNews(List<LatestNews> latestNews) {
		this.latestNews = latestNews;
	}
	
	//連結Dept
	@OneToMany(mappedBy="hotel",cascade= {CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Dept> depts;
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	
	
	
	
	
	
	
	

}
