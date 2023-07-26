public interface INotepad {

     void createPageAndWriteOnIt(String newText);
     void addTextToPage(int pageNumber, String textToBeAdded);
     void deleteText(int pageNumber);
     void reviewAllPages();
}
