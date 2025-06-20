package week1.factory.factories;

import week1.factory.documents.Document;
import week1.factory.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}