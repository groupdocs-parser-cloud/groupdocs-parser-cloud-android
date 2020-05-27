/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="FieldPosition.java">
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
import com.groupdocs.cloud.parser.model.Size;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Field position class.
 */
@ApiModel(description = "Field position class.")
public class FieldPosition {
  @SerializedName("fieldPositionType")
  private String fieldPositionType = null;

  @SerializedName("rectangle")
  private Rectangle rectangle = null;

  @SerializedName("regex")
  private String regex = null;

  @SerializedName("matchCase")
  private Boolean matchCase = null;

  @SerializedName("linkedFieldName")
  private String linkedFieldName = null;

  @SerializedName("isLeftLinked")
  private Boolean isLeftLinked = null;

  @SerializedName("isRightLinked")
  private Boolean isRightLinked = null;

  @SerializedName("isTopLinked")
  private Boolean isTopLinked = null;

  @SerializedName("isBottomLinked")
  private Boolean isBottomLinked = null;

  @SerializedName("searchArea")
  private Size searchArea = null;

  @SerializedName("autoScale")
  private Boolean autoScale = null;

  public FieldPosition fieldPositionType(String fieldPositionType) {
    this.fieldPositionType = fieldPositionType;
    return this;
  }

   /**
   * Provides a template field position.
   * @return fieldPositionType
  **/
  @ApiModelProperty(value = "Provides a template field position.")
  public String getFieldPositionType() {
    return fieldPositionType;
  }

  public void setFieldPositionType(String fieldPositionType) {
    this.fieldPositionType = fieldPositionType;
  }

  public FieldPosition rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Rectangular area on the page that bounds the field value.
   * @return rectangle
  **/
  @ApiModelProperty(value = "Rectangular area on the page that bounds the field value.")
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public FieldPosition regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Gets or sets the regular expression.
   * @return regex
  **/
  @ApiModelProperty(value = "Gets or sets the regular expression.")
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public FieldPosition matchCase(Boolean matchCase) {
    this.matchCase = matchCase;
    return this;
  }

   /**
   * Gets or sets the value that indicates whether a text case isn&#39;t ignored.
   * @return matchCase
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the value that indicates whether a text case isn't ignored.")
  public Boolean getMatchCase() {
    return matchCase;
  }

  public void setMatchCase(Boolean matchCase) {
    this.matchCase = matchCase;
  }

  public FieldPosition linkedFieldName(String linkedFieldName) {
    this.linkedFieldName = linkedFieldName;
    return this;
  }

   /**
   * Gets or sets the name of the linked field.
   * @return linkedFieldName
  **/
  @ApiModelProperty(value = "Gets or sets the name of the linked field.")
  public String getLinkedFieldName() {
    return linkedFieldName;
  }

  public void setLinkedFieldName(String linkedFieldName) {
    this.linkedFieldName = linkedFieldName;
  }

  public FieldPosition isLeftLinked(Boolean isLeftLinked) {
    this.isLeftLinked = isLeftLinked;
    return this;
  }

   /**
   * Gets or sets the value that indicates whether a field is searched by the left from the linked field.
   * @return isLeftLinked
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the value that indicates whether a field is searched by the left from the linked field.")
  public Boolean getIsLeftLinked() {
    return isLeftLinked;
  }

  public void setIsLeftLinked(Boolean isLeftLinked) {
    this.isLeftLinked = isLeftLinked;
  }

  public FieldPosition isRightLinked(Boolean isRightLinked) {
    this.isRightLinked = isRightLinked;
    return this;
  }

   /**
   * Gets or sets a value indicating whether this instance is right linked.
   * @return isRightLinked
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether this instance is right linked.")
  public Boolean getIsRightLinked() {
    return isRightLinked;
  }

  public void setIsRightLinked(Boolean isRightLinked) {
    this.isRightLinked = isRightLinked;
  }

  public FieldPosition isTopLinked(Boolean isTopLinked) {
    this.isTopLinked = isTopLinked;
    return this;
  }

   /**
   * Gets or sets a value indicating whether this instance is top linked.
   * @return isTopLinked
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether this instance is top linked.")
  public Boolean getIsTopLinked() {
    return isTopLinked;
  }

  public void setIsTopLinked(Boolean isTopLinked) {
    this.isTopLinked = isTopLinked;
  }

  public FieldPosition isBottomLinked(Boolean isBottomLinked) {
    this.isBottomLinked = isBottomLinked;
    return this;
  }

   /**
   * Gets or sets a value indicating whether this instance is bottom linked.
   * @return isBottomLinked
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether this instance is bottom linked.")
  public Boolean getIsBottomLinked() {
    return isBottomLinked;
  }

  public void setIsBottomLinked(Boolean isBottomLinked) {
    this.isBottomLinked = isBottomLinked;
  }

  public FieldPosition searchArea(Size searchArea) {
    this.searchArea = searchArea;
    return this;
  }

   /**
   * Gets or sets the size of the area where a field is searched.
   * @return searchArea
  **/
  @ApiModelProperty(value = "Gets or sets the size of the area where a field is searched.")
  public Size getSearchArea() {
    return searchArea;
  }

  public void setSearchArea(Size searchArea) {
    this.searchArea = searchArea;
  }

  public FieldPosition autoScale(Boolean autoScale) {
    this.autoScale = autoScale;
    return this;
  }

   /**
   * Gets or sets Gets the value that indicates whether SearchArea is scaled by the linked field size.
   * @return autoScale
  **/
  @ApiModelProperty(required = true, value = "Gets or sets Gets the value that indicates whether SearchArea is scaled by the linked field size.")
  public Boolean getAutoScale() {
    return autoScale;
  }

  public void setAutoScale(Boolean autoScale) {
    this.autoScale = autoScale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldPosition fieldPosition = (FieldPosition) o;
    return Objects.equals(this.fieldPositionType, fieldPosition.fieldPositionType) &&
        Objects.equals(this.rectangle, fieldPosition.rectangle) &&
        Objects.equals(this.regex, fieldPosition.regex) &&
        Objects.equals(this.matchCase, fieldPosition.matchCase) &&
        Objects.equals(this.linkedFieldName, fieldPosition.linkedFieldName) &&
        Objects.equals(this.isLeftLinked, fieldPosition.isLeftLinked) &&
        Objects.equals(this.isRightLinked, fieldPosition.isRightLinked) &&
        Objects.equals(this.isTopLinked, fieldPosition.isTopLinked) &&
        Objects.equals(this.isBottomLinked, fieldPosition.isBottomLinked) &&
        Objects.equals(this.searchArea, fieldPosition.searchArea) &&
        Objects.equals(this.autoScale, fieldPosition.autoScale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPositionType, rectangle, regex, matchCase, linkedFieldName, isLeftLinked, isRightLinked, isTopLinked, isBottomLinked, searchArea, autoScale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPosition {\n");
    
    sb.append("    fieldPositionType: ").append(toIndentedString(fieldPositionType)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
    sb.append("    linkedFieldName: ").append(toIndentedString(linkedFieldName)).append("\n");
    sb.append("    isLeftLinked: ").append(toIndentedString(isLeftLinked)).append("\n");
    sb.append("    isRightLinked: ").append(toIndentedString(isRightLinked)).append("\n");
    sb.append("    isTopLinked: ").append(toIndentedString(isTopLinked)).append("\n");
    sb.append("    isBottomLinked: ").append(toIndentedString(isBottomLinked)).append("\n");
    sb.append("    searchArea: ").append(toIndentedString(searchArea)).append("\n");
    sb.append("    autoScale: ").append(toIndentedString(autoScale)).append("\n");
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

