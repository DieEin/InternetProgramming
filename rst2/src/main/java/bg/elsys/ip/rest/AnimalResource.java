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
@Api("animals")
public class AnimalResource {
	
	@GET
	@Path("/getanimals")
	@ApiOperation(value = "get all animals", response = Animal.class, responseContainer = "List")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAnimals() {
		
		System.out.println("get animals called");
		AnimalService animalService = AnimalService.getInstance();
		
		return Response.ok(animalService.getAnimals()).build();
	}
	
	@POST
	@Path("/createanimal")
	@ApiOperation(value = "create an animal", response = Animal.class)
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createAnimal(Animal animal) {
		AnimalService.getInstance().addAnimal(animal);

		return Response.ok(animal).status(Status.CREATED).build();
	}
}
