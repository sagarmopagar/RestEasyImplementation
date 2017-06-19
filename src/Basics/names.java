package Basics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
//import javax.ws.rs.core.Response;

@Path("nms")
public class names {

	@GET
	@Path("hello/{name}")
	public String show(@PathParam("name") final String name) {
		String message = "hello" + name;
		return message;

	}

}
