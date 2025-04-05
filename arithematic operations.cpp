#include<iostream>
using namespace std;
int main()
{
	int i,num1,num2,result;
	cout<<"Enter first number:";
	cin>>num1;
	cout<<"Enter second number:";
	cin>>num2;
	do{
	cout<<"1. Add"<<endl;
	cout<<"2.sub"<<endl;
	cout<<"3.multiply"<<endl;
	cout<<"4.division"<<endl;
	cout<<"5.mod"<<endl;
	cout<<"6.exit"<<endl;
	cout<<"Enter your choice:";
	cin>>i;
    
   
	switch(i)
	{
		case 1:
			result=num1+num2;
			cout<<"addition is:"<<result<<endl;
			break;
		case 2:
			result=num1-num2;
			cout<<"subtraction is:"<<result<<endl;
			break;
		case 3:
			result=num1*num2;
			cout<<"multipication is:"<<result<<endl;
			break;
		case 4:
			result=num1/num2;
			cout<<"division is:"<<result<<endl;
			break;
		case 5:
			result=num1%num2;
			cout<<"mod is:"<<result<<endl;
			break;
		case 6:
			cout<<"exit"<<endl;
			break;
		default:
		cout<<"Enter courret choice"<<endl;	
	}
}while(i!=6);
	
	return 0;
	
}
