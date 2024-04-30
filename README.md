<!-- Logo proyecto -->

<img src="./images/Enviar emails.png" width="100%">



# 📧Messaging Service
***Este proyecto es una aplicación Java que permite enviar correos electrónicos utilizando el servidor SMTP de Gmail. Está implementado como una aplicación Spring Boot con los siguientes componentes clave:***

#### EmailConfig: 
Esta clase de configuración establece las propiedades necesarias para conectarse al servidor SMTP de Gmail y enviar correos electrónicos.
#### EmailController: 
Esta clase de controlador expone un endpoint REST para enviar correos electrónicos. Utiliza la interfaz IEmailService para delegar la funcionalidad real de envío de correos.
#### EmailDTO: 
Esta es una simple clase DTO (Data Transfer Object) que representa la solicitud de correo electrónico, incluyendo la dirección de correo electrónico del destinatario, el asunto del correo y el mensaje.
#### IEmailService: 
Esta es una interfaz que define el contrato para el servicio de correo electrónico. La clase EmailServiceImpl implementa esta interfaz para manejar la lógica de envío de correos.
#### EmailServiceImpl: 
Esta clase implementa la interfaz IEmailService y es responsable de enviar correos utilizando el servidor SMTP de Gmail.
#### email.properties:
Este archivo de configuración es donde debes ingresar la dirección de correo electrónico de Gmail desde la cual se enviarán los correos electrónicos, así como la contraseña de aplicación generada en la configuración de tu cuenta de Gmail. La contraseña de aplicación es necesaria para permitir que la aplicación acceda a tu cuenta de Gmail de forma segura sin necesidad de utilizar tu contraseña principal. Debes generar una contraseña de aplicación en la sección de seguridad de la configuración de tu cuenta de Gmail. **Es muy importante que realices esta configuración de lo contrario no va a funcionar el servicio.**
#### Template HTML
Ya que este servicio implementa Thymeleaf ofrece una gran oportunidad para mejorar tus correos electrónicos enviándolos como plantillas HTML con CSS incrustado. Esto no solo les da un aspecto más profesional, sino que también permite una presentación visual atractiva sin la necesidad de enviar simples textos planos. ***He dejado una plantilla modelo puedes editarla o cambiarla a tu gusto, recuerda importar thymeleaf a tu plantilla y hacer el llamaado al message de la siguiente manera: th:text="${mensaje} como atributo de una etiqueta p.***

## 🛠️Tecnologías Usadas

<div style="display: flex; justify-content: space-around;">
  <img src="https://img.shields.io/badge/Java-%2523ED8B00.svg?style=for-the-badge&logo=oracle&logoColor=red&color=white" alt="Java" width="120" height="40">
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" alt="Spring" width="120" height="40">
  <img src="https://img.shields.io/static/v1?style=for-the-badge&message=JavaMail&color=red&logo=Oracle&logoColor=white&label=" alt="JavaMail" width="120" height="40">
  <img src="https://img.shields.io/static/v1?style=for-the-badge&message=Thymeleaf&color=005F0F&logo=Thymeleaf&logoColor=white&label=" alt="Thymeleaf" width="120" height="40">
  <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white" alt="Gradle" width="120" height="40">
  <img src="https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens" alt="JWT" width="120" height="40">
  <img src="https://img.shields.io/badge/Docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" width="120" height="40">
</div>

## ✒️Autor 

* [Juan Martín Perez](https://tinchogithub.github.io/Martin-Perez/)


<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=5cb85c&height=120&section=footer"/>