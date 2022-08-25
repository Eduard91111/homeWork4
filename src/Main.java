public class Main {
    public static void main(String[] args) {
        task3();
    }
    public static void task1() {
        int number = 1;
        while (number <= 10) {
            System.out.print(" " + number++);
        }
        System.out.println ();

        for (int newNumber = 10; newNumber >= 1; newNumber--) {
            System.out.print(newNumber + " ");
        }
    }
    public static void task2() {
        for (int firstFriday = 5; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница " + firstFriday + " число. Необходимо подготовить отчет.");
        }
    }
    public static void task3() {
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int i = start; i <= end; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

    }

    }