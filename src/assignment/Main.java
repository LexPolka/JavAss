/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main 
{   
    public static void main(String[] args) 
    {
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
        
        // PAYMENT
        AccountWallet[] wallet = new AccountWallet[100];
        wallet[0] = new AccountWallet(100);
        wallet[1] = new AccountWallet(200);
        wallet[2] = new AccountWallet(300);
        
// SYSTEM STARTS HERE ===================================================== !!!!!        

        ArrayList<Game> gameList = new ArrayList();
        ArrayList<Cart> cartList = new ArrayList();
        titleScreen();
        CustomerMainMenu(cartList, gameList);
    }
    
    public static void titleScreen() {
        // TODO code application logic here
        
        
        
        ArrayList<Customer> cusLogin = new ArrayList<Customer>();
        filereadingCusData(cusLogin);
        
        Scanner scanner = new Scanner(System.in);
        
        
        boolean exitChoice = false;
        do {
            System.out.println(" |<========================================================================>|");
            System.out.println(" |    ===++=== ||                  /======>>                       |  //    |");
            System.out.println(" |       []    ||      //====     (                          ____  | //     |");
            System.out.println(" |       []    |====|  |_____      \\====\\  //==\\\\ //==\\\\  //      ||        |");
            System.out.println(" |       []    ||  ||  |                  ) ||  || \\\\__||  [       | \\      |");
            System.out.println(" |       []    ||  ||  L=====      ======/  ||  ||     ||  \\\\____  |  \\\\    |");
            System.out.println(" |                                                                          |");
            System.out.println(" |     //===>  ___,    //   ____.                      L ____________ R     |");
            System.out.println(" |    //      /   /   //  //       /===@   L===\\\\     //         X   \\\\     |");
            System.out.println(" |   //===   /___/   //  //       /    /  //   //    /  [ ]    Y   A   \\    |");
            System.out.println(" |  //         //   //   \\___.  @===/   //   //     \\      _____B     /     |");
            System.out.println(" |                                                    \\____/     \\____/     |");
            System.out.println(" |<========================================================================>|");


            System.out.println("1. REGISTER");
            System.out.println("2. LOGIN");        
            System.out.println("3. EXIT");
            System.out.println("Enter choice >");
            int userChoice = scanner.nextInt(); //userchoice for switch
        

            
            
            
            switch(userChoice) {
            case 1:
                System.out.println("Type exit to return to title screen");
                fileWritingCustomer();
                break;

            case 2:
                // call login function            
                chkUsrOrStf();
                  
                break;
            case 3:
                
                System.out.print("Thanks for coming!");
                exitChoice = true;
                
            default:
                throw new AssertionError();
        }
        } while (!exitChoice);
               
    
        
    } // end of main
    
    public static void chkUsrOrStf(){
        
        ArrayList<Customer> cusLogin = new ArrayList<Customer>();
        filereadingCusData(cusLogin);
        
    Scanner scanner = new Scanner(System.in);
    int errorChecking = 0; 
    String pwHolder = "";
    String idHolder = "";
    User user = new Customer();

        Staff[] stflogin = new Staff[10];
        stflogin[0] = new Staff("S1000","staff1","S1001@mail.com");
        stflogin[1] = new Staff("S1001","staff2","S1002@mail.com");
        stflogin[2] = new Staff("S1002","staff3","S1003@mail.com");
        stflogin[3] = new Staff("S1003","staff4","S1004@mail.com");
        stflogin[4] = new Staff("S1004","staff5","S1005@mail.com");
        stflogin[5] = new Staff("S1005","staff6","S1006@mail.com");
        stflogin[6] = new Staff("S1006","staff7","S1007@mail.com");
        stflogin[7] = new Staff("S1007","staff8","S1008@mail.com");
        stflogin[8] = new Staff("S1008","staff9","S1009@mail.com");
        stflogin[9] = new Staff("S1009","staff10","S1010@mail.com");
        
        //loopings, used to loop until user types exit
        boolean loopingMain = false;
        boolean looping1 = false;
        boolean looping2 = false;
        boolean next = false;
        boolean next2 = false;
        do{
            do {
                System.out.println("Type exit to return to title screen");
                 System.out.println("Enter ID       >");
                    user.setuserID(scanner.next());
                    idHolder = user.getuserID(); 


                   if (idHolder.startsWith("S")) {
                       errorChecking = 0;
                       System.out.println("You are a Staff!");
                       //get length of staff array
                       int arrayLength = stflogin.length;
                       //get id & pw
                       for (int i = 0; i < stflogin.length; i++) {
                           if ( idHolder.equals(stflogin[i].getuserID())) {
                               System.out.println("ID found !Staff ID > " + stflogin[i].getuserID());
                               pwHolder = stflogin[i].getuserPw();
                               i = arrayLength;
                               next = true;
                               
                           }
                           else{
                               //counter
                               errorChecking++;   }                 
                       }
                       //go through array, if counter = arraylength while still not finding, must not exist
                       if (errorChecking == arrayLength) {
                               System.out.println("Error! Staff ID not found!");
                               looping1 = true;

                        }
                           // bool to check password validity
                           if (next == true) {
                           looping2 = false;
                           do {
                              System.out.println("Enter Password >");
                              String userInput = scanner.next();

                               if (userInput.equals(pwHolder)) {
                                   System.out.println("Login Success!");
                                   loopingMain = true;
                                   looping1 = true;
                                   looping2 = true;
                                   StaffMenu();
                                   
                               }// exit
                               else if ("exit".equalsIgnoreCase(userInput) == true) {
                                   System.out.println("Returning to title screen");
                                   looping1 = true;
                                   looping2 = true;
                               }
                               else{
                                   System.out.println("Error ! wrong password");
                               }


                          }while(!looping2);
                       }
                    }
                else if(idHolder.startsWith("C")){
                      System.out.println("You are a Customer!");

                      // extract id
                        looping2 = false;
                        next2 = false;
                        int errorChk2 = 0;
                        // loop until array ends.
                        for (Customer customer : cusLogin) {
                            if (idHolder.equals(customer.getuserID())) {

                                looping2 = true;
                                System.out.println("ID found! Customer ID > " + customer.getuserID());
                                pwHolder = customer.getuserPw();
                                next2 = true;
                                break;
                            }
                            
                            else{
                                errorChk2++;
                            }
                            if (errorChk2 == cusLogin.size()) {
                            System.out.println("Error ! Customer ID not found!");
                            
                            }
                        }
                        if (next2 == true) {
                                   boolean passwChk2 = false;
                                   do {
                                      System.out.println("Enter Password >");
                                      String userInput2 = scanner.next();

                                       if (userInput2.equals(pwHolder)) {
                                           System.out.println("Login Success!");
                                           MainMenu();
                                           loopingMain = true;
                                           looping1 = true;
                                           passwChk2 = true;
                                       }
                                       else if ("exit".equalsIgnoreCase(userInput2) == true) {
                                           System.out.println("Returning to title screen");
                                           looping1 = true;
                                           passwChk2 = true;
                                       }
                                       else{
                                           System.out.println("Error ! wrong password");
                                       }


                                  }while (!passwChk2);
                        }
                       

                   
                  }
                else if("exit".equalsIgnoreCase(idHolder) == true){
                    System.out.println("Returning to title screen");
                    loopingMain = true;
                    looping1 = true;
                   
                } 
                  else{
                       System.out.println("Error ! Invalid ID");
                  }
       
            } while (!looping1);
        }while(!loopingMain);
          //idk what to put here for now
          
           
}
    public static void StaffMenu(){
        Scanner sc = new Scanner(System.in);
        boolean staffLooper = false;
        while(!staffLooper){
            System.out.println("What do you want to do ?");
            System.out.println("1. Add Game");
            System.out.println("2. Exit Program");

            int staffChoice = sc.nextInt();
                
            switch(staffChoice){
                case 1:
                    fileWritingGame();
                case 2:
                    ExitProgram();
                default:
                    System.out.printf("\n Error ! Invalid Choice");
                
            }
            
        }
        
        
        
    }
    
    
    //READ CUSTOMER DATAFILE
    public static ArrayList<Customer> filereadingCusData(ArrayList<Customer> cusLogin){

        File cusData = new File("cusData.txt");

        try(Scanner fileread = new Scanner(cusData)){
             while(fileread.hasNextLine()){
             String cusread = fileread.nextLine();
             Customer cus = new Customer();
             String[] parts = cusread.split("\\|");
             if(parts.length== 3){
                    cus.setuserID(parts[0]); 
                    cus.setuserPw(parts[1]);
                    cus.setuserEmail(parts[2]);
              }
             cusLogin.add(new Customer(cus.getuserID(), cus.getuserPw(), cus.getuserEmail()));
            }

        }
          catch(FileNotFoundException e){
               System.out.println("Error ! File Not Found!");
                }
     return cusLogin;
  }
    //WRITE CUS FILE   
    public static void fileWritingCustomer(){
        boolean exitRegi = false;
        Scanner sc = new Scanner(System.in);
        
        do {
            ArrayList<Customer> cusLogin = new ArrayList<Customer>();
            filereadingCusData(cusLogin);

            //get latest id
            //get latest element
            int lastIndex = cusLogin.size() - 1;
            Customer latestCustomer = cusLogin.get(lastIndex);

            // extract id
            String cusIdHolder = latestCustomer.getuserID();

            //extract number part of string
            cusIdHolder = cusIdHolder.substring(1);

            //change it to int
            int usrIdNum = Integer.parseInt(cusIdHolder);
            ++usrIdNum;
            //combine to get new id
            String newUsrIdNum = ("C" + (usrIdNum));

            Customer cus = new Customer(); 
            System.out.println("New ID > " +newUsrIdNum);
                cus.setuserID(newUsrIdNum);
                System.out.printf("\nEnter Password > ");
                cus.setuserPw(sc.nextLine());
                
                //email + validate email
                boolean validEmail = false;
                String tempEmail;
                do
                {
                System.out.printf("\nEnter Email > ");

                tempEmail = sc.nextLine();

                    if (validateEmail(tempEmail))
                    {
                        validEmail = true;
                    }
                    else
                    {
                        System.out.println("Invalid Email! Please follow email format!");
                    }
                } while (validEmail == false);
                
                cus.setuserEmail(tempEmail);
                
                System.out.println("ID       > "+ cus.getuserID());
                System.out.println("Password > "+ cus.getuserPw());
                System.out.println("Email    > " +cus.getuserEmail());
                System.out.println("Confirm ? (Y = proceed /N = return to title screen)> ");
                char comfirmation2 = sc.next().charAt(0);

                if (Character.toUpperCase(comfirmation2) == 'Y') {
                     try{
                        FileWriter writecus = new FileWriter("cusData.txt", true);
                        writecus.write(String.format("%s|%s|%s\n", cus.getuserID(), cus.getuserPw(), cus.getuserEmail()));
                        writecus.close();
                        System.out.printf("\nRegister succesful!\n");
                        exitRegi = true;
                        }
                        catch(IOException e){
                            System.out.printf("\nRegister Failed\n");
                            e.printStackTrace();
                        }
                }else if (Character.toUpperCase(comfirmation2) == 'N'){
                    exitRegi = true;
                    break;
                }
                else
                { System.out.println("\nPlease only select Yes [Y] or No [N]\n");
                   sc.nextLine();
                }
        } while (!exitRegi);

    
    }
    
    public static boolean validateEmail(String email) {
        String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
  
    
    public static void CustomerMainMenu(ArrayList<Cart> cartList, ArrayList<Game> gameList)
    {   
        // GAMES
        Order order = new Order();
        double total = 0;

        //Variables
        //main menu after customer login
        fileWritingGame();
        int exitprog = 0;
        do{
        int choice = MainMenu();
        
        switch(choice){
            case 1:
                //GAME ON SALES
                filereadingGame(gameList);
                order.setSubTotal(gameSelection(gameList, cartList));
                break;
            case 2:
                //VIEW CART CONTENT
                total = viewOrder(order.getSubTotal());
                System.out.printf("Your total price is....  %.2f\n\n", total );
                CartMenu(cartList, gameList);
                break;
            case 3:
                topUp();
                break;
            case 4:
                addBank();
                break;  
            case 5:
                ExitProgram();
        }
        choice = exitprog;
        }while(exitprog != 5);
    }
    
     //Retrieving game into the store===================================================================================
  public static ArrayList<Game> filereadingGame(ArrayList<Game> gameList){
        gameList.clear();
        File gameFile = new File("available_games.txt");
  
        try(Scanner fileread = new Scanner(gameFile)){
             while(fileread.hasNextLine()){
             String gameread = fileread.nextLine();  
             Game game = new Game();
             String[] parts = gameread.split("\\|");
             if(parts.length== 5){
                    game.setGameID(parts[0]); 
                 game.setGameName(parts[1]);
                 game.setPrice(Double.parseDouble(parts[2]));
                 game.setGenre(parts[3]);
                  game.setGameDesc(parts[4]);
              }
             gameList.add(new Game(game.getGameID(), game.getGameName(), game.getPrice(), game.getGenre(), game.getGameDesc()));
            }
      
        }
          catch(FileNotFoundException e){
             System.out.println("The file does not exist :(");
                }
     return gameList;
  }
    //Adding new game(ONLY FOR STAFF)================================================================================
  
     public static void fileWritingGame(){
        Scanner sc = new Scanner(System.in);
        char comfirmation;
        Game game = new Game();
        System.out.println("Add new game? (Y/N)> ");
        
        
        do{
         comfirmation = sc.next().charAt(0);
         
        if(Character.toUpperCase(comfirmation) == 'Y')
        {           
            
            sc.nextLine();
            System.out.printf("\nNew Game Name: ");
            game.setGameName(sc.nextLine());
            System.out.printf("\nNew Game Price: ");
            game.setPrice(sc.nextDouble());
            System.out.printf("""
                              New Game Genre (Enter the number for a Genre)
                              ---------------------------------------------
                              1)RPG           5)Adventure
                              2)Action        6)Horror
                              3)Shooter       7)Relaxing
                              4)Story Rich    8)Strategy
                              """);
            switch(sc.nextInt()){
                case 1:
                     game.setGenre("RPG");
                     break;
                case 2:
                     game.setGenre("Action");
                     break;
                case 3:
                     game.setGenre("Shooter");
                     break;
                case 4:
                     game.setGenre("Story Rich");
                     break;
                case 5:
                     game.setGenre("Adventure");
                     break;
                case 6:
                     game.setGenre("Horror");
                     break;
                case 7:
                     game.setGenre("Relaxing");
                     break;
                case 8:
                    game.setGenre("Strategy");
                    break;
                default:
                    System.out.println("\nPlease only select number from 1-8 for setting a Genre\n");
            }
            sc.nextLine();
            System.out.printf("\nNew Game Description: ");
            game.setGameDesc(sc.nextLine());
        
        try{
        FileWriter writegame = new FileWriter("available_games.txt", true);
        writegame.write(String.format("%s|%s|%.2f|%s|%s\n", game.getGameID(), game.getGameName(), game.getPrice(), game.getGenre(), game.getGameDesc()));
        writegame.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.printf("\nAdd another Game? > ");
        comfirmation = sc.next().charAt(0);
        }
        else if(Character.toUpperCase(comfirmation) == 'N'){
                break;
                }
        else
        { System.out.println("Please only select Yes [Y] or No [N]");
           sc.nextLine();
        }
        
        }while(Character.toUpperCase(comfirmation) == 'Y' || Character.toUpperCase(comfirmation) != 'N');
    }
     //DISPLAY THE MAIN MENU =======================================================================
public static int MainMenu()
   {
        boolean valid = false;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        do{
            System.out.printf(
                    """
                    ========================================
                          (===M===)  _____   []
                          |   |   |  [___|   __   [===         
                          O   o   O  [   |   ||   O   O        
                          X       X  |   |   ||   X   X                  
                    ========================================
                      Welcome to Main Menu!
                      1. Games on Sale
                      2. Open Cart
                      3. Add Bank Account
                      4. Top-Up Wallet
                      5. Exit Program
                        """);
            
            
            //validate
            try
            {   choice = sc.nextInt();
                
                if (choice < 1 || choice > 5){
                valid = false;
                System.out.println("Enter value is not in range with the option!");
                System.out.println("Only enter number from 1 - 4 !");
                }
                else
                valid = true;
            }
            catch(Exception ex){
                valid = false;
                sc.nextLine();
                System.out.println("Only Enter number!");
            }
        }   while (valid == false);
        return choice;
   }
   



    //GAME MENU (INCLUDE VIEWING GAME, ADD TO CART, AND CALCULATE SUBTOTAL
    public static void menucontent(ArrayList<Game> gameList){
        int i = 0;
        System.out.printf("""
                          
                          
                          ==============================================================
                             ====    ==   == = ==  ====    == = ==  ====  ==  =  =   =
                            =       =  =  =======  =       =======  =     === =  =   =
                            =  ===  ====  =  =  =  ====    =  =  =  ====  = ===  =   =
                            =   =   =  =  =  =  =  =       =  =  =  =     =   =  =   =
                             ====   =  =  =  =  =  ====    =  =  =  ====  =   =   ===
                          ==============================================================
                          """);
        for(Game printgame : gameList){
            gameList.get(i);
            System.out.println(++i + ") " + printgame.getGameName());
            
        }
        
    }
    public static double gameSelection(ArrayList<Game> gameList,ArrayList<Cart> cartList ){
        Game game = new Game();
        double totalPrice = 0;
        Scanner sc = new Scanner(System.in);
        int option = 0;
        char proceed;
      do{
        menucontent(gameList);
        System.out.printf(
                      "\n0) Exit Game Menu" +
                      "\nSelect a game > ");
        boolean input = false;
       
       while(!input){
       try{
           option = sc.nextInt();
           if(option >= 1 && option <= gameList.size()){
               option--;
               game = gameList.get(option);
               input = true;
           }
           else if (option == 0)
           {
               CustomerMainMenu(cartList, gameList);
           }
           else{
              int lastIndex = gameList.size() - 1;
              System.out.println("Invalid Option! Please select only from 1 to " + (1 + lastIndex));
              sc.nextLine();
           }
              
       }catch (Exception ex)
       {
           int lastIndex = gameList.size() - 1;
           System.out.println("Invalid Option! Please select only from 1 to " + (1 + lastIndex));
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
                            
                             """, game.getGameName(), game.getPrice(), game.getGenre());
        formatGameDesc(game.getGameDesc(), 40);
        System.out.println("=================================================================");

        // OPTIONS SEGMENT (CART, REVIEWS, 
        System.out.printf("""   
                          [1] Add to Cart     [2] Reviews     [3] Back to Games   
                          Please Enter An Option (1-3):  """);
        
        option = sc.nextInt();
     
        switch(option)
        {
            case 1:
                
                cartList.add(new Cart(game.getGameID(),game.getGameName(), game.getPrice()));
                System.out.printf("""
                                  ================= Your Cart Content =================
                                  Game Name                            Price
                        
                                  """);
                for(Cart cartprint : cartList)
                {
                    System.out.println(cartprint.getGameName()  + "                     " + cartprint.getPrice());
                }
                totalPrice += game.getPrice();
                System.out.println("Total price: " + totalPrice);
                break;
            case 2:
                    System.out.println("\n  Showing recent reviews:" + "\n  -------------------------");
           /* if (choice == 1)
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
            }*/
            case 3:
                menucontent(gameList);
                
        }
        System.out.println("\n Continue Looking For Game? > ");
        proceed = sc.next().charAt(0);
        sc.nextLine();
        
    }while( Character.toUpperCase(proceed) == 'Y' || Character.toUpperCase(proceed) != 'N' );
      return totalPrice;
    }
    
    //FORMAT THE DESCRIPTION TO MAKE IT LOOK LIKE A BLOCK OF TEXT
    public static void formatGameDesc(String desc, int width){
        String[] descSplit = desc.split("\\s+");
        StringBuilder nextline = new StringBuilder();
        
        for(String descG : descSplit){
            if(nextline.length() + descG.length() + 1 <= width){
                if(nextline.length() > 0){
                nextline.append(" ");
                }
             nextline.append(descG);
            }
            else
            {
                System.out.println("    " + nextline.toString());
                nextline = new StringBuilder(descG);
            }
        }
         if (nextline.length() > 0) {
            System.out.println(nextline.toString());
        }
        
    }
    //CHECK YOUR ORDER =============================================
    public static double viewOrder(double totalPrice){
        Order order = new Order();
        
        order.calculateTax(totalPrice);
        order.calculateFinal(totalPrice);
        order.setSubTotal(totalPrice);
        System.out.println(order.toString());
        return order.getTotal();
    }
   
   //TOP UP
    public static void topUp()
    {
        String topupInput;
        double amount;
        AccountWallet wallet = new AccountWallet();

        Scanner sc = new Scanner(System.in);

        //print account wallet info
        System.out.print(wallet.toString());
        System.out.println("Please input amount to Top-Up below: ");
        System.out.println("Do 'X' to Exit");

        topupInput = sc.nextLine();

        if (!topupInput.equalsIgnoreCase("X"))
        {
            amount = Double.parseDouble(topupInput);
            wallet.increase(amount);
            System.out.println(" Your Current Balance is: " + wallet.checkBalance());
        }
       
   }
   
    // ADD A CREDIT CARD
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
   
      public static void CartMenu(ArrayList<Cart> cartList, ArrayList<Game> gameList)
   {
        Game game = new Game();
        boolean valid = false;
        Scanner sc = new Scanner(System.in);
        int choice =0;
        do{
            System.out.println(
                    """
                    ========================================
                          o====-  __    __   |
                          |      |__|  [    =|== 
                          o====o |  |  [     |_
                    ========================================
                      Displaying Cart:
                     Name                           Price
                        """);
            // do your cart thing here !!
                for(Cart cartprint : cartList)
                {
                    System.out.println(cartprint.getGameName()  + "              " + cartprint.getPrice());
                }
            
            System.out.println(
                    """
                    ========================================
                        Please pick an option:
                    1. Proceed with Checkout Order
                    2. Return to Main Menu
                        """);
            
            //validate
            try
            {   
                choice = sc.nextInt();
                
                if (choice < 1 || choice > 5){
                valid = false;
                System.out.println("Enter value is not in range with the option!");
                System.out.println("Only enter number from 1 - 3 !");
                }
                else
                valid = true;
            }
            catch(Exception ex){
                valid = false;
                sc.nextLine();
                System.out.println("Only Enter number!");
            }
        }   while (valid == false);
        
        //choice
        switch(choice){
            case 1:
                //PROCEED WITH CHECKOUT
                //
                //
                break;
            case 2:
                CustomerMainMenu(cartList, gameList);
                break;
        }
   }
   
   //EXIT
    public static void ExitProgram()
    {
        System.out.println("See you next time!");
        System.exit(0);
    }
}