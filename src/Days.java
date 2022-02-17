
import java.util.Scanner;

public class Days {
    public static void main (String [] args){
        System.out.print ("Введите количество минут: ");
        Scanner scan  = new Scanner(System.in);
            int minuts = scan.nextInt();
            final int year = 365;
            final int hour = 24;
            final int minut = 60;
                int years = minuts/(minut*hour*year);
                int days = minuts/(minut*hour)-years*year;
       System.out.println (minuts + " минут - это примерно " + years +" лет и "+ days + " дней");
    }
}