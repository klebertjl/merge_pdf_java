package fr.epita.example;

// Merging multiple pdf documents here

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args)
            throws IOException
    {

        // loading all the pdf files we wish to merge

        File file1 = new File(
                "C:\\temp\\poubelle\\Angular-1-installation-architecture-et-components.pdf");
        File file2 = new File(
                "C:\\temp\\poubelle\\Angular-2-les-concepts-essentiels.pdf");

        // Instantiating PDFMergerUtility class

        PDFMergerUtility obj = new PDFMergerUtility();

        // Setting the destination file path

        obj.setDestinationFileName(
                "C:\\temp\\result.pdf");

        // Add all source files, to be merged

        obj.addSource(file1);
        obj.addSource(file2);

        // Merging documents

        obj.mergeDocuments();

        System.out.println(
                "PDF Documents merged to a single file");
    }
}
