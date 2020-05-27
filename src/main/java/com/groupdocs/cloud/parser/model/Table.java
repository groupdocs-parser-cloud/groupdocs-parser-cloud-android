/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Table.java">
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
import com.groupdocs.cloud.parser.model.DetectorParameters;
import com.groupdocs.cloud.parser.model.TableLayout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Document template table
 */
@ApiModel(description = "Document template table")
public class Table {
  @SerializedName("tableName")
  private String tableName = null;

  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  @SerializedName("detectorParameters")
  private DetectorParameters detectorParameters = null;

  @SerializedName("tableLayout")
  private TableLayout tableLayout = null;

  public Table tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Gets or sets a unique template table name.
   * @return tableName
  **/
  @ApiModelProperty(value = "Gets or sets a unique template table name.")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public Table pageIndex(Integer pageIndex) {
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

  public Table detectorParameters(DetectorParameters detectorParameters) {
    this.detectorParameters = detectorParameters;
    return this;
  }

   /**
   * Gets or sets the detector parameters. Provides parameters for the table detection algorithms. 
   * @return detectorParameters
  **/
  @ApiModelProperty(value = "Gets or sets the detector parameters. Provides parameters for the table detection algorithms. ")
  public DetectorParameters getDetectorParameters() {
    return detectorParameters;
  }

  public void setDetectorParameters(DetectorParameters detectorParameters) {
    this.detectorParameters = detectorParameters;
  }

  public Table tableLayout(TableLayout tableLayout) {
    this.tableLayout = tableLayout;
    return this;
  }

   /**
   * Gets or sets the table layout. Provides the template table layout which is used by Table to define table position.
   * @return tableLayout
  **/
  @ApiModelProperty(value = "Gets or sets the table layout. Provides the template table layout which is used by Table to define table position.")
  public TableLayout getTableLayout() {
    return tableLayout;
  }

  public void setTableLayout(TableLayout tableLayout) {
    this.tableLayout = tableLayout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(this.tableName, table.tableName) &&
        Objects.equals(this.pageIndex, table.pageIndex) &&
        Objects.equals(this.detectorParameters, table.detectorParameters) &&
        Objects.equals(this.tableLayout, table.tableLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, pageIndex, detectorParameters, tableLayout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    detectorParameters: ").append(toIndentedString(detectorParameters)).append("\n");
    sb.append("    tableLayout: ").append(toIndentedString(tableLayout)).append("\n");
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

