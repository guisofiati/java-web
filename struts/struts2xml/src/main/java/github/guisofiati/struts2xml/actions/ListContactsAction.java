package github.guisofiati.struts2xml.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

import github.guisofiati.struts2xml.beans.Contact;

public class ListContactsAction implements Action {
	
	private List<Contact> contacts = new ArrayList<Contact>();
	
	@Override
	public String execute() throws Exception {
		
		Contact contact1 = new Contact(1, "Maria", "11988888888");
		Contact contact2 = new Contact(2, "Jose", "11977777777");
		
		contacts.add(contact1);
		contacts.add(contact2);
		
		return SUCCESS;
	}
		
	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}
