package htl;

public class HospitalTest {
    public static void main(String[] args) {

        Hospital Hospital1 = new Hospital("Klagenfurt");
        Hospital1.addRoom("A1",3,false);

        Hospital Hospital2 = new Hospital("Villach");
        Hospital2.addRoom("I1",2,true );
        Hospital2.addRoom("I2",2,true );
        Hospital2.addRoom("A2");

        System.out.println(Hospital1);
        System.out.println(Hospital2);

        Hospital2.changeBedsInRoom("I1", 1);
        Hospital2.changeBedsInRoom("I2", 1);

       System.out.println(Hospital2);


    }

}
