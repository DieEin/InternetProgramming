package bg.elsys.ip.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/animals")
public class AnimalResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAnimals() {
		
		System.out.println("get animals called");
		AnimalService animalService = AnimalService.getInstance();
		
		return Response.ok(animalService.getAnimals()).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAnimal(Animal animal) {
		AnimalService.getInstance().addAnimal(animal);

		return Response.ok(animal).status(Status.CREATED).build();
	}
}
