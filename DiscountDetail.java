package tw.com.ispan.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="discount_detail")
public class DiscountDetail {
//	dd_id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dd_id")
	private Integer ddId;
	
//	h_id
	@ManyToOne
	@JoinColumn(name="h_id", referencedColumnName = "h_id", nullable=false)
	private Hotel hotel;
	
//	promo code
	@Column(name="promo_code")
	private String promoCode;
	
//	begin date 
	@Column(name="begin_date")
	private LocalDate beginDate;
	
//	last date
	@Column(name="last_date")
	private LocalDate lastDate;
	
//	discount rate
	@Column(name="discount_rate")
	private Integer discountRate;
	
//	discount price
	@Column(name="discount_price")
	private Integer discountPrice;
	
//	name
	@Column(name="name")
	private String name;
	
//	status
	@Column(name="status")
	private String status;
	
//	remark
	@Column(name="remark")
	private String remark;
	
//	max times
	@Column(name="max_times")
	private String maxTimes;
	
//	discount type
	@Column(name="discount_type")
	private String discountType;
	
//	member only(T/F)
	@Column(name="member_only")
	private Boolean memberOnly;
	
//	last modified date
	@Column(name = "last_modified_date")
	private LocalDate lastModifiedDate;

//	last modified emp
	@Column(name = "last_modified_emp")
	private Integer lastModifiedEmp;

//	last modified text
	@Column(name = "last_modified_text")
	private Integer lastModifiedText;
	
	@ManyToMany
	@JoinTable(
			name="UseDiscount",
			joinColumns = {
					@JoinColumn(name="dd_id", referencedColumnName = "dd_id")
			},
			inverseJoinColumns = {
					@JoinColumn(name="bp_id", referencedColumnName = "bp_id")
			})
//	private Set<BookingPayment> bookingPayment;
//	
//	@ManyToMany
//	@JoinTable(
//			name="Discount",
//			joinColumns = {
//					@JoinColumn(name="dd_id", referencedColumnName = "dd_id")
//			},
//			inverseJoinColumns = {
//					@JoinColumn(name="rt_id", referencedColumnName = "rt_id")
//			})
//	private Set<RoomType> roomType;
//	
//	
//	

	




	public Integer getDdId() {
		return ddId;
	}




	public void setDdId(Integer ddId) {
		this.ddId = ddId;
	}




	public Hotel getHotel() {
		return hotel;
	}




	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}




	public String getPromoCode() {
		return promoCode;
	}




	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
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




	public Integer getDiscountPrice() {
		return discountPrice;
	}




	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
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




	public String getMaxTimes() {
		return maxTimes;
	}




	public void setMaxTimes(String maxTimes) {
		this.maxTimes = maxTimes;
	}




	public String getDiscountType() {
		return discountType;
	}




	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}




	public Boolean getMemberOnly() {
		return memberOnly;
	}




	public void setMemberOnly(Boolean memberOnly) {
		this.memberOnly = memberOnly;
	}




	public LocalDate getLastModifiedDate() {
		return lastModifiedDate;
	}




	public void setLastModifiedDate(LocalDate lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}




	public Integer getLastModifiedEmp() {
		return lastModifiedEmp;
	}




	public void setLastModifiedEmp(Integer lastModifiedEmp) {
		this.lastModifiedEmp = lastModifiedEmp;
	}




	public Integer getLastModifiedText() {
		return lastModifiedText;
	}




	public void setLastModifiedText(Integer lastModifiedText) {
		this.lastModifiedText = lastModifiedText;
	}

//
//
//
//	public Set<BookingPayment> getBookingPayment() {
//		return bookingPayment;
//	}
//
//
//
//
//	public void setBookingPayment(Set<BookingPayment> bookingPayment) {
//		this.bookingPayment = bookingPayment;
//	}
//
//
//
//
//	public Set<RoomType> getRoomType() {
//		return roomType;
//	}
//
//
//
//
//	public void setRoomType(Set<RoomType> roomType) {
//		this.roomType = roomType;
//	}




	public DiscountDetail() {
		super();
	}

}
