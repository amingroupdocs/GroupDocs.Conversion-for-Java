package com.groupdocs.conversion.examples;

import com.groupdocs.conversion.examples.advanced_usage.converting.*;
import com.groupdocs.conversion.examples.advanced_usage.converting.common.AddWatermark;
import com.groupdocs.conversion.examples.advanced_usage.converting.common.ConvertSpecificPages;
import com.groupdocs.conversion.examples.advanced_usage.loading.LoadPasswordProtectedDocument;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.cad.ConvertCadAndSpecifyLayouts;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.cad.ConvertCadAndSpecifyWidthAndHeight;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.csv.ConvertCsvByConvertingDateTimeAndNumericData;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.csv.ConvertCsvBySpecifyingDelimiter;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.csv.ConvertCsvBySpecifyingEncoding;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.email.ConvertEmailWithAlteringFieldsVisibility;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.email.ConvertEmailWithTimezoneOffset;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.note.ConvertNoteBySpecifyingFontSubstitution;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.pdf.ConvertPdfAndFlattenAllFields;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.pdf.ConvertPdfAndHideAnnotations;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.pdf.ConvertPdfAndRemoveEmbeddedFiles;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.presentation.ConvertPresentationByHiddingComments;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.presentation.ConvertPresentationBySpecifyingFontSubstitution;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.presentation.ConvertPresentationWithHiddenSlidesIncluded;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.spreadsheet.*;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.word_processing.ConvertWordProcessingByHiddingComments;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.word_processing.ConvertWordProcessingByHiddingTrackedChanges;
import com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.word_processing.ConvertWordProcessingBySpecifyingFontSubstitution;
import com.groupdocs.conversion.examples.advanced_usage.loading.loading_documents_from_different_sources.*;
import com.groupdocs.conversion.examples.basic_usage.GetPossibleConversions;
import com.groupdocs.conversion.examples.basic_usage.GetSourceDocumentInfo;
import com.groupdocs.conversion.examples.basic_usage.convert_to_html.ConvertToHtml;
import com.groupdocs.conversion.examples.basic_usage.convert_to_image.ConvertToJpg;
import com.groupdocs.conversion.examples.basic_usage.convert_to_image.ConvertToPng;
import com.groupdocs.conversion.examples.basic_usage.convert_to_image.ConvertToPsd;
import com.groupdocs.conversion.examples.basic_usage.convert_to_presentation.ConvertToPresentation;
import com.groupdocs.conversion.examples.basic_usage.convert_to_spreadsheet.ConvertToSpreadsheet;
import com.groupdocs.conversion.examples.basic_usage.convert_to_word_processing.ConvertToWordProcessing;
import com.groupdocs.conversion.examples.basic_usage.convert_to_pdf.ConvertToPdf;
import com.groupdocs.conversion.examples.quick_start.HelloWorld;
import com.groupdocs.conversion.examples.quick_start.SetLicenseFromFile;
import com.groupdocs.conversion.examples.quick_start.SetLicenseFromStream;
//import com.groupdocs.conversion.examples.quick_start.SetMeteredLicense;

public class RunExamples {

	public static void main(String[] args) throws Throwable {

        System.out.print("Open RunExamples.cs. \nIn Main() method uncomment the example that you want to run.");
        System.out.print("=====================================================");

        //NOTE: Please uncomment the example you want to try out

        // Quick Start

        SetLicenseFromFile.run();
        SetLicenseFromStream.run();
        //SetMeteredLicense.run(); //todo fails
        
        HelloWorld.run();        

        // Basic Usage
        GetPossibleConversions.run();
        GetSourceDocumentInfo.run();

        // Convert document to HTML
        ConvertToHtml.run();

        // Convert document to Image
        ConvertToJpg.run();
        ConvertToPng.run();
        ConvertToPsd.run();       

        // Convert document to PDF
        ConvertToPdf.run();        

        // Convert document to Presentation
        ConvertToPresentation.run();        

        // Convert document to Spreadsheet
        ConvertToSpreadsheet.run();        

        // Convert document to WordProcessing
        ConvertToWordProcessing.run();
               

        // Advanced Usage
        // Common rendering options
        AddWatermark.run();
        ConvertSpecificPages.run();        

        // Loading
        LoadPasswordProtectedDocument.run();

        // Loading documents from different sources
        LoadDocumentFromLocalDisk.run();
        LoadDocumentFromStream.run();
        //LoadDocumentFromUrl.run(); // TODO: Check - An exception occured while executing the Java class. com.groupdocs.conversion.internal.c.a.w.FileCorruptedException cannot be cast to java.lang.RuntimeException
        //LoadDocumentFromFtp.run();
        //LoadDocumentFromAmazonS3.run();
        //LoadDocumentFromAzureBlobStorage.run();

        // Load options by document type
        // Cad
        //ConvertCadAndSpecifyLayouts.run(); // TODO - com.groupdocs.conversion.exceptions.FileTypeNotSupportedException: Can not save a to pdf
        
        //ConvertCadAndSpecifyWidthAndHeight.run();   // TODO - com.groupdocs.conversion.exceptions.FileTypeNotSupportedException: Can not save a to pdf    

        // Csv
        ConvertCsvByConvertingDateTimeAndNumericData.run();
        ConvertCsvBySpecifyingDelimiter.run();
        ConvertCsvBySpecifyingEncoding.run();        

        // Email
        ConvertEmailWithAlteringFieldsVisibility.run();
        ConvertEmailWithTimezoneOffset.run();        

        // Note
        //ConvertNoteBySpecifyingFontSubstitution.run();        // TODO - Caused by: com.groupdocs.conversion.internal.c.a.n.system.exceptions.d: DefaultFont is not initialized properly: null Parameter name: DefaultFont

        // Pdf
        ConvertPdfAndFlattenAllFields.run();
        ConvertPdfAndHideAnnotations.run();
        ConvertPdfAndRemoveEmbeddedFiles.run();

        // Presentation
        ConvertPresentationByHiddingComments.run();
        ConvertPresentationBySpecifyingFontSubstitution.run();
        ConvertPresentationWithHiddenSlidesIncluded.run();

        // Spreadsheet
        ConvertSpreadsheetAndHideComments.run();
        ConvertSpreadsheetByShowingGridLines.run();
        ConvertSpreadsheetBySkippingEmptyRowsAndColumns.run();
        ConvertSpreadsheetBySpecifyingFontsubstitution.run();
        ConvertSpreadsheetBySpecifyingRange.run();
        ConvertSpreadsheetWithHiddenSheetsIncluded.run();


        // WordProcessing
        ConvertWordProcessingByHiddingComments.run();
        ConvertWordProcessingByHiddingTrackedChanges.run();
        ConvertWordProcessingBySpecifyingFontSubstitution.run();

        // Convert options
        ConvertToHtmlWithAdvancedOptions.run();
        //ConvertToImageWithAdvancedOptions.run(); // TODO - com.groupdocs.conversion.internal.c.a.ms.System.NotSupportedException: Saving complete multi page document to image is not supported. Please save by page.
        
        ConvertToPdfWithAdvancedOptions.run();
        ConvertToPresentationWithAdvancedOptions.run();
        ConvertToSpreadsheetWithAdvancedOptions.run();
        ConvertToWordProcessingWithAdvancedOptions.run();
        
        System.out.print("\nAll done.");
	}
}
