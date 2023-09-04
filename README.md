# Spring/Java: Starter API Code Sample

This Java code sample demonstrates how to build an API server using Spring that is secure by design. This Spring code sample builds the API server using Spring functional controllers.

Visit the ["Spring/Java Code Samples: API Security in Action"](https://developer.auth0.com/resources/code-samples/api/spring) section of the ["Auth0 Developer Resources"](https://developer.auth0.com/resources) to explore how you can secure Spring applications written in Java by implementing endpoint protection and authorization with Auth0.

## Why Use Auth0?

Auth0 is a flexible drop-in solution to add authentication and authorization services to your applications. Your team and organization can avoid the cost, time, and risk that come with building your own solution to authenticate and authorize users. We offer tons of guidance and SDKs for you to get started and [integrate Auth0 into your stack easily](https://developer.auth0.com/resources/code-samples/full-stack).

## Set Up and Run the Spring Project

Create a `.env` file under the root project directory and populate it with the following environment variables:

```bash
PORT=6060
CLIENT_ORIGIN_URL=http://localhost:4040
```

Run the project with the following command:

```sh
./gradlew bootRun
```

It's also possible to start the server using [Spring Tools](https://spring.io/tools) and the IDE of your preference (VSCode, Eclipse, etc.)
