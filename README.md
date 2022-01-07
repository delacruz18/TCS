# automationpractice1

 Se crean dos escenarios de pruebas de acuerdo a la funcionalidad.

 1. para todo lo relacionado con la lectura y escritura por consola del archivo, teniendo en cuentas las
 instrucciones dadas para la impresión por consola del mismo.

 2. se realiza la implementación de archivo plano mencionado con anterioridad, para darle uso en la paggina indicada


 

## Getting started

1. importar el proyecto como un proyecto de mavem 


2. en la clase Lecturadatos, en las lineas 32 y 52 se hace referencia a la ruta del archivo plano
C:\Users\User\Downloads\Proyecto TCS\Datos\  esta ruta se encuentra en mi equipo local, por lo cual debe reemplezar esta ruta por la ruta que contennga el archivo en su equipo


3. recomendación   almacenar el proyecto en descargas para facilitar las rutas de los archivos

4. En la clase Questions se configura una ruta para la toma de evidencias en la web 
la cual toma dos capturas una antes de diligenciar el formulario y una posterior a esto.
realizar un proceso similar al punto 2 para que las evidencias se almacenen en su equipo 

5. se realiza un reporte de pruennbas con serenityReport 
por lo cual necesita de la siguiente configuración para ejecutar el proyecto

comandos   clean install serenity:aggregate
perfil  prueba

los comandos estan configurados para limpiar las evidencias posteriores a la ejecución en proceso


