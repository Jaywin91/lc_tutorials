package ie.cit.caf.lc_tutorial2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) {

		String artistFile = args[0];
	//	String artworkFile = args[1];

		try {

			//argument1 (args0) linked and data retrieved from source json file.
			Artist artist = new ObjectMapper().readValue(new File(artistFile), Artist.class);
			System.out.printf("Processing Artist file: %s", artistFile);
			System.out.println("\n" + artist.toString());
			
			//argument2 (args1) linked and data retrieved from source json file.	
		//	Artwork artwork = new ObjectMapper().readValue(new File(artworkFile), Artwork.class);
		//	System.out.printf("\nProcessing Artwork file: %s", artworkFile);
		//	System.out.println("\n" + artwork.toString());
			
		} 
		
		  catch (JsonParseException e) {
			System.out.println("Error parsing the file.");
		} catch (JsonMappingException e) {
			System.out.println("Error mapping to Java object.");
		} catch (IOException e) {
			System.out.println("Unknown I/O error.");
		}

	}

}