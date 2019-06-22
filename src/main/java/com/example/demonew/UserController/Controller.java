package com.example.demonew.UserController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demonew.Entity.User;
import com.example.newdemo.Service.UseServiceImpl;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public User[] check()
	{
		UseServiceImpl u=new UseServiceImpl();
		return u.retrieveName();
	}
	@GetMapping("/{name}/{id}")
	public String mulparameters(@PathVariable("name") String name,@PathVariable("id") int id)
	{
		return name+id;
	}
	
	
	
}
