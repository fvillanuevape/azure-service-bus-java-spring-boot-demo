# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.7/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.7/maven-plugin/reference/html/#build-image)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.7/reference/htmlsingle/#production-ready)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.7/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.7/reference/htmlsingle/#boot-features-developing-web-applications)
* [Validation](https://docs.spring.io/spring-boot/docs/2.6.7/reference/htmlsingle/#boot-features-validation)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)


### Terraform - Azure Cloud


En la siguientes lineas se indica para crear el entorno de service bus mediante Terraform:
* Requisitos
  * Tener instalado Terraform
  * Tener insalado Azure CLI
  * Una suscripción gratuita o de pago de azure
* Crear el entorno:
  * Para crear el entorno, ubicarse en el directorio terraform y ejecutar los siguiente comandos:
    1. Inicializar el directorio terraform mediante ``terraform init``
    2. Crear el entorno mediante el siguiente comando ``terraform apply``
    3. Finalmente ingresar a Azure Portal y validar que los recursos estén creados

