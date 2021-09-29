import java.util.Scanner;

/*
Complete below program to accept test scores from a user to find the minimum,
 maximum, and average test scores. You can not change existing code.
 */
public class CompletetheRest {
    public static void main (String args[]){
        int min, max, sum;
        double avg;
        int score, counter;

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a test score. Type -1 to quit.");
        score = keybd.nextInt();
        keybd.nextLine();
        counter = 0;
        min=0;
        max=99999999;
        sum=0;
        avg=0;

        while (score != -1) {
         if (min < score)
             min = score;
         if (max > score)
             max = score;
         sum += score;
         counter++;
         score = keybd.nextInt();
        }

        if (counter > 0)
            avg = sum / counter;


        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
}
