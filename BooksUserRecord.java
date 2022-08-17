import java.util.Scanner;

public class BooksUserRecord {


/*
bu kısımda kullanıcı şayet sisteme üye değilse kayıt yapmasını istediğimiz paneldir burdan method aracılığıyla kayıt yapmasını isteyeceğiz

 */
public static void userrecordPanel() {
    String userName = "";
    String userPass = "";
    String userAdress = "";
    int userAge = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Wellcome to the register section... ");
    System.out.println("Please enter your username");
    userName = scan.nextLine();
    System.out.println("Please enter your userPass\n(UserPass must be at least 8 character)");
    userPass = scan.nextLine();
    while (userPass.length() < 8) {
        System.out.println("UserPass must be at least 8 character, please enter your userPass");
        userPass = scan.nextLine();
    }
    System.out.println("Please enter your Adress");
    userAdress = scan.nextLine();
    System.out.println("Please enter your age");
    userAge = scan.nextInt();
    if (userAge < 10) {
        System.out.println("You must be at least 10 years old for registration");
        userrecordPanel();
    }

    System.out.println("New Registered Member \n" + "UserName      : " + userName + "\nUserPass      : " + userPass + "\nUserAdres     : " + userAdress + "\nUserAge       : " + userAge);
    System.out.println("Your registration has been successfully created. You are redirected to the login page");

}
}


