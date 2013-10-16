package com.example.testloadvaadin.client.mycustomcompo;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;

public interface MyCustomCompoServerRpc extends ServerRpc {

	// TODO example API
	public void clicked(MouseEventDetails mouseDetails);

}
