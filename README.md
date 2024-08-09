# solvaTaskApi
Technical requirement SOLVA

# Launching the service
1. Установите нужные программы, библиотеки, также зависимости.
2. установите Postgresql и создайте базу данных "solvaDB".
3.   spring.application.name=TaskApi
    server.port=3000
    spring.datasource.url=jdbc:postgresql://localhost:5432/solvaDB
    spring.datasource.username=postgres
    spring.datasource.password=3220
    spring.jpa.hibernate.ddl-auto=none
    spring.jpa.show-sql=true
    spring.liquibase.change-log=classpath:/db/changelog/db.changelog-master.xml
    feign.service.url=https://www.alphavantage.co/
4. API микросервиса: http://localhost:3000/client.

# Dependencies
1. Spring Boot
2. Lombok
3. MapStruct
4. PostgreSQL JDBC Driver
5. Spring Cloud OpenFeign
6. Liquibase
7. JUnit

# Endpoint
1. API Client
   localhost:3000/client/getLimits - получаем все лимиты.
   localhost:3000/client/newLimit - задаем новый лимит.
2. API Exchange
   localhost:3000/exchange/daily-rate - Отправляем запрос на внешний API (alphavantage) для получение курс валют и сохранить в нашем базе данных.

