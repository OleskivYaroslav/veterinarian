/*
* Реалізація клініки
* @author Oleskiv
* @sinse 25.04.2016
* */
public class ClinicRunner{

    public static void main(String[] arg){
        final VetClinic clinic = new VetClinic(10);

        clinic.addClient(0, new Client("Brown", new Cat("Digy")));

        clinic.addClient(1, new Client("Nick", new Dog(new Animal("Sparky"))));


    }
}