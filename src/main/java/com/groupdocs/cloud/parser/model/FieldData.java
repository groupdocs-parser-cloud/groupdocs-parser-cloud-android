/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="FieldData.java">
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
import com.groupdocs.cloud.parser.model.FieldData;
import com.groupdocs.cloud.parser.model.PageArea;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Class for document field data.
 */
@ApiModel(description = "Class for document field data.")
public class FieldData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  @SerializedName("pageArea")
  private PageArea pageArea = null;

  @SerializedName("linkedField")
  private FieldData linkedField = null;

  public FieldData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the field name.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the field name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldData pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Gets or sets the index of the page.
   * @return pageIndex
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the index of the page.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public FieldData pageArea(PageArea pageArea) {
    this.pageArea = pageArea;
    return this;
  }

   /**
   * Gets or sets the value of the field.
   * @return pageArea
  **/
  @ApiModelProperty(value = "Gets or sets the value of the field.")
  public PageArea getPageArea() {
    return pageArea;
  }

  public void setPageArea(PageArea pageArea) {
    this.pageArea = pageArea;
  }

  public FieldData linkedField(FieldData linkedField) {
    this.linkedField = linkedField;
    return this;
  }

   /**
   * Gets or sets the linked data field.
   * @return linkedField
  **/
  @ApiModelProperty(value = "Gets or sets the linked data field.")
  public FieldData getLinkedField() {
    return linkedField;
  }

  public void setLinkedField(FieldData linkedField) {
    this.linkedField = linkedField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldData fieldData = (FieldData) o;
    return Objects.equals(this.name, fieldData.name) &&
        Objects.equals(this.pageIndex, fieldData.pageIndex) &&
        Objects.equals(this.pageArea, fieldData.pageArea) &&
        Objects.equals(this.linkedField, fieldData.linkedField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pageIndex, pageArea, linkedField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageArea: ").append(toIndentedString(pageArea)).append("\n");
    sb.append("    linkedField: ").append(toIndentedString(linkedField)).append("\n");
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

