import java.util.*;
class sortedName
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[5];
        System.out.println("Enter five names");
        for (int i = 0; i < name.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            name[i] = sc.nextLine();
        }
        Arrays.sort(name);
        System.out.println("\nNames in alphabetical order:");
        for (String names : name) {
            System.out.println(name);
        }

        sc.close();
    }
}