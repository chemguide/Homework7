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
    }
}