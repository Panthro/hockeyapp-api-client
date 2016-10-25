package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AppsApps;
import java.util.ArrayList;
import java.util.List;

/**
 * Apps
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T11:56:12.494Z")

public class Apps   {
  @JsonProperty("success")
  private String success = null;

  @JsonProperty("apps")
  private List<AppsApps> apps = new ArrayList<AppsApps>();

  public Apps success(String success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }

  public Apps apps(List<AppsApps> apps) {
    this.apps = apps;
    return this;
  }

  public Apps addAppsItem(AppsApps appsItem) {
    this.apps.add(appsItem);
    return this;
  }

   /**
   * Get apps
   * @return apps
  **/
  @ApiModelProperty(value = "")
  public List<AppsApps> getApps() {
    return apps;
  }

  public void setApps(List<AppsApps> apps) {
    this.apps = apps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apps apps = (Apps) o;
    return Objects.equals(this.success, apps.success) &&
        Objects.equals(this.apps, apps.apps);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

