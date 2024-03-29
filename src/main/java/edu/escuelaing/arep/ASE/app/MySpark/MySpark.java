package edu.escuelaing.arep.ASE.app.MySpark;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MySpark {
    public static Map<String, Response> cache = new HashMap<>();


    /**
     * Maneja solicitudes HTTP GET.
     * @param path ruta
     * @param route Objeto que implementa la interfaz 'Route', proporcionando la lógica de manejo de la ruta.
     */
    public static void get(String path, Route route) {
        Request request = new Request();
        Response response = new Response();
        String body = route.handle(request, response);
        response.setBody(body);
        response.setPath(path);
        cache.put(path, response);
    }

    /**
     *Lee un archivo desde la ruta proporcionada, configura una respuesta y la almacena en caché.
     * @param path ruta del archivo
     */
    public static void setCache(String path)  {
        String body="";
        Response response = new Response();
        byte[] file=new byte[0];
        String type;
        try{
            file = Files.readAllBytes(Paths.get("target/classes/public" + path));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        if(path.endsWith("js") || path.endsWith("html") || path.endsWith("css")){
            type = path.split("\\.")[1];
            body = new String(file);
            if(Objects.equals(type, "js")){
                type = "javascript";
            }
            response.setType("text/" + type);
        } else if (path.endsWith("png")) {
            body= Base64.getEncoder().encodeToString(file);
            response.setType("image/png");
        }
        response.setBody(body);
        cache.put(path, response);
    }

    /**
     *Maneja solicitudes HTTP POST, creando una respuesta JSON que luego almacena en caché.
     * @param path ruta
     * @param query
     * @return La respuesta generada en formato JSON
     */
    public static String post(String path, String query){
        Response response = new Response();
        String key = query.split("=")[0];
        String value = query.split("=")[1];
        String body = "{" + key + ":" + value + "}";
        response.setBody(body);
        response.setType("application/json");
        cache.put(path, response);
        return response.getResponse();
    }
}
