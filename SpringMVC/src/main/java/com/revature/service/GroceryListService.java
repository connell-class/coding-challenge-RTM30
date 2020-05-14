package com.revature.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.GroceryList;
import com.revature.dao.DaoContract;
@Service
public class GroceryListService {
	  private DaoContract<GroceryList, Integer> dao;
	  @Autowired
	  public void setGroceryListService(DaoContract<GroceryList, Integer> dc) {
	    dao = dc;
	  }
	  public List<GroceryList> getAll() {
		    return dao.findAll();
		  }
		  public GroceryList save(GroceryList t) {
		    dao.save(t);
		    return t;
		  }
		  public GroceryList getById(int id) {
		    return dao.findById(id);
		  }
		  public GroceryList update(GroceryList newGroceryList) {
		    GroceryList oldUser = dao.findById(newGroceryList.getGroceryListId());
		    oldUser = dao.update(newGroceryList);
		    return dao.findById(oldUser.getGroceryListId());
		  }
		  public boolean deleteById(int id) {
		    dao.delete(dao.findById(id));
		    return true;
		  }
		  public GroceryList getByUsername(String name) {
		    return dao.findByString(name);
		  }
}