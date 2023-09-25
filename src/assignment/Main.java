//AMOGUS SUSSY 11:30pm
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
import java.util.Scanner;
// LOOK HERE ALOY

public class Main {
    public static void main(String[] args) 
    {
        // this is a test
        // GAMES
        Game[] games = new Game[5];
        games[0] = new Game("Night in the Woods", 10, "Adventure" , "  College dropout Mae Borowski returns home to the"
                + "\n             crumbling former mining town of Possum Springs."+ "\n             Seeking to resume her aimless former life and"
                + "\n             reconnect with the friends she left behind."+ "\n             But things are not the same. Home seems different"
                + "\n             now and her friends have grown and changed."+ "\n             Leaves are falling and the wind is growing colder."
                + "\n             Strange things are happening as the light fades."+ "\n"+ "\n             And there is something in the woods."
        );
        games[1] = new Game("Undertale", 20, "Indie / RPG" , "  Welcome to UNDERTALE. In this RPG, you control"
                + "\n             a human who falls underground into the world of monsters."+ "\n             Now you must find your way out... or stay trapped forever."
                + "\n"+ "\n             ((Healthy Dog is Warning: Game contains imagery"+ "\n             that may be harmful to players with"
                + "\n             photosensitive epilepsy or similar condition.))"
        );
        games[2] = new Game("Hollow Knight", 90, "Action / Indie / Adventure" ,"  Forge your own path in Hollow Knight! An epic action"
                + "\n             adventure through a vast ruined kingdom of insects"+ "\n             and heroes. Explore twisting caverns, battle tainted"
                + "\n             creatures and befriend bizarre bugs, all in a classic,"+ "\n             hand-drawn 2D style."
                + "\n"+ "\n             Hollow Knight is a challenging 2D action-adventure."+ "\n             You will explore twisting caverns, battle tainted creatures"
                + "\n             and escape intricate traps, all to solve an ancient,"+ "\n             long-hidden mystery."
        );
        games[3] = new Game("Elden Ring", 180, "Action / RPG" ,"  THE NEW FANTASY ACTION RPG. Rise, Tarnished,"
                + "\n             and be guided by grace to brandish the power of the"+ "\n             Elden Ring and become an Elden Lord in the Lands Between."
                + "\n"+ "\n             This Game may contain content not appropriate for all"+ "\n             ages, or may not be appropriate for viewing at work:"
                + "\n             [!] Frequent Violence or Gore, General Mature Content"
        );
        games[4] = new Game("Detroit: Become Human", 80,"Adventure / Action" ,"  Detroit 2038. Technology has evolved to a point"
                + "\n             where human like androids are everywhere."+ "\n             They speak, move and behave like human beings,"
                + "\n             but they are only machines serving humans."+ "\n"+ "\n             This Game may contain content not appropriate for all"
                + "\n             ages, or may not be appropriate for viewing at work: "+ "\n             [!] Frequent Violence or Gore, General Mature Content"
        );
        
        // REVIEWS
        Review[] Game1Reviews = new Review[10];
        Game1Reviews[0] = new Review("Markiplier#87", "This game is lowkey amazing!");
        Game1Reviews[1] = new Review("AmogusSussy#69", "AMOGUS!");
        Game1Reviews[2] = new Review("Cool#420", "I love Mae!");
        Review[] Game2Reviews = new Review[10];
        Game2Reviews[0] = new Review("AloySUS#24", "Undertail is COOL");
        Game2Reviews[1] = new Review("sanslover#16", "I WANNA BANG THAT SKEELTON");
        Game2Reviews[2] = new Review("Metaton#420", "RATINGS ARE OFF THE CHARTS!");
        Review[] Game3Reviews = new Review[10];
        Game3Reviews[0] = new Review("HollowKnightFan#124", "Hollow Knight has been my long time favourite!");
        Game3Reviews[1] = new Review("Kevin#****", "ShAW!");
        Game3Reviews[2] = new Review("Hornet", "@Kevin#**** that's not funny");
        Review[] Game4Reviews = new Review[10];
        Game4Reviews[0] = new Review("PewDiePie#bro", "THIS GAME IS TRASH! :trash_bin:");
        Game4Reviews[1] = new Review("Alden Ling#132", "this game copied my name!!!");
        Game4Reviews[2] = new Review("Eiden Ring#992", "@Alden Ling#132 IKR");
        Review[] Game5Reviews = new Review[10];
        Game5Reviews[0] = new Review("Markus#sigma", "well, i tried");
        Game5Reviews[1] = new Review("Android#182", "I LOVE THIS GAME!");
        Game5Reviews[2] = new Review("Markiplier#87", "Hello everybody my name is Markiplier.");
        
        // CART
        Cart[] cart = new Cart[100];

        // PAYMENT
        AccountWallet[] wallet = new AccountWallet[100];
        wallet[0] = new AccountWallet(100);
        wallet[1] = new AccountWallet(200);
        wallet[2] = new AccountWallet(300);
        
// SYSTEM STARTS HERE ===================================================== !!!!!        
    
    //Variables
    int choice = 0;
    int option = 0;
    Scanner sc = new Scanner(System.in);
    
    // GAME SELECT SEGMENT
    System.out.printf("------------------------------------------------------"
            + "\n               Games on Sale!"
            + "\n            1. Night in the Woods"
            + "\n            2. Undertale"
            + "\n            3. Hollow Knight"
            + "\n            4. Elden Ring"
            + "\n            5. Detroit: Become Human"
            + "\n------------------------------------------------------"
            + "\n   Please Enter your choice (1-5): "
    );

    choice = sc.nextInt();
    choice--;
    
    //VALIDATE
    while (choice < 0 || choice > 4)
    {
        System.out.print("\n   [Invalid Option!]" + "\n   Please Re-enter your choice (1-5): ");
        choice = sc.nextInt();
    }       
    
    System.out.println("\n   Showing Description for: " + games[choice].getGameName());
    System.out.println(games[choice].displayGame());
    
    // OPTIONS SEGMENT (CART, REVIEWS, 
    System.out.printf("     [1] Add to Cart     [2] Reviews     [3] Back to Games   "
                      + "\n   Please Enter An Option (1-3): "
    );
    
    option = sc.nextInt();
    
    // VALIDATE
    while (option < 1 || option > 3)
    {
        System.out.print("\n   [Invalid Option!]" + "\n   Please Enter an Option (1-3): ");
        option = sc.nextInt();
    }
    
    choice++;
    // ADD TO CART
    if (option == 1)
    {
        System.out.println("\n  [Added To Cart]!");
        if (choice == 1)
        {
           //cart
        }
        if (choice == 2)
        {
           for (int i = 0; i < Game2Reviews.length; i++)
           {
                System.out.println(Game2Reviews[i].displayReview());
           }
        }
         if (choice == 3)
        {
           for (int i = 0; i < Game3Reviews.length; i++)
           {
                System.out.println(Game3Reviews[i].displayReview());
           }
        }
          if (choice == 4)
        {
           for (int i = 0; i < Game4Reviews.length; i++)
           {
                System.out.println(Game4Reviews[i].displayReview());
           }
        }
           if (choice == 5)
        {
           for (int i = 0; i < Game5Reviews.length; i++)
           {
                System.out.println(Game5Reviews[i].displayReview());
           }
        }
    }
    
    // REVIEWS SEGMENT (OPTIMIZE)
    if (option == 2)
    {
        System.out.println("\n  Showing recent reviews:" + "\n  -------------------------");
        if (choice == 1)
        {
           for (int i = 0; i < Game1Reviews.length; i++)
           {
                System.out.println(Game1Reviews[i].displayReview());
           }
        }
        if (choice == 2)
        {
           for (int i = 0; i < Game2Reviews.length; i++)
           {
                System.out.println(Game2Reviews[i].displayReview());
           }
        }
         if (choice == 3)
        {
           for (int i = 0; i < Game3Reviews.length; i++)
           {
                System.out.println(Game3Reviews[i].displayReview());
           }
        }
          if (choice == 4)
        {
           for (int i = 0; i < Game4Reviews.length; i++)
           {
                System.out.println(Game4Reviews[i].displayReview());
           }
        }
           if (choice == 5)
        {
           for (int i = 0; i < Game5Reviews.length; i++)
           {
                System.out.println(Game5Reviews[i].displayReview());
           }
        }
    }
    
    //PAYMENT
    int cost= 50;
    
    
    }
}
