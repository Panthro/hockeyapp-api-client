package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-10-25T11:56:09.125Z")
public class AppsApps   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("bundle_identifier")
  private String bundleIdentifier = null;

  @JsonProperty("public_identifier")
  private String publicIdentifier = null;

  @JsonProperty("device_family")
  private String deviceFamily = null;

  @JsonProperty("minimum_os_version")
  private String minimumOsVersion = null;

  @JsonProperty("release_type")
  private Integer releaseType = null;

  @JsonProperty("status")
  private Integer status = null;

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

  /**
   **/
  public AppsApps title(String title) {
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
  public AppsApps bundleIdentifier(String bundleIdentifier) {
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
  public AppsApps publicIdentifier(String publicIdentifier) {
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
  public AppsApps deviceFamily(String deviceFamily) {
    this.deviceFamily = deviceFamily;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("device_family")
  public String getDeviceFamily() {
    return deviceFamily;
  }
  public void setDeviceFamily(String deviceFamily) {
    this.deviceFamily = deviceFamily;
  }

  /**
   **/
  public AppsApps minimumOsVersion(String minimumOsVersion) {
    this.minimumOsVersion = minimumOsVersion;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minimum_os_version")
  public String getMinimumOsVersion() {
    return minimumOsVersion;
  }
  public void setMinimumOsVersion(String minimumOsVersion) {
    this.minimumOsVersion = minimumOsVersion;
  }

  /**
   **/
  public AppsApps releaseType(Integer releaseType) {
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
  public AppsApps status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   **/
  public AppsApps platform(PlatformEnum platform) {
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
    AppsApps appsApps = (AppsApps) o;
    return Objects.equals(title, appsApps.title) &&
        Objects.equals(bundleIdentifier, appsApps.bundleIdentifier) &&
        Objects.equals(publicIdentifier, appsApps.publicIdentifier) &&
        Objects.equals(deviceFamily, appsApps.deviceFamily) &&
        Objects.equals(minimumOsVersion, appsApps.minimumOsVersion) &&
        Objects.equals(releaseType, appsApps.releaseType) &&
        Objects.equals(status, appsApps.status) &&
        Objects.equals(platform, appsApps.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, bundleIdentifier, publicIdentifier, deviceFamily, minimumOsVersion, releaseType, status, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsApps {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    bundleIdentifier: ").append(toIndentedString(bundleIdentifier)).append("\n");
    sb.append("    publicIdentifier: ").append(toIndentedString(publicIdentifier)).append("\n");
    sb.append("    deviceFamily: ").append(toIndentedString(deviceFamily)).append("\n");
    sb.append("    minimumOsVersion: ").append(toIndentedString(minimumOsVersion)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

