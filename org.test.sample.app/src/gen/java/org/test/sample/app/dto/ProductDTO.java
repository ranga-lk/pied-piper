package org.test.sample.app.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;



@ApiModel(description = "")
public class ProductDTO  {
  
  
  
  private String productId = null;
  
  
  private String description = null;
  
  
  private String displayName = null;
  
  
  private String capacity = null;
  
  
  private String image = null;

  
  /**
   * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
   **/
  @ApiModelProperty(value = "Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * Description of product.
   **/
  @ApiModelProperty(value = "Description of product.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Display name of product.
   **/
  @ApiModelProperty(value = "Display name of product.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * Capacity of product. For example, 4 people.
   **/
  @ApiModelProperty(value = "Capacity of product. For example, 4 people.")
  @JsonProperty("capacity")
  public String getCapacity() {
    return capacity;
  }
  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  
  /**
   * Image URL representing the product.
   **/
  @ApiModelProperty(value = "Image URL representing the product.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDTO {\n");
    
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  capacity: ").append(capacity).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
