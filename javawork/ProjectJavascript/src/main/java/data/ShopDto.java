package data;

public class ShopDto {
	private String sanpum;
	private String photo;
	private int price;
	private String color;
	
	public ShopDto() {
		super();
	}
	
	public ShopDto(String sanpum, String photo, int price, String color) {
		super();
		this.sanpum = sanpum;
		this.photo = photo;
		this.price = price;
		this.color = color;
	}
	
	public String getSangpum() {
		return sanpum;
	}
	public void setSangpum(String sanpum) {
		this.sanpum = sanpum;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
