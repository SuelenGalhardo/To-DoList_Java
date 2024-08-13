# To-DoList_Java
API for Task control


Documentation 🛠️: 
https://efficient-sloth-d85.notion.site/Curso-de-Java-2408d11bfc3447e980fe9460b6293976
- Java-https://efficient-sloth-d85.notion.site/Java-17-cb8f150e72a249fd9ec30b8da30f27af
- Maven: https://efficient-sloth-d85.notion.site/Maven-d11762457beb4cf7a0ecc83e22f99991
  Maven Repository: https://mvnrepository.com/- 
- Rest Client: https://efficient-sloth-d85.notion.site/Rest-Client-da993bf3e73c4a77b1357b45cdf17bda

🛠️
- SpringBoot:
- https://start.spring.io/
- Spring Boot DevTools dependency
- Spring Web Application
  
Extensions for VS code: 

-**vscjava.vscode-java-pack**
    - vscjava.vscode-java-debug
    - vscjava.vscode-java-test
    - vscjava.vscode-java-dependency
    - vscjava.vscode-maven
    - redhat.java
- **vscjava.vscode-spring-initializr**
- **vmware.vscode-spring-boot**
- **vscjava.vscode-spring-boot-dashboard**
Librerias:
- Lombok Annotations Support for VS Code: https://projectlombok.org/
Lombok es una biblioteca de código abierto para Java que elimina la necesidad de escribir código repetitivo y tedioso
-Spring Data JPA -  https://spring.io/projects/spring-data-jpa, no permite hacer la comunicacion con el banco de datos y maniplar los datos- ORM-Mapeamento de objetos relacional

base de datos:
- H2 DATABASE engine //https://www.h2database.com/html/main.html 
http://localhost:8080/h2-console






Port:
netstat -ano | findstr :8080
detener proceso: taskkill /PID <PID> /F
sudo kill -9 <PID>
Stop-Process -Id 11028 -Force


Commands mvn :

mvn clean install
mvn -v
mvn --version
mvn validate
mvn compile
mvn spring-boot:run
mvn clean
mvn clean package
mvn clean install
mvn archetype:generate
mvn archetype:generate
mvn clean install -P<profile-name>
mvn plugin:goal
mvn test
mvn install
mvn help
mvn exec:java -Dexec.mainClass="com.example.Main"
mvn site
mvn deploy


notas:/*
     * Metodos de HTTP para el servidor
     * +GET - Buscar una información dentro de la base de datos/aplicacion
     * +post - adicionar un datos/aplicacion
     * +PUT- alterar una información o la base de datos/aplicacion/objeto , mas de
     * una informacion
     * +DELETE - remove un datos/aplicacion
     * +PATCH - alterar solamente una parte información dato/aplicacion , somente
     * una parte información
     */

    // Metodo (funcionalidad) de una clase

modificadores de acceso en java: 
public
private
protected   
default

tipos de datos: 
String(text )
Interger(int) numeros interos
double (double) numeros 0.000
Float(float) numeros 0.000
date (Date)
void (void) no hay returnt

informaciones del usuario se encuenta dentro del Body @RequestBody

getters 
private: setters - atibuir metodo privado de una clase 

setUsername para adicionar valor
getUsername para buscar valor


ORM (Object-Relational Mapping) users table 