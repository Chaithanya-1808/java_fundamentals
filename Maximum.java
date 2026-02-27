//using ternary operators
public class Maximum{
    public static void main(String[] args){
        int a = 3, b =5,c=1;
        System.out.println((a>b)? ((a>c) ? a : c ):((b>c) ? b : c));
        System.out.println((a>b)&&(a>c)?a :((b>a) && (b>c)) ? b :c);//AND OPERATOR
    }
}