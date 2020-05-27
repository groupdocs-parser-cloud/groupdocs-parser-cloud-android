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

import java.util.List;
import java.util.Arrays;

import com.groupdocs.cloud.parser.client.ApiException;
import com.groupdocs.cloud.parser.model.requests.*;
import com.groupdocs.cloud.parser.model.*;

import org.junit.Test;

public class ParserParseApiTests extends BaseApiTest {

    @Test
    public void TestParseDocument() throws ApiException {
        // Arrange
        ParseOptions options = new ParseOptions();
        options.setFileInfo(TestFiles.TemplateDocumentDocx.ToFileInfo());
        Template template = getTemplate();
        options.setTemplate(template);
        ParseRequest request = new ParseRequest(options);

        // Act & Assert
        ParseResult result = parseApi.parse(request);

        assertNotNull(result);
        assertNotNull(result.getFieldsData());
        assertEquals(Integer.valueOf(4), result.getCount());

        List<String> dataFieldNames = Arrays.asList(new String[] { "FIELD1", "RELATEDFIELD2", "REGEX", "TABLECELLS" });
        for (FieldData field : result.getFieldsData()) {
            assertTrue(dataFieldNames.contains(field.getName()));
            if (field.getName().equals("TABLECELLS")) {
                assertEquals(Integer.valueOf(4), field.getPageArea().getPageTableArea().getColumnCount());
                assertEquals(Integer.valueOf(3), field.getPageArea().getPageTableArea().getRowCount());
            }
        }
    }

    @Test
    public void TestParseDocument_FileNotFoundResult() {
        // Arrange
        ParseOptions options = new ParseOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        Template template = getTemplate();
        options.setTemplate(template);
        options.setTemplatePath("templates/document-template.json");
        ParseRequest request = new ParseRequest(options);

        // Act & Assert
        try {
            parseApi.parse(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder/NotExist.docx'.", ex.getMessage());
        }
    }

    @Test
    public void TestParseDocument_WithoutOptions() {
        ParseOptions options = new ParseOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        ParseRequest request = new ParseRequest(options);
        // Act & Assert
        try {
            parseApi.parse(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
        }
    }

    @Test
    public void TestParseDocument_NotSupportedFile() {
        ParseOptions options = new ParseOptions();
        options.setFileInfo(TestFiles.JpegFile.ToFileInfo());
        Template template = getTemplate();
        options.setTemplate(template);
        options.setTemplatePath("templates/document-template.json");
        ParseRequest request = new ParseRequest(options);
        try {
            parseApi.parse(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("The specified file 'image\\jpeg\\document.jpeg' has type which is not currently supported.",
                    ex.getMessage());
        }
    }

    @Test
    public void TestParseDocument_IncorrectPassword() {
        // Arrange
        ParseOptions options = new ParseOptions();
        Template template = getTemplate();
        options.setTemplate(template);
        options.setTemplatePath("templates/document-template.json");
        FileInfo fileInfo = TestFiles.PasswordProtected.ToFileInfo();
        fileInfo.setPassword("123");
        options.setFileInfo(fileInfo);
        ParseRequest request = new ParseRequest(options);

        // Act & Assert
        try {
            parseApi.parse(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file 'words\\docx\\password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }

    private Template getTemplate() {
        Field field1 = new Field();
        field1.setFieldName("Field1");
        field1.setPageIndex(4);
        FieldPosition fieldPosition1 = new FieldPosition();
        fieldPosition1.setFieldPositionType("Fixed");
        Rectangle rect1 = new Rectangle();
        Size size1 = new Size();
        size1.setHeight(30d);
        size1.setWidth(140d);
        Point position1 = new Point();
        position1.setX(0d);
        position1.setY(0d);
        rect1.setSize(size1);
        rect1.setPosition(position1);
        fieldPosition1.setRectangle(rect1);
        field1.setFieldPosition(fieldPosition1);

        Field field2 = new Field();
        field2.setFieldName("RelatedField2");
        FieldPosition fieldPosition2 = new FieldPosition();
        fieldPosition2.setFieldPositionType("Linked");
        fieldPosition2.setLinkedFieldName("Field1");
        fieldPosition2.setIsBottomLinked(true);
        fieldPosition2.setIsRightLinked(true);
        Size size2 = new Size();
        size2.setWidth(209d);
        size2.setHeight(24d);
        fieldPosition2.setSearchArea(size2);
        fieldPosition2.setAutoScale(false);
        field2.setFieldPosition(fieldPosition2);

        Field field3 = new Field();
        field3.setFieldName("Regex");
        FieldPosition fieldPosition3 = new FieldPosition();
        fieldPosition3.setFieldPositionType("Regex");
        fieldPosition3.setRegex("REGEX TEXT 123");
        field3.setFieldPosition(fieldPosition3);

        Table table = new Table();
        table.setTableName("TableCells");
        table.setPageIndex(5);
        DetectorParameters detectorparams = new DetectorParameters();
        Rectangle rect = new Rectangle();
        Size size = new Size();
        size.setHeight(400d);
        size.setWidth(600d);
        Point position = new Point();
        position.setX(0d);
        position.setY(0d);
        rect.setSize(size);
        rect.setPosition(position);

        detectorparams.setRectangle(rect);
        table.setDetectorParameters(detectorparams);

        List<Field> fields = Arrays.asList(new Field[] { field1, field2, field3 });
        List<Table> tables = Arrays.asList(new Table[] { table });
        Template options = new Template();
        options.setFields(fields);
        options.setTables(tables);

        return options;
    }

}
