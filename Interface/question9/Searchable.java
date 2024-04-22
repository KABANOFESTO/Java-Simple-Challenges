package Interface.question9;

 interface Searchable {
     void search(String keyword);
}
class Document implements Searchable{
     private String content;

     Document(String content){
         this.content = content;
     }
    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in the document.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the document.");
        }
    }

}
class WebPage implements Searchable{
    private String url;
    private String htmlContent;

    WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    public void search(String keyword) {
        if (htmlContent.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found on the webpage: " + url);
        } else {
            System.out.println("Keyword '" + keyword + "' not found on the webpage: " + url);
        }
    }

}
