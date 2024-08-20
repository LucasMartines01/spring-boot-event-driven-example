FROM ubuntu:20.04
WORKDIR /app
COPY ./target/event-application-example /app
COPY ./target/*.dll /app/
EXPOSE 8080
CMD [ "./event-application-example" ]
