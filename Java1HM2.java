public class Java1HM2 {
    public static void main(String[] args) {
        System.out.println("Task1");
        Task1();
        System.out.println("Task2");
        Task2();
        System.out.println("Task3");
        Task3();
    }


          public static void Task1() {
             int[] arr = {1, 0, 0, 1, 0, 1};
             for (int i = 0; i < arr.length; i++) {
                 System.out.print(arr[i]);
                 if (arr[i] == 0) arr[i] = 1;
                 else arr[i] = 0;
                 System.out.println(arr[i]);
             }
         }

          public static void Task2() {
            int[] a = new int[8];
            for (int i = 0, j = 0; i < a.length; i++, j += 3) {
                a[i] = j;
                System.out.println(a[i] + " ");
            }


        }

    public static void Task3() {
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < b.length; i++) {
            System.out.print("До " + b[i] + " ");
            if (b[i] < 6) b[i] *= 2;
            System.out.println("После " + b[i] + " ");
        }

    }



    }





