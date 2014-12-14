package com.example.app.resource;

import com.example.app.ExampleConfig;
import lombok.Data;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

/**
 */
@Path("/fun")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FunResource {

	private final ExampleConfig cfg;
	private final HttpHeaders headers;

	@Inject
	public FunResource(ExampleConfig cfg, HttpHeaders headers) {
		this.cfg = cfg;
		this.headers = headers;
	}

	@Data
	public static class Stuff {
		private final String foo;
	}

	@GET
	public Stuff stuff() {
		return new Stuff(cfg.getFoo());
	}

	@GET
	@Path("/headers")
	public HttpHeaders headers() {
		return headers;
	}
}
