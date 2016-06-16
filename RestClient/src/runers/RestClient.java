package runers;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import com.datalex.pojos.Reservation.Customer;

import java.util.List;

import javax.ws.rs.core.MediaType;

public class RestClient {
	private static final String baseUrl = "http://localhost:9091/RestTest/rest/message";
	
	public static void main(String[] args) {
		  Client client = Client.create();
    		client.setFollowRedirects(true);
    		WebResource resource = client.resource(baseUrl);
    		   		
    		GenericType<List<Customer>> genericType = new GenericType<List<Customer>>() {
    		};
    		List<Customer> messages = resource.accept(MediaType.APPLICATION_XML).get(genericType);
    		
    		for (Customer temp : messages) {
    			System.out.println(temp);
    		}
    		/*
    		 * Get message by ID
    		 */
    		String id = "RESV_RETRIEVE_Customer1850432";
    		Customer message = resource.path(String.valueOf(id)).accept(MediaType.APPLICATION_XML).get(Customer.class);
    		System.out.println("Message with ID = " + id);
    		System.out.println(message);
    		    		
    		// Put message
    		System.out.println("puttin' message");
    		message = new Customer();
    		message.setFirstName("Petrov");
    		message.setLastName("Petr");
    		message.setCustomerDocID("111");
    		resource.accept(MediaType.APPLICATION_XHTML_XML).put(message);

    		messages = resource.accept(MediaType.APPLICATION_XML).get(genericType);

    		for (Customer temp : messages) {
    			System.out.println(temp);
    		}
    		   		
    		 //Update message    		
    		String id1 = "111";
    		message.setFirstName("Yuliya");
    		message.setLastName("Maliauka");
    		resource.post(message);
    		message = resource.path(String.valueOf(id1)).accept(MediaType.APPLICATION_XML).get(Customer.class);
    		System.out.println("Message with ID = " + id1);
    		System.out.println(message);
    		    		
    		//Put message
    		System.out.println("puttin' message");
    		message = new Customer();
    		message.setFirstName("Ivanov");
    		message.setLastName("Ivan");
    		message.setCustomerDocID("222");
    		resource.accept(MediaType.APPLICATION_XHTML_XML).put(message);

    		messages = resource.accept(MediaType.APPLICATION_XML).get(genericType);

    		for (Customer temp : messages) {
    			System.out.println(temp);
    		}
    		/*
    		 * Delete message
    		 */
    		
    		System.out.println("delete message with ID = " + id1);
    		resource.path(String.valueOf(id1)).delete();
    		messages = resource.accept(MediaType.APPLICATION_XML).get(genericType);

    		for (Customer temp : messages) {
    			System.out.println(temp);
    		}    		
    		
    	}   
	}


