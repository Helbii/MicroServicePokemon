package com.micro.inventoryservice.queue;
import com.micro.inventoryservice.model.Pokemons;
import com.micro.inventoryservice.repository.PokemonsRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Receiver {

    @Autowired
    private PokemonsRepository pokemonRepository;
    @RabbitListener(queues = "hatching")
    public void receive(Pokemons pokemon) {
        pokemonRepository.save(pokemon);
        System.out.println("Pokemon saved in database: " + pokemon);
    }
}