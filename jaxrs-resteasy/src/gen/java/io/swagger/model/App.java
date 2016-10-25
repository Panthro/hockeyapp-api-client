package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-10-25T11:55:55.901Z")
public class App   {
  
  private String title = null;
  private String bundleIdentifier = null;
  private String publicIdentifier = null;
  private Integer releaseType = null;

  /**
   * Gets or Sets platform
   */
  public enum PlatformEnum {
    IOS("iOS"),

        ANDROID("Android"),

        MAC_OS("Mac Os"),

        WINDOWS_PHONE("Windows Phone"),

        CUSTOM("Custom");
    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PlatformEnum platform = null;

  /**
   **/
  
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @JsonProperty("bundle_identifier")
  public String getBundleIdentifier() {
    return bundleIdentifier;
  }
  public void setBundleIdentifier(String bundleIdentifier) {
    this.bundleIdentifier = bundleIdentifier;
  }

  /**
   **/
  
  @JsonProperty("public_identifier")
  public String getPublicIdentifier() {
    return publicIdentifier;
  }
  public void setPublicIdentifier(String publicIdentifier) {
    this.publicIdentifier = publicIdentifier;
  }

  /**
   **/
  
  @JsonProperty("release_type")
  public Integer getReleaseType() {
    return releaseType;
  }
  public void setReleaseType(Integer releaseType) {
    this.releaseType = releaseType;
  }

  /**
   **/
  
  @JsonProperty("platform")
  public PlatformEnum getPlatform() {
    return platform;
  }
  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(title, app.title) &&
        Objects.equals(bundleIdentifier, app.bundleIdentifier) &&
        Objects.equals(publicIdentifier, app.publicIdentifier) &&
        Objects.equals(releaseType, app.releaseType) &&
        Objects.equals(platform, app.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, bundleIdentifier, publicIdentifier, releaseType, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    bundleIdentifier: ").append(toIndentedString(bundleIdentifier)).append("\n");
    sb.append("    publicIdentifier: ").append(toIndentedString(publicIdentifier)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

