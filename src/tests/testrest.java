package tests;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.junit.Test;

public class testrest {

	@Test
	public void testCustomerResource() throws Exception {
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://jsonplaceholder.typicode.com/posts").request().get();
		response = client.target("http://localhost:8080/RestWeb/rest/xml/user/get").request().get();

		System.out.println(response.toString());
	}

}
