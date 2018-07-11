/**
 * Java1HM3
 *
 * @author Stanislav Yakovlev
 * @version dated 18.07.2018
 */

import java.util.Scanner;

class Java1HomeWork3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать чило с трех попыток");
        System.out.println("Введите число от 0 до 9");
        int try3 = 0;
            int a = 9;
            int b = (int) (Math.random() * a);
            while (try3 < 3) {
                int input_number = scanner.nextInt();
                if (input_number == b) {
                    System.out.println("Вы угадали.");
                    break;
                } else if (input_number > b) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                    }
                    try3++;

                }
        System.out.println("Повторить игру еще раз?\n 1 - да,  0 - нет");
        String answer = scanner.next();
            if (answer.equals("1")){
                main(null);
            }


            }

            }


