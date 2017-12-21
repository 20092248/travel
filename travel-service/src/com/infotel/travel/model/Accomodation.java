package com.infotel.travel.model;

public class Accomodation /*implements Comparable*/ {

	private int id, image_id;
	private AccomodationInfo info;
	private AccomodationImage image;
	
	public Accomodation() {

	}
	
	public Accomodation(int id, int price) {
		this.id = id;
		this.price = price;
	}
	
	public Accomodation(int id, float price) {
		this.id = id;
		this.price = (int)(price);
	}
	
	public int getImage_id() {
		return image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}

	private int price;
	
	public AccomodationInfo getInfo() {
		return info;
	}

	public void setInfo(AccomodationInfo info) {
		this.info = info;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrice(int i) {
		this.price = i;
	}

	public void setImage(AccomodationImage image) {
		this.image = image;
	}
	
	public void setImage(Integer id,byte[] content) {
		image = new AccomodationImage();
		image.setId(id);
		image.setContent(content);		
	}

	public void setInformation(String name, String adress, String distance) {
		
		info = new AccomodationInfo();
		info.setName(name);
		info.setAdress(adress);
		info.setDistance(distance);
	}
	
	public void setInformationName(String name) {
		
		info = new AccomodationInfo();
		info.setName(name);
	}
	public void setInformationAdress(String adress) {
		
		info = new AccomodationInfo();
		info.setAdress(adress);
	}
	public void setInformationDistance(String distance) {
		
		info = new AccomodationInfo();
		info.setDistance(distance);
	}
	
	public void setInformationType(AccomodationType type) {
		
		info = new AccomodationInfo();
		info.setType(type);
	}
	public void setInformationType(String type) {
		
		info = new AccomodationInfo();
		info.setType(type);
	}
	
	public void setInformationType(int star) {
		
		info = new AccomodationInfo();
		info.setStars(star);
	}
	
	public void setInformationCF(String cancellation_free) {
		
		info = new AccomodationInfo();
		info.setCancellationFree(cancellation_free);
	}
	
	public void setInformationLa(double la) {
		
		info = new AccomodationInfo();
		info.setCoordinatesLa(la);
	}
	public void setInformationLo(double lo) {
		
		info = new AccomodationInfo();
		info.setCoordinatesLa(lo);
	}
	
	public int getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public AccomodationInfo getInformation() {
		return info;
	}

	public AccomodationImage getImage() {
		return image;
	}



	@Override
	public String toString() {
		return "Accomodation [id=" + id + ", image_id=" + image_id + ", price=" + price + ", info=" + info + ", image="
				+ image + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accomodation other = (Accomodation) obj;
		if (id != other.id)
			return false;
		return true;
	}

//	public int compareTo(Object o) {
//		
//		Accomodation autre=(Accomodation)o;
//		int astars = 
//				(autre.getInformation()!=null ? autre.getInformation().getStars() : 0);
//		int mystars = 
//				(this.getInformation()!=null ? this.getInformation().getStars() : 0);
//		return (mystars - astars);
//	}
	

	
	
}
