package com.revature.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="groceryitem")
public class GroceryItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="groceryItem_Id")
	private int groceryItemId;
	@Column(name="grocery_Name", length = 255)
	private String ItemName;
	
	public int getGroceryItemId() {
		return groceryItemId;
	}
	public void setGroceryItemId(int groceryItemId) {
		this.groceryItemId = groceryItemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	

		
}