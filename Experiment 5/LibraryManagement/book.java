package LibraryManagement;

public class book {
    String title;
    String author;
    int isbn;
    public book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }
    public void displayBook(){
        System.out.println("Book title:" +title);
        System.out.println("author name:" +author);
        System.out.println("international standerd book number:" +isbn);
    }
}
