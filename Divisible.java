import java.util.*;
public class Divisible {
    public  static boolean divisibilityBySeven(int x){
        int a = 0;
        int b = 0;
        while(x>0){
            a = x/10;
            b = x-(a*10);
            x = a - 2*b;
        }
        if(x == 0 || x == 7 || x == -7){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int x = sc.nextInt();

        System.out.println(divisibilityBySeven(x));
    }
}
