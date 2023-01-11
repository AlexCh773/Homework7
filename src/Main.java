public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("task1:");
        int depositAmount = 0;
        int monthlyContribution = 15000;
        int numberOfMonth = 0;
        while (depositAmount < 2_459_000) {
            depositAmount = depositAmount + monthlyContribution;
            numberOfMonth++;
            System.out.println("Месяц " + numberOfMonth + ", сумма накоплений равна " + depositAmount + " рублей");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3:");
        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int deathRatePer1000 = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + population/1000 * (birthRatePer1000 - deathRatePer1000);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("task4:");
        double depositAmount = 15000;
        int percentPerMonth = 7;
        int numberOfMonth = 0;
        while (depositAmount < 12_000_000) {
            depositAmount = Math.floor(depositAmount + depositAmount/100 * percentPerMonth);
            numberOfMonth++;
            System.out.println("Месяц №" + numberOfMonth + " сумма накоплений Василия - " + String.format("%.0f", depositAmount) + " руб");
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("task5:");
        double depositAmount = 15000;
        int percentPerMonth = 7;
        int numberOfMonth = 0;
        while (depositAmount < 12_000_000) {
            depositAmount = Math.floor(depositAmount + depositAmount/100 * percentPerMonth);
            numberOfMonth++;
            if (numberOfMonth % 6 == 0) {
                System.out.println("Месяц №" + numberOfMonth + " сумма накоплений Василия - " + String.format("%.0f", depositAmount) + " руб");
            }
        }
    }

    public static void task6() {
        System.out.println();
        System.out.println("task6:");
        double depositAmount = 15000;
        int percentPerMonth = 7;
        int depositTermInYears = 9;
        for (int i = 1; i <= depositTermInYears * 12; i++ ) {
            depositAmount = Math.floor(depositAmount + depositAmount/100 * percentPerMonth);
            if (i % 6 == 0) {
                System.out.println("Месяц №" + i + " сумма накоплений Василия - " + String.format("%.0f", depositAmount) + " руб");
            }
        }
    }

    public static void task7() {
        System.out.println();
        System.out.println("task7:");
        int firstFridayDate = 6;
        int currentDayOfTheMonth = firstFridayDate;
        while (currentDayOfTheMonth <= 31) {
            if ((currentDayOfTheMonth - firstFridayDate) % 7 == 0) {
                System.out.println("Сегодня пятница, " + currentDayOfTheMonth + "-е число. Необходимо подготовить отчет");
            }
            currentDayOfTheMonth++;
        }
    }

    public static void task8() {
        System.out.println();
        System.out.println("task8:");
        int cometAppearanceInterval = 79;
        int currentYear = 2023;
        for (int i = 0; i <= currentYear + 100; i = i + cometAppearanceInterval) {
            if (i >= currentYear - 200) {
                System.out.println(i);
            }
        }
    }
}