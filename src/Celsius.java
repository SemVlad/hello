import java.util.Scanner;

    public class Celsius {
        public static void main (String[] args){
            System.out.print("Введите градусы в Фаренгейте: ");
            Scanner scan = new Scanner (System.in);
            final int nolCelsius = 32;
            final float koef = 1.8f;
                float fahrenheit = scan.nextFloat();
                float celsius = (fahrenheit - nolCelsius)/koef;
                System.out.println ( fahrenheit + " градусов по Фаренгейту равна " + celsius + " по Цельсию");
        }
}
