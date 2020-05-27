/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PageArea.java">
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
import com.groupdocs.cloud.parser.model.Page;
import com.groupdocs.cloud.parser.model.PageTableArea;
import com.groupdocs.cloud.parser.model.PageTextArea;
import com.groupdocs.cloud.parser.model.Rectangle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Class for document page area.
 */
@ApiModel(description = "Class for document page area.")
public class PageArea {
  @SerializedName("rectangle")
  private Rectangle rectangle = null;

  @SerializedName("page")
  private Page page = null;

  @SerializedName("pageTextArea")
  private PageTextArea pageTextArea = null;

  @SerializedName("pageTableArea")
  private PageTableArea pageTableArea = null;

  public PageArea rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Gets or sets the rectangular area.
   * @return rectangle
  **/
  @ApiModelProperty(value = "Gets or sets the rectangular area.")
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public PageArea page(Page page) {
    this.page = page;
    return this;
  }

   /**
   * Gets or sets the document page information such as page index and page size.
   * @return page
  **/
  @ApiModelProperty(value = "Gets or sets the document page information such as page index and page size.")
  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public PageArea pageTextArea(PageTextArea pageTextArea) {
    this.pageTextArea = pageTextArea;
    return this;
  }

   /**
   * Gets or sets the text area. Represents a page text area which is used to represent a text value in the parsing by template functionality.
   * @return pageTextArea
  **/
  @ApiModelProperty(value = "Gets or sets the text area. Represents a page text area which is used to represent a text value in the parsing by template functionality.")
  public PageTextArea getPageTextArea() {
    return pageTextArea;
  }

  public void setPageTextArea(PageTextArea pageTextArea) {
    this.pageTextArea = pageTextArea;
  }

  public PageArea pageTableArea(PageTableArea pageTableArea) {
    this.pageTableArea = pageTableArea;
    return this;
  }

   /**
   * Gets or sets the table area. Represents a table page area which is used to represent a table in the parsing by template functionality.
   * @return pageTableArea
  **/
  @ApiModelProperty(value = "Gets or sets the table area. Represents a table page area which is used to represent a table in the parsing by template functionality.")
  public PageTableArea getPageTableArea() {
    return pageTableArea;
  }

  public void setPageTableArea(PageTableArea pageTableArea) {
    this.pageTableArea = pageTableArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageArea pageArea = (PageArea) o;
    return Objects.equals(this.rectangle, pageArea.rectangle) &&
        Objects.equals(this.page, pageArea.page) &&
        Objects.equals(this.pageTextArea, pageArea.pageTextArea) &&
        Objects.equals(this.pageTableArea, pageArea.pageTableArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rectangle, page, pageTextArea, pageTableArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageArea {\n");
    
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageTextArea: ").append(toIndentedString(pageTextArea)).append("\n");
    sb.append("    pageTableArea: ").append(toIndentedString(pageTableArea)).append("\n");
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

