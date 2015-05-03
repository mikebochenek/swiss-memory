package ch.bochenek.memory.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsyncUndeed {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
