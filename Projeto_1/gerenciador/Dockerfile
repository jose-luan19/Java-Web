# Estágio de compilação (stage de build)
FROM openjdk:11 AS build
WORKDIR /app

# Copie todos os arquivos .java do seu projeto para o contêiner
COPY . /app/

# Compile todos os arquivos .java no diretório atual
RUN javac src/main/java/br/com/alura/gerenciador/servlet/*.java

# Estágio de produção
FROM tomcat:9-jre11-slim
WORKDIR /usr/local/tomcat/webapps

# Copie o resultado da compilação (classe .class e outros recursos) para o Tomcat
COPY --from=build /app /usr/local/tomcat/webapps

EXPOSE 8080
CMD ["catalina.sh", "run"]