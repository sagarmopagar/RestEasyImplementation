package Basics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "users")
@Path("Items")
public class Item {

	private String description;
	private int price;

	public Item() {
	}

	public Item(String description, int price) {
		this.description = description;
		this.price = price;
	}

	@GET
	@Path("item")
	@Produces("application/xml")
	public Item getItem() {

		Item item = new Item("computer", 2500);

		return item;
	}
	// Getter- Setter methods

}