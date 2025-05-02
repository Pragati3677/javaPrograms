package LibraryManagement;

public class Member {
    String name;
    String memberID;

    public Member(String name, String memberID){
        this.name = name;
        this.memberID = memberID;

    }
    public void displayMember(){
        System.out.println("Member name:" +name);
        System.out.println("Member ID:" +memberID);
    }
}
