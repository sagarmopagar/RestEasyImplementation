# RestEasyImplementation
This is a simple implementation of RestEasy framework offered by JBoss.
Remember to deploy this project on WildFly as WildFly comes with all the necessary jars. 
In this project, I have demonstrated how to build a smiple Restful webserivce that supports http GET method
Users send a request to the webserver using webservice URI. And the server responds with the response generated for the particular request.
For example, there's a service class called "names" in package Basics. 

@Path("nms")
public class names {

	@GET
	@Path("hello/{name}")
	public String show(@PathParam("name") final String name) {
		String message = "hello" + name;
		return message;

	}

}

Here, the class names has a method which is annotated as GET and Path. And the class is annotated as Path. The Path at class level is 
used to add a relative path. Relative to the path of the webapp. For example, if your project name is "RestWeb", then 
your webapp URI would be, "http://localhost:8080/RestWeb". And now to access the service class above the URI would be
"http://localhost:8080/RestWeb/nms".

But hold on. There's one more thing that comes in between RestWeb and nms. What's it?

Before deploying your application you need a JAX-RS class activator, which is a class extending javax.ws.rs.core.Application 
and declaring the Path where JAX-RS Services will be availble: I have created this class under package Application. 
So no need to worry much.


package com.sample.activator;
 
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
 
@ApplicationPath("/rest")
public class JaxRsActivator extends Application {
 
}

So all service classes here onwards needs to be accessed using this path along with class and method specific paths:
"localhost:8080/RestWeb/rest"

To access our class, names we will need the URI: "localhost:8080/RestWeb/rest/nms"

But we need to get down to the specific class method, to get exactly what we want. The only method in the class is show() 
which takes a parameter. And it's annotated as GET and Path. Hence, to access the method we need to add the path. And hence
our final path (hope so), becomes:

"localhost:8080/RestWeb/rest/nms/hello/{name}" 

Well, Although we went to the last level, our implementation is not perfect. because we should replace {name} with a real name as it's 
a parameter. Just give a name and try the url in browser or POSTMAN in chrome. You will be stunned to see your first ever Restful 
service working.



