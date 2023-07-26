public class ElectronicSecureNotepad extends SecureNotepad implements IElectronicDevice {

    private boolean isStarted;

    public ElectronicSecureNotepad(String password) {
        super(password);
    }

    @Override
    /**
     * Starts the device
     */
    public void start() {
        if (isStarted == false) {
            this.isStarted = true;
        }
    }

    @Override
    /**
     * Stops the device
     */
    public void stop() {
        if (isStarted == true) {
            this.isStarted = false;
        }
    }

    @Override
    /**
     * Checks if device is started
     */
    public boolean isStarted() {
        if (isStarted == false) {
            System.out.println("You must turn on the device first!");
        }
        return this.isStarted;
    }

    @Override
    /**
     * Creates a new page and writes on it
     */
    public void createPageAndWriteOnIt(String newText, String password) {
        if (isStarted() == true) {
            super.createPageAndWriteOnIt(newText, password);
        }
    }

    @Override
    /**
     * Adds text to page
     */
    public void addTextToPage(int pageNumber, String textToBeAdded, String password) {
        if (isStarted() == true) {
            super.addTextToPage(pageNumber, textToBeAdded, password);
        }

    }

    @Override
    /**
     * Deletes text
     */
    public void deleteText(int pageNumber, String password) {
        if (isStarted() == true) {
            super.deleteText(pageNumber, password);
        }

    }

    @Override
    /**
     * Reviews all pages
     */
    public void reviewAllPages(String password) {
        if (isStarted() == true) {
            super.reviewAllPages(password);
        }
    }

}
