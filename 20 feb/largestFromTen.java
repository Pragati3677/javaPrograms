import java.util.*;
class largestFromTen
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        System.out.println("Enter 10 numbers");
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Number"+ (i+1) +":");
            numbers[i] = sc.nextInt();
        } 
        int largest = numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("\nThe largest number is: " + largest);

        sc.close();
    }
}