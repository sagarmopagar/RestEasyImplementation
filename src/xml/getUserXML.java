package xml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import xml.User;

@Path("xml/user")
public class getUserXML extends User {

	@GET
	@Path("get")
	@Produces("application/xml")
	public User getUserInXML() {

		User user1 = new User();
		user1.setUsername("mktyoung");
		user1.setPassword("password");
		user1.setPin(1234);

		return user1;

	}

}
