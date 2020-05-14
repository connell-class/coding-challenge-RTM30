package com.revature.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.model.Grocery;
import com.revature.dao.DaoContract;

@Service
public class GroceryService {
	  private DaoContract<Grocery, Integer> dao;
	  @Autowired
	  public void setGroceryService(DaoContract<Grocery, Integer> dc) {
	    dao = dc;
	  }
	  public List<Grocery> getAll() {
		    return dao.findAll();
		  }
		  public Grocery save(Grocery t) {
		    dao.save(t);
		    return t;
		  }
		  public Grocery getById(int id) {
		    return dao.findById(id);
		  }
		  public Grocery update(Grocery newUser) {
		    Grocery oldUser = dao.findById(newUser.getUserId());
		    oldUser = dao.update(newUser);
		    return dao.findById(oldUser.getUserId());
		  }
		  public boolean deleteById(int id) {
		    dao.delete(dao.findById(id));
		    return true;
		  }
		  public Grocery getByUsername(String name) {
		    return dao.findByString(name);
		  }
}