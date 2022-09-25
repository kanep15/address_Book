public class Contact {
    String name;
    String address;
    String phone;
    String eMail;

    public Contact(String[] info) {
        name = info[0];
        address = info[1];
        phone = info[2] ;
        eMail = info[3];
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String geteMail() {
        return eMail;
    }

    public String getInfo(){
        return(address+" " + phone+' ' + eMail);
    }
}
