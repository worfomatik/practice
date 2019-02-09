package com.crunchify.restjersey;
 
/**
 * @author Crunchify, LLC
 * Description: This program converts unit from Fahrenheit to Centigrade.
 * 
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
 
@Path("/postservice")
public class PostService {
 
	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		
		Post post = new Post("Really bad notes for you", "Awful Class"
								, "BadStudent", "See? this is a bad note", 2019, 2, 24);
		
		jsonObject.put("Title", post.getTitle());
		jsonObject.put("Course", post.getCourse());
		jsonObject.put("User", post.getUser());
		jsonObject.put("Note", post.getNote());
		jsonObject.put("ClassDate", post.getClassDate().toString());
		jsonObject.put("LastModified", post.getPostDate().toString());
 
		String result = "@Produces(\"application/json\") Output: \n\nPost Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
 
	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius = (f - 32) * 5 / 9;
		jsonObject.put("F Value", f);
		jsonObject.put("C Value", celsius);
 
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}