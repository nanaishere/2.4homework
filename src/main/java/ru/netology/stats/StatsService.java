package ru.netology.stats;

public class StatsService {
    public static void main(String [] args) {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int amount = getAmount(purchases);
        int average = getAverage(purchases);
        int monthMax = findMonthMax(purchases);
        int monthMin = findMonthMin(purchases);
        int monthUnderAverage =  findQuantityUnderAverage(purchases);
        int monthOverAverage =  findQuantityOverAverage(purchases);
        System.out.println("Сумма всех продаж " + amount);
        System.out.println("Средняя сумма продаж " + average);
        System.out.println(monthMax + " Месяц максимальных продаж");
        System.out.println(monthMin + " Месяц минимальных продаж");
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего " + monthUnderAverage);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего " + monthOverAverage);
    }
    public static int getAmount(int [] purchases){
        int amount = 0;
        for (int purchase:purchases) {
            amount += purchase;
        }
        return amount;
    }
    public static int getAverage(int[] purchases) {

        return getAmount(purchases) / purchases.length;

    }
    public static int findMonthMax(int[] purchases) {
        int max = purchases[0];
        int number = 0;
        int numberMax = 0;
        for (int purchase : purchases) {
            number++;
            if (max <= purchase) {
                max = purchase;
                numberMax = number;
            }
        }
        return numberMax;
    }
    public static int findMonthMin(int[] purchases) {
        int min = purchases[0];
        int number = 0;
        int numberMin = 0;
        for (int purchase : purchases) {
            number++;
            if (min >= purchase) {
                min = purchase;
                numberMin = number;
            }
        }
        return numberMin;
    }
    public static int  findQuantityUnderAverage(int[] purchases) {
        int average = getAverage(purchases);
        int month = 0;
        int quantityUnder = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                month++;
                quantityUnder = month;
            }
        }
        return quantityUnder;
    }
    public static int findQuantityOverAverage(int[] purchases) {
        int average = getAverage(purchases);
        int month = 0;
        int quantityOver = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;
    }
}
