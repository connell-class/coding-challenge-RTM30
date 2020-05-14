package com.revature.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.revature.model.GroceryList;

@Repository
@Transactional
public class GroceryListDao implements DaoContract<GroceryList, Integer> {
  private SessionFactory ses;
  
  @Autowired
  public void setSesFact(SessionFactory sse) {
    ses = sse;
  }
@Override
public GroceryList findById(Integer id) {
	// TODO Auto-generated method stub
	return ses.openSession().get(GroceryList.class, id);
}
@Override
public void save(GroceryList t) {
	// TODO Auto-generated method stub
	ses.openSession().save(t);
	
}
@Override
public boolean delete(GroceryList t) {
	// TODO Auto-generated method stub
    ses.getCurrentSession().delete(t);
    if (findById(t.getGroceryListId()) == null) {
      return true;
    }
    return false;
}

@Override
public GroceryList update(GroceryList t) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<GroceryList> findAll() {
	// TODO Auto-generated method stub
	System.out.println("Find all method is running in DAO");
	return ses.openSession().createQuery("from GroceryList", GroceryList.class).getResultList();
}
@Override
public GroceryList findByAuthorId(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<GroceryList> findAllById(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public GroceryList findByString(String s) {
	// TODO Auto-generated method stub
	return null;
}

}

