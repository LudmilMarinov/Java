public class SecureNotepad extends SimpleNotepad {
    private String password;

    /**
     * Constructor that creates a SecureNotepad
     * @param password
     */
    public SecureNotepad(String password) {
        super();
        this.password = password;
    }


    /**
     * Method that creates page and writes on it
     * @param newText
     * @param password
     */
    public void createPageAndWriteOnIt(String newText, String password) {
        if (checkPassword(password) == true) {
            super.createPageAndWriteOnIt(newText);
        }
    }

    /**
     * Adds text to page
     * @param pageNumber
     * @param textToBeAdded
     * @param password
     */
    public void addTextToPage(int pageNumber, String textToBeAdded, String password) {
        if (checkPassword(password) == true) {
            super.addTextToPage(pageNumber, textToBeAdded);
        }

    }

    /**
     * Deletes text from page
     * @param pageNumber
     * @param password
     */
    public void deleteText(int pageNumber, String password) {
        if (checkPassword(password) == true) {
            super.deleteText(pageNumber);
        }

    }

    /**
     * Reviews all pages
     * @param password
     */
    public void reviewAllPages(String password) {
        if (checkPassword(password) == true) {
            super.reviewAllPages();
        }
    }

    /**
     * Checks if password is correct
     * @param password
     * @return
     */
    private boolean checkPassword(String password) {

        boolean isPasswordCorrect = false;

        if (this.password != null) {
            if (this.password.equals(password)) {
                isPasswordCorrect = true;
            } else {
                System.out.println("Wrong password!");
            }
        }


        return isPasswordCorrect;

    }

}
