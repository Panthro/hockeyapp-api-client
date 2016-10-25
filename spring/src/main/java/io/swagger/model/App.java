package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * App
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T11:56:12.494Z")

public class App   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("bundle_identifier")
  private String bundleIdentifier = null;

  @JsonProperty("public_identifier")
  private String publicIdentifier = null;

  @JsonProperty("release_type")
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

    @JsonCreator
    public static PlatformEnum fromValue(String text) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("platform")
  private PlatformEnum platform = null;

  public App title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public App bundleIdentifier(String bundleIdentifier) {
    this.bundleIdentifier = bundleIdentifier;
    return this;
  }

   /**
   * Get bundleIdentifier
   * @return bundleIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getBundleIdentifier() {
    return bundleIdentifier;
  }

  public void setBundleIdentifier(String bundleIdentifier) {
    this.bundleIdentifier = bundleIdentifier;
  }

  public App publicIdentifier(String publicIdentifier) {
    this.publicIdentifier = publicIdentifier;
    return this;
  }

   /**
   * Get publicIdentifier
   * @return publicIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getPublicIdentifier() {
    return publicIdentifier;
  }

  public void setPublicIdentifier(String publicIdentifier) {
    this.publicIdentifier = publicIdentifier;
  }

  public App releaseType(Integer releaseType) {
    this.releaseType = releaseType;
    return this;
  }

   /**
   * Get releaseType
   * @return releaseType
  **/
  @ApiModelProperty(value = "")
  public Integer getReleaseType() {
    return releaseType;
  }

  public void setReleaseType(Integer releaseType) {
    this.releaseType = releaseType;
  }

  public App platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(value = "")
  public PlatformEnum getPlatform() {
    return platform;
  }

  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.title, app.title) &&
        Objects.equals(this.bundleIdentifier, app.bundleIdentifier) &&
        Objects.equals(this.publicIdentifier, app.publicIdentifier) &&
        Objects.equals(this.releaseType, app.releaseType) &&
        Objects.equals(this.platform, app.platform);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
