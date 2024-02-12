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

Para realizar la prueba en otro sistema operativo, se hizó uso de la maquina virtual kali linux. Se cambio el puerto a 17001, ya que el 35000 no se encontraba libre. Para probar el funcionamiento en le navegador debera ingresar http://localhost:17001/archivoSolicitado.extension, donde las extensiones pueden ser (js, html, css). Los archivos a solicitar se encuentra dentro del proyecto.

### Prueba html

![htmlKaliLinux](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaHtmlKaliLinux.png)

### Prueba js

![jsKaliLinux](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaJsKaliLinux.png)

### Prueba css

![cssKaliLinux](https://github.com/lgar000/Taller3_Arep/blob/main/Imagenes/pruebaCssKaliLinux.png)

## Diseño

Se busca simular un framework web co un funcionamiento parecido a Spark. Este maneja solicitudes GET y POST. Para esto se creo una interfaz Root con un método “handle” que toma una solicitud y una respuesta, y devuelve una cadena. Esta interfaz permite que defina sus propios manejadores de rutas al implementarla. En la clase MySpark, se encuentran definidos los metodos GET y POST.
El cliente es el navegador que hace solicitudes http de tipo Get, mediante estas se solicitan archivos estáticos que pueden ser  HTML, JavaScript, CSS. Estas solicitudes son respondidas por un servidor, que escucha el puerto 35000 y gestiona las peticiones para mostrar el contenido de los archivos.

## Ejemplo


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
