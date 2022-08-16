import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BooksLogin {
    static Scanner scan=new Scanner(System.in);
    public static void LoginQuestion(){
        /*
        bu kısımda kullanıcından sistem'e üye olup olamdığına dair sorgulama yapılan panel'dir
        */
        System.out.println("----------------------------------");
        System.out.println("|     Welcome The Books Panel    |");
        System.out.println("|Do you have a subscription?(Y/N)|");
        char question=scan.nextLine().toUpperCase().charAt(0);
        if (question=='Y') {
            LoginPanel();
        }else {

        }
    }



    public static void LoginPanel() {
/*
bu kısımda kullanıcı giriş panelinin görsel paneli yapılmıştır
 */
        System.out.println("|           User Name            |");
        String userName=scan.nextLine();
        System.out.println("|           User Password        |");
        userPasswordCheck();
        System.out.println("|                                |");
       // System.out.println("|     I forgot my password       |");
        System.out.println("|-------                  -------|");
        System.out.println("        |----        ----|        ");
        System.out.println("             |--  --|             ");
        System.out.println("               |--|               ");
        System.out.println("                ||                ");
        /*
        40 satırda ki method kullanıcı kayıt oluşturmuş üye girişini yaptıktan sonra
        giriş yapacağı panele gittiği oturumdur.
         */
        BooksUserPanel.UserPanelView();

    }

    private static void userPasswordCheck() {
        /*
        bu kısımda kullanıcın parolasını uygun koşullara sahip olup olmadığını sorguladığımız panel dir
         */

        String userPassword=scan.nextLine();


    }

}
