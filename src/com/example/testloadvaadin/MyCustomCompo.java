package com.example.testloadvaadin;

import com.example.testloadvaadin.client.mycustomcompo.MyCustomCompoClientRpc;
import com.example.testloadvaadin.client.mycustomcompo.MyCustomCompoServerRpc;
import com.vaadin.shared.MouseEventDetails;
import com.example.testloadvaadin.client.mycustomcompo.MyCustomCompoState;

public class MyCustomCompo extends com.vaadin.ui.AbstractComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 916729465068561357L;
	private MyCustomCompoServerRpc rpc = new MyCustomCompoServerRpc() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7774237856163937033L;
		private int clickCount = 0;

		public void clicked(MouseEventDetails mouseDetails) {
			// nag every 5:th click using RPC
			if (++clickCount % 5 == 0) {
				getRpcProxy(MyCustomCompoClientRpc.class).alert(
						"Ok, that's enough!");
			}
			// update shared state
			getState().text = "You have clicked " + clickCount + " times";
		}
	};  

	public MyCustomCompo() {
		registerRpc(rpc);
	}

	@Override
	public MyCustomCompoState getState() {
		return (MyCustomCompoState) super.getState();
	}
}
