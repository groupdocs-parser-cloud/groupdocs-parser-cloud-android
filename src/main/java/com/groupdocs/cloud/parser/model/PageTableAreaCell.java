/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PageTableAreaCell.java">
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
import com.groupdocs.cloud.parser.model.PageArea;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a table cell.
 */
@ApiModel(description = "Represents a table cell.")
public class PageTableAreaCell {
  @SerializedName("columnIndex")
  private Integer columnIndex = null;

  @SerializedName("columnSpan")
  private Integer columnSpan = null;

  @SerializedName("pageArea")
  private PageArea pageArea = null;

  @SerializedName("rowIndex")
  private Integer rowIndex = null;

  @SerializedName("rowSpan")
  private Integer rowSpan = null;

  public PageTableAreaCell columnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Gets or sets the index of the column.
   * @return columnIndex
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the index of the column.")
  public Integer getColumnIndex() {
    return columnIndex;
  }

  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }

  public PageTableAreaCell columnSpan(Integer columnSpan) {
    this.columnSpan = columnSpan;
    return this;
  }

   /**
   * Gets or sets the total number of columns that contain the table cell.
   * @return columnSpan
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the total number of columns that contain the table cell.")
  public Integer getColumnSpan() {
    return columnSpan;
  }

  public void setColumnSpan(Integer columnSpan) {
    this.columnSpan = columnSpan;
  }

  public PageTableAreaCell pageArea(PageArea pageArea) {
    this.pageArea = pageArea;
    return this;
  }

   /**
   * Gets or sets the table cell value.
   * @return pageArea
  **/
  @ApiModelProperty(value = "Gets or sets the table cell value.")
  public PageArea getPageArea() {
    return pageArea;
  }

  public void setPageArea(PageArea pageArea) {
    this.pageArea = pageArea;
  }

  public PageTableAreaCell rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Gets or sets the index of the row.
   * @return rowIndex
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the index of the row.")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public PageTableAreaCell rowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }

   /**
   * Gets or sets the total number of rows that contain the table cell.
   * @return rowSpan
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the total number of rows that contain the table cell.")
  public Integer getRowSpan() {
    return rowSpan;
  }

  public void setRowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageTableAreaCell pageTableAreaCell = (PageTableAreaCell) o;
    return Objects.equals(this.columnIndex, pageTableAreaCell.columnIndex) &&
        Objects.equals(this.columnSpan, pageTableAreaCell.columnSpan) &&
        Objects.equals(this.pageArea, pageTableAreaCell.pageArea) &&
        Objects.equals(this.rowIndex, pageTableAreaCell.rowIndex) &&
        Objects.equals(this.rowSpan, pageTableAreaCell.rowSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnIndex, columnSpan, pageArea, rowIndex, rowSpan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageTableAreaCell {\n");
    
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
    sb.append("    columnSpan: ").append(toIndentedString(columnSpan)).append("\n");
    sb.append("    pageArea: ").append(toIndentedString(pageArea)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
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

