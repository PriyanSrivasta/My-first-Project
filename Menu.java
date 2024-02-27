package apnaclg;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Student:");
        int i;
        do {
            int n = sc.nextInt();
            if (n>=90 && n<=100) {
                System.out.println("This is Good");
             } 
            else if(n<=89 &&n>=60){
                System.out.println("This is also Good");
            }
            else if(n<=59  &&n >= 0 ){
                System.out.println("This is Good as well");
            }
                
             else {
                System.out.println("Invalid Number");
                
            }
            System.out.print("Want to continue press 1(Yes) or 0(No):");
            i=sc.nextInt();

            sc.close();
        } while (i==1);
        
    }
    
}
