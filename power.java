import java.util.Scanner;
import java.lang.Math;
class power{
    public static void main(String[] args) {
        int x, n, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        x = sc.nextInt();
        System.out.println("Enter the power: ");
        n = sc.nextInt();
        z = Math.pow(x, n);
        System.out.println(z);
    }
    
}