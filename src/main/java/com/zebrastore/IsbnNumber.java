package com.zebrastore;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.time.Instant;

@Schema(description = "Several ISBN formats")
public class IsbnNumber {
  @Schema(required = true)
  @JsonbProperty("isbn_10")
  public String isbn10;
  @Schema(required = true)
  @JsonbProperty("isbn_13")
  public String isbn13;
  @JsonbTransient
  public Instant generationDate;


  @Override
  public String toString() {
    return "IsbnNumbers{isbn10='%s', isbn13='%s', generationDate=%s}"
      .formatted(isbn10, isbn13, generationDate);
  }
}


