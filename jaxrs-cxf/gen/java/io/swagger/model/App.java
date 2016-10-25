package io.swagger.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "App", propOrder =
	{ "title", "bundleIdentifier", "publicIdentifier", "releaseType", "platform"
})

@XmlRootElement(name="App")
public class App  {
  

  @XmlElement(name="title")
  private String title = null;

  @XmlElement(name="bundle_identifier")
  private String bundleIdentifier = null;

  @XmlElement(name="public_identifier")
  private String publicIdentifier = null;

  @XmlElement(name="release_type")
  private Integer releaseType = null;

@XmlType(name="PlatformEnum")
@XmlEnum
public enum PlatformEnum {

    IOS(String.valueOf("iOS")), ANDROID(String.valueOf("Android")), MAC_OS(String.valueOf("Mac Os")), WINDOWS_PHONE(String.valueOf("Windows Phone")), CUSTOM(String.valueOf("Custom"));


    private String value;

    PlatformEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlatformEnum fromValue(String v) {
        return valueOf(v);
    }
}


  @XmlElement(name="platform")
  private PlatformEnum platform = null;

  /**
   **/
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  /**
   **/
  
  public String getBundleIdentifier() {
    return bundleIdentifier;
  }
  public void setBundleIdentifier(String bundleIdentifier) {
    this.bundleIdentifier = bundleIdentifier;
  }
  /**
   **/
  
  public String getPublicIdentifier() {
    return publicIdentifier;
  }
  public void setPublicIdentifier(String publicIdentifier) {
    this.publicIdentifier = publicIdentifier;
  }
  /**
   **/
  
  public Integer getReleaseType() {
    return releaseType;
  }
  public void setReleaseType(Integer releaseType) {
    this.releaseType = releaseType;
  }
  /**
   **/
  
  public PlatformEnum getPlatform() {
    return platform;
  }
  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

