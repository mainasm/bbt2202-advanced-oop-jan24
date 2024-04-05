package Factory_Pattern.DocumentService;

import java.util.HashMap;
import java.util.Map;

//Factory utilization
public class DocumentManager {
    private static final Map<String, DocumentFactory> factories = new HashMap<>();

    static {
        factories.put("WORD", new WordDocumentFactory());
        factories.put("PDF", new PdfDocumentFactory());
        factories.put("SPREADSHEET", new SpreadsheetFactory());
    }

    public static Document createDocument(String type) {
        return factories.getOrDefault(type.toUpperCase(), () -> null).createDocument();
    }
}
