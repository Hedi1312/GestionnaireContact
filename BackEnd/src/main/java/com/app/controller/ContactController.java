package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Contact;
import com.app.service.ContactService;

@RestController
@CrossOrigin("*")
public class ContactController {
	
	@Autowired
	private ContactService contactServ;
	
	@PostMapping(value = "postcontact")
	public List<Contact> saveContact(@RequestBody Contact contact){
		contactServ.saveContact(contact);
		return contactServ.findAllContact();
	}
	
	@PutMapping(value = "updatecontact")
	public List<Contact> updateContact(@RequestBody Contact contact){
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
