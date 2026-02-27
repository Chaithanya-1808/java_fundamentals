import java.util.Scanner;
public class Vowels{
    public static void main(String[] args){
        char vowel;
        System.out.print("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        vowel = sc.next().charAt(0);
        switch(vowel){
            case 'A','a' : System.out.print("Vowel");
                            break;
            case 'E','e' : System.out.print("Vowel");
                            break;
            case 'I','i' : System.out.print("Vowel");
                            break;
            case 'O','o' : System.out.print("Vowel");
                            break;
            case 'U','u' : System.out.print("Vowel");
                            break;
            default : System.out.print("Consonent");
                    break;
        }

        

    }
}