package com.example.testloadvaadin.client.mycustomcompo;

import com.google.gwt.user.client.ui.Label;

// TODO extend any GWT Widget
public class MyCustomCompoWidget extends Label {

	public static final String CLASSNAME = "mycustomcompo";

	public MyCustomCompoWidget() {

		// setText("MyCustomCompo sets the text via MyCustomCompoConnector using MyCustomCompoState");
		setStyleName(CLASSNAME);

	}

}