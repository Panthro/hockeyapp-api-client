package io.swagger.model;

import io.swagger.model.AppsApps;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Apps", propOrder =
	{ "success", "apps"
})

@XmlRootElement(name="Apps")
public class Apps  {
  

  @XmlElement(name="success")
  private String success = null;

  @XmlElement(name="apps")
  private List<AppsApps> apps = new ArrayList<AppsApps>();

  /**
   **/
  
  public String getSuccess() {
    return success;
  }
  public void setSuccess(String success) {
    this.success = success;
  }
  /**
   **/
  
  public List<AppsApps> getApps() {
    return apps;
  }
  public void setApps(List<AppsApps> apps) {
    this.apps = apps;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apps {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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

