/*
 * Wavefront REST API
 * <p>The Wavefront REST API enables you to interact with Wavefront servers using standard REST API tools. You can use the REST API to automate commonly executed operations such as automatically tagging sources.</p><p>When you make REST API calls outside the Wavefront REST API documentation you must add the header \"Authorization: Bearer &lt;&lt;API-TOKEN&gt;&gt;\" to your HTTP requests.</p>
 *
 * OpenAPI spec version: v2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wavefront.rest.models;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A message for display to a particular user, all users within a customer, or all users on a cluster
 */
@ApiModel(description = "A message for display to a particular user, all users within a customer, or all users on a cluster")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-25T16:34:08.557+05:30")
public class Message {
  @SerializedName("source")
  private String source = null;

  /**
   * Message severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    MARKETING("MARKETING"),

    INFO("INFO"),

    WARN("WARN"),

    SEVERE("SEVERE");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("severity")
  private SeverityEnum severity = null;

  /**
   * The audience scope that this message should reach
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    CLUSTER("CLUSTER"),

    CUSTOMER("CUSTOMER"),

    USER("USER");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scope")
  private ScopeEnum scope = null;

  @SerializedName("attributes")
  private Map<String, String> attributes = null;

  @SerializedName("read")
  private Boolean read = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("startEpochMillis")
  private Long startEpochMillis = null;

  @SerializedName("endEpochMillis")
  private Long endEpochMillis = null;

  /**
   * The form of display for this message
   */
  @JsonAdapter(DisplayEnum.Adapter.class)
  public enum DisplayEnum {
    BANNER("BANNER"),

    TOASTER("TOASTER");

    private String value;

    DisplayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayEnum fromValue(String text) {
      for (DisplayEnum b : DisplayEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisplayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DisplayEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("display")
  private DisplayEnum display = null;

  @SerializedName("target")
  private String target = null;

  public Message source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Message source.  System messages will com from &#39;system@wavefront.com&#39;
   *
   * @return source
   **/
  @ApiModelProperty(required = true, value = "Message source.  System messages will com from 'system@wavefront.com'")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Message severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Message severity
   *
   * @return severity
   **/
  @ApiModelProperty(required = true, value = "Message severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Message scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The audience scope that this message should reach
   *
   * @return scope
   **/
  @ApiModelProperty(required = true, value = "The audience scope that this message should reach")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public Message attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Message putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, String>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * A string-&gt;string map of additional properties associated with this message
   *
   * @return attributes
   **/
  @ApiModelProperty(value = "A string->string map of additional properties associated with this message")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public Message read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * A derived field for whether the current user has read this message
   *
   * @return read
   **/
  @ApiModelProperty(value = "A derived field for whether the current user has read this message")
  public Boolean isRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Message title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of this message
   *
   * @return title
   **/
  @ApiModelProperty(required = true, value = "Title of this message")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Message id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Message content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Message content
   *
   * @return content
   **/
  @ApiModelProperty(required = true, value = "Message content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Message startEpochMillis(Long startEpochMillis) {
    this.startEpochMillis = startEpochMillis;
    return this;
  }

  /**
   * When this message will begin to be displayed, in epoch millis
   *
   * @return startEpochMillis
   **/
  @ApiModelProperty(required = true, value = "When this message will begin to be displayed, in epoch millis")
  public Long getStartEpochMillis() {
    return startEpochMillis;
  }

  public void setStartEpochMillis(Long startEpochMillis) {
    this.startEpochMillis = startEpochMillis;
  }

  public Message endEpochMillis(Long endEpochMillis) {
    this.endEpochMillis = endEpochMillis;
    return this;
  }

  /**
   * When this message will stop being displayed, in epoch millis
   *
   * @return endEpochMillis
   **/
  @ApiModelProperty(required = true, value = "When this message will stop being displayed, in epoch millis")
  public Long getEndEpochMillis() {
    return endEpochMillis;
  }

  public void setEndEpochMillis(Long endEpochMillis) {
    this.endEpochMillis = endEpochMillis;
  }

  public Message display(DisplayEnum display) {
    this.display = display;
    return this;
  }

  /**
   * The form of display for this message
   *
   * @return display
   **/
  @ApiModelProperty(required = true, value = "The form of display for this message")
  public DisplayEnum getDisplay() {
    return display;
  }

  public void setDisplay(DisplayEnum display) {
    this.display = display;
  }

  public Message target(String target) {
    this.target = target;
    return this;
  }

  /**
   * For scope&#x3D;CUSTOMER or scope&#x3D;USER, the individual customer or user id
   *
   * @return target
   **/
  @ApiModelProperty(value = "For scope=CUSTOMER or scope=USER, the individual customer or user id")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.source, message.source) &&
        Objects.equals(this.severity, message.severity) &&
        Objects.equals(this.scope, message.scope) &&
        Objects.equals(this.attributes, message.attributes) &&
        Objects.equals(this.read, message.read) &&
        Objects.equals(this.title, message.title) &&
        Objects.equals(this.id, message.id) &&
        Objects.equals(this.content, message.content) &&
        Objects.equals(this.startEpochMillis, message.startEpochMillis) &&
        Objects.equals(this.endEpochMillis, message.endEpochMillis) &&
        Objects.equals(this.display, message.display) &&
        Objects.equals(this.target, message.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, severity, scope, attributes, read, title, id, content, startEpochMillis, endEpochMillis, display, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");

    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    startEpochMillis: ").append(toIndentedString(startEpochMillis)).append("\n");
    sb.append("    endEpochMillis: ").append(toIndentedString(endEpochMillis)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

