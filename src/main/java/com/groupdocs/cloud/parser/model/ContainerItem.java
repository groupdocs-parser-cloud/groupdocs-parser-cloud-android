/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ContainerItem.java">
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a container item like Zip archive entity, email attachment, PDF Portfolio item and so on.
 */
@ApiModel(description = "Represents a container item like Zip archive entity, email attachment, PDF Portfolio item and so on.")
public class ContainerItem {
  @SerializedName("name")
  private String name = null;

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("directory")
  private String directory = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  public ContainerItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the name of the item.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the name of the item.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContainerItem filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Gets or sets the full path of the item.
   * @return filePath
  **/
  @ApiModelProperty(value = "Gets or sets the full path of the item.")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public ContainerItem directory(String directory) {
    this.directory = directory;
    return this;
  }

   /**
   * Gets or sets the directory of the item.
   * @return directory
  **/
  @ApiModelProperty(value = "Gets or sets the directory of the item.")
  public String getDirectory() {
    return directory;
  }

  public void setDirectory(String directory) {
    this.directory = directory;
  }

  public ContainerItem metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ContainerItem putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Gets or sets the collection of metadata items.
   * @return metadata
  **/
  @ApiModelProperty(value = "Gets or sets the collection of metadata items.")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerItem containerItem = (ContainerItem) o;
    return Objects.equals(this.name, containerItem.name) &&
        Objects.equals(this.filePath, containerItem.filePath) &&
        Objects.equals(this.directory, containerItem.directory) &&
        Objects.equals(this.metadata, containerItem.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, filePath, directory, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

