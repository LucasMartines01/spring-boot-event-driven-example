FROM ubuntu:20.04
WORKDIR /app
COPY event-application-example /app/
RUN chmod +x ./event-application-example
EXPOSE 8080
CMD ["./event-application-example"]

