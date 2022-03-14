package com.app.controller;

import java.util.List;
import java.util.UUID;

import com.app.dao.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.model.Contact;
import com.app.service.ContactService;

@RestController
@CrossOrigin("*")
public class ContactController {
	
	@Autowired
	private ContactService contactServ;
	private ContactRepository contactRepository;
	@PostMapping(value = "postcontact")
	public List<Contact> saveContact(@RequestBody Contact contact){
		contactServ.saveContact(contact);
		return contactServ.findAllContact();
	}
	
	@GetMapping(value = "getallContacts")
	public List<Contact> getContacts(){
		return contactServ.findAllContact();
	}
	
	@GetMapping(value = "getcontactbyid")
	public Contact getContactById(@RequestParam int id){
		return contactServ.findContactById(id);
	}
	
	@DeleteMapping(value = "deletecontact")
	public List<Contact> deleteContact(@RequestParam int id){
		contactServ.deleteContact(id);
		return contactServ.findAllContact();
	}
}
