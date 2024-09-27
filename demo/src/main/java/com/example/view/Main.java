package com.example.view;

import com.example.entities.*;
import com.example.repository.*;
import com.example.services.*;
import com.example.view.*;
import com.example.resources.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choix;
        Scanner scanner = new Scanner(System.in);
        ClientServiceImpl clientServiceImpl = new ClientServiceImpl(RepositoryClient);

        do {
            System.out.println("Choisissez une option:");
            System.out.println("1-Creer Client");
            System.out.println("2-Lister client");
            System.out.println("3-Rechercher client Par Telephone");
            System.out.println("4-Creer Utilisateur");
            System.out.println("5-Lister Utilisateurs");
            System.out.println("6-Quitter");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    Client client = new Client();
                    System.out.println("Entrer le surnom");
                    client.setSurname(scanner.nextLine());
                    System.out.println("Entrer le Telephone");
                    client.setTelephone(scanner.nextLine());
                    System.out.println("Entrer l'email");
                    client.setAddresse(scanner.nextLine());
                    clientServiceImpl.create(client);
                    break;
                case 2:
                    List<Client> clients = clientServiceImpl.show();
                    clients.forEach(System.out::println);
                    break;
                    while (choix != 6);

        scanner.close();  
    }

}
}
}