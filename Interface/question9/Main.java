package Interface.question9;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("This is a sample document with some content.");

        document.search("sample");

        WebPage webPage = new WebPage("https://www.honore.com", "<html><body>This is a sample webpage.</body></html>");

       
        webPage.search("webpage");
    }

}


