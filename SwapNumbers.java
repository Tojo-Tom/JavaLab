public class SwapNumbers {
    public static void main(String[] args){
        int A=15;
        int B=20;
        int temp=0;
        System.out.println("With temp variable");
        System.out.println("Before swap");
        System.out.println("A = "+A);
        System.out.println("B = "+B);

        temp = A;
        A = B;
        B = temp;

        System.out.println("After Swap");
        System.out.println("A = "+A);
        System.out.println("B = "+B);

        System.out.println("Without temp variable");
        System.out.println("Before swap");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        A = A+B;
        B = A-B;
        A = A -B;
        System.out.println("After Swap");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
    }
    }

