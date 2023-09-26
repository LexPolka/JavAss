/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main 
{   
    public static void main(String[] args) 
    {
        // this is a test
        // GAMES
        ArrayList<Game> gameList = new ArrayList();
        Game game = new Game();
         gameList.add(new Game("G1001","Night in the Woods", 10,"Adventure", 
                """
                College dropout Mae Borowski returns home to the
                     crumbling former mining town of Possum Springs            
                     Seeking to resume her aimless former life and
                     reconnect with the friends she left behind.
                     But things are not the same. Home seems different
                     now and her friends have grown and changed.
                     Leaves are falling and the wind is growing colder.
                     Strange things are happening as the light fades.
                     And there is something in the woods.
                     """));
        gameList.add(new Game("G1002", "Undertale", 20, "Role Playing", 
                """
                Welcome to UNDERTALE. In this RPG, you control
                     a human who falls underground into the world of monsters.
                     Now you must find your way out... or stay trapped forever.
                     ((Healthy Dog is Warning: Game contains imagery
                     that may be harmful to players with
                     photosensitive epilepsy or similar condition.
                     """));
        gameList.add(new Game("G1003","Hollow Knight", 90 ,"Action / Indie / Adventure", 
                """
                Forge your own path in Hollow Knight! An epic action
                     adventure through a vast ruined kingdom of insects
                     and heroes. Explore twisting caverns, battle tainted
                     creatures and befriend bizarre bugs, all in a classic,
                     hand-drawn 2D style.                                                                    
                     """));
        gameList.add(new Game("G1004","Elden Ring", 199, "Action / RPG / Adventure", 
                """
                THE NEW FANTASY ACTION RPG. Rise, Tarnished,
                and be guided by grace to brandish the power of the
                Elden Ring and become an Elden Lord in the Lands Between.
                This Game may contain content not appropriate for all
                ages, or may not be appropriate for viewing at work:
                [!] Frequent Violence or Gore, General Mature Content
                                                                  """));
       gameList.add(new Game("G1005", "Detroit: Become Human", 107, "Adventure / Story Rich",
               """
               Detroit 2038. Technology has evolved to a point
               where human like androids are everywhere.                                                                              
               They speak, move and behave like human beings,
               but they are only machines serving humans.
               This Game may contain content not appropriate for all
               ages, or may not be appropriate for viewing at work:
               [!] Frequent Violence or Gore, General Mature Content
                                                                              """));    
                
          
        
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
        System.out.printf(
                """
                ------------------------------------------------------
                               Games on Sale!
                           1. Night in the Woods
                           2. Undertale
                           3. Hollow Knight
                           4. Elden Ring
                           5. Detroit: Become Human
                ------------------------------------------------------
                      Please Enter your choice (1-5):   """
                                                 
        );
       boolean input = false;
       
       while(!input){
       try{
           option = sc.nextInt();
           option--;
           if(option >= 1 && option <= 5){
               game = gameList.get(option);
               input = true;
           }
           else{
              System.out.println("Invalid Option! Please select only from 1 to 5!");
              sc.nextLine();
           }
              
       }catch (Exception ex)
       {
           System.out.println("Invalid Option! Please select only from 1 to 5!");
           input = false;
           sc.nextLine();
       }
       }
        System.out.printf(
                          """
                          =================================================================
                              Game Name  : %s
                              Game Price : %.2f
                              Game Genre : %s
                             ______________________________
                              Game Description
                             ------------------------------ 
                               %s
                          ==================================================================
                              """, game.getGameName(), game.getPrice(), game.getGenre(), game.getGameDesc()
                                       );
             

        // OPTIONS SEGMENT (CART, REVIEWS, 
        System.out.printf("     [1] Add to Cart     [2] Reviews     [3] Back to Games   "
                          + "\n   Please Enter An Option (1-3): ");
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
               
            }
             if (choice == 3)
            {
               
            }
              if (choice == 4)
            {
               
            }
               if (choice == 5)
            {
               
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
    }
    
    //TOP UP ACCOUNT WALLET
   public static void topup()
   {
       int topupChoice;
       Scanner sc = new Scanner(System.in);
    
       //print account wallet info
       System.out.print(AccountWallet.class.toString());
       System.out.println("Please Select a Top-Up option below:");
       System.out.println("1. RM 10");
       System.out.println("2. RM 20");
       System.out.println("3. RM 50");
       System.out.println("\n0. Exit");
       
       topupChoice = sc.nextInt();
       
       //VALIDATE
       while (topupChoice < 0 || topupChoice > 4)
        {
            System.out.print("\n   [Invalid Option!]" + "\n   Please Re-enter your choice (1-5): ");
            topupChoice = sc.nextInt();
        }
       
       //
       
   }
    public static void topUp()
   {
       int topupChoice;
       Scanner sc = new Scanner(System.in);
    
       //print account wallet info
       System.out.print(AccountWallet.class.toString());
       System.out.println("Please Select a Top-Up option below:");
       System.out.println("1. RM 10");
       System.out.println("2. RM 20");
       System.out.println("3. RM 50");
       System.out.println("\n0. Exit");
       
       topupChoice = sc.nextInt();
       
       //VALIDATE
       while (topupChoice < 0 || topupChoice > 4)
        {
            System.out.print("\n   [Invalid Option!]" + "\n   Please Re-enter your choice (0-3): ");
            topupChoice = sc.nextInt();
        }
       
       //
       switch(topupChoice)
       {
           case 0:
               //back to main
           case 1:
               System.out.println("Successful Top-Up!\nRM 10 Added to balance!");
               //do topup
           case 2:
               System.out.println("Successful Top-Up!\nRM 20 Added to balance!");
               //do topup
           case 3:
               System.out.println("Successful Top-Up!\nRM 50 Added to balance!");  
               //do topup
       }
   }
   
   public static void addBank()
   {
        String cardNumber;
        String cardType;
        boolean valid = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("== Adding Bank Account ============================="
                        + "\n Enter Bank Associated with Account > "
                        );
       
        cardType = sc.next();
       
        System.out.println(" Enter Bank Account Number (8 digits) > "
                        );
      
        cardNumber = sc.next();
        
        do
        {
            if (isEightDigits(cardNumber))
            {
                valid = true;
            }
            else
            {
                valid = false;
                System.out.println("Invalid Card Number! Must be at least 8 Digits!");
            }
        } while (valid == false);
   }
   
   public static boolean isEightDigits(String input) {
        // Define a regular expression pattern for 8 digits
        String regex = "\\d{8}";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object to match the input against the pattern
        Matcher matcher = pattern.matcher(input);

        // Check if the input matches the pattern (contains 8 digits)
        return matcher.matches();
    }
   
}

