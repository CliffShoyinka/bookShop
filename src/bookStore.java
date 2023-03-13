import java.util.Scanner;

public class bookStore extends loginPage {

    public static void main (String[] args)  {
        start();
        enter();
    }

    public static void enter() {

        Scanner input = new Scanner(System.in);
        System.out.println("--- WELCOME THE BOOK STORE ---");
        System.out.println();

        int select = -1;

        while (select!=0) {
            System.out.println("--- Product management enterence ---");
            System.out.println("1- books");
            System.out.println("2- notebooks");
            System.out.println("0- exit");
            System.out.println();
            System.out.println("Your choice: ");
            select=input.nextInt();

            productService service = select == 1 ? new bookService() : new notebookService();


            if(select==1 || select==2) {
                service.processMenu();

            } else if (select ==0) {
                System.out.println("Good bye... <3");

            }else {
                System.out.println("WRONG ENTERENCE");
            }

        }
    }
}