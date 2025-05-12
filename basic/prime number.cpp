#include<iostream>
using namespace std;
int main()
{
	int flag =1;
	int a;
	cout<<"Enter the number:";
	cin>>a;
	if(a<=1)
	{
		cout<<"given number is not prime number"<<endl;
		
	}
	else
	{
		for (int i = 2; i < a ; i++)
		{
			if(a % i == 0)
			{
				flag=0;
				break;
			}
	
       }
		
	}
	if(flag)
	{
		cout<<"Given number is prime";
	}
	else
	{
		cout<<"given number not prime number";
	}
	
	return 0;
}
