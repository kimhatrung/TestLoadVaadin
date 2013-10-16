package com.example.testloadvaadin.client.mycustomcompo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

import com.example.testloadvaadin.MyCustomCompo;
import com.example.testloadvaadin.client.mycustomcompo.MyCustomCompoWidget;
import com.example.testloadvaadin.client.mycustomcompo.MyCustomCompoServerRpc;
import com.vaadin.client.communication.RpcProxy;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.client.MouseEventDetailsBuilder;
import com.example.testloadvaadin.client.mycustomcompo.MyCustomCompoClientRpc;
import com.example.testloadvaadin.client.mycustomcompo.MyCustomCompoState;
import com.vaadin.client.communication.StateChangeEvent;

@Connect(MyCustomCompo.class)
public class MyCustomCompoConnector extends AbstractComponentConnector {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6512227260252569357L;
	MyCustomCompoServerRpc rpc = RpcProxy
			.create(MyCustomCompoServerRpc.class, this);
	
	public MyCustomCompoConnector() {
		registerRpc(MyCustomCompoClientRpc.class, new MyCustomCompoClientRpc() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -7063242364461519231L;

			public void alert(String message) {
				// TODO Do something useful
				Window.alert(message);
			}
		});

		// TODO ServerRpc usage example, do something useful instead
		getWidget().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
					.buildMouseEventDetails(event.getNativeEvent(),
								getWidget().getElement());
				rpc.clicked(mouseDetails);
			}
		});

	}

	@Override
	protected Widget createWidget() {
		return GWT.create(MyCustomCompoWidget.class);
	}

	@Override
	public MyCustomCompoWidget getWidget() {
		return (MyCustomCompoWidget) super.getWidget();
	}

	@Override
	public MyCustomCompoState getState() {
		return (MyCustomCompoState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);

		// TODO do something useful
		final String text = getState().text;
		getWidget().setText(text);
	}

}

