package com.example.testloadvaadin.client.mycustomcompo;

import com.vaadin.shared.communication.ClientRpc;

public interface MyCustomCompoClientRpc extends ClientRpc {

	// TODO example API
	public void alert(String message);

}