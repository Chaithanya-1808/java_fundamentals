import java.lang.Math;
public class MathFunc{
    public static void main(String[] args){
        int num1 = 4;
        System.out.println("Square root : " + Math.sqrt(num1));
        System.out.println("cube root : " + Math.cbrt(num1));
        System.out.println("absolute value : " + Math.abs(num1));
        float num2 = 10.001f;
        System.out.println("round value : " + Math.round(num2));
        System.out.println("ceil : " + Math.ceil(num2));
        System.out.println("Floor : " + Math.floor(num2));
        System.out.println("Maximum : " + Math.max(num1,num2));
        System.out.println("Minimum : " + Math.min(num1,num2));
        System.out.println("Power : " + Math.pow(num1,2));//num1 = 4 -->4*4=16
        System.out.println("Random : " + Math.random());        

    }
}