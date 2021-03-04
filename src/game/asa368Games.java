/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author a3yko
 */
public class asa368Games {
    
    
    public static void main(String[] args) {
        Game game1 = new Game("Football Manager 2019","Sports Interactive");
        game1.setPrice(49.99);
        game1.setCategory(Catagories.SPORTS);
        
        Game game2 = new Game("The Witcher: Enhanced Edition Director's Cut", "CD PROJEKT RED", Catagories.RPG, 9.99);
        game2.setDiscount(.69);
        
        Game game3 = new Game();
        game3.setName("Mittelborg:City of mages");
        game3.setDeveloper("Armatur Games");
        game3.setPrice(14.99);
        game3.setCategory(Catagories.STRATEGY);
        game3.setDiscount(0.9);
        
        System.out.println("Game 1:");
        System.out.println("Name: " + game1.getName());
        System.out.println("Developer: " + game1.getDeveloper());
        System.out.println("Price: " + game1.getPrice() );
        System.out.println("Category: " + game1.getCategory());
        System.out.println("Version: " + game1.getVersion());
        System.out.println("\n");
        System.out.println("Game 2:");
        System.out.println("Name: " + game2.getName());
        System.out.println("Developer: " + game2.getDeveloper());
        System.out.println("Price: " + game2.getPrice());
        System.out.println("Category: " + game2.getCategory());
        System.out.println("Version: " + game2.getVersion());
        System.out.println("\n");
        System.out.println("Game 3:");
        System.out.println("Name: " + game3.getName());
        System.out.println("Developer: " + game3.getDeveloper());
        System.out.println("Price: " + game3.getPrice());
        System.out.println("Category: " + game3.getCategory());
        System.out.println("Version: " + game3.getVersion());
        System.out.println("\n");
        System.out.println("Number of Games: " + Game.numberOfGames);
    }
    
}
