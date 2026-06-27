import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args){
        String name;
        int rollno;
        String course;
        double percentage;

        Scanner input =new Scanner(System.in);

        System.out.println("Name : ");
        name = input.nextLine();
        System.out.println("RollNo: ");
        rollno = input.nextInt();
        input.nextLine();
        System.out.println("Course: ");
        course = input.nextLine();
        System.out.println("Percentage: ");
        percentage = input.nextDouble();


        System.out.println("Student Details");
        System.out.println("Name : "+name);
        System.out.println("RollNo : "+rollno);
        System.out.println("Course : "+course);
        System.out.println("Percentage : "+percentage);

    }
}
