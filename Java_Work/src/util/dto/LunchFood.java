package util.dto;

import java.time.LocalDate;

public class LunchFood {
	private String foodName;
	private int foodPrice;
	private String foodRegDate;
	private String foodmodDate;
	
	//생성자
	public LunchFood(String foodName, int foodPrice, String foodRegDate, String foodmodDate, String foodLocator) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodRegDate = foodRegDate;
		this.foodmodDate = foodmodDate;
		this.foodLocator = foodLocator;
	}
	
	//toString
	@Override
	public String toString() {
		return "LunchFood [foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodRegDate=" + foodRegDate
				+ ", foodmodDate=" + foodmodDate + ", foodLocator=" + foodLocator + "]";
	}
	
	//getter,setter
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodRegDate() {
		return foodRegDate;
	}
	public void setFoodRegDate(String foodRegDate) {
		this.foodRegDate = foodRegDate;
	}
	public String getFoodmodDate() {
		return foodmodDate;
	}
	public void setFoodmodDate(String foodmodDate) {
		this.foodmodDate = foodmodDate;
	}
	public String getFoodLocator() {
		return foodLocator;
	}
	public void setFoodLocator(String foodLocator) {
		this.foodLocator = foodLocator;
	}
	private String foodLocator;
	
	
	}
	
	
	

