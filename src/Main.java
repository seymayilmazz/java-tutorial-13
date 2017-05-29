/**
 * Created by Şeyma Yılmaz on 29.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Şeyma");
        person.setAge(22);


        Address address1 = new Address();
        address1.setCity("Kocaeli");
        address1.setStreet("Fatih Mahallesi");
        address1.setPostCode("41000");

        Address address2 = new Address();
        address2.setCity("istanbul");
        address2.setStreet("Pendik");
        address2.setPostCode("34000");

        person.setAddress(address1);
        person.setAddress(address2);
        System.out.println();

    }

}
