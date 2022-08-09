public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
        public static void task1() {
        int i = 1;
        while (i <= 10){
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
}