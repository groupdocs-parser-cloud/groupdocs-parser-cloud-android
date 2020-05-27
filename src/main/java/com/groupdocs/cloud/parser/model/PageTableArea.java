/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PageTableArea.java">
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
import com.groupdocs.cloud.parser.model.PageTableAreaCell;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a table page area which is used to represent a table in the parsing by template functionality.
 */
@ApiModel(description = "Represents a table page area which is used to represent a table in the parsing by template functionality.")
public class PageTableArea {
  @SerializedName("rowCount")
  private Integer rowCount = null;

  @SerializedName("columnCount")
  private Integer columnCount = null;

  @SerializedName("pageTableAreaCells")
  private List<PageTableAreaCell> pageTableAreaCells = null;

  public PageTableArea rowCount(Integer rowCount) {
    this.rowCount = rowCount;
    return this;
  }

   /**
   * Gets or sets the total number of the table rows.
   * @return rowCount
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the total number of the table rows.")
  public Integer getRowCount() {
    return rowCount;
  }

  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }

  public PageTableArea columnCount(Integer columnCount) {
    this.columnCount = columnCount;
    return this;
  }

   /**
   * Gets or sets the total number of the table columns.
   * @return columnCount
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the total number of the table columns.")
  public Integer getColumnCount() {
    return columnCount;
  }

  public void setColumnCount(Integer columnCount) {
    this.columnCount = columnCount;
  }

  public PageTableArea pageTableAreaCells(List<PageTableAreaCell> pageTableAreaCells) {
    this.pageTableAreaCells = pageTableAreaCells;
    return this;
  }

  public PageTableArea addPageTableAreaCellsItem(PageTableAreaCell pageTableAreaCellsItem) {
    if (this.pageTableAreaCells == null) {
      this.pageTableAreaCells = new ArrayList<PageTableAreaCell>();
    }
    this.pageTableAreaCells.add(pageTableAreaCellsItem);
    return this;
  }

   /**
   * Gets or sets the collection of table area cell.
   * @return pageTableAreaCells
  **/
  @ApiModelProperty(value = "Gets or sets the collection of table area cell.")
  public List<PageTableAreaCell> getPageTableAreaCells() {
    return pageTableAreaCells;
  }

  public void setPageTableAreaCells(List<PageTableAreaCell> pageTableAreaCells) {
    this.pageTableAreaCells = pageTableAreaCells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageTableArea pageTableArea = (PageTableArea) o;
    return Objects.equals(this.rowCount, pageTableArea.rowCount) &&
        Objects.equals(this.columnCount, pageTableArea.columnCount) &&
        Objects.equals(this.pageTableAreaCells, pageTableArea.pageTableAreaCells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowCount, columnCount, pageTableAreaCells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageTableArea {\n");
    
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
    sb.append("    pageTableAreaCells: ").append(toIndentedString(pageTableAreaCells)).append("\n");
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

