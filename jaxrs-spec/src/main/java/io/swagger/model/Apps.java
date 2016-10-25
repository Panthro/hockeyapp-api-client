package io.swagger.model;

import io.swagger.model.AppsApps;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Apps   {
  
  private String success = null;
  private List<AppsApps> apps = new ArrayList<AppsApps>();

  /**
   **/
  public Apps success(String success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSuccess() {
    return success;
  }
  public void setSuccess(String success) {
    this.success = success;
  }

  /**
   **/
  public Apps apps(List<AppsApps> apps) {
    this.apps = apps;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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
