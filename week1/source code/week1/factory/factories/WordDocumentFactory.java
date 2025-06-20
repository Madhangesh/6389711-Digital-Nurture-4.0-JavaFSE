package week1.factory.factories;

import week1.factory.documents.Document;
import week1.factory.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}