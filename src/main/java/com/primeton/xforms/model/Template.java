package com.primeton.xforms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Template
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-06T21:06:45.082+08:00")

public class Template   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("content")
  private String content = null;

  public Template id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 表单ID
   * @return id
  **/
  @ApiModelProperty(value = "表单ID")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Template version(String version) {
    this.version = version;
    return this;
  }

   /**
   * null
   * @return version
  **/
  @ApiModelProperty(value = "null")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Template content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 表单模板的schema，实际存储为json格式的字符串
   * @return content
  **/
  @ApiModelProperty(value = "表单模板的schema，实际存储为json格式的字符串")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.id, template.id) &&
        Objects.equals(this.version, template.version) &&
        Objects.equals(this.content, template.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

