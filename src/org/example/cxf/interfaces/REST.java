package org.example.cxf.interfaces;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

public interface REST {	
	
	@GET
	public String echo();
	
	@GET
	@Path("/get")
	public String get();
	
	@POST
	@Path("/add")
	public void add();
	
	@PUT
	@Path("/replace")
	public void replace();
	
	@DELETE
	@Path("/delete")
	public void delete();
	
}
