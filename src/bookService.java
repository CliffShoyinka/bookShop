import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bookService implements productService {

    List<book> bookList = new ArrayList<>();

    public bookService() {
        book book1=new book(1,"Vadideki Zambak","150",25,"Balzac","Penguin");
        book book2=new book(2,"Suç ve Ceza","150 Lira",12,"Dostoyevski","Penguin");
        book book3=new book(3,"Sefiller","125 Lira",15,"V.Hugo","Dream");
        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);


    }

    @Override
    public void processMenu() {

        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice!=0) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("1-Kitapları Listele");
            System.out.println("2-Kitap ekle");
            System.out.println("3-Kitap sil");
            System.out.println("4-Yayınevine göre filtrele");
            System.out.println("0-Geri dön");
            System.out.println("Seçiminiz:");

            choice=input.nextInt();

            switch (choice) {

                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    System.out.println("Yayinevi: ");
                    String pub = input.next();
                    filterProduct(pub);
                    break;
                default:
                    System.out.println("WARNING! PLEASE RESELECT!");
                    break;
            }
        }

    }

    @Override
    public void listProduct() {

        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s \n","ID","Kitap Adı","Yazar Adı","Yayınevi","Birim Fiyat","Stok");
        for (book book: this.bookList) {
            System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s \n",
                    book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getPrice(),book.getStock());
        }
        System.out.println("------------------------------------------------------------------------");
    }

    @Override
    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kitap adi: ");
        String bookName = input.nextLine();
        System.out.println("Yazar adi: ");
        String authorName = input.nextLine();
        System.out.println("Yayinevi: ");
        String pub = input.nextLine();
        System.out.println("Birim fiyati: ");
        String price = input.nextLine();
        System.out.println("Stok: ");
        int stock = input.nextInt();

        book newBook = new book(this.bookList.get(this.bookList.size()-1).getId()+1,bookName,price,stock,authorName,price);
        this.bookList.add(newBook);

    }

    @Override
    public void removeProduct() {

        Scanner input = new Scanner(System.in);
        boolean isExist=true;
        System.out.println("Kitap adi: ");
        int id = input.nextInt();
        for (book book: this.bookList) {
            if (book.getId()==id) {
                isExist = true;
                this.bookList.remove(book);
                System.out.println("BOOK HAS DELETED");
                break;
            }else {
                isExist=false;
            }
        }

        if (!isExist) {
            System.out.println("BOOK WAS NOT FOUND");
        }
    }

    @Override
    public void filterProduct(String filter) {
        for (book book: this.bookList) {
            if (book.getPublisher().equalsIgnoreCase(filter)) {
                System.out.printf("%-2s | %-20s | %-15s | %-10s | %-7s | %-5s \n",
                        book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getPrice(),book.getStock());
            }
        }

    }
}
