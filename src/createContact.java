import java.util.Scanner;

//name = info[0];
  //      address = info[1];
    //    phone = info[2] ;
      //  eMail = info[3];

public class createContact {
        public Contact getData(){
            System.out.println("heelo");
            Scanner infoIn = new Scanner(System.in);
            String[] options ={"name","address","phone number","email"};
            String[] contactInfo ={"","","","",""};

            for(int i = 0; i <4;i++){
                System.out.println("please enter "+options[i]);
                contactInfo[i] = infoIn.nextLine();

            }

            //should probably add some checks here but its only a test??
            Contact newContact = new Contact(contactInfo);
            //System.out.println(newContact.getInfo());

            return newContact;





    }
}
