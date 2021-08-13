#Econotravel App

[Descripción completa del proyecto en Simplonline](https://simplonline.co/briefs/c051e298-4819-4197-a53c-c5ea55a53bab)

![icono-econotravel](doc/images/logo.png)

Esta plantilla incluye parte del Backend para desarrollar este proyecto y las herramientas para compilar el frontend tal y como se ha explicado en clase.

### Estructura

- La carpeta `src` contiene el backend (Java, Spring Boot)
- La carpeta `web-client` contiene el frontend, que se compila usando `npm` y `webpack`


### Desarrollo

## Compilación del frontend

Para generar el bundle del frontend, podemos hacerlo de dos maneras: 

- Desde la carpeta `web-client`: 

```bash
npm install 
npm run build
```

- Desde el proyecto de Gradle, usando la tarea `buildFrontend` de Gradle

```bash
./gradlew buildFrontend
```

**Copiado de archivos**: esta tarea no sólo compila el "bundle" del frontend, sino que además
copia los archivos a la carpeta `src/main/resources/static`, para que el backend pueda servirlos.


## Compilación del backend

Usando la tarea `build` de Gradle.


## Desarrollo local del frontend

Si no queremos tener que lanzar el servidor cada vez que queremos visualizar un cambio en 
el frontend, es posible usar **webpack dev server**, haciendo: 

```
npm run develop
```

### H2 Database

Una vez arrancada la aplicación, puede accederse al panel de configuración
de H2 disponible en `/h2-ui`

![panel de h2](doc/images/h2-ui.png)


