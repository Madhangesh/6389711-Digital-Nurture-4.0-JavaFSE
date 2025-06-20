package week1.factory;


import week1.factory.documents.Document;
import week1.factory.factories.DocumentFactory;
import week1.factory.factories.ExcelDocumentFactory;
import week1.factory.factories.PdfDocumentFactory;
import week1.factory.factories.WordDocumentFactory;

public class TestFactoryPattern {
    public static void main(String[] args) {
        // Create Word Document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        // Create PDF Document-
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        // Create Excel Document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}