package com.app.dto;

import com.app.model.Contact;
import org.springframework.stereotype.Component;




@Component
public class ContactResponse {
private Contact contact;
private String status;

public Contact getContact() {
	return contact;
}
public void setContact(Contact contact) {
	this.contact = contact;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "ContactResponse [status=" + status + "]";
}

}

// IT IS USED FOR RETRIEVING DATA
//In the CustomerResponseDTO, we add an additional id field to uniquely identify the customer. This DTO will be used when retrieving a customer from the API.
//when retrieving a customer, you can transform the Customer entity to the CustomerResponseDTO object and send it back to the client