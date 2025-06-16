package com.zenith.bitbite.api.domain;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ID de usuario
 */

@Schema(name = "UserId", description = "ID de usuario")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-16T20:44:14.459347600+02:00[Europe/Madrid]")
public class UserId implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("userId")
  private Long userId;

  public UserId userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * ID del usuario
   * @return userId
  */
  
  @Schema(name = "userId", example = "234423", description = "ID del usuario", required = false)
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserId userId = (UserId) o;
    return Objects.equals(this.userId, userId.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserId {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

