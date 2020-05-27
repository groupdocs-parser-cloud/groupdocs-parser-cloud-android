/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ParseResult.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Parse result.
 */
@ApiModel(description = "Parse result.")
public class ParseResult {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("fieldsData")
  private List<FieldData> fieldsData = null;

  public ParseResult count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Gets or sets the total number of the fields data.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the total number of the fields data.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ParseResult fieldsData(List<FieldData> fieldsData) {
    this.fieldsData = fieldsData;
    return this;
  }

  public ParseResult addFieldsDataItem(FieldData fieldsDataItem) {
    if (this.fieldsData == null) {
      this.fieldsData = new ArrayList<FieldData>();
    }
    this.fieldsData.add(fieldsDataItem);
    return this;
  }

   /**
   * Collection of the data fields.
   * @return fieldsData
  **/
  @ApiModelProperty(value = "Collection of the data fields.")
  public List<FieldData> getFieldsData() {
    return fieldsData;
  }

  public void setFieldsData(List<FieldData> fieldsData) {
    this.fieldsData = fieldsData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseResult parseResult = (ParseResult) o;
    return Objects.equals(this.count, parseResult.count) &&
        Objects.equals(this.fieldsData, parseResult.fieldsData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, fieldsData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseResult {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    fieldsData: ").append(toIndentedString(fieldsData)).append("\n");
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

