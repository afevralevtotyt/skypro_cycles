public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task2_1();
        task2_2();
        task2_3();
        task3_1();
        task3_2();
        hardTask4();
        hardTask5();


    }


    private static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task2_1() {
        System.out.println("Задание 2_1");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                System.out.println(+i + " год является високосным");}
        }

    }

    private static void task2_2() {
        System.out.println("Задание 2_2");
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    private static void task2_3() {
        System.out.println("Задание 2_3");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%s", Math.round((Math.pow(2, i))) +" ");
        }
        System.out.println();
    }


    private static void task3_1() {
        System.out.println("Задание 3_1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Общая сумма в " + i + " месяце равна " + total);
        }
    }

    private static void task3_2() {
        System.out.println("Задание 3_2");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total += salary;
            System.out.println("Общая сумма в " + i + " месяце равна " + total);
        }
    }


    private static void hardTask4() {
        System.out.println("Задание повышенной сложности 4");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + " :ping");

            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + " :pong");
            }
        }

    }


    private static void hardTask5() {
        System.out.println("Задание повышенной сложности 5");
        int first = 0;
        int second = 1;
        int next;
        String total = first + " " + second + " ";
        for (int i = 0; i < 8; i++) {
            next = first + second;
            first = second;
            second = next;
            total += next + " ";
        }
        System.out.println(total);
    }


}