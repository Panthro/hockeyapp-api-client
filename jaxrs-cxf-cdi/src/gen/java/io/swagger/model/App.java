package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;



import io.swagger.annotations.*;
import java.util.Objects;


public class App   {
  
  private String title = null;
  private String bundleIdentifier = null;
  private String publicIdentifier = null;
  private Integer releaseType = null;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="App")
@XmlEnum
public enum App {
    {values&#x3D;[iOS, Android, Mac Os, Windows Phone, Custom], enumVars&#x3D;[{name&#x3D;IOS, value&#x3D;&quot;iOS&quot;}, {name&#x3D;ANDROID, value&#x3D;&quot;Android&quot;}, {name&#x3D;MAC_OS, value&#x3D;&quot;Mac Os&quot;}, {name&#x3D;WINDOWS_PHONE, value&#x3D;&quot;Windows Phone&quot;}, {name&#x3D;CUSTOM, value&#x3D;&quot;Custom&quot;}]}, 
    
    public String value() {
        return name();
    }

    public static App fromValue(String v) {
        return valueOf(v);
    }
}
  private PlatformEnum platform = null;

  /**
   **/
  public App title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public App bundleIdentifier(String bundleIdentifier) {
    this.bundleIdentifier = bundleIdentifier;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bundle_identifier")
  public String getBundleIdentifier() {
    return bundleIdentifier;
  }
  public void setBundleIdentifier(String bundleIdentifier) {
    this.bundleIdentifier = bundleIdentifier;
  }

  /**
   **/
  public App publicIdentifier(String publicIdentifier) {
    this.publicIdentifier = publicIdentifier;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("public_identifier")
  public String getPublicIdentifier() {
    return publicIdentifier;
  }
  public void setPublicIdentifier(String publicIdentifier) {
    this.publicIdentifier = publicIdentifier;
  }

  /**
   **/
  public App releaseType(Integer releaseType) {
    this.releaseType = releaseType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("release_type")
  public Integer getReleaseType() {
    return releaseType;
  }
  public void setReleaseType(Integer releaseType) {
    this.releaseType = releaseType;
  }

  /**
   **/
  public App platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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

