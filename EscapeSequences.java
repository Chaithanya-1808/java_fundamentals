public class EscapeSequences{
    public static void main(String[] args){
        String name1 = "Ram\n"; // \n newline
        System.out.print(name1);
        String name2 = "Ravi\t";// \t tab space
        System.out.print(name2);
        String name3 = "Seetha\s";// \s single space
        System.out.print(name3);
        String name4 = "Lakshman\r"; // \r carriage return --> Start of same line
        System.out.print(name4);
        String name5 = "Krishna\f"; // \f formfeed --> page break / new line
        System.out.print(name5);
        String name6 = "Balram";
        System.out.print(name6);

    }
}