package bootHibernate.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootHibernate.entity.User;
import bootHibernate.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	  private static Logger logger = Logger.getLogger(UserController.class);
	    
	@Autowired
	private UserService userService;
        
	@RequestMapping("/Byid")
	public Object userByid( @RequestParam("id") Integer id){
		  User user=userService.getById(id);
		    return user;
	}
	
	@RequestMapping("/add")
	public Object useradd (User u){
		userService.adduser(u);
		return null;
	}
}
