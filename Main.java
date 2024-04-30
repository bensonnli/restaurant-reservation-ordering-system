import java.util.*;

public class Main{

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Menu> menu = new ArrayList<Menu>();
    static ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    // global function to print menu (for both customer/admin)
    static void printMenu(){
        System.out.println("MENU");
        System.out.println("=========================");

        System.out.println("APPETIZERS");
        for(int i = 0; i<menu.size(); i++){
            if(menu.get(i).getCategory()=="appetizer"){
                System.out.println(menu.get(i).getItem()+ " | $" + menu.get(i).getPrice());
            }
        }

        System.out.println("-------------------------");
        System.out.println("MAINS");
        for(int i = 0; i<menu.size(); i++){
            if(menu.get(i).getCategory()=="main"){
                System.out.println(menu.get(i).getItem()+ " | $" + menu.get(i).getPrice());
            }
        }

        System.out.println("-------------------------");
        System.out.println("DESSERTS");
        for(int i = 0; i<menu.size(); i++){
            if(menu.get(i).getCategory()=="dessert"){
                System.out.println(menu.get(i).getItem()+ " | $" + menu.get(i).getPrice());
            }
        }

        System.out.println("-------------------------");
        System.out.println("DRINKS");
        for(int i = 0; i<menu.size(); i++){
            if(menu.get(i).getCategory()=="drink"){
                System.out.println(menu.get(i).getItem()+ " | $" + menu.get(i).getPrice());
            }
        }
    }

    static void test(){
        for(int i = 0;i<menu.size(); i++){
            System.out.println(menu.get(i).getItem() + " | " + menu.get(i).getPrice() + " | " + menu.get(i).getCategory());
        }
    }

    // ADMIN METHODS
    // Print reservations
    // Search reservations by name / number
    // Search menu
    
    static void printReservations(){
        for(int i = 0;i<reservations.size(); i++){
            System.out.println("\nRESERVATIONS GUI");
            System.out.println("Name  |  Phone    | Time  | Party Size");
            System.out.println(reservations.get(i).getName() + " | " + reservations.get(i).getPhone() + " | " + reservations.get(i).getTime() + " | " + reservations.get(i).getPartySize());
        }
    }



    public static void main (String[] args){

        // BASE MENU
        Menu fries = new Menu("fries", 5.00, "appetizer");
        Menu ct = new Menu("chicken tenders", 6.00, "appetizer");
        Menu cfr = new Menu("chicken fried rice", 8.00, "main");
        Menu sfr = new Menu("shrimp fried rice", 9.00, "main");
        Menu vic = new Menu("vanilla ice cream", 4.00, "dessert");
        Menu pp = new Menu("peach pie", 6.00, "dessert");
        Menu coke = new Menu("coke", 2.00, "drink");
        Menu bbt = new Menu("bubble tea", 5.00, "drink");

        menu.add(fries);
        menu.add(ct);
        menu.add(cfr);
        menu.add(sfr);
        menu.add(vic);
        menu.add(pp);
        menu.add(coke);
        menu.add(bbt);

        Scanner sc = new Scanner(System.in);

        int quit = 0;
        int choice;
        int aquit = 0;
        int aChoice;
        String newitem;
        double newprice;
        int addMenuChoice;
        
        // LOOP PROGRAM
        do{

            // User chooses their user status or exit
            System.out.println("\nMAIN GUI");
            System.out.println("Choose user:");
            System.out.println("(1) Admin");
            System.out.println("(2) Customer");
            System.out.println("(3) Exit");
            choice = sc.nextInt();

            // Admin features
            // 1. View and edit menu items
            // 2. View a list of all reservations and orders.
            // 3. Cancel reservations if necessary.
            switch (choice){

                case 1:
                    do{
                        System.out.println("\nADMIN GUI");
                        System.out.println("=========================");
                        System.out.println("MENU OPTIONS");
                        System.out.println("-------------------------");
                        System.out.println("(1) View Menu");
                        System.out.println("(2) Add Menu Item");
                        System.out.println("(3) Delete Menu Item");
                        System.out.println("(4) Update Menu Item");
                        System.out.println("-------------------------");
                        System.out.println("RESERVATION OPTIONS");
                        System.out.println("-------------------------");
                        System.out.println("(5) View Reservations");
                        System.out.println("(6) Add Reservation");
                        System.out.println("(7) Delete Reservation");
                        System.out.println("(8) Update Reservation");
                        System.out.println("(9) Exit");

                        aChoice = sc.nextInt();
                    
                        switch(aChoice){
                            case 1:
                                printMenu();
                                break;
                            case 2:
                                String addMenuCategory;
                                int valid=0;
                                do{
                                    System.out.println("\nADD MENU ITEM GUI");
                                    System.out.println("Choose menu item category: ");
                                    System.out.println("(1) Appetizer");
                                    System.out.println("(2) Main");
                                    System.out.println("(3) Dessert");
                                    System.out.println("(4) Drink");
                                    addMenuChoice = sc.nextInt();     
                                    addMenuCategory= "appetizer"; 

                                    switch(addMenuChoice){
                                        case 1:
                                            addMenuCategory= "appetizer";
                                            valid = 1;
                                            break;
                                        case 2: 
                                            addMenuCategory= "main";
                                            valid = 1;
                                            break;
                                        case 3: 
                                            addMenuCategory= "dessert";
                                            valid = 1;
                                            break;
                                        case 4: 
                                            addMenuCategory= "drink";
                                            valid = 1;
                                            break;
                                        default:
                                            System.out.println("Not a valid option, try again!");
                                    }
                                } while(valid == 0);

                                System.out.println("Enter menu item name: ");
                                newitem = sc.next();

                                System.out.println("Enter menu item price: ");
                                newprice = sc.nextDouble();

                                Menu newMenu = new Menu(newitem, newprice, addMenuCategory);

                                menu.add(newMenu);
                                //test();
                                System.out.println("Item successfully added!");
                                break;

                            case 3:
                                System.out.println("woop2");
                                break;

                            case 4:
                                System.out.println("woop2");
                                break;

                            case 5:
                                printReservations();
                                break;

                            case 6:
                                System.out.println("\nADD RESERVATION GUI");
                                System.out.println("Enter name: ");
                                String resName = sc.next();
                                System.out.println("Enter phone number (XXXXXXXXXX format): ");
                                String resPhone = sc.next();
                                System.out.println("Enter time (XX:XXpm/am format): ");
                                String resTime = sc.next(); 
                                System.out.println("Enter party size: ");
                                int resPartySize = sc.nextInt();
                                sc.nextLine();
                                Reservation newRes = new Reservation(resName,resPhone, resTime,resPartySize);
                                reservations.add(newRes);
                                break;

                            case 7:
                                System.out.println("woop2");
                                break;

                            case 8:
                                System.out.println("woop2");
                                break;

                            case 9:
                                System.out.println("Back to main menu ...");
                                aquit = 1;
                                break;

                            default:
                                System.out.print("\nThat's not an option! Try again: ");
                                break;
                            
                        }
                    } while (aquit == 0);
                    break;

            // Customer features
                case 2:
                    System.out.println("Customer test");
                    break;
            // Exit
                case 3:
                    System.out.println("Exiting ...");
                    quit = 1;
                    break;
            
            // Invalid option
                default:
                    System.out.print("\nThat's not an option! Try again: ");
                    break;

            }
        } while(quit == 0);
    }
}
