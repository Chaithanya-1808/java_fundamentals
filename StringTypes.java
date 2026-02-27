public class StringTypes{
    public static void main(String[] args){
        //non-primitive types
        String name = "Chaithanya C"; // wide space also characters = 11 wide space = 1 total = 12
        System.out.println(name.length());
        System.out.println(name.charAt(0)); 
        System.out.println(name.substring(0,4));
        System.out.println(name.replace('a','b'));//new string change not original string
        System.out.println(name);//original string cannot change it is immutable
       /*
       String name1 = "Chaithanya";
       String name2 = "Rakshitha";
       String name = name1 +" "+name2;
       System.out.println(name);
       String name3 = "Chai and Raki";
       System.out.println(name3.substring(0,4));
       System.out.println(name3.substring(5,8));
       System.out.println(name3.substring(9,13));
*/

    }
}