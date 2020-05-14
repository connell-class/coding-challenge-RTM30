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
import com.revature.model.Grocery;
import com.revature.service.GroceryService;
@Controller
@CrossOrigin
@SessionAttributes("id")
public class GroceryController {
	  /**
	   * Allows Spring to instantiate User Service
	   */
	  @Autowired
	  private GroceryService sc;
	  /**
	   * Used to find all Users in the database Does not take in any parameters
	   * 
	   * @return list of all Users in the database
	   */
	  @RequestMapping(method = RequestMethod.GET, value = "/users.app")
	  public ResponseEntity<List<Grocery>> findAll() {
	    return new ResponseEntity<List<Grocery>>(sc.getAll(), HttpStatus.OK);
	  }
	  @RequestMapping(method = RequestMethod.GET, value = "/users/{id}.app")
	  public ResponseEntity<Grocery> getById(@PathVariable("id") int id) {
	    return new ResponseEntity<Grocery>(sc.getById(id), HttpStatus.OK);
	  }
	  /**
	   * Creates a new User in the database
	   * 
	   * @param g takes in information related to user
	   * @return newly created user information
	   */
	  @RequestMapping(method = RequestMethod.POST, value = "/users.app")
	  public ResponseEntity<Grocery> save(@RequestBody Grocery g) {
	    g = sc.save(g);
	    return new ResponseEntity<Grocery>(g, HttpStatus.CREATED);
	  }
}