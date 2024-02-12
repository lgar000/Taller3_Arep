package edu.escuelaing.arep.ASE.app.MySpark;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MySpark {
    public static Map<String, Response> cache = new HashMap<>();

    public static void get(final String path, final Route route) {
        Request request = new Request();
        Response response = new Response();
        String s = route.handle(request, response);
        response.setBody(s);
        response.setPath(path);
        cache.put(path, response);
    }


    public static void setCache(String path) {
        Response response = new Response();
        byte[] file;
        String type;
        try{
            file = Files.readAllBytes(Paths.get("target/classes/public" + path));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        type = path.split("\\.")[1];
        String s = new String(file);
        response.setBody(s);
        if(Objects.equals(type, "js")){
            type = "javascript";
        }
        response.setType("text/" + type);
        cache.put(path, response);
    }

    public static String post(String path, String query){
        Response response = new Response();
        String key = query.split("=")[0];
        String value = query.split("=")[1];
        String s = "{" + key + ":" + value + "}";
        response.setBody(s);
        response.setType("application/json");
        cache.put(path, response);
        return response.getResponse();
    }
}
