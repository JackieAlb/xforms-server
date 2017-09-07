package com.primeton.xforms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Form
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-06T21:06:45.082+08:00")

public class Form   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tempalteId")
  private String tempalteId = null;

  @JsonProperty("value")
  private String value = null;

  public Form id(String id) {
    this.id = id;
    return this;
  }

   /**
   * null
   * @return id
  **/
  @ApiModelProperty(value = "null")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Form tempalteId(String tempalteId) {
    this.tempalteId = tempalteId;
    return this;
  }

   /**
   * null
   * @return tempalteId
  **/
  @ApiModelProperty(value = "null")


  public String getTempalteId() {
    return tempalteId;
  }

  public void setTempalteId(String tempalteId) {
    this.tempalteId = tempalteId;
  }

  public Form value(String value) {
    this.value = value;
    return this;
  }

   /**
   * null
   * @return value
  **/
  @ApiModelProperty(value = "null")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form form = (Form) o;
    return Objects.equals(this.id, form.id) &&
        Objects.equals(this.tempalteId, form.tempalteId) &&
        Objects.equals(this.value, form.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tempalteId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tempalteId: ").append(toIndentedString(tempalteId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

