package Ecommerce ;
class product{
String name;
int id;
int price;
product(String name, int id, int price){
this.name = name;
this.id = id;
this.pricr = price;
}
void display(){
System.out.println("name of product is"+name);
System.out.println("product id"+id);
System.out.println("product price"+price);
}
}
