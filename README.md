
# Conversor de Monedas - Desafío Alura
Este proyecto es una aplicación de consola desarrollada en Java como parte del desafío de programación de Alura Latam. La aplicación permite al usuario realizar conversiones de divisas en tiempo real consumiendo datos desde una API externa.

# Tecnologías utilizadas
- Java: Lenguaje de programación principal.

- IntelliJ IDEA: IDE de desarrollo.

- Gson: Librería de Google para la serialización y deserialización de JSON.

- HttpClient: Clase nativa de Java para realizar las peticiones HTTP.

## Estructura del proyecto
- Main.java: Gestiona el flujo del menú y la interacción con el usuario.

- Consulta.java: Maneja la conexión con la API mediante HttpClient.

- Moneda.java: Un record que modela los datos recibidos de la API.

## Instalación y uso  

1. Clonar este repositorio en tu equipo:  
   ```bash
   git clone https://github.com/DanLest/ConversorDeMonedas.git


2. Configurar la API Key:

- Regístrate en ExchangeRate-API para obtener tu llave gratuita.

- En tu archivo Consulta.java, reemplaza "TU_API_KEY_AQUI" por tu llave real.

3. Compilar y ejecutar:

- Abre el proyecto en IntelliJ IDEA.

- Asegúrate de que la librería gson-2.11.0.jar esté agregada como dependencia en tu carpeta lib.

- Ejecuta la clase Main.java.