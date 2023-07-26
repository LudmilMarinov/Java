public class Demo {
    public static void main(String[] args) {
        SimpleNotepad simpleNotepad = new SimpleNotepad();
        simpleNotepad.createPageAndWriteOnIt("Text");
        simpleNotepad.createPageAndWriteOnIt("Text2");
        simpleNotepad.reviewAllPages();
        System.out.println();

        simpleNotepad.addTextToPage(2,"Text3");
        simpleNotepad.reviewAllPages();
        System.out.println();

        simpleNotepad.deleteText(1);
        simpleNotepad.reviewAllPages();
        System.out.println();

        SecureNotepad secureNotepad = new SecureNotepad("1234");
        secureNotepad.createPageAndWriteOnIt("Secure", "1234");
        secureNotepad.reviewAllPages("1234");
        System.out.println();

        secureNotepad.deleteText(1,"1235");
        secureNotepad.reviewAllPages("1234");

        ElectronicSecureNotepad electronicSecureNotepad = new ElectronicSecureNotepad("12345");
        electronicSecureNotepad.createPageAndWriteOnIt("Electronic secure", "12345");
        electronicSecureNotepad.reviewAllPages("12345");
        System.out.println();

        electronicSecureNotepad.start();
        electronicSecureNotepad.createPageAndWriteOnIt("Electronic secure", "12345");
        electronicSecureNotepad.reviewAllPages("12345");
    }
}
