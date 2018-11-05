/**
 * Java1 Hm 7
 *
 * @author Stanislav Yakovlev
 * @version dated Aug 02, 2018
 * @link https://github.com/StanislavYak
 */
public class hm7{
    public static void main(String[] args) {
        Cat[] x = {new Cat("Murzik", 23), new Cat("Hvostik", 49), new Cat("Ushastik", 35)};
        Plate plate = new Plate(50);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("-------------------");
        System.out.println("increase food by 20");
        plate.increaseFood(20);
        System.out.println(plate);
        System.out.println("-------------------");
        System.out.println("Cats eating:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
    static class Cat {
        private String name;
        private int appetite;
        private boolean isFull;

        Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.isFull = false;
        }

        @Override
        public String toString() {
            return "CAT: " + name + " | APPETITE: " + appetite + "| ISFULL: " + isFull;
        }

        void eat(Plate plate) {
            if (plate.getAmountOfFood() > appetite) {
                plate.decreaseFood(appetite);
                isFull = true;
            }
        }
    }

    static class Plate {
        private int amountOfFood;

        Plate(int amountOfFood) {
            this.amountOfFood = amountOfFood;
        }

        @Override
        public String toString() {
            return "PLATE: " + amountOfFood;
        }

        void decreaseFood(int appetite) {
            if (amountOfFood >= appetite) {
                amountOfFood -= appetite;
            }
        }

        int getAmountOfFood() {
            return amountOfFood;
        }

        void increaseFood(int amount) {
            amountOfFood += amount;
        }
    }

}