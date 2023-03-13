import java.util.Scanner;

public class loginPage {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        UserService service = new UserService();
        int selectLogin;

        do {
            showMenu();
            selectLogin = scanner.nextInt();
            switch (selectLogin) {
                case 1:
                    service.register();
                    System.out.println(service.usernames);
                    System.out.println(service.emails);
                    System.out.println(service.passwords);
                    break;
                case 2:
                    service.login();
                    break;
                case 0:
                    System.out.println("İyi günler dileriz...");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz!");
            }


        }while (selectLogin != 0) ;

    }

    public static void showMenu() {
        System.out.println("===BOOK STORE LOGIN PAGE===");
        System.out.println("1-SIGN UP");
        System.out.println("2-SIGN IN");
        System.out.println("0-EXIT");
        System.out.println("YOUR CHOICE: ");
    }
}
