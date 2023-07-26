
import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        System.out.println();
        // To take a character from the user
        Scanner sc=new Scanner(System.in);
        // Scanner class which is under the given package through the class we can read the data 
        // from the keyboard
        char c=sc.next().charAt(0);
        if(c>=65 && c<=90){ // (c>='A' && c<='Z')
            System.out.println("1");
        }
        else if(c>=97 && c<=122){
            System.out.println("0");

        }
        else{
            System.out.println("-1");
        }


    }
}
