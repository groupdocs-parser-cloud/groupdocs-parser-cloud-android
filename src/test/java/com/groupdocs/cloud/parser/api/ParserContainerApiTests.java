/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.parser.api;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import com.groupdocs.cloud.parser.client.ApiException;
import com.groupdocs.cloud.parser.model.requests.*;
import com.groupdocs.cloud.parser.model.*;

import org.junit.Test;

public class ParserContainerApiTests extends BaseApiTest {

    @Test
    public void TestGetContainerItemInfo() throws ApiException {
        // Arrange
        ContainerOptions options = new ContainerOptions();
        options.setFileInfo(TestFiles.Zip.ToFileInfo());
        ContainerRequest request = new ContainerRequest(options);

        // Act & Assert
        ContainerResult result = infoApi.container(request);

        assertNotNull(result);
        assertNotNull(result.getContainerItems());
        assertEquals(2, result.getContainerItems().size());
        List<String> names = Arrays.asList(new String[] { "one-page.docx", "four-pages.docx" });
        for (ContainerItem item : result.getContainerItems()) {
            assertTrue(names.contains(item.getName()));
        }
    }

    @Test
    public void TestGetContainerItemInfo_FileNotFoundResult() {
        // Arrange
        ContainerOptions options = new ContainerOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        ContainerRequest request = new ContainerRequest(options);

        // Act & Assert
        try {
            infoApi.container(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder/NotExist.docx'.", ex.getMessage());
        }
    }

    @Test
    public void GetContainerItemsInfo_UnsupportedFileType() {
        // Arrange
        ContainerOptions options = new ContainerOptions();
        FileInfo fileInfo = TestFiles.FourPages.ToFileInfo();
        options.setFileInfo(fileInfo);
        ContainerRequest request = new ContainerRequest(options);

        // Act & Assert
        try {
            infoApi.container(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("The specified file 'words\\docx\\four-pages.docx' has type which is not currently supported.",
                    ex.getMessage());
        }
    }

    @Test
    public void GetContainerItemsInfo_WithoutOptions() {
        // Arrange
        ContainerRequest request = new ContainerRequest(null);

        // Act & Assert
        try {
            infoApi.container(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Missing the required parameter 'options' when calling container(Async)",
                    ex.getMessage());
        }
    }
}
