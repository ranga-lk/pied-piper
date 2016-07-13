package org.test.sample.app.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;



@ApiModel(description = "")
public class ActivityDTO  {
  
  
  
  private String uuid = null;

  
  /**
   * Unique identifier for the activity
   **/
  @ApiModelProperty(value = "Unique identifier for the activity")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityDTO {\n");
    
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
