package Ecommerce ;
class order(){
public product p;
public customer c;
int totalCost;
order(product p, customer c, int totalCost){
this.p=p;
this.c=c;
this.totalCost=totalCost;
}
public void placingOrder(){
c.displayInfo();
p.display();

}
}