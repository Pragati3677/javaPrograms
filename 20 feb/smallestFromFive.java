import java.util.*;
class smallestFromFive
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        System.out.println("Enter five numbers");
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("numbers"+(i+1)+":");
            numbers[i] = sc.nextInt();
        }
        int Smallest = numbers[0];
        for(int i = 0; i<numbers.length; i++)
        {
            if(i<Smallest)
            {
                Smallest=numbers[i];
            }
        }
        System.out.println("Smallest number is:"+ Smallest);
        sc.close();
    }
}