package week1.factory.factories;

import week1.factory.documents.Document;
import week1.factory.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}