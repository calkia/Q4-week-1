/**
 * Kiana Tjon
 * 4/8/25
 * Monogram
 */
import java.util.*;
public class Monogram {
    public static void main(String[] args) {
        String first;
        String middle, last;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        first = input.next().substring(0,1);
        System.out.print("Enter your middle initial: ");
        middle = input.next().substring(0,1);
        System.out.print("Enter your last name: ");
        last = input.next().substring(0,1);

        System.out.println("Your monogram is: "+first.toLowerCase()+last.toUpperCase()+middle.toLowerCase());

    }
}
