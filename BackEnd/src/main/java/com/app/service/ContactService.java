package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.dao.ContactRepository;
import com.app.model.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepo;
	
	public Contact saveContact(Contact contact) {

		return contactRepo.save(contact);
	}
	public Contact updateContact(Contact contact, int id){
		Contact ctcUpdate = contactRepo.findById(id).get();
		ctcUpdate.setId(contact.getId());
		ctcUpdate.setAdressePostal(contact.getAdressePostal());
		ctcUpdate.setEmail(contact.getEmail());
		ctcUpdate.setPrenom(contact.getPrenom());

		return contactRepo.save(ctcUpdate);
	}

	public Contact update(Contact contact) {
		return contactRepo.save(contact);
	}
	
	public List<Contact> findAllContact() {
		return contactRepo.findAll();
	}
	public Contact findContactById(int id) {
		return contactRepo.findById(id).get();
	}
	
	public void deleteContact(int id) {contactRepo.deleteById(id);
	}
}
