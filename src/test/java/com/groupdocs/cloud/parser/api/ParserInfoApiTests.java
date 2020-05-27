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

import com.groupdocs.cloud.parser.client.ApiException;
import com.groupdocs.cloud.parser.model.requests.*;
import com.groupdocs.cloud.parser.model.*;

import org.junit.Test;

public class ParserInfoApiTests extends BaseApiTest {

    @Test
    public void TestGetInfo_Txt() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.EncodingDetection.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("PLAIN TEXT FILE", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(1), result.getPageCount());
    }

    @Test
    public void TestGetInfo_Docx() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.FourPages.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("MICROSOFT WORD OPEN XML DOCUMENT", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(4), result.getPageCount());
    }

    @Test
    public void TestGetInfo_ContainerItem() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Zip.ToFileInfo());
        ContainerItemInfo containerItemInfo = new ContainerItemInfo();
        containerItemInfo.setRelativePath("one-page.docx");
        options.setContainerItemInfo(containerItemInfo);
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("MICROSOFT WORD OPEN XML DOCUMENT", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(1), result.getPageCount());
    }

    @Test
    public void TestGetInfo_FileNotFoundResult() {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder/NotExist.docx'.", ex.getMessage());
        }
    }

    @Test
    public void TestGetInfo_IncorrectPassword() {
        // Arrange
        InfoOptions options = new InfoOptions();
        FileInfo fileInfo = TestFiles.PasswordProtected.ToFileInfo();
        fileInfo.setPassword("123");
        options.setFileInfo(fileInfo);
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file 'words\\docx\\password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }
}
