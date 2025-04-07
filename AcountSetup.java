/**
 * Kiana Tjon
 * 4/7/25
 * AcountSetup
 */
import java.util.*;
 public class AcountSetup{
     public static void main(String[] args) {
         String user;
         String pass;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a username: ");
        user = input.next().toLowerCase();
        do {
        System.out.print("Enter a password that is atleast 8 characters: ");
        pass = input.next().toLowerCase();
        }while (pass.length()<8);
        System.out.println("Your username is "+user+" and your password is "+pass);
       
     }
 }