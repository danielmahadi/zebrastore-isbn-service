package com.zebrastore;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@ApplicationPath("/")
@OpenAPIDefinition(
  info = @Info(
    title = "ISBN Microservice",
    description = "This microservice generates ISBN numbers",
    version = "1.0",
    contact = @Contact(
      name = "@danielmahadi",
      url = "https://www.twitter.com/danielmahadi"
    )
  )
)
public class IsbnApplication extends Application {

}
