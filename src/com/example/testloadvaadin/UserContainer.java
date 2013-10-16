package com.example.testloadvaadin;

import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;

/**
 * 
 * @author kimhatrung
 * 
 */

public class UserContainer extends IndexedContainer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7265322816144121080L;

	public UserContainer() {
		addContainerProperty("FIRSTNAME", String.class, "");
		addContainerProperty("LASTNAME", String.class, "");
		addContainerProperty("AGE", Integer.class, 0);
		addContainerProperty("EMAIL", String.class, "");
		addContainerProperty("COUNTRY", String.class, "");
	}
	
	 @SuppressWarnings("unchecked")
	public void addUser(String fisrtname, String lastname, int age, String email, String country) {
	        Object itemId = addItem();
	        Item item = getItem(itemId);
	        if (item != null) {
	            item.getItemProperty("FIRSTNAME").setValue(fisrtname);
	            item.getItemProperty("LASTNAME").setValue(lastname);
	            item.getItemProperty("AGE").setValue(age);
	            item.getItemProperty("EMAIL").setValue(email);
	            item.getItemProperty("COUNTRY").setValue(country);
	        }
	    }

}
