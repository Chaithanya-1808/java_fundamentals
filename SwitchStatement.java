import java.util.Scanner;
public class SwitchStatement{
    public static void main(String[] args){
        /*
        Scanner sc = new Scanner (System.in);
        int choice;
        System.out.println("Enter a number from 0 to 6");
        choice = sc.nextInt();
        switch(choice){
            case 0 : System.out.println("Sunday");
                break;
            case 1 : System.out.println("Monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            case 4 : System.out.println("Thursday");
                break;
            case 5 : System.out.println("Friday");
                break;
            case 6 : System.out.println("Saturday");
                break;
            default : System.out.println("Invalid day of a week");
                break; 
            */
        /*
        Scanner sc = new Scanner (System.in);
        char choice;
        System.out.println("Enter a charecter r,g,b");
        choice = sc.next().charAt(0);
        switch(choice){
            case 'R','r' : System.out.println("Red");
                break;
            case 'G','g' : System.out.println("Green");
                break;
            case 'B','b' : System.out.println("Blue");
                break;
            default : System.out.println("Invalid color");
                break;
        */
       /*
        Scanner sc = new Scanner (System.in);
        String choice;
        System.out.println("Enter a string ");
        choice = sc.next();
        switch(choice){
            case "Jan" : System.out.println("1st month January");
                break;
            case "Feb" : System.out.println("2nd month February");
                break;
            case "Mar" : System.out.println("3rd month March");
                break;
            case "Apr" : System.out.println("4th month April");
                break;
            case "May" : System.out.println("5th month May");
                break;
            case "Jun" : System.out.println("6th month June");
                break;
            case "Jul" : System.out.println("7th month July");
                break;
            case "Aug" : System.out.println("8th month August");
                break;
            case "Sep" : System.out.println("9th month September");
                break;
            case "Oct" : System.out.println("10nth month October");
                break;
            case "Nov" : System.out.println("11nth month November");
                break;
            case "Dec" : System.out.println("12th month December");
                break;
            default : System.out.println("Invalid month of a week");
                break;
            */
        Scanner sc = new Scanner (System.in);
        float choice;
        System.out.println("Enter a number from 0.0 to 2.0");
        choice = sc.nextFloat();
        switch(choice){
            case 0.0f : System.out.println("0.0");
                break;
            case 1.0f : System.out.println("1.0");
                break;
            case 2.0f : System.out.println("2.0");
                break;
            default : System.out.println("Invalid value");
                break;
        }

    }
}