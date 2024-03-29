package edu.escuelaing.arep.ASE.app.MySpark;

/**
 * Clase que representa una respuesta HTTP, que cuenta con información como la ruta,
 *  el tipo de contenido y el cuerpo de la respuesta.
 */

public class Response {

    private String path;

    private String type;
    private String body = null;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHeader(){
        return "HTTP/1.1 200 \r\n" +
                "Content-Type:" +type+ "\r\n" +
                "\r\n";
    }

    public String getResponse() {
        return getHeader() + getBody();
    }



}
