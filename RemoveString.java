import java.util.Scanner;

/**
 * Kiana Tjon
 * 4/8/25
 * Remove String
 */

public class RemoveString {
    public static void main(String[] args) {
        String sentence, remove;
        int index;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();
        System.out.print("Enter a string: ");
        remove = input.next();
        //do{
            index = sentence.indexOf(remove);
            if (index != -1){
                sentence.replace(remove, "");
            }
        //}while (index != -1);
        System.out.println(sentence);
        System.out.println(index);
    }
}
