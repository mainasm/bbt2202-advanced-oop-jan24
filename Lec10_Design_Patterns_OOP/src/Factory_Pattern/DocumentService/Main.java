package Factory_Pattern.DocumentService;

public class Main {
    public static void main(String[] args) {
        Document wordDoc = DocumentManager.createDocument("WORD");
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        // Similar for PDF and Spreadsheet documents
    }
}