package edu.escuelaing.arep.ASE.app.MySpark;

/**
 * Interfaz que determina como se van manejar las solicitudes en un servidor web.
 *
 */
public interface Route {

    /**
     * Maneja una solicitud HTTP para una ruta y retorna una respuesta.
     *
     * @param request  Objeto que engloba la información de la solicitud.
     * @param response Objeto que se usa para construir y enviar la respuesta.
     * @return La respuesta generada como una cadena.
     */
    String handle(Request request, Response response);
}
