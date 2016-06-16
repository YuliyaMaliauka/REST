package com.datalex.resourse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

import com.datalex.pojos.Reservation.Customer;
import com.datalex.pojos.Reservation.Customer.Email;
import com.datalex.pojos.Reservation.Customer.Phone;


public class CustomersDo {
private static List<Customer> customers;
private final static Namespace NAMESPACE = Namespace.getNamespace("urn:reservation.rqrs.datalex.com");

private static Element rootElement(String xmlFileName) throws IOException, JDOMException {

    SAXBuilder builder = new SAXBuilder();
    Document document = builder.build(xmlFileName);
    Element root = document.getRootElement();

    return root;
}
	
	static{		
		Element root = null;
		try {
			root = rootElement("0004257753.xml");
		} catch (IOException | JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		 	List customerElements = root.getChildren("Customer", NAMESPACE);
	        Iterator custIterator = customerElements.iterator();
	        customers = new ArrayList<Customer>();
	        while (custIterator.hasNext()) {
	            Element cusElement = (Element) custIterator.next();
	            Customer customer = new Customer();

        
	            customer.setFirstName(cusElement.getAttributeValue("FirstName"));
	            customer.setLastName(cusElement.getAttributeValue("LastName"));
	            customer.setCustomerDocID(cusElement.getAttributeValue("CustomerDocID"));

	            Email email = new Email();
	            Element emailElement = cusElement.getChild("Email", NAMESPACE);
	            email.setEmailAddress(emailElement.getAttributeValue("EmailAddress"));
	            email.setEmailType(emailElement.getAttributeValue("EmailType"));
	            email.setSyncStatus(emailElement.getAttributeValue("SyncStatus"));
	            customer.setEmail(email);

	            Phone phon = new Phone();
	            Element phonElement = cusElement.getChild("Phone", NAMESPACE);
	            phon.setPhoneNumber(phonElement.getAttributeValue("PhoneNumber"));
	            phon.setPhoneType(phonElement.getAttributeValue("PhoneType"));
	            phon.setSyncStatus(phonElement.getAttributeValue("SyncStatus"));
	            customer.setPhone(phon);

        
	            customers.add(customer);
	        }
		}
	
	public static List<Customer> getCustomers(){
		return customers;
	}
	
	
	public static boolean deleteMessageById(String id) {
		boolean result = false;
		for (Customer customer : customers) {
			if (customer.getCustomerDocID().equals(id)) {
				result = customers.remove(customer);
				return result;
			}
		}
		return result;
	}

	public static Customer findMessageById(String id) {
		for (Customer customer : customers) {
			if (customer.getCustomerDocID().equals(id)) {
				return customer;
			}
		}
		return null;
	}
		
	public static boolean updateMessage(Customer customer) {
		boolean result = false;
		for (Customer temp: customers) {
			if (temp.getCustomerDocID().equals(customer.getCustomerDocID())) {
				temp.setFirstName(customer.getFirstName());
				temp.setLastName(customer.getLastName());
				result = true;
			}
		}
		return result;
	}

	public static boolean addMesage(Customer customer) {
		
		return customers.add(customer);
	}
}
