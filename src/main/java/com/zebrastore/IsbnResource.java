package com.zebrastore;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.util.Random;

@Path("/api/isbn")
@Tag(name = "ISBN Rest endpoint", description = "Provide ISBN related operations")
public class IsbnResource {
  @Inject
  Logger logger;

  @GET
  @Produces({MediaType.APPLICATION_JSON})
  @Operation(summary = "Generates book numbers", description = "ISBN 10 and ISBN 13 numbers")
  public IsbnNumber generateIsBnNumber() {
    IsbnNumber isbnNumbers = new IsbnNumber();
    isbnNumbers.isbn13 = "13-%d".formatted(new Random().nextInt(100_000_000));
    isbnNumbers.isbn10 = "10-%d".formatted(new Random().nextInt(100_000));
    isbnNumbers.generationDate = Instant.now();
    logger.info("Numbers generated " + isbnNumbers);
    return isbnNumbers;
  }
}


