package Factory_Pattern.DocumentService;

//Concrete factory
public class SpreadsheetFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new Spreadsheet();
    }
}
