/**
 * Java 1. Homework 1
 *
 * @authors Stanislav Yakovlev
 * @version dated Jul 11,2018
 */
public class Java1HomeWork1 {
        public static void main(String[] args) {
            theTask1();
            System.out.println("a * (b + (c / d)) = " + add(2,6,10,5));
            System.out.println(theTask3(5, 8));
            theTask4(-7);
            System.out.println(theTask5(-1));
            theTask6("Hello!");

        }

        static void theTask1() {
            System.out.println("Задание 1.");
            boolean b = true;
            byte bt = 10;
            char c = 'x';
            short s = 123;
            int i = 347;
            long l = 123456L;
            float f = 123.0f;
            double d = 546.654;
            System.out.println("Значение для типа boolean = " + b);
            System.out.println("Значение для типа byte = " + bt);
            System.out.println("Значение для типа char = [" + c + "]");
            System.out.println("Значение для типа short = " + s);
            System.out.println("Значение для типа int = " + i);
            System.out.println("Значение для типа long = " + l);
            System.out.println("Значение для типа float = " + f);
            System.out.println("Значение для типа double = " + d);
        }


        static double add(int a, int b, int c, int d) {
            System.out.println("Задание 2.");
            return a * (b + (c / d));
        }


        static boolean theTask3(int a, int b) {
            System.out.println("Задание 3.");
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }


        static void theTask4(int a) {
            System.out.println("Задание 4.");
            if (a >= 0) System.out.println("положительное");
            else System.out.println("отрицательное");
        }


        static boolean theTask5(int a) {
            System.out.println("Задание 5.");
            if (a < 0) return true;
            return false;
        }


        static void theTask6(String name) {
            System.out.println("Задание 6.");
            System.out.println(name);
        }


    }


