/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PageTextArea.java">
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
import com.groupdocs.cloud.parser.model.PageTextArea;
import com.groupdocs.cloud.parser.model.TextStyle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a page text area which is used to represent a text value in the parsing by template functionality.
 */
@ApiModel(description = "Represents a page text area which is used to represent a text value in the parsing by template functionality.")
public class PageTextArea {
  @SerializedName("text")
  private String text = null;

  @SerializedName("baseLine")
  private Double baseLine = null;

  @SerializedName("areas")
  private List<PageTextArea> areas = null;

  @SerializedName("textStyle")
  private TextStyle textStyle = null;

  public PageTextArea text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Gets or sets the text.
   * @return text
  **/
  @ApiModelProperty(value = "Gets or sets the text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PageTextArea baseLine(Double baseLine) {
    this.baseLine = baseLine;
    return this;
  }

   /**
   * Gets or sets the base line.
   * @return baseLine
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the base line.")
  public Double getBaseLine() {
    return baseLine;
  }

  public void setBaseLine(Double baseLine) {
    this.baseLine = baseLine;
  }

  public PageTextArea areas(List<PageTextArea> areas) {
    this.areas = areas;
    return this;
  }

  public PageTextArea addAreasItem(PageTextArea areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<PageTextArea>();
    }
    this.areas.add(areasItem);
    return this;
  }

   /**
   * Gets or sets the collection of child text page areas.
   * @return areas
  **/
  @ApiModelProperty(value = "Gets or sets the collection of child text page areas.")
  public List<PageTextArea> getAreas() {
    return areas;
  }

  public void setAreas(List<PageTextArea> areas) {
    this.areas = areas;
  }

  public PageTextArea textStyle(TextStyle textStyle) {
    this.textStyle = textStyle;
    return this;
  }

   /**
   * Gets or sets the text style such as font size, font name an so on.
   * @return textStyle
  **/
  @ApiModelProperty(value = "Gets or sets the text style such as font size, font name an so on.")
  public TextStyle getTextStyle() {
    return textStyle;
  }

  public void setTextStyle(TextStyle textStyle) {
    this.textStyle = textStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageTextArea pageTextArea = (PageTextArea) o;
    return Objects.equals(this.text, pageTextArea.text) &&
        Objects.equals(this.baseLine, pageTextArea.baseLine) &&
        Objects.equals(this.areas, pageTextArea.areas) &&
        Objects.equals(this.textStyle, pageTextArea.textStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, baseLine, areas, textStyle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageTextArea {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    baseLine: ").append(toIndentedString(baseLine)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    textStyle: ").append(toIndentedString(textStyle)).append("\n");
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

