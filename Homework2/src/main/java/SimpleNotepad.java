import java.util.ArrayList;
import java.util.List;

public class SimpleNotepad implements INotepad {
    private List<Page> pages = new ArrayList<>();

    @Override
    /**
     * Creates page and writes on it
     */
    public void createPageAndWriteOnIt(String newText) {
        Page newPage = new Page(this.pages.size() + 1);
        this.pages.add(newPage);
        newPage.addText(newText);
    }

    @Override
    /**
     * Adds text to page
     */
    public void addTextToPage(int pageNumber, String textToBeAdded) {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
        foundPage.addText(textToBeAdded);
    }

    @Override
    /**
     * deletes text
     */
    public void deleteText(int pageNumber) {
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
    }

    @Override
    /**
     * reviews all pages
     */
    public void reviewAllPages() {
        for (Page page : pages) {
            System.out.println(page.reviewPage());
        }
    }

    /**
     * finds a page
     * @param pageNumber
     * @return
     */
    private Page findPage(int pageNumber) {

        Page foundPage = null;

        int currentPageNumber = 0;

        for (Page page : pages) {
            currentPageNumber = page.getPageNumber();
            if (currentPageNumber == pageNumber) {
                foundPage = page;
                break;
            }
        }

        return foundPage;
    }
}
