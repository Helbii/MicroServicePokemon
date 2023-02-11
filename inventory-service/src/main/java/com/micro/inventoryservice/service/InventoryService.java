package com.micro.inventoryservice.service;
import com.micro.inventoryservice.model.Eggs;
import com.micro.inventoryservice.model.Inventory;
import com.micro.inventoryservice.model.Pokemons;
import com.micro.inventoryservice.model.Users;
import com.micro.inventoryservice.repository.EggsRepository;
import com.micro.inventoryservice.repository.PokemonsRepository;
import com.micro.inventoryservice.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryService {


        @Autowired
        private EggsRepository eggsRepository;
        @Autowired
        private UsersRepository userRepository;
        @Autowired
        private PokemonsRepository pokemonsRepository;
        private Integer deleteEggsById(Integer id){
            eggsRepository.deleteEggsById(id);
            return id;
        }
        private Eggs save(Eggs eggs){
            return eggsRepository.save(eggs);
        }
        private List<Eggs> getAllEggs(){
            return (List<Eggs>) eggsRepository.findAll();
        }
        private Eggs getEggsByName(String name){
            return eggsRepository.findEggsByName(name);
        }

        private List<Eggs> getAllEggsByUserid(Integer userid){
            return eggsRepository.findEggsByUserid(userid);
        }

        private Users save(Users Users) {
            return userRepository.save(Users);
        }

        private List<Users> getAllUsers() {
            return (List<Users>) userRepository.findAll();
        }

        private Users getUserInformation(Integer id){
            return userRepository.findUserById(id);
        }

        private Pokemons save(Pokemons pokemon){return pokemonsRepository.save(pokemon); }

        private List<Pokemons> getAllPokemonByUserId(Integer userid){return pokemonsRepository.findPokemonByUserid(userid); }

        public String getInventoryOfUser(Integer userid){
            List<Pokemons> pokemon = getAllPokemonByUserId(userid);
            Users users = getUserInformation(userid);
            List<Eggs> egg = getAllEggsByUserid(userid);

            Inventory inventory = new Inventory(userid, users.getName(), users.getGold(), pokemon, egg);
            return inventory.toString();
        }
        public String removePokemonFromInventory(Integer userid, Pokemons pokemons){
            pokemonsRepository.delete(pokemonsRepository.findPokemonsByUseridAndId(userid, pokemons.getId()));
            return pokemons.stringify();
        }
        public String removeEggFromInventory(Eggs eggs){
            List<Eggs> eggsList = getAllEggs();
            Integer idEggDeleted = eggs.getId();
            eggsRepository.delete(eggs);
            List<Eggs> eggListAfter = getAllEggs();
            return eggs.stringify();
        }
        public String addEggToInventory(Eggs eggs, Integer userid){
            eggs.setUserid(userid);
            eggsRepository.save(eggs);
            return eggs.stringify();
        }

        public String addGoldToUserInventory(Integer userid, Integer gold){
            Users user = userRepository.findUserById(userid);
            user.setGold(user.getGold() + gold);
            userRepository.deleteById(userid);
            userRepository.save(user);
            return user.getGold().toString();
        }


    public String removeGoldToUserInventory(Integer userid, Integer gold){
            Users user = userRepository.findUserById(userid);
            user.setGold(user.getGold() - gold);
            userRepository.deleteById(userid);
            userRepository.save(user);
            return user.getGold().toString();
    }



        //public String addEggsToInventory(Integer userid, EggsUser eggsUser){





        //}




}
