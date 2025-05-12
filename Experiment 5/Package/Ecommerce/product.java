package Ecommerce ;
class product{
String name;
int id;
product(String name, int id){
this.name = name;
this.id = id;
}
void display(){
System.out.println("name of product is"+name);
System.out.println("product id"+id);
}
}
