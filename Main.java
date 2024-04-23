import java.util.*;

public class Main{

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Menu> menu = new ArrayList<Menu>();
    static ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int quit = 0;
        int choice;
        
        do{

            // User chooses their user status or exit
            System.out.println("Choose user:");
            System.out.println("(1) Admin");
            System.out.println("(2) Customer");
            System.out.println("(3) Exit");
            choice = sc.nextInt();

            // Admin features
            switch (choice){
                case 1:
                    System.out.println("Admin test");
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
