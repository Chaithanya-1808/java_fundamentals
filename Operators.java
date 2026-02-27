public class Operators{
    public static void main(String[] args){
        // Arithmetic operators
        int a = 1,b = 1;
        int add1 = a+b;
        int sub1 = a-b;
        int mul1 = a*b;
        int div1 = a/b;
        int  mod1 = a%b;
        System.out.println("add1 = " + add1);
        System.out.println("sub1 = " +sub1);
        System.out.println(" mul = " +mul1);
        System.out.println("div1 = " +div1);
        System.out.println("mod1 = " +mod1);
        //Assignment operators
        System.out.println(a+=2);
        System.out.println(b+=2);
        System.out.println(a-=2);
        System.out.println(b-=2);
        System.out.println(a*=2);
        System.out.println(b*=2);
        System.out.println(a/=2);
        System.out.println(b/=2);
        System.out.println(a%=2);
        System.out.println(b%=2);
        //comparision operators
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        //unary operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b--);
        System.out.println(--b);
        //logical operators
        System.out.println((a>b) && (b>a));
        System.out.println((a>b) || (b>a));
        System.out.println(!(a>b));
        //bitwise operators
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        //ternary operators
        System.out.println((a>b)? a : b);
        //shift operators
        System.out.println(a<<2);
        System.out.println(a>>10);

        if(a==b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        float c = 10.011f , d = 20.011f;
        if(c==d){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}