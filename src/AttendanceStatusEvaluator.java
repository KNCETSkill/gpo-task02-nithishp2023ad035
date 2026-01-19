import java.util.Scanner;
import java.io.*;

public class AttendanceStatusEvaluator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Attendance = sc.nextInt();
        if(Attendance>85){
            System.out.println("Excellent");
        } else if(Attendance>=60 && Attendance<=85){
            System.out.println("Satisfactory");       
        } else if(Attendance<60){
           System.out.println("Poor");
                }
       
        sc.close();
    }
}


