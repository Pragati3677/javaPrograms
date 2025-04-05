#include<iostream>
using namespace std;
int main()
{
	int num;
	int rno=0;
	cout<<"Enter the number:";
	cin>>num;
	
	while(num!=0)
	{
		int digit = num%10;
		rno=rno*10+digit;
		num=num/10;
		
	}
	cout<<"reverse number is"<<rno;
	return 0;
	
}
