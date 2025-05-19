Instalacion del proyecto!
- *Paso1:* **Copia el url del repositorio y crea una carpeta en tu escritorio.**
- *Paso2:* **Abre VS CODE, te diriges a la carpeta que creaste y la abres.**
- *Paso3:* **Precionas Control + J para abrir la terminal**
- *Paso4:* **En la terminal copias lo siguiente (git clone https://github.com/Valentiwew/jojos)**
- *Paso5:* **Se te creara un clon del repositorio**

Ahora necesitas 2 Aplicaciones que son necesarias para correr la API.
- PostMan - Es un programa para crear y probar paginas web de forma Local
- Laragon - Es una herramienta para probar si las conexiones de tu sistema (API) funcionan bien.

Una vez teniendo las apps.
- Abrimos Laragon (No te preocupes si te pide una key, puedes usarlo de todas formas.)
- Le damos al boton de abajo que dice "Iniciar Todo", esto nos ejecutara lo siguiente: Apache, MYSQL, MAILPIT.
- Luego de hacer eso, se iniciara.
- Ahora le damos "Base de Datos", Se nos abrira una ventanita que dice "HeidiSQL" dejamos todo como esta y le damos donde dice "Abrir"
- Ahora nos vamos arriba a la izquierda donde dice "Laragon.MySQL" le damos clic derecho "Crear nuevo" - "Base de Datos" y le ponemos como nombre (db_jojos_vm)
- En el VS CODE ahora ejecutamos el programa, para verificar que si funciona en tu navegador escribe esto (http://localhost:8080/api/v1/Personajes)
- Te deberia arrojar algo como esto []
- Si es así funciona perfecto!

PostMan
- Ahora para hacer que se agregen personajes a la API, usaremos PostMan
- Paso1: Descargamos Postman y iniciamos sesion.
- Paso2: Luego de eso, le damos arribita a la derecha al +, deberia aparecer lo siguiente (GET _______ SEND)
- Paso3: Lo que vamos a hacer es copiar la ruta que seria la siguiente (http://localhost:8080/api/v1/Personajes)
- Paso4: Le damos al boton de "Send", y nos enviara lo mismo que cuando lo probamos en el navegador []
- Paso5: Para agregar la informacion usamos el Post, entoces cambiamos el GET por POST, y antes de darle SEND, tenemos que ir abajito donde dice "BODY" donde podremos escribir la estructura.
- Paso6: Escribiremos algo así y le damos a "SEND"
  {
  "nombre": "Jotaro",
  "edad": 19
  }
- Paso7: Ahora se agrego con exito la info, luego de eso para verificar que si se envio a nuestra base de datos
- Paso8: Nos dirigimos a "HeidiSQL" buscamos (db_jojos_vm) la desplazamos y le damos clic a la tabla de "PersonajesJojos"
- Paso9: Una vez abierto la tabla de "PersonajesJojos" buscamos arribita "Datos" Y le damos clic y al boton de refrescar.
- Paso10: Ya estaria insertado el dato :D

Y eso seria toda mi API de personajes de Jojo's.
