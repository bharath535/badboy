package Collections;

public class Watch {
	private String brand;
	private int price;
	private boolean isSmart;
	private boolean isWaterProof;
	private String color;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setIsSmart(boolean isSmart) {
		this.isSmart=isSmart;
	}
	public boolean getIsSmart() {
		return this.isSmart;
	}
	public void setIsWaterProof(boolean isWaterProof) {
		this.isWaterProof=isWaterProof;
	}
	public boolean getIsWaterProof() {
		return this.isWaterProof;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public Watch(String brand,int price,boolean isSmart,boolean isWaterProof,String color) {
		this.brand=brand;
		this.price=price;
		this.isSmart=isSmart;
		this.isWaterProof=isWaterProof;
		this.color=color;
	}
	public String toString() {
		return brand+" "+price+" "+isSmart+" "+isWaterProof+" "+color;
	}

}
