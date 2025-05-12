package libraryManagement;
class Book
{
String title;
String author;
int isbn;
Book(String title, String author, int isbn){
this.title=title;
this.author=author;
this.isbn=isbn;
}
public void DisplayBook(){
System.out.println("Title is"+title);
System.out.println("Author name is"+author);
System.out.println("Isb number is"+isbn);
}
}