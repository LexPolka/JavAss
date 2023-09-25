/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
public class Game {
    protected int gameID;
    protected String gameName;
    protected double price;
    protected String gameGenre;
    protected String gameDesc;
    private static int lastGameID = 1001;
    
    //Functions
    public String displayGame()
    {
        return String.format
        ("=================================================================="
        + "\nName       : " + gameName
        + "\nPrice      : RM " + price
        + "\nGenre      : " + gameGenre
        + "\nDescription: " + gameDesc
        + "\n==================================================================");
    }
    
    //Constructor
    public Game (String gameName, double price, String gameGenre, String gameDesc)
    {
        this.gameName = gameName;
        this.price = price;
        this.gameGenre = gameGenre;
        this.gameDesc = gameDesc;
        this.gameID = lastGameID;
        lastGameID++;
    }
    
    //Accessors
    public int getGameID()
    {
        return gameID;
    }
    public String getGameName()
    {
        return gameName;
    }
    public String getGameDesc()
    {
        return gameDesc;
    }
    public double getPrice()
    {
        return price;
    }
    
    //Mutators
    public void setGameID(int newGameID)
    {
        this.gameID = newGameID;
    }
    public void setGameName(String newGameName)
    {
        this.gameName = newGameName;
    }
    public void setGameDesc(String newGameDesc)
    {
        this.gameDesc = newGameDesc;
    }
    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }
}
