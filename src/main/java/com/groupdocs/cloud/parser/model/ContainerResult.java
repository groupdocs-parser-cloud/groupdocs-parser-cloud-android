/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ContainerResult.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.parser.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.parser.model.ContainerItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Container result.
 */
@ApiModel(description = "Container result.")
public class ContainerResult {
  @SerializedName("containerItems")
  private List<ContainerItem> containerItems = null;

  public ContainerResult containerItems(List<ContainerItem> containerItems) {
    this.containerItems = containerItems;
    return this;
  }

  public ContainerResult addContainerItemsItem(ContainerItem containerItemsItem) {
    if (this.containerItems == null) {
      this.containerItems = new ArrayList<ContainerItem>();
    }
    this.containerItems.add(containerItemsItem);
    return this;
  }

   /**
   * Gets or sets the collection of a container items like Zip archive entity, email attachment, PDF Portfolio item and so on.
   * @return containerItems
  **/
  @ApiModelProperty(value = "Gets or sets the collection of a container items like Zip archive entity, email attachment, PDF Portfolio item and so on.")
  public List<ContainerItem> getContainerItems() {
    return containerItems;
  }

  public void setContainerItems(List<ContainerItem> containerItems) {
    this.containerItems = containerItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerResult containerResult = (ContainerResult) o;
    return Objects.equals(this.containerItems, containerResult.containerItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerResult {\n");
    
    sb.append("    containerItems: ").append(toIndentedString(containerItems)).append("\n");
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

