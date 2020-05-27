/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextOptions.java">
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
import com.groupdocs.cloud.parser.model.ContainerItemInfo;
import com.groupdocs.cloud.parser.model.FileInfo;
import com.groupdocs.cloud.parser.model.FormattedTextOptions;
import com.groupdocs.cloud.parser.model.ParserOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Extract options.
 */
@ApiModel(description = "Extract options.")
public class TextOptions extends ParserOptions {
  @SerializedName("formattedTextOptions")
  private FormattedTextOptions formattedTextOptions = null;

  @SerializedName("startPageNumber")
  private Integer startPageNumber = null;

  @SerializedName("countPagesToExtract")
  private Integer countPagesToExtract = null;

  public TextOptions formattedTextOptions(FormattedTextOptions formattedTextOptions) {
    this.formattedTextOptions = formattedTextOptions;
    return this;
  }

   /**
   * Gets or sets the options which are used for formatted text extraction.
   * @return formattedTextOptions
  **/
  @ApiModelProperty(value = "Gets or sets the options which are used for formatted text extraction.")
  public FormattedTextOptions getFormattedTextOptions() {
    return formattedTextOptions;
  }

  public void setFormattedTextOptions(FormattedTextOptions formattedTextOptions) {
    this.formattedTextOptions = formattedTextOptions;
  }

  public TextOptions startPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
    return this;
  }

   /**
   * Gets or sets the zero-based start page index.
   * @return startPageNumber
  **/
  @ApiModelProperty(value = "Gets or sets the zero-based start page index.")
  public Integer getStartPageNumber() {
    return startPageNumber;
  }

  public void setStartPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
  }

  public TextOptions countPagesToExtract(Integer countPagesToExtract) {
    this.countPagesToExtract = countPagesToExtract;
    return this;
  }

   /**
   * Gets or sets the number of pages to extract.
   * @return countPagesToExtract
  **/
  @ApiModelProperty(value = "Gets or sets the number of pages to extract.")
  public Integer getCountPagesToExtract() {
    return countPagesToExtract;
  }

  public void setCountPagesToExtract(Integer countPagesToExtract) {
    this.countPagesToExtract = countPagesToExtract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextOptions textOptions = (TextOptions) o;
    return Objects.equals(this.formattedTextOptions, textOptions.formattedTextOptions) &&
        Objects.equals(this.startPageNumber, textOptions.startPageNumber) &&
        Objects.equals(this.countPagesToExtract, textOptions.countPagesToExtract) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formattedTextOptions, startPageNumber, countPagesToExtract, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    formattedTextOptions: ").append(toIndentedString(formattedTextOptions)).append("\n");
    sb.append("    startPageNumber: ").append(toIndentedString(startPageNumber)).append("\n");
    sb.append("    countPagesToExtract: ").append(toIndentedString(countPagesToExtract)).append("\n");
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

