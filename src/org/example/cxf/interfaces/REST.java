package org.example.cxf.interfaces;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface REST {	
	
	@GET
	public String echo();
	
	@POST
	@Path("/newuser")
	public String addUser(String body);
	
	@GET
	@Path("/{action}/{idUser}")
	public String get(@PathParam("action")String action, @PathParam("idUser")int idUser);
	
	@POST
	@Path("/{action}/{idUser}")
	public void add(String body, @PathParam("action")String action, @PathParam("idUser")int idUser);
	
}
