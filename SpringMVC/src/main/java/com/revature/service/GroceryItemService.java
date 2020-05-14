package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.DaoContract;
import com.revature.model.GroceryItem;

@Service
public class GroceryItemService {
	  private DaoContract<GroceryItem, Integer> dao;
	  @Autowired
	  public void setUserService(DaoContract<GroceryItem, Integer> dc) {
	    dao = dc;
	  }
	  public List<GroceryItem> getAll() {
		    return dao.findAll();
		  }
		  public GroceryItem save(GroceryItem t) {
		    dao.save(t);
		    return t;
		  }
		  public GroceryItem getById(int id) {
		    return dao.findById(id);
		  }
		  public GroceryItem update(GroceryItem newGroceryList) {
			  GroceryItem oldUser = dao.findById(newGroceryList.getGroceryItemId());
		    oldUser = dao.update(newGroceryList);
		    return dao.findById(oldUser.getGroceryItemId());
		  }
		  public boolean deleteById(int id) {
		    dao.delete(dao.findById(id));
		    return true;
		  }
		  public GroceryItem getByUsername(String name) {
		    return dao.findByString(name);
		  }
}
