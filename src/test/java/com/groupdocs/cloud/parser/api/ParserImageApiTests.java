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

public class ParserImageApiTests extends BaseApiTest {

    @Test
    public void TestGetImage_Docx() throws ApiException {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        options.setFileInfo(TestFiles.FourPages.ToFileInfo());
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        ImagesResult result = parseApi.images(request);

        assertNotNull(result);
        int i = 0;
        for (Image image : result.getImages()) {
            assertEquals("parser/images/words/docx/four-pages_docx/image_" + i + ".jpeg", image.getPath());
            assertNotNull(image.getDownloadUrl());
            i++;
        }
    }

    @Test
    public void TestGetImage_Container() throws ApiException {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        options.setFileInfo(TestFiles.ZipWithEmailImagePdf.ToFileInfo());
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        ImagesResult result = parseApi.images(request);

        assertNotNull(result);
        for (Image image : result.getImages()) {
            assertTrue(image.getPath().contains("parser/images/containers/archive/zip-eml-jpg-pdf_zip/"));
        }
    }

    @Test
    public void TestGetImage_Email() throws ApiException {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        options.setFileInfo(TestFiles.ImageAndAttachment.ToFileInfo());
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        ImagesResult result = parseApi.images(request);

        assertNotNull(result);
        for (Image image : result.getImages()) {
            assertTrue(image.getPath().contains("parser/images/email/eml/embedded-image-and-attachment_eml/"));
        }
    }

    @Test
    public void TestGetImage_FromPages() throws ApiException {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        options.setFileInfo(TestFiles.Pdf.ToFileInfo());
        options.setStartPageNumber(1);
        options.setCountPagesToExtract(2);
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        ImagesResult result = parseApi.images(request);

        assertNotNull(result);
        assertNotNull(result.getPages());
        assertEquals(2, result.getPages().size());

        assertEquals("parser/images/pdf/template-document_pdf/page_1/image_0.jpeg",
                result.getPages().get(0).getImages().get(0).getPath());
        assertEquals("parser/images/pdf/template-document_pdf/page_2/image_0.jpeg",
                result.getPages().get(1).getImages().get(0).getPath());
    }

    @Test
    public void TestGetImage_ContainerItem_FromPages() throws ApiException {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        options.setFileInfo(TestFiles.PdfContainer.ToFileInfo());
        options.setStartPageNumber(1);
        options.setCountPagesToExtract(2);
        ContainerItemInfo containerInfo = new ContainerItemInfo();
        containerInfo.setRelativePath("template-document.pdf");
        options.setContainerItemInfo(containerInfo);
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        ImagesResult result = parseApi.images(request);

        assertNotNull(result);
        assertNotNull(result.getPages());
        assertEquals(2, result.getPages().size());

        assertEquals("parser/images/template-document_pdf/page_1/image_0.jpeg",
                result.getPages().get(0).getImages().get(0).getPath());
        assertEquals("parser/images/template-document_pdf/page_2/image_0.jpeg",
                result.getPages().get(1).getImages().get(0).getPath());
    }

    @Test
    public void TestGetImage_Container_FromPages_Error() {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        options.setFileInfo(TestFiles.Zip.ToFileInfo());
        options.setStartPageNumber(1);
        options.setCountPagesToExtract(2);
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        try {
            parseApi.images(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("The specified file 'containers\\archive\\docx.zip' has type which is not currently supported.", ex.getMessage());
        }
    }

    @Test
    public void TestGetImage_FromPages_OutOfThePageRange() {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        options.setFileInfo(TestFiles.Pdf.ToFileInfo());
        options.setStartPageNumber(3);
        options.setCountPagesToExtract(5);
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        try {
            parseApi.images(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
        }
    }

    @Test
    public void TestGetImage_FileNotFoundResult() {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        try {
            parseApi.images(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder/NotExist.docx'.", ex.getMessage());
        }
    }

    @Test
    public void TestGetImage_IncorrectPassword() {
        // Arrange
        ImagesOptions options = new ImagesOptions();
        FileInfo fileInfo = TestFiles.PasswordProtected.ToFileInfo();
        fileInfo.setPassword("123");
        options.setFileInfo(fileInfo);
        ImagesRequest request = new ImagesRequest(options);

        // Act & Assert
        try {
            parseApi.images(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file 'words\\docx\\password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }
}
