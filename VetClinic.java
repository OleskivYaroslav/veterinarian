/*
* Клас описує клініку
* @author Oleskiv
* @sinse 25.04.2016
* */
public class VetClinic{
    /*Список клієнтів
    * */
    private final Client[] clients;

    public VetClinic(final int size){
        this.clients=new Client[size];
    }
    /*Додати клієнта
    * @param position позиція
    * @param client клієнт
    * */
    public void addClient(final int position, final Client client){
        this.clients[position]=client;
    }

    public Client[] findClientsByPetName(final String name){

        return  new Client[]{};
    }
}