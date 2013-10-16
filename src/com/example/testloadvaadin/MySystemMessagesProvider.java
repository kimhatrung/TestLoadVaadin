package com.example.testloadvaadin;

import com.vaadin.server.CustomizedSystemMessages;
import com.vaadin.server.SystemMessages;
import com.vaadin.server.SystemMessagesInfo;
import com.vaadin.server.SystemMessagesProvider;

public class MySystemMessagesProvider implements SystemMessagesProvider {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3266211623604867375L;

	@Override
	public SystemMessages getSystemMessages(
			SystemMessagesInfo systemMessagesInfo) {
		CustomizedSystemMessages customizedSystemMessages = new CustomizedSystemMessages();
		customizedSystemMessages.setCommunicationErrorCaption("Alo");
		customizedSystemMessages.setCommunicationErrorMessage("Hello Trung");
		customizedSystemMessages.setCommunicationErrorNotificationEnabled(true);
		customizedSystemMessages.setCommunicationErrorURL("www.vnexpress.net");
		return customizedSystemMessages;
	}
}
