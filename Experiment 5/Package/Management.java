package LibraryManagement;
import java.util.*;
class Management{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter title of book:");
String title = sc.next();
System.out.print("Enter author of book:");
String author = sc.next();
System.out.print("Enter isbn of book:");
int isbn = sc.nextInt();

System.out.print("Enter Name of Member:");
String name = sc.next();
System.out.print("Enter id:");
int id = sc.nextInt();

Book b1 = new Book(title,author,isbn);
member m1 = new member(name, id);

System.out.println("Book details");
b1.DisplayBook();
System.out.println("Member details");
m1.displayDetails();
}
}