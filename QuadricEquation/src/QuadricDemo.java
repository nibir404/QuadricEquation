import java.util.Scanner;

public class QuadricDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A : ");
        double A=input.nextDouble();
        System.out.println("Enter B : ");
        double B=input.nextDouble();
        System.out.println("Enter C : ");
        double C=input.nextDouble();

        Double eq= B*B-4*A*C;

        if (eq>0){
            double x1 = (-B+Math.pow(eq,0.5))/(2.0*A);
            double x2 = (-B-Math.pow(eq,0.5))/(2.0*A);
            System.out.println("The roots are "+x1+" and "+x2);
        }
        else if (eq==0){
            double x1 = -B/(2.0*A);
            System.out.println("the root is : "+x1);
        }
        else System.out.println("The equation has no root");
    }
}
