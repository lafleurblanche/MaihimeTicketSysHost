FROM openjdk:17
ARG JAR_FILE=target/*jar
COPY ${JAR_FILE} MaihimeTicketSysHost.jar
ENTRYPOINT ["java","-jar","/MaihimeTicketSysHost.jar"]
