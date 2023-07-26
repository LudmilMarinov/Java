import java.security.PublicKey;

public class Page {
    private String article;
    private String text;
    private int pageNumber;

    /**
     * Constructor that creates page
     * @param pageNumber
     */
    public Page(int pageNumber) {
        this.pageNumber = pageNumber;
        this.article = "Page" + this.pageNumber;
    }

    /**
     * Method to add text
     * @param newText
     */
    public void addText(String newText) {
        this.text = newText;
    }

    /**
     * Method to delete text
     */
    public void deleteText() {
        if (this.text != null) {
            this.text = null;
        }
    }

    /**
     * Method to review page
     * @return
     */
    public String reviewPage() {
        String articlePlusText = this.article  + "\n" + this.text;
        return articlePlusText;
    }

    /**
     * Method that returns page number
     * @return
     */
    public int getPageNumber() {
        return this.pageNumber;
    }

}
