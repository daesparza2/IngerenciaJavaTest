# IngerenciaJavaTest
# Descripcion del ejercicio
La aplicación es un cliente REST que apunta a una API pública.
![image](https://user-images.githubusercontent.com/65741905/150238204-eda06078-12cc-4727-ad08-25a382996620.png)
Componente Backend

La aplicación Backend debe conectarse a esta API que muestra recientemente artículos publicados sobre Java en Hacker News:


●	Url API externa: http://hn.algolia.com/api/v1/search_by_date?query=java


La url externa debe ser administrada a través de anotaciones (lectura de archivo properties).
La aplicación del servidor debe definir un endpoint REST que será probado con POSTMAN.

# Instalacion y Ejecucion 

El ejercicio fue desarrollado con java 8 y el IDE eclipse 
Clone este repositorio e importe el proyecto en su IDE eclipse par au compilacion

# Estructura
El codigo esta organizado con un rest controller y una capa de servicio la cual se encarga de consumir el api, este servicio es inyectado en el controlador el cual devuelve los datos obtenidos desde el api.
