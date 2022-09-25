import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello");
        RateFileReader test = new RateFileReader("C:\\Users\\User\\IdeaProjects\\address_Book\\src\\Kane.txt");

        AddressBook tester = test.readFile();

        System.out.println(tester.getContacts().get(1).getName());

        createContact test1 = new createContact();
        Contact newContact = test1.getData();

        tester.addContacts(newContact);

        System.out.println(tester.getContacts().get(2).getInfo());
    }

}
