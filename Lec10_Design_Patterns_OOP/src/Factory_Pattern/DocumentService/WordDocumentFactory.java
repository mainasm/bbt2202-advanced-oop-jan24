package Factory_Pattern.DocumentService;

//Concrete factory
public class WordDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
