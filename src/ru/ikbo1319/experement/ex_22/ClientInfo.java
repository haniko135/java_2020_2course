package ru.ikbo1319.experement.ex_22;

public class ClientInfo {
    private String name;
    private String inn;

    public ClientInfo(String nameClient, String innClient) throws InnError{
        this.name = nameClient;
        if(innClient.length() != 10){
            throw new InnError();
        }
        else {
            this.inn = innClient;
        }
    }
}
