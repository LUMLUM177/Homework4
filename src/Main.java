public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
        public static void task1() {
        int i = 0;
        while (i < 10){
            System.out.print(++i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        public static void task2() {
        int currentFriday = 5;
        while (currentFriday <= 31) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчёт.");
            currentFriday += 7;
        }
    }
        public static void task3() {
        int currentYear = 2022;
        int begin = currentYear - 200;
        int end = currentYear + 100;
        for (int year = 0; year <= end; year += 79) {
            if (year >= begin) {
                System.out.println(year);
            }
        }
    }
        public static void task4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            }
            else if (i % 3 == 0) {
                System.out.println(i + ": ping ");
            }
            else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            }
            else {
                System.out.println(i + ":");
            }
        }
    }
        public static void task5() {
        int first = 0;
        int second = 1;
        int nextNumber = 0;
        int previousNumber = first + second;
        System.out.print(first);
        for (int i = 0; i < 10; i++) {
            previousNumber += nextNumber;
            nextNumber += previousNumber;
            System.out.print(" " + previousNumber);
            System.out.print(" " + nextNumber);
        }
        }
}