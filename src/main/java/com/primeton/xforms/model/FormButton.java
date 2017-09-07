package com.primeton.xforms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormButton
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-06T21:06:45.082+08:00")

public class FormButton   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("action")
  private String action = null;

  public FormButton id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 按钮ID
   * @return id
  **/
  @ApiModelProperty(value = "按钮ID")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FormButton name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 按钮名称
   * @return name
  **/
  @ApiModelProperty(value = "按钮名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormButton action(String action) {
    this.action = action;
    return this;
  }

   /**
   * 按钮在click时调用的后台Service，参数要求为Json格式
   * @return action
  **/
  @ApiModelProperty(value = "按钮在click时调用的后台Service，参数要求为Json格式")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormButton formButton = (FormButton) o;
    return Objects.equals(this.id, formButton.id) &&
        Objects.equals(this.name, formButton.name) &&
        Objects.equals(this.action, formButton.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormButton {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

