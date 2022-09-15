package com.projet.immob.Controller;

import com.projet.immob.model.Client;
import com.projet.immob.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ClientController {
    private ClientService clientService;

    @GetMapping("")
    public List<Client> showAllClient(){
        return clientService.getAllClient();
    }

    @GetMapping("/Client/{id_client}")
    public Optional<Client> getById(@PathVariable int id_client){
        return clientService.getAllClientId(id_client);
    }

    @PostMapping("/Client")
    public Client insertClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @DeleteMapping("/Client/{id_client}")
    public void deleteClient (@PathVariable Iterable id_client){
        clientService.deleteClientById(id_client);
    }

    @PatchMapping("/Client/{id_client}")
    public void ModifierClient(
            @PathVariable Iterable id_client,
            @RequestParam(name = "date_de_naissance", required = false)Date date_de_naissance,
            @RequestParam(name = "email", required = false) String email,
            @RequestParam(name = "nom", required = false) String nom,
            @RequestParam(name = "prenom", required = false) String prenom
    ){

    }
}
