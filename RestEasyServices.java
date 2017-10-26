package com.resteasy;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/Welcome")
public class RestEasyServices {
	@GET
	@Path("/{name}")
	public Response WelcomRestEasy(@PathParam("name") String name) {
		String result = "Welcome to my RestEasy Example !" + name;
		return Response.status(200).entity(result).build();

	}

	@GET
	public Response WelcomRestEasySecond() {
		String result = "Rest easy with out param call ! ";
		return Response.status(200).entity(result).build();
	}
}