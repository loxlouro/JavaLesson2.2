import java.io.File;

public class Main {
    public static void main(String[] args) {
        txtWriter theTXTWriter = new txtWriter();
        JSONWriter theJSONWriter = new JSONWriter();
        XMLWriter theXMLWriter = new XMLWriter();
        File JSON = new File("src/JSON.JSON");
        File TXT = new File("src/TXT.TXT");
        File XML = new File("src/XML.XLM");
        theTXTWriter.EnterWrite(TXT.getAbsolutePath(),"TXT.TXT", "Ivan Ivanov");
        theJSONWriter.EnterWrite(JSON.getAbsolutePath(), "JSON.JSON", "{IVAN IVANOV}");
        theXMLWriter.EnterWrite(XML.getAbsolutePath(), "XML.XML"," <?xml version=\"1.0\" encoding=\"utf-8\"?");
    }
}