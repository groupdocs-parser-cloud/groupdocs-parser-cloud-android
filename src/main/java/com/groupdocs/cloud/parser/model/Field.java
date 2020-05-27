/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Field.java">
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
import com.groupdocs.cloud.parser.model.FieldPosition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Field of document template
 */
@ApiModel(description = "Field of document template")
public class Field {
  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  @SerializedName("fieldPosition")
  private FieldPosition fieldPosition = null;

  public Field fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * A unique template field name.
   * @return fieldName
  **/
  @ApiModelProperty(value = "A unique template field name.")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public Field pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * The page index. An integer value that represents the index of the page where the template item is located; null if the template item is located on any page.
   * @return pageIndex
  **/
  @ApiModelProperty(value = "The page index. An integer value that represents the index of the page where the template item is located; null if the template item is located on any page.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Field fieldPosition(FieldPosition fieldPosition) {
    this.fieldPosition = fieldPosition;
    return this;
  }

   /**
   * Defines the way how to find the field on a page.
   * @return fieldPosition
  **/
  @ApiModelProperty(value = "Defines the way how to find the field on a page.")
  public FieldPosition getFieldPosition() {
    return fieldPosition;
  }

  public void setFieldPosition(FieldPosition fieldPosition) {
    this.fieldPosition = fieldPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.fieldName, field.fieldName) &&
        Objects.equals(this.pageIndex, field.pageIndex) &&
        Objects.equals(this.fieldPosition, field.fieldPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, pageIndex, fieldPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    fieldPosition: ").append(toIndentedString(fieldPosition)).append("\n");
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

