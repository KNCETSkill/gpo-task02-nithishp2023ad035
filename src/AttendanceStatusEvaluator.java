import java.util.Scanner;

public class StudentAttendanceEvaluator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Attendance = sc.nextInt();
        if(Attendance>85){
            printf("Excellent");
        } else if(Attendance>=60 && Attendance<=85){
            printf("Satisfactory");       
        } else if(Attendance<60){
            printf("Poor");
                }
       
        sc.close();
    }
}


