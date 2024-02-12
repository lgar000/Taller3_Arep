package edu.escuelaing.arep.ASE.app;

import edu.escuelaing.arep.ASE.app.MySpark.MySpark;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, URISyntaxException {
        HttpServer server = HttpServer.getInstance();
        MySpark.get("/arep", (request, response) -> {
            response.setType("text/htm");
            return response.getResponse();
        });
        server.run(args);

    }

}
