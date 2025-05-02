
import java.util.Scanner;

import LibraryManagement.Member;
import LibraryManagement.book;


public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book title:");
        String title = sc.nextLine();

        System.out.print("Enter author name:");
        String author = sc.nextLine();

        System.out.print("Enter isbn:");
        int isbn = sc.nextInt();

        System.out.print("Enter Member name:");
        String name = sc.next();

        System.out.print("Enter Member ID:");
        String memberID = sc.next();

        book b1 = new book(title,author,isbn);
        Member m1 = new Member(name, memberID);

        System.out.println("\n--- Book Details ---");
        b1.displayBook();   
        System.out.println("\n--- Member Details ---");
        m1.displayMember();  
sc.close();
    }
    
}
