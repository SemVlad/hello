
import java.util.Scanner;

    public class Inch {
        public static void main (String[] args){
            System.out.print ("Введите значение для дюйма: ");
            Scanner scan = new Scanner(System.in);
                float inch = scan.nextFloat();
                final float koefInch = 0.0254f;
                float metr = inch*koefInch;
                System.out.println (inch + " дюйма - это " + metr + " метра");
        }
}
