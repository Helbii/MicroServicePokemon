package com.IMT.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	String playerPseudo = Lucazette;
	int playerLevel = 5;
	int playerGold = 500;
	int playerExperience = 5000;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	private static String showPseudo(idJoueur){
		//recuperer l'exp dans la DB  en fonction de l'idJoueur
		return playerPseudo;
	}

	private static int showExperince(idJoueur){
		//recuperer l'exp dans la DB  en fonction de l'idJoueur
		return playerExperience;
	}

	private static int showLevel(idJoueur){
		//recuperer le niveau dans la DB  en fonction de l'idJoueur
		return playerLevel;
	}

	private static int showGold(idJoueur){
		//recuperer l'or dans la DB  en fonction de l'idJoueur
		return playerGold;
	}	
}
