package org.example.cxf.interfaces;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface REST {	
	
	@GET
	public String echo();
	
	@GET
	@Path("/{action}/{idUser}")
	public String get(@PathParam("action")String action, @PathParam("idUser")int idUser);
	
	@POST
	@Path("/add/{}")
	public void add();
	
	@PUT
	@Path("/replace")
	public void replace();
	
	@DELETE
	@Path("/delete")
	public void delete();
	
}
