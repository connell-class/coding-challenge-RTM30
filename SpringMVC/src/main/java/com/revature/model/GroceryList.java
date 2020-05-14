package com.revature.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="grocerylist")
public class GroceryList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int groceryListId;
	
//	@OneToOne
//	@JoinColumn(name = "groceryItem_Id", referencedColumnName = "groceryList_Id", unique = true, nullable = false)
//	private GroceryList groceryId;
	
	@Column(name="groceryList_Name")
	private String listName;
	
	public int getGroceryListId() {
		return groceryListId;
	}
	public void setGroceryListId(int groceryListId) {
		this.groceryListId = groceryListId;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	@Override
	public String toString() {
		return "GroceryList [groceryListId=" + groceryListId + ", listName=" + listName + "]";
	}
}