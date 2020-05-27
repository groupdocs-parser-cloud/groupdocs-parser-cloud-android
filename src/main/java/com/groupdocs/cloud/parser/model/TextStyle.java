/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextStyle.java">
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

/**
 * The text style such as font size, font name an so on.             
 */
@ApiModel(description = "The text style such as font size, font name an so on.             ")
public class TextStyle {
  @SerializedName("fontName")
  private String fontName = null;

  @SerializedName("fontSize")
  private Double fontSize = null;

  @SerializedName("isBold")
  private Boolean isBold = null;

  @SerializedName("isItalic")
  private Boolean isItalic = null;

  @SerializedName("name")
  private String name = null;

  public TextStyle fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }

   /**
   * Gets or sets the name of the font.
   * @return fontName
  **/
  @ApiModelProperty(value = "Gets or sets the name of the font.")
  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public TextStyle fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Gets or sets the size of the font.
   * @return fontSize
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the size of the font.")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public TextStyle isBold(Boolean isBold) {
    this.isBold = isBold;
    return this;
  }

   /**
   * Gets or sets the value that indicates whether the font is bold.
   * @return isBold
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the value that indicates whether the font is bold.")
  public Boolean getIsBold() {
    return isBold;
  }

  public void setIsBold(Boolean isBold) {
    this.isBold = isBold;
  }

  public TextStyle isItalic(Boolean isItalic) {
    this.isItalic = isItalic;
    return this;
  }

   /**
   * Gets or sets the value that indicates whether the font is italic.
   * @return isItalic
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the value that indicates whether the font is italic.")
  public Boolean getIsItalic() {
    return isItalic;
  }

  public void setIsItalic(Boolean isItalic) {
    this.isItalic = isItalic;
  }

  public TextStyle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the style name.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the style name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextStyle textStyle = (TextStyle) o;
    return Objects.equals(this.fontName, textStyle.fontName) &&
        Objects.equals(this.fontSize, textStyle.fontSize) &&
        Objects.equals(this.isBold, textStyle.isBold) &&
        Objects.equals(this.isItalic, textStyle.isItalic) &&
        Objects.equals(this.name, textStyle.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontName, fontSize, isBold, isItalic, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextStyle {\n");
    
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    isBold: ").append(toIndentedString(isBold)).append("\n");
    sb.append("    isItalic: ").append(toIndentedString(isItalic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

