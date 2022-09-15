package com.projet.immob.service;

import com.projet.immob.model.Client;
import com.projet.immob.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor

public class ClientService {
    private ClientRepository clientRepository;

    public List<Client> getAllClient(){
        return clientRepository.findAll() ;
    }
    public Optional<Client> getAllClientId(int id_client){
        return clientRepository.findById(id_client);
    }
    public Client saveClient(Client client){
        return clientRepository.save(client);
    }
    public void deleteClientById(Iterable id_client){
        clientRepository.deleteAllById(id_client);
    }
    public void UpdateClient (int id_client, Date date_de_naissance, String email, String nom, String prenom){
        Optional<Client> OptionalClient =clientRepository.findById(id_client);

        if (OptionalClient.isPresent()){
            Client client = OptionalClient.get();
            client.setNom(nom);
            client.setPrenom(prenom);
            client.setDate_de_naissance((java.sql.Date) date_de_naissance);
            client.setEmail(email);
            clientRepository.save(client);
        }else{
            throw new IllegalArgumentException("Client not found");
        }
    }

}
