import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        double p;
        double r;
        double t;
        double si;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle : ");
        p = input.nextDouble();
        System.out.println("Enter Rate : ");
        r = input.nextDouble();
        System.out.println("Enter Time : ");
        t = input.nextDouble();

        si = p*r*t / 100;

        total = si + p;
        System.out.println("Simple Interest : "+ si);
        System.out.println("Amount : "+total);


        }

    }

