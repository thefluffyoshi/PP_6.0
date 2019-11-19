import java.util.Scanner;
public class Array
{
    public static void main (String[] args)
    {
        //Scanner
        Scanner keyboard = new Scanner(System.in);
        //array
        int nums[] = new int[5];

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println("Please enter a number for the array ");
            nums[i] = keyboard.nextInt();
        }//end for loop 1

        System.out.println("The numbers for the array are: ");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(+ nums[i] + ",");
        }//end for loop 2
    }//end main
}//end class Array