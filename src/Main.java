public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int savingForGrow = 15_000;
        int depositInBank = 0;
        int financeGoal = 2_459_000;
        int month = 0;
        while (depositInBank < financeGoal) {
            depositInBank += depositInBank / 100;
            depositInBank += savingForGrow;
            month ++;
            }
        System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", month, depositInBank);
        //Задача 2
        System.out.println("\n\nЗадача 2");
        int growNumber = 0;
        while (growNumber < 10) {
            growNumber ++;
            System.out.print(growNumber + " ");
        }
        System.out.println();
        for ( int i = 10; i > 0; i --) {
            System.out.print(i+ " ");
        }
        //Задача 3
        System.out.println("\n\nЗадача 3");
        int population = 12_000_000;
        int birthRatePerThousand = 12;
        int deathRatePerThousand = 8;
        int birthTotal = 0;
        int deathTotal = 0;
        int goalYear = 10;
        for ( int i = 1; i <= goalYear; i ++) {
            birthTotal = birthRatePerThousand * population / 1000;
            deathTotal = deathRatePerThousand * population / 1000;
            population = population + birthTotal - deathTotal;
            System.out.printf("Год %s, численность населения составляет %s\n", i, population);
        }
        //Задача 4
        System.out.println("\n\nЗадача 4");
        double depositInBankForGrow = 15_000;
        double financeGoalVasiliy = 12_000_000;
        int bankPercent = 7;
        int monthToWait = 0;
        while (depositInBankForGrow < financeGoalVasiliy) {
            depositInBankForGrow += depositInBankForGrow * bankPercent / 100;
            monthToWait ++;
            System.out.printf("Месяц %s, сумма накоплений %.2f\n", monthToWait, depositInBankForGrow);
        }
        System.out.printf("Нужно копить %s месяцев\n", monthToWait);

        //Задача5
        System.out.println("\n\nЗадача 5");
        double depositInBankForGrowEverySix = 15_000;
        double financeGoalVasiliyEverySix = 12_000_000;
        int bankPercentEverySix = 7;
        int monthToWaitEverySix = 0;
        while (depositInBankForGrowEverySix < financeGoalVasiliyEverySix) {
            depositInBankForGrowEverySix += depositInBankForGrowEverySix * bankPercentEverySix / 100;
            monthToWaitEverySix ++;
            if (monthToWaitEverySix % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений %.2f\n", monthToWaitEverySix, depositInBankForGrowEverySix);
            }
        }
        System.out.printf("Нужно копить %s месяцев\n", monthToWait);

        //Задача6
        System.out.println("\n\nЗадача 6");
        double depositInBankNineYears = 15_000;
        int stockPeriod = 9;
        int stockPeriodInMonth = stockPeriod * 12;
        int bankPercentNineYears = 7;
        int monthToWaitNineYears = 0;
        while (monthToWaitNineYears < stockPeriodInMonth) {
            depositInBankNineYears += depositInBankNineYears * bankPercentNineYears / 100;
            monthToWaitNineYears ++;
            if (monthToWaitNineYears % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений %.2f\n", monthToWaitNineYears, depositInBankNineYears);
            }
        }
        System.out.printf("Нужно копить %s месяцев\n", monthToWaitNineYears);

        //Задача7
        System.out.println("\n\nЗадача 7");
        int firstFriday = 5;
        int dayPerMonth = 31;
        while (firstFriday <= dayPerMonth) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет\n", firstFriday);
            firstFriday += 7;
        }

        //Задача8
        System.out.println("\n\nЗадача 8");
        int currentYear = 2024;
        int hundredAhead = currentYear + 100;
        int twoHundredBack = currentYear - 200;
        int yearCount = twoHundredBack;
        while (yearCount <= hundredAhead) {
            if (yearCount % 79 == 0) {
                System.out.println(yearCount);
            }
            yearCount ++;
        }
    }
}