/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Coordinates.java">
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
 * Class for rectangle coordinates.
 */
@ApiModel(description = "Class for rectangle coordinates.")
public class Coordinates {
  @SerializedName("top")
  private Double top = null;

  @SerializedName("bottom")
  private Double bottom = null;

  @SerializedName("left")
  private Double left = null;

  @SerializedName("right")
  private Double right = null;

  public Coordinates top(Double top) {
    this.top = top;
    return this;
  }

   /**
   * Gets or sets the y-coordinate of the top edge of the rectangular area.
   * @return top
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the y-coordinate of the top edge of the rectangular area.")
  public Double getTop() {
    return top;
  }

  public void setTop(Double top) {
    this.top = top;
  }

  public Coordinates bottom(Double bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * Gets or sets the y-coordinate of the bottom edge of the rectangular area.
   * @return bottom
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the y-coordinate of the bottom edge of the rectangular area.")
  public Double getBottom() {
    return bottom;
  }

  public void setBottom(Double bottom) {
    this.bottom = bottom;
  }

  public Coordinates left(Double left) {
    this.left = left;
    return this;
  }

   /**
   * Gets or sets the x-coordinate of the left edge of the rectangular area.
   * @return left
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the x-coordinate of the left edge of the rectangular area.")
  public Double getLeft() {
    return left;
  }

  public void setLeft(Double left) {
    this.left = left;
  }

  public Coordinates right(Double right) {
    this.right = right;
    return this;
  }

   /**
   * Gets or sets the x-coordinate of the right edge of the rectangular area.
   * @return right
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the x-coordinate of the right edge of the rectangular area.")
  public Double getRight() {
    return right;
  }

  public void setRight(Double right) {
    this.right = right;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinates coordinates = (Coordinates) o;
    return Objects.equals(this.top, coordinates.top) &&
        Objects.equals(this.bottom, coordinates.bottom) &&
        Objects.equals(this.left, coordinates.left) &&
        Objects.equals(this.right, coordinates.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(top, bottom, left, right);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinates {\n");
    
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
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

