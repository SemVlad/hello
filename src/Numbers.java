import java.util.Scanner;

    public class Numbers {
        public static void main (String [] args){
            int x = 4;
            do{
            System.out.print ("Введите целое цисло: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
                    if (number <= 999 && number >= 100) {
                        int num1 = number / 100;
                        int num2 = (number / 10) % 10;
                        int num3 = number % 10;
                        int sum = num1 + num2 + num3;
                        System.out.println("Сумма всех цифр в " + number + " равна " + sum);
                        break;
                    } else {
                        System.out.println("Введите число от 100 до 999");
                    }
            } while (x == 4);

        }
    }