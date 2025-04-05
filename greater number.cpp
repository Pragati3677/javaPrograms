#include<iostream>
using namespace std;
int main()
{
	int num1;
	int num2;
	int num3;
	    cout<<"Enter value for num1:";
	cin>>num1;
	cout<<endl;
	    cout<<"Enter value for num2:";
	cin>>num2;
	cout<<endl;
		cout<<"Enter value for num3:";
	cin>>num3;
	cout<<endl;
	if(num1>num2 && num1>num3)
	{
		cout<<num1;
	}
	else if(num2>num1 && num2>num3)
	{
		cout<<num2;
	}
	else
	{
		cout<<num3;
	}
	return 0;
}
