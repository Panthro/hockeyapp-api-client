package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AppsApps;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-10-25T11:55:55.901Z")
public class Apps   {
  
  private String success = null;
  private List<AppsApps> apps = new ArrayList<AppsApps>();

  /**
   **/
  
  @JsonProperty("success")
  public String getSuccess() {
    return success;
  }
  public void setSuccess(String success) {
    this.success = success;
  }

  /**
   **/
  
  @JsonProperty("apps")
  public List<AppsApps> getApps() {
    return apps;
  }
  public void setApps(List<AppsApps> apps) {
    this.apps = apps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apps apps = (Apps) o;
    return Objects.equals(success, apps.success) &&
        Objects.equals(apps, apps.apps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, apps);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
