import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of the Circle:");
        double r = sc.nextDouble();
        System.out.println("Area of the Circle:");
        double a = 3.141*(r*r);
        System.out.println(a);
        System.out.println("Enter princpal amount :");
        int p = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        double R = sc.nextDouble();
        System.out.println("Enter timre (in year):");
        int t = sc.nextInt();
        System.out.println("Simple interes :");
        double s = p*R*t/100;
        System.out.println(s);



    }
}
