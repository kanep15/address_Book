public class Contact {
    String name;
    String address;
    String phone;
    String eMail;

    public Contact(String name, String address, String phone, String eMail) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }
    public String getInfo(String contactName){
        return(address + phone + eMail);
    }
}
