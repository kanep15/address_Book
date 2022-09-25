import java.util.List;

public class AddressBook {
    String owner;
    List<Contact> contacts;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    public void addContacts(Contact newContact){
        contacts.add(newContact);
    }
    public void printContacts(){
        for(int i = 0; i < contacts.size();i++){
            System.out.println(contacts.get(i));
        }
    }
}

