package kutuphaneProjesi;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class BooksClass {
    static Scanner scan = new Scanner(System.in);
    static Map<Integer, String> bookMap = new TreeMap<>();

    public static void bookMenu() {
        System.out.println("Welcome to Book Menu");
        System.out.println("1-Book List\n2-Book Add\n3-Book Delete\n4-Book Search\n5-Book On Me\n6-Exit");
        int input = scan.nextInt();
        switch (input) {
            case 1:
                bookList();
                break;
            case 2:
                bookAdd();
                break;
            case 3:
                bookDelete();
                break;
            case 4:
                bookSearch();
                break;
            case 5:
                bookOnMe();
                break;
            case 6:
                quit();
                break;
            default:
                System.out.println("Wrong select");
                bookMenu();
                break;
        }

    }

    public static void quit() {
        System.out.println("See you later...");
    }


    public static Map<Integer, String> bookList() {

        bookMap.put(1, "1984,George,Orwell");
        bookMap.put(2, "Beyaz Geceler,Fyodor,Dostoyevski");
        bookMap.put(3, "Dorian Gray’in Portresi,Oscar,Wilde");
        bookMap.put(4, "Bozkir kurdu,Hermann,Hesse");
        bookMap.put(5, "Ugultulu Tepeler,Emily,Bronte");
        bookMap.put(6, "Ses ve Ofke,William,Faulkner");
        bookMap.put(7, "Iki Sehrin Hikayesi,Charles,Dickens");
        bookMap.put(8, "Oblomov,Ivan,Goncarov");
        bookMap.put(9, "Veba,Albert,Camus");
        bookMap.put(10, "Saf ve Dusunceli Romanci,Orhan,Pamuk");
        bookMap.put(11, "Satranc,Stefan,Zweig");
        bookMap.put(12, "Sineklerin Tanrisi,William,Golding");
        bookMap.put(13, "Saatleri Ayarlama Enstitusu,Ahmet Hamdi,Tanpinar");
        bookMap.put(14, "Tatar Colu,Dino,Buzatti");
        bookMap.put(15, "Gun Olur Asra Bedel,Cengiz,Aytmatov");
        bookMap.put(16, "Masumiyet Muzesi,Orhan,Pamuk");
        bookMap.put(17, "Sofie’nin Dunyası,Jostein,Gaarder");
        bookMap.put(18, "Puslu Kitalar Atlasi,Ihsan Oktay,Anar");
        bookMap.put(19, "Nietzsche Agladiginda,Irvin D.,Yalom");
        bookMap.put(20, "Tutunamayanlar,Oguz,Atay");
        bookMap.put(21, "Sarkılar Kitabi,Heinrich,Heine");
        bookMap.put(22, "Simdilik,Muzaffer Tayyip,Uslu");
        bookMap.put(23, "Oda Muzigi,James,Joyce");
        bookMap.put(24, "Seviyordum Sizi,Alexandr,Puskin");
        bookMap.put(25, "Ask Siirleri,Alexandr,Puskin");
        bookMap.put(26, "Buyuk Saat,Turgut,Uyar");
        bookMap.put(27, "Gelmis Bulundum,Edip,Canseve");
        bookMap.put(28, "Butun Siirleri,Asaf Halet,Celebi");
        bookMap.put(29, "Sisler Bulvari,Attila,İlhan");
        bookMap.put(30, "Erbain Kirik Yilin Siirleri,Ismet,Ozel");
        bookMap.put(31, "Insan Ne Ile Yasar,Lev,Tolstoy");
        bookMap.put(32, "Dr. Jekyll Ile Bay Hyde,Robert Louis,Stevenson");
        bookMap.put(33, "Dr. Jekyll Ile Bay Hyde,Robert Louis,Stevenson");
        bookMap.put(34, "Insanciklar,Fyodor,Dostoyevski");
        bookMap.put(35, "Simyaci,Paulo,Coelho");
        bookMap.put(36, "Donusum,Franz,Kafka");
        bookMap.put(37, "Palyaco,Heinrich,Bolch");
        bookMap.put(38, "Agridagi Efsanesi,Yasar,Kemal");
        bookMap.put(39, "Aclik,Knut,Hamsun");
        bookMap.put(40, "Huzur,Ahmet Hamdi,Tanpinar");


        return bookMap;
    }

    public static void bookAdd() {
        System.out.println("Welcome Book Add Menu");
        System.out.println("Please input information of the book \nYou want to add");

        int id;
        System.out.println("Input Book Name");
        String bookName = scan.nextLine();
        scan.nextLine();
        System.out.println("Input Author Name");
        String authorName = scan.nextLine();
        System.out.println("Input Author Surname");
        String authorSurname = scan.nextLine();
        String value = bookName + "," + authorName + "," + authorSurname;
        Set<Map.Entry<Integer, String>> entrySeti = bookMap.entrySet();
        do {
            System.out.println("Input Id Number");

            id = scan.nextInt();
            System.out.println("The id you input is invalid");

        } while (!entrySeti.contains(id));

        bookMap.put(id, value);
    }





    public static void bookDelete() {
        System.out.println("kitap silme menusune hos geldiniz");
    }

    public static void getBookList() {
        System.out.println("Welcome to list menu");

        //   System.out.println(bookList());

        Set<Map.Entry<Integer, String>> entrySet = bookList().entrySet();
        //    System.out.println(entrySet);
        int siraNo;
        System.out.println("\n==================================================");
        System.out.printf("%-6s  %-15s  %-14s  %-15s", "number", "Author Name", "Author Surname", "Book Name");
        System.out.println("\n==================================================");

        for (Map.Entry<Integer, String> entry : entrySet) {
            String[] bookNameArray = entry.getValue().split(",");
            siraNo = entry.getKey();
            System.out.printf("\n%-6s  %-15s  %-14s  %-15s", siraNo, bookNameArray[1], bookNameArray[2], bookNameArray[0]);
            // System.out.println(entry);
        }

    }

    public static void bookSearch() {
        System.out.println("Arama menusune Hos Geldiniz");
        System.out.println("Lutfen Aramak istediginiz kriteri yaziniz\n1-Sira No\n2-Yazar Adi\n3-Yazar Soyadi\n4-Kitap Adi\n5-Cikis");
        int selection = scan.nextInt();
        switch (selection) {
            case 1:
                siraNoyaGoreArama();
                break;
            case 2:
                //    yazarAdinaGoreArama();
                break;
            case 3:
                //   yazarSoyadinaGoreArama();
                break;
            case 4:
                //  kitapAdinaGoreArama();
                break;
            case 5:
                //  cikis();
                break;
            default:
                System.out.println("Yanlis Secim yaptiniz");
                bookSearch();
                break;
        }
    }

    public static void siraNoyaGoreArama() {         //         =============== siraya gore kitap arama
        System.out.println("Kitap arama menusune hos geldiniz");
        Set<Map.Entry<Integer, String>> entrySet1 = bookList().entrySet();
        System.out.println("Aramak istediginiz kitap sirasini giriniz");
        int demand = scan.nextInt();
        int count = 0;
        for (Map.Entry<Integer, String> entry : entrySet1) {
            int index = entry.getKey();
            String[] entryArray = entry.getValue().split(",");
            if (demand == index) {
                count++;
                System.out.println(entryArray[0] + " " + entryArray[1] + " " + entryArray[2]);
            }


        }
        if (count == 0) {
            System.out.println("Kardes aradigin kitap yok");
            bookSearch();
        }

    }

    public static void bookOnMe() {

    }
}
