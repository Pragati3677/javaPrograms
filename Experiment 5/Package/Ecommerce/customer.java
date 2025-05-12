package Ecommerce ;
class customer{
String name;
String address;

customer(String name, String address){
this.name = name;
this.address = address;
}
void displayInfo(){
System.out.println("Entre name of customer"+name);
System.out.println("Enter address of customer"+address);
}
}