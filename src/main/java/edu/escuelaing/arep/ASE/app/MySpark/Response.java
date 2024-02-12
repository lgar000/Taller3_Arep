package edu.escuelaing.arep.ASE.app.MySpark;


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

    public void assignFileExtension(String file) {
        String extension = file.split("\\.")[1];
        if (extension.equalsIgnoreCase("html")) {
            type = "text/html";
        }else if (extension.equalsIgnoreCase("js")) {
            type = "application/javascript";
        } else if (extension.equalsIgnoreCase("css")) {
            type = "text/css";
        } else if (extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("jpg")) {
            type = "image/png";
        }
    }

}
