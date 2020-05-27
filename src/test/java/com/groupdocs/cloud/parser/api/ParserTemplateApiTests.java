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

public class ParserTemplateApiTests extends BaseApiTest {

    @Test
    public void TestCreateTemplate() throws ApiException {
        // Arrange
        CreateTemplateOptions options = new CreateTemplateOptions();
        Template template = getTemplate();
        options.setTemplate(template);
        options.setTemplatePath("templates/template_2.json");
        CreateTemplateRequest request = new CreateTemplateRequest(options);

        // Act & Assert
        TemplateResult result = templateApi.createTemplate(request);

        assertNotNull(result);
        assertTrue(result.getUrl().contains("storage/file/templates/template_2.json"));
    }

    @Test
    public void TestUpdateTemplate() throws ApiException {
        // Arrange
        CreateTemplateOptions options = new CreateTemplateOptions();
        Template template = getTemplate();
        options.setTemplate(template);
        options.setTemplatePath("templates/template_1.json");
        CreateTemplateRequest request = new CreateTemplateRequest(options);

        // Act & Assert
        templateApi.createTemplate(request);
        TemplateResult resultNew = templateApi.createTemplate(request);

        assertNotNull(resultNew);
        assertTrue(resultNew.getUrl().contains("storage/file/templates/template_1.json"));
    }

    @Test
    public void TestGetTemplate() throws ApiException {
        // Arrange
        CreateTemplateOptions options = new CreateTemplateOptions();
        Template template = getTemplate();
        options.setTemplate(template);
        options.setTemplatePath("templates/template_1.json");
        CreateTemplateRequest request = new CreateTemplateRequest(options);
        templateApi.createTemplate(request);

        TemplateOptions getOptions = new TemplateOptions();
        getOptions.setTemplatePath("templates/template_1.json");
        GetTemplateRequest getRequest = new GetTemplateRequest(getOptions);

        // Act & Assert
        Template getResult = templateApi.getTemplate(getRequest);

        assertNotNull(getResult);
        assertEquals(3, getResult.getFields().size());
        assertEquals(1, getResult.getTables().size());
    }

    @Test
    public void TestDeleteTemplate() throws ApiException {
        // Arrange
        CreateTemplateOptions options = new CreateTemplateOptions();
        Template template = getTemplate();
        options.setTemplate(template);
        options.setTemplatePath("templates/template_1.json");
        CreateTemplateRequest request = new CreateTemplateRequest(options);
        templateApi.createTemplate(request);

        TemplateOptions deleteOptions = new TemplateOptions();
        deleteOptions.setTemplatePath("templates/template_1.json");
        DeleteTemplateRequest deleteRequest = new DeleteTemplateRequest(deleteOptions);

        // Act
        templateApi.deleteTemplate(deleteRequest);
    }

    @Test
    public void TestTemplate_Delete_FileNotFoundResult() {
        // Arrange
        TemplateOptions deleteOptions = new TemplateOptions();
        deleteOptions.setTemplatePath("notExistTemplate.json");
        DeleteTemplateRequest deleteRequest = new DeleteTemplateRequest(deleteOptions);

        // Act & Assert
        try {
            templateApi.deleteTemplate(deleteRequest);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'notExistTemplate.json'.", ex.getMessage());
        }
    }

    @Test
    public void TestTemplate_Get_FileNotFoundResult() {
        // Arrange
        TemplateOptions getOptions = new TemplateOptions();
        getOptions.setTemplatePath("notExistTemplate.json");
        GetTemplateRequest getRequest = new GetTemplateRequest(getOptions);

        // Act & Assert
        try {
            templateApi.getTemplate(getRequest);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'notExistTemplate.json'.", ex.getMessage());
        }
    }

    @Test
    public void TestTemplate_Put_WithoutOptions() {
        // Arrange
        CreateTemplateOptions options = new CreateTemplateOptions();
        CreateTemplateRequest request = new CreateTemplateRequest(options);

        // Act & Assert
        try {
            templateApi.createTemplate(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
        }
    }

    @Test
    public void TestTemplate_Get_WithoutOptions() {
        // Arrange
        TemplateOptions options = new TemplateOptions();
        GetTemplateRequest request = new GetTemplateRequest(options);

        // Act & Assert
        try {
            templateApi.getTemplate(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
        }
    }

    @Test
    public void TestTemplate_Delete_WithoutOptions() {
        // Arrange
        TemplateOptions options = new TemplateOptions();
        DeleteTemplateRequest request = new DeleteTemplateRequest(options);

        // Act & Assert
        try {
            templateApi.deleteTemplate(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
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
