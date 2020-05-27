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

public class ParserTextApiTests extends BaseApiTest {

    @Test
    public void TestExtractText() throws ApiException {
        // Arrange
        TextOptions options = new TextOptions();
        options.setFileInfo(TestFiles.OnePage.ToFileInfo());
        TextRequest request = new TextRequest(options);

        // Act & Assert
        TextResult result = parseApi.text(request);

        assertNotNull(result);
        assertEquals("First Page\r\r\f", result.getText());
    }

    @Test
    public void TestExtractText_WithPassword() throws ApiException {
        // Arrange
        TextOptions options = new TextOptions();
        options.setFileInfo(TestFiles.PasswordProtected.ToFileInfo());
        options.setStartPageNumber(0);
        options.setCountPagesToExtract(1);
        FormattedTextOptions textOptions = new FormattedTextOptions();
        textOptions.setMode("PlainText");
        options.setFormattedTextOptions(textOptions);
        TextRequest request = new TextRequest(options);

        // Act & Assert
        TextResult result = parseApi.text(request);

        assertNotNull(result);
        assertNull(result.getText());
        assertEquals(
                "Text inside a bookmark 1\r\n\r\nPage 1 heading!\r\n\r\nSample test text - Page 1!\r\n\r\n\fText inside a bookmark 2\r\n\r\n",
                result.getPages().get(0).getText());
    }

    @Test
    public void TestExtractPages() throws ApiException {
        // Arrange
        TextOptions options = new TextOptions();
        options.setFileInfo(TestFiles.FourPages.ToFileInfo());
        options.setStartPageNumber(0);
        options.setCountPagesToExtract(4);
        FormattedTextOptions textOptions = new FormattedTextOptions();
        textOptions.setMode("PlainText");
        options.setFormattedTextOptions(textOptions);
        TextRequest request = new TextRequest(options);

        // Act & Assert
        TextResult result = parseApi.text(request);

        assertNotNull(result);
        assertEquals(Integer.valueOf(0), result.getPages().get(0).getPageIndex());
        assertEquals(
                "Text inside bookmark 0\r\n\r\nPage 0 heading\r\n\r\nPage Text - Page 0\r\n\r\n\fText inside bookmark 1\r\n\r\n",
                result.getPages().get(0).getText());

        assertEquals(Integer.valueOf(3), result.getPages().get(3).getPageIndex());
        assertEquals("\fText inside bookmark 3\r\n\r\nPage 3 heading\r\n\r\nPage Text - Page 3\r\n\r\n",
                result.getPages().get(3).getText());
    }

    @Test
    public void TestExtractFormatted() throws ApiException {
        // Arrange
        TextOptions options = new TextOptions();
        options.setFileInfo(TestFiles.FormattedDocument.ToFileInfo());
        FormattedTextOptions textOptions = new FormattedTextOptions();
        textOptions.setMode("Html");
        options.setFormattedTextOptions(textOptions);
        TextRequest request = new TextRequest(options);

        // Act & Assert
        TextResult result = parseApi.text(request);

        assertNotNull(result);
        assertTrue(result.getText().contains("<b>Bold text</b>"));
        assertTrue(result.getText().contains("<i>Italic text</i>"));
        assertTrue(result.getText().contains("<h1>Heading 1</h1>"));
        assertTrue(result.getText().contains("<tr><td><p>table</p></td>"));
        assertTrue(result.getText().contains("<ol><li><i>First element</i>"));
        assertTrue(result.getText().contains("<a href=\"http://targetwebsite.domain\">Hyperlink </a>"));
    }

    @Test
    public void TestExtractFormattedPage() throws ApiException {
        // Arrange
        TextOptions options = new TextOptions();
        options.setFileInfo(TestFiles.FormattedDocument.ToFileInfo());
        FormattedTextOptions textOptions = new FormattedTextOptions();
        textOptions.setMode("Markdown");
        options.setFormattedTextOptions(textOptions);
        options.setStartPageNumber(1);
        options.setCountPagesToExtract(1);
        TextRequest request = new TextRequest(options);

        // Act & Assert
        TextResult result = parseApi.text(request);

        assertNotNull(result.getPages());
        assertTrue(result.getPages().get(0).getText().contains("**Second page bold text**"));
        assertTrue(result.getPages().get(0).getText().contains("# Second page heading"));
    }

    @Test
    public void TestExtractText_FileNotFoundResult() {
        // Arrange
        TextOptions options = new TextOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        TextRequest request = new TextRequest(options);

        // Act & Assert
        try {
            parseApi.text(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            System.out.println(ex.getMessage());
            assertEquals("Can't find file located at 'folder/NotExist.docx'.", ex.getMessage());
        }
    }

    @Test
    public void TestExtractText_NotSupportedFile() {
        // Arrange
        TextOptions options = new TextOptions();
        options.setFileInfo(TestFiles.JpegFile.ToFileInfo());
        TextRequest request = new TextRequest(options);

        // Act & Assert
        try {
            parseApi.text(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("The specified file 'image\\jpeg\\document.jpeg' has type which is not currently supported.",
                    ex.getMessage());
        }
    }

    @Test
    public void TestExtractText_IncorrectPassword() {
        // Arrange
        TextOptions options = new TextOptions();
        FileInfo fileInfo = TestFiles.PasswordProtected.ToFileInfo();
        fileInfo.setPassword("123");
        options.setFileInfo(fileInfo);
        TextRequest request = new TextRequest(options);

        // Act & Assert
        try {
            parseApi.text(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file 'words\\docx\\password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }
}
