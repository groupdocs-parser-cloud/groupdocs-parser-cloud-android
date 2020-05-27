/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TableLayout.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides the template table layout which is used by Table to define table position.
 */
@ApiModel(description = "Provides the template table layout which is used by Table to define table position.")
public class TableLayout {
  @SerializedName("verticalSeparators")
  private List<Double> verticalSeparators = null;

  @SerializedName("horizontalSeparators")
  private List<Double> horizontalSeparators = null;

  public TableLayout verticalSeparators(List<Double> verticalSeparators) {
    this.verticalSeparators = verticalSeparators;
    return this;
  }

  public TableLayout addVerticalSeparatorsItem(Double verticalSeparatorsItem) {
    if (this.verticalSeparators == null) {
      this.verticalSeparators = new ArrayList<Double>();
    }
    this.verticalSeparators.add(verticalSeparatorsItem);
    return this;
  }

   /**
   * Gets or sets the table columns separators.
   * @return verticalSeparators
  **/
  @ApiModelProperty(value = "Gets or sets the table columns separators.")
  public List<Double> getVerticalSeparators() {
    return verticalSeparators;
  }

  public void setVerticalSeparators(List<Double> verticalSeparators) {
    this.verticalSeparators = verticalSeparators;
  }

  public TableLayout horizontalSeparators(List<Double> horizontalSeparators) {
    this.horizontalSeparators = horizontalSeparators;
    return this;
  }

  public TableLayout addHorizontalSeparatorsItem(Double horizontalSeparatorsItem) {
    if (this.horizontalSeparators == null) {
      this.horizontalSeparators = new ArrayList<Double>();
    }
    this.horizontalSeparators.add(horizontalSeparatorsItem);
    return this;
  }

   /**
   * Gets or sets the table rows separators.
   * @return horizontalSeparators
  **/
  @ApiModelProperty(value = "Gets or sets the table rows separators.")
  public List<Double> getHorizontalSeparators() {
    return horizontalSeparators;
  }

  public void setHorizontalSeparators(List<Double> horizontalSeparators) {
    this.horizontalSeparators = horizontalSeparators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableLayout tableLayout = (TableLayout) o;
    return Objects.equals(this.verticalSeparators, tableLayout.verticalSeparators) &&
        Objects.equals(this.horizontalSeparators, tableLayout.horizontalSeparators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verticalSeparators, horizontalSeparators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableLayout {\n");
    
    sb.append("    verticalSeparators: ").append(toIndentedString(verticalSeparators)).append("\n");
    sb.append("    horizontalSeparators: ").append(toIndentedString(horizontalSeparators)).append("\n");
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

