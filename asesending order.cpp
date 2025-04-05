#include<iostream>
using namespace std;
int main()
{
	int a[10];
	int temp;
	cout<<"Enter number 10 number:";
	for(int i=0; i<10; i++)
	{
		cin>>a[i];
	}
		for(int i=0; i<10; i++)

		{
			for(int j=i+1; j<10; j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
	
cout << "Numbers in ascending order:" << endl;
    for (int i = 0; i < 10; i++) 
	{
        cout << a[i] << " "; 
    }
    cout << endl;
	return 0;
}
