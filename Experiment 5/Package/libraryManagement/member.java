package libraryManagement;
class member{
String name;
int id;
member(String name, int id){
this.name = name;
this.id = id;
}
public void displayDetails() {
System.out.println("name is"+name);
System.out.println("id is"+id);
}
}