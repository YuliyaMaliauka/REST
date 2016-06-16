package com.datalex.entity;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;

import com.datalex.pojos.Reservation.Customer;
import com.datalex.resourse.CustomersDo;


@Path("message")
public class CustomerResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Customer> getAllMessages() {
		List<Customer> messages = CustomersDo.getCustomers();
		if (messages == null) {
			throw new RuntimeException("Can't load all messages");
		}
		return messages;
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getMessageById(@PathParam("id") String id) {
		Customer message = CustomersDo.findMessageById(id);
		if (message == null) {
			throw new RuntimeException("can't find mesage with id = " + id);
		}
		return message;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public void addMessage(JAXBElement<Customer> message) {
		if (CustomersDo.addMesage(message.getValue()) != true) {
			throw new RuntimeException("can't add mesage with id = "
					+ message.getValue().getCustomerDocID());
		}
	}

	@DELETE
	@Path("{id}")
	public void deleteMessage(@PathParam("id") String id) {
		if (CustomersDo.deleteMessageById(id) != true) {
			throw new RuntimeException("can't delete mesage with id = " + id);
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void updateMessage(JAXBElement<Customer> message) {
		if (CustomersDo.updateMessage(message.getValue()) != true) {
			throw new RuntimeException("can't update mesage with id = "
					+ message.getValue().getCustomerDocID());
		}
	}
}
