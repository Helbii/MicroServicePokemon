package com.micro.inventoryservice.queue;
import jakarta.persistence.*;
import com.micro.inventoryservice.model.Pokemons;
import com.micro.inventoryservice.repository.PokemonsRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class Receiver {

    @Autowired
    private PokemonsRepository pokemonRepository;
    @RabbitListener(queues = "${queue.name}")
    public void receive(Pokemons pokemon) {
        pokemonRepository.save(pokemon);
        System.out.println("Pokemon saved in database: " + pokemon);
    }
}