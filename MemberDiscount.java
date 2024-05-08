package tw.com.ispan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MemberDiscount")  //連結MemberDiscountDetail(會員優惠)和MemberRank(會員等級)的中間表
public class MemberDiscount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "md_id")
	private Integer mdId;
	
	@ManyToOne
	@JoinColumn(name="mdd_id", referencedColumnName = "mdd_id")
	private MemberDiscountDetail memberDiscountDetail;
	
//	@ManyToOne
//	@JoinColumn(name="mr_id", referencedColumnName = "mr_id")
//	private MemberRank mrId;

	public Integer getMdId() {
		return mdId;
	}
	public void setMdId(Integer mdId) {
		this.mdId = mdId;
	}
	public MemberDiscountDetail getMemberDiscountDetail() {
		return memberDiscountDetail;
	}
	public void setMemberDiscountDetail(MemberDiscountDetail memberDiscountDetail) {
		this.memberDiscountDetail = memberDiscountDetail;
	}

	}
//	public MemberRank getMrId() {
//		return mrId;
//	}
//	public void setMrId(MemberRank mrId) {
//		this.mrId = mrId;
//	}


	
	//以下這段要放在MemberRank裡面

//	@OneToMany(mappedBy="mdId",cascade= {CascadeType.PERSIST, CascadeType.REFRESH})
//	private List<MemberDiscount> memberDiscounts;
//	public List<MemberDiscount> getMemberDiscounts() {
//		return memberDiscounts;
//	}
//	public void setMemberDiscounts(List<MemberDiscount> memberDiscounts) {
//		this.memberDiscounts = memberDiscounts;
//	}

	
	



