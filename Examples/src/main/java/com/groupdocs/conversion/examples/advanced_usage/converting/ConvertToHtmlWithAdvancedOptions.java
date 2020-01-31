package com.groupdocs.conversion.examples.advanced_usage.converting;

import com.groupdocs.conversion.Converter;
import com.groupdocs.conversion.examples.Constants;
import com.groupdocs.conversion.options.convert.MarkupConvertOptions;
import com.groupdocs.conversion.options.load.WordProcessingLoadOptions;

import java.io.File;


/**
* This example demonstrates how to convert password-protected document to HTML and specifying pages to be converted
*/
public class ConvertToHtmlWithAdvancedOptions {
    public static void run()
    {
        String outputFolder = Constants.getOutputDirectoryPath(null);
        String outputFile = new File(outputFolder, "converted.html").getPath();


        WordProcessingLoadOptions loadOptions = new WordProcessingLoadOptions();
        loadOptions.setPassword("12345");

        Converter converter = new Converter(Constants.SAMPLE_DOCX_WITH_PASSWORD, loadOptions);
        MarkupConvertOptions options = new MarkupConvertOptions();
        options.setPageNumber(2);
        options.setFixedLayout(true);
        options.setPagesCount(1);

        converter.convert(outputFile, options);


        System.out.print("\nPassword protected document converted successfully. \nCheck output in " + outputFolder);
    }
}