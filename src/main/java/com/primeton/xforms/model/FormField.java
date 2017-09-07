package com.primeton.xforms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.primeton.xforms.model.FormButton;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-06T21:06:45.082+08:00")

public class FormField   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("fieldType")
  private String fieldType = null;

  @JsonProperty("fieldLength")
  private Integer fieldLength = null;

  /**
   * 显示方式
   */
  public enum DisplayClassEnum {
    INPUT("input"),
    
    DATEPICKER("datePicker"),
    
    INPUTNUMBER("inputNumber"),
    
    TIMEPICKER("timePicker"),
    
    TEXTAREA("textarea"),
    
    RICHTEXTAREA("richTextarea"),
    
    SINGLESELECT("singleSelect"),
    
    MULTISELECT("multiSelect"),
    
    RADIO("radio"),
    
    CHECKBOX("checkbox"),
    
    SINGLESELECTDIALOG("singleSelectDialog"),
    
    MULTISELECTDIALOG("multiSelectDialog"),
    
    SWITCH("switch"),
    
    TRANSFER("transfer"),
    
    UPLOAD("upload"),
    
    TABLE("table");

    private String value;

    DisplayClassEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DisplayClassEnum fromValue(String text) {
      for (DisplayClassEnum b : DisplayClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("displayClass")
  private DisplayClassEnum displayClass = DisplayClassEnum.INPUT;

  @JsonProperty("dataSource")
  private String dataSource = null;

  @JsonProperty("relations")
  private String relations = null;

  /**
   * 授权
   */
  public enum AuthorizationEnum {
    READONLY("readonly"),
    
    EDIT("edit");

    private String value;

    AuthorizationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AuthorizationEnum fromValue(String text) {
      for (AuthorizationEnum b : AuthorizationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("authorization")
  private AuthorizationEnum authorization = null;

  @JsonProperty("buttons")
  private List<FormButton> buttons = null;

  public FormField id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 字段标识
   * @return id
  **/
  @ApiModelProperty(value = "字段标识")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FormField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 字段名称
   * @return name
  **/
  @ApiModelProperty(value = "字段名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormField fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * 字段类型
   * @return fieldType
  **/
  @ApiModelProperty(value = "字段类型")


  public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public FormField fieldLength(Integer fieldLength) {
    this.fieldLength = fieldLength;
    return this;
  }

   /**
   * 字段长度
   * @return fieldLength
  **/
  @ApiModelProperty(value = "字段长度")


  public Integer getFieldLength() {
    return fieldLength;
  }

  public void setFieldLength(Integer fieldLength) {
    this.fieldLength = fieldLength;
  }

  public FormField displayClass(DisplayClassEnum displayClass) {
    this.displayClass = displayClass;
    return this;
  }

   /**
   * 显示方式
   * @return displayClass
  **/
  @ApiModelProperty(value = "显示方式")


  public DisplayClassEnum getDisplayClass() {
    return displayClass;
  }

  public void setDisplayClass(DisplayClassEnum displayClass) {
    this.displayClass = displayClass;
  }

  public FormField dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * 数据来源
   * @return dataSource
  **/
  @ApiModelProperty(value = "数据来源")


  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public FormField relations(String relations) {
    this.relations = relations;
    return this;
  }

   /**
   * 输入前后关系
   * @return relations
  **/
  @ApiModelProperty(value = "输入前后关系")


  public String getRelations() {
    return relations;
  }

  public void setRelations(String relations) {
    this.relations = relations;
  }

  public FormField authorization(AuthorizationEnum authorization) {
    this.authorization = authorization;
    return this;
  }

   /**
   * 授权
   * @return authorization
  **/
  @ApiModelProperty(value = "授权")


  public AuthorizationEnum getAuthorization() {
    return authorization;
  }

  public void setAuthorization(AuthorizationEnum authorization) {
    this.authorization = authorization;
  }

  public FormField buttons(List<FormButton> buttons) {
    this.buttons = buttons;
    return this;
  }

  public FormField addButtonsItem(FormButton buttonsItem) {
    if (this.buttons == null) {
      this.buttons = new ArrayList<FormButton>();
    }
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * 表单中的功能按钮
   * @return buttons
  **/
  @ApiModelProperty(value = "表单中的功能按钮")

  @Valid

  public List<FormButton> getButtons() {
    return buttons;
  }

  public void setButtons(List<FormButton> buttons) {
    this.buttons = buttons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormField formField = (FormField) o;
    return Objects.equals(this.id, formField.id) &&
        Objects.equals(this.name, formField.name) &&
        Objects.equals(this.fieldType, formField.fieldType) &&
        Objects.equals(this.fieldLength, formField.fieldLength) &&
        Objects.equals(this.displayClass, formField.displayClass) &&
        Objects.equals(this.dataSource, formField.dataSource) &&
        Objects.equals(this.relations, formField.relations) &&
        Objects.equals(this.authorization, formField.authorization) &&
        Objects.equals(this.buttons, formField.buttons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fieldType, fieldLength, displayClass, dataSource, relations, authorization, buttons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormField {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    fieldLength: ").append(toIndentedString(fieldLength)).append("\n");
    sb.append("    displayClass: ").append(toIndentedString(displayClass)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
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

