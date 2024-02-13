# MICROFRAMEWORKS WEB

Un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor debe leer los archivos del disco local y retornar todos los archivos solicitados, incluyendo páginas html, archivos java script, css e imágenes. Construya una aplicación web con  javascript, css, e imágenes para probar su servidor. Incluya en la aplicación la comunicación asíncrona con unos servicios REST en el backend.

### Prerrequisitos

- Java
- Maven
- Git


### Instalación

Para hacer uso del proyecto clone el repositorio usando el siguiente comando

```
git clone https://github.com/lgar000/Taller3_Arep.git
```

Ubiquese en la carpeta en la cual clono el repositorio. A continuación
acceda a la carpeta principal del proyecto mediante el siguiente comando

```
cd Taller3_Arep
```

Para empaquetar el proyecto ejecute

```
mvn package
```



## Pruebas en diferentes sistemas operativos

### Windows

Para probar el funcionamiento, una vez tenga descargado el proyecto y ejecutado correctamente proceda a ingresar a un navergador, donde debera ingresar http://localhost:35000/archivoSolicitado.extension, donde las extensiones pueden ser (js, html, css). Los archivos a solicitar se encuentra dentro del proyecto.

### Prueba html

![html](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaHtml.png)

### Prueba js

![js](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaJs.png)

### Prueba css

![css](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaCss.png)


### Debian GNU/Linux

Para realizar la prueba en otro sistema operativo, se hizó uso de la maquina virtual kali linux. Se cambio el puerto a 17001, ya que el 35000 no se encontraba disponible. Para probar el funcionamiento en le navegador debera ingresar http://localhost:17001/archivoSolicitado.extension, donde las extensiones pueden ser (js, html, css). Los archivos a solicitar se encuentra dentro del proyecto.

### Prueba html

![htmlKaliLinux](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaHtmlKaliLinux.png)

### Prueba js

![jsKaliLinux](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaJsKaliLinux.png)

### Prueba css

![cssKaliLinux](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaCssKaliLinux.png)

## Ejemplo

Vamos a simular el funcionamiento del servicio Get, para lo que hacemos uso del método get que se encuentra en MySpark y establecemos el tipo de contenido de la respuesta como "application/json".

![get](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/ejemplo.png)

 Donde el recurso prueba devuelve la cadena JSON {"prueba": "Hola"}.
 
![salidaGet](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/respuestaEjemploGet.png)

Para el post vamos a hacer uso de Postman, donde enviamos un endpoint a http://localhost:35000?keyPrueba=valuePrueba, en el cual va la llave y el valor. Aqué vemos que nos envia el código 200 ok.

![salidaPost](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/ejemploPost.png)

## Diseño

Se busca simular un framework web co un funcionamiento parecido a Spark. Este maneja solicitudes GET y POST. Para esto se creo una interfaz Root con un método “handle” que toma una solicitud y una respuesta, y devuelve una cadena. Esta interfaz permite que defina sus propios manejadores de rutas al implementarla. En la clase MySpark, se encuentran definidos los metodos GET, POST y setCache. En este se cuenta con un HashMap que es el que almacena las respuestas asociadas con la ruta. El método get recibe una ruta y un objeto Route.Crea una solicitud (Request) y una respuesta (Response) e invoca el método handle de la interfaz Route para procesar la solicitud y obtiene la respuesta como una cadena (String). Por otra parte, el método Post recibe una ruta y una cadena de consulta, crea una respuesta (Response) y extrae el par clave-valor de la cadena de consulta y construye una cadena JSON simple, donde el tipo de contenido es"application/json".
El servidor web es el que valida sí la petición es post o get y en consecuencia usa los métodos de MySpark. Este servidor está diseñado bajo el patro singleton, donde solamente existe una instancia del servidor.
El cliente es el navegador que hace solicitudes http de tipo Get, mediante estas se solicitan archivos estáticos que pueden ser  HTML, JavaScript, CSS. Estas solicitudes son respondidas por un servidor, que escucha el puerto 35000 y gestiona las peticiones para mostrar el contenido de los archivos.


## Construido Con

* [Java 11](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html) - Lenguaje de programación y desarrollo
* [Html](https://developer.mozilla.org/es/docs/Web/HTML) - Lenguaje de marcado para la elaboración de páginas web
* [JavaScript](https://developer.mozilla.org/es/docs/Web/CSS) -JavaScript es un lenguaje de programación interpretado
* [Maven](https://maven.apache.org/) - Gestión de dependencias
* [Intellij](https://www.jetbrains.com/es-es/idea/) - Entorno de desarrollo integrado para el desarrollo de programas informáticos
* [Git](https://rometools.github.io/rome/) - Sistema de control de versiones distribuido


## Autor

* **Laura García** - [lgar000](https://github.com/lgar000)

## Licencia

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
