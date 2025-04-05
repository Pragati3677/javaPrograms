#include<iostream>
using namespace std;
class student
{
	public:
		string name;
		int rollNo;
		void getData()
		{
			cout<<"Enter student name:";
			cin>>name;
			cout<<"Enter student rollNo:";
			cin>>rollNo;
		}
		void displayData()
		{
			cout<<"name is:"<<name<<endl;
			cout<<"roll no is:"<<rollNo<<endl;
		}
};
int main()
{
	student s[5];
		cout<<"Enter details for student:"<<endl;
    
    for(int i=0; i<5; i++)
    {
    
    	s[i].getData();
	}
	int choice;
	cout<<"Enter your choice";
	cin>>choice;
	
	if(choice>=0 && choice<=5)
	{
		cout<<"Enter student details"<<choice<<endl;
		s[choice-1].displayData();
	}
	else
	{
		cout<<"Enter valid details:";
	}
	

}
