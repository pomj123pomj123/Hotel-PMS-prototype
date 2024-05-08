package tw.com.ispan.model;

import java.sql.Blob;
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
@Table(name = "hotel_photo")
public class HotelPhoto {
	
//	hp_id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hp_id")
	private Integer hpId;
	
//	h_id
	@ManyToOne
	@JoinColumn(name="h_id", referencedColumnName = "h_id", nullable=false)
	private Hotel hotel;
	
//	photo name
	@Column(name = "photo_name")
	private String photoName;
	
//	photo file
	@Column(name = "photo_file")
	private Blob photoFile;
	
//	added date
	@Column(name = "added_date")
	private LocalDate addedDate;
	
	

	public HotelPhoto(Integer hpId, Hotel hotel, String photoName, Blob photoFile, LocalDate addedDate) {
	super();
	this.hpId = hpId;
	this.hotel = hotel;
	this.photoName = photoName;
	this.photoFile = photoFile;
	this.addedDate = addedDate;
}



	public Integer getHpId() {
		return hpId;
	}



	public void setHpId(Integer hpId) {
		this.hpId = hpId;
	}



	public Hotel getHotel() {
		return hotel;
	}



	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}



	public String getPhotoName() {
		return photoName;
	}



	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}



	public Blob getPhotoFile() {
		return photoFile;
	}



	public void setPhotoFile(Blob photoFile) {
		this.photoFile = photoFile;
	}



	public LocalDate getAddedDate() {
		return addedDate;
	}



	public void setAddedDate(LocalDate addedDate) {
		this.addedDate = addedDate;
	}



	public HotelPhoto() {
	}

}
