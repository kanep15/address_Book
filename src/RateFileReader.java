import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class RateFileReader {
    private String fileName;

    public RateFileReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public AddressBook readFile(){
        List<String> contactsStrings =  TextFileReader.getStrings(this.fileName);

        AddressBook book = new AddressBook();
        book.setOwner(fileName);
        //List<Contact> contacts = new List<Contact>();
        ArrayList<Contact> contacts = new ArrayList<>();

        for(int i = 0; i < contactsStrings.size(); i++){

            String[] fields = contactsStrings.get(i).split(",");
            Contact bob = new Contact(fields);
            //System.out.println("bob"+ bob.getInfo());
            contacts.add(bob);

        }

        book.setContacts(contacts);

        return book;

    }
}
