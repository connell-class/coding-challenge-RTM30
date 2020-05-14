package com.revature.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.revature.model.GroceryItem;
import com.revature.model.GroceryList;
import com.revature.service.GroceryListService;

@Controller
@CrossOrigin
@SessionAttributes("id")
public class GroceryItemController {


	  @Autowired
	  private GroceryListService sc;
	  
	  // Find All
	  @RequestMapping(method = RequestMethod.GET, value = "/groceryitem.app")
	  public ResponseEntity<List<GroceryList>> findAll() {
		  System.out.println("Controller - Get all groceries is running");
		  System.out.println(sc.getAll());
	    return new ResponseEntity<List<GroceryList>>(sc.getAll(), HttpStatus.OK);
	  }
	  
	  // Find By ID
	  @RequestMapping(method = RequestMethod.GET, value = "/groceryitem/{id}.app")
	  public ResponseEntity<GroceryList> getById(@PathVariable("id") int id) {
		  System.out.println("Controller - Get grocery item was successful");
	    return new ResponseEntity<GroceryList>(sc.getById(id), HttpStatus.OK);
	  }
	 
	  // Create New
	  @RequestMapping(method = RequestMethod.POST, value = "/groceryitem.app")
	  public ResponseEntity<GroceryItem> save(@RequestBody GroceryItem g) {
	    g = sc.save(g);
	    System.out.println("Controller - Create grocery item successful");
	    return new ResponseEntity<GroceryItem>(g, HttpStatus.CREATED);
	  }
}
