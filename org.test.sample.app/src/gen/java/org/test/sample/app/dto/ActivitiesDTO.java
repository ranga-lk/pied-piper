package org.test.sample.app.dto;

import java.util.*;
import org.test.sample.app.dto.ActivityDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;



@ApiModel(description = "")
public class ActivitiesDTO  {
  
  
  
  private Integer offset = null;
  
  
  private Integer limit = null;
  
  
  private Integer count = null;
  
  
  private List<ActivityDTO> history = new ArrayList<ActivityDTO>() ;

  
  /**
   * Position in pagination.
   **/
  @ApiModelProperty(value = "Position in pagination.")
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   * Number of items to retrieve (100 max).
   **/
  @ApiModelProperty(value = "Number of items to retrieve (100 max).")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  
  /**
   * Total number of items available.
   **/
  @ApiModelProperty(value = "Total number of items available.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("history")
  public List<ActivityDTO> getHistory() {
    return history;
  }
  public void setHistory(List<ActivityDTO> history) {
    this.history = history;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitiesDTO {\n");
    
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  history: ").append(history).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
