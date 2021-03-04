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
public class Game {
    private String name, developer;
    private Double price;
    private Catagories catagory;
    private int version;
    private Double discount = 1.0;
    public static int numberOfGames;
    
    public Game(){
        this.developer = "";
        this.name = "";
        numberOfGames += 1;
    }
    
    public Game(String name, String dev){
        this();
        this.name = name;
        this.developer = dev;
        this.version = 0;
    }
    
    public Game(String name, String dev, Catagories category, Double price){
        this(name,dev);
        this.catagory = category;
        this.price = price;
        this.version = 1;
        
    }
    
    public void setName(String name){
        this.name = name;
        this.version += 1;
    }
    
    public void setDeveloper(String dev){
        this.developer = dev;
        this.version +=1;
    }
    
    public void setPrice(Double price){
        this.price = price;
    }
    
    public void setCategory(Catagories category){
        this.catagory = category;
        this.version += 1;
    }
    
    public void setDiscount(Double discount){
        this.discount = discount;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDeveloper(){
        return this.developer;
    }
    
    public Double getPrice(){
        return this.price * this.discount;
    }
    
    public Catagories getCategory(){
        return this.catagory;
    }
    
    public int getVersion(){
        return this.version;
    }

}
