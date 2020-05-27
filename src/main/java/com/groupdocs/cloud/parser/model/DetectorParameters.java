/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DetectorParameters.java">
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
import com.groupdocs.cloud.parser.model.Rectangle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides parameters for the table detection algorithms. 
 */
@ApiModel(description = "Provides parameters for the table detection algorithms. ")
public class DetectorParameters {
  @SerializedName("minRowCount")
  private Integer minRowCount = null;

  @SerializedName("minColumnCount")
  private Integer minColumnCount = null;

  @SerializedName("minVerticalSpace")
  private Integer minVerticalSpace = null;

  @SerializedName("hasMergedCells")
  private Boolean hasMergedCells = null;

  @SerializedName("rectangle")
  private Rectangle rectangle = null;

  @SerializedName("verticalSeparators")
  private List<Double> verticalSeparators = null;

  public DetectorParameters minRowCount(Integer minRowCount) {
    this.minRowCount = minRowCount;
    return this;
  }

   /**
   * Gets or sets the minimum number of the table rows.
   * @return minRowCount
  **/
  @ApiModelProperty(value = "Gets or sets the minimum number of the table rows.")
  public Integer getMinRowCount() {
    return minRowCount;
  }

  public void setMinRowCount(Integer minRowCount) {
    this.minRowCount = minRowCount;
  }

  public DetectorParameters minColumnCount(Integer minColumnCount) {
    this.minColumnCount = minColumnCount;
    return this;
  }

   /**
   * Gets or sets the minimum number of the table columns.
   * @return minColumnCount
  **/
  @ApiModelProperty(value = "Gets or sets the minimum number of the table columns.")
  public Integer getMinColumnCount() {
    return minColumnCount;
  }

  public void setMinColumnCount(Integer minColumnCount) {
    this.minColumnCount = minColumnCount;
  }

  public DetectorParameters minVerticalSpace(Integer minVerticalSpace) {
    this.minVerticalSpace = minVerticalSpace;
    return this;
  }

   /**
   * Gets or sets the minimum space between the table columns.
   * @return minVerticalSpace
  **/
  @ApiModelProperty(value = "Gets or sets the minimum space between the table columns.")
  public Integer getMinVerticalSpace() {
    return minVerticalSpace;
  }

  public void setMinVerticalSpace(Integer minVerticalSpace) {
    this.minVerticalSpace = minVerticalSpace;
  }

  public DetectorParameters hasMergedCells(Boolean hasMergedCells) {
    this.hasMergedCells = hasMergedCells;
    return this;
  }

   /**
   * Gets or sets the value that indicates whether the table has merged cells.
   * @return hasMergedCells
  **/
  @ApiModelProperty(value = "Gets or sets the value that indicates whether the table has merged cells.")
  public Boolean getHasMergedCells() {
    return hasMergedCells;
  }

  public void setHasMergedCells(Boolean hasMergedCells) {
    this.hasMergedCells = hasMergedCells;
  }

  public DetectorParameters rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Gets or sets the rectangular area that contains the table.
   * @return rectangle
  **/
  @ApiModelProperty(value = "Gets or sets the rectangular area that contains the table.")
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public DetectorParameters verticalSeparators(List<Double> verticalSeparators) {
    this.verticalSeparators = verticalSeparators;
    return this;
  }

  public DetectorParameters addVerticalSeparatorsItem(Double verticalSeparatorsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectorParameters detectorParameters = (DetectorParameters) o;
    return Objects.equals(this.minRowCount, detectorParameters.minRowCount) &&
        Objects.equals(this.minColumnCount, detectorParameters.minColumnCount) &&
        Objects.equals(this.minVerticalSpace, detectorParameters.minVerticalSpace) &&
        Objects.equals(this.hasMergedCells, detectorParameters.hasMergedCells) &&
        Objects.equals(this.rectangle, detectorParameters.rectangle) &&
        Objects.equals(this.verticalSeparators, detectorParameters.verticalSeparators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minRowCount, minColumnCount, minVerticalSpace, hasMergedCells, rectangle, verticalSeparators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectorParameters {\n");
    
    sb.append("    minRowCount: ").append(toIndentedString(minRowCount)).append("\n");
    sb.append("    minColumnCount: ").append(toIndentedString(minColumnCount)).append("\n");
    sb.append("    minVerticalSpace: ").append(toIndentedString(minVerticalSpace)).append("\n");
    sb.append("    hasMergedCells: ").append(toIndentedString(hasMergedCells)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
    sb.append("    verticalSeparators: ").append(toIndentedString(verticalSeparators)).append("\n");
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

