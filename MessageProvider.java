package com.app.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/msg")
public class MessageProvider {
	@Path("/show")
	@GET
	public String showMsg()
	{
		return "Welcome to ReST!";
	}

}
