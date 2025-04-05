public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello, World!");

        // Задача 1: Объявление переменных.
        int varInt = 1;
        byte varByte = 2;
        short varShort = 3;
        long varLong = 4L;
        float varFloat = 5.0f;
        double varDouble = 6.0;
        System.out.println("Задача 1:");
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
        System.out.println();

        // Задача 2: Инициализация переменных.
        float var1 = 27.12f;
        long var2 = 987678965549L;
        float var3 = 2.786f;
        short var4 = 569;
        short var5 = -159;
        int var6 = 27897;
        byte var7 = 67;
        System.out.println("Задача 2:");
        System.out.println("Без использования переменных var1-var7 не дает пушить, потому выведу их в консоль:");
        System.out.println(var1 + "; " + var2 + "; " + var3 + "; " + var4 + "; " +  var5 + "; " +
                var6 + "; " + var7 + ".");
        System.out.println();

        // Задача 3: Задача о листах бумаги.
        byte numberOfStudentsLP = 23;
        byte numberOfStudentsAS = 27;
        byte numberOfStudentsEA = 30;
        short numberOfSheets = 480;
        System.out.println("Задача 3:");
        float sheetsPerPupil = (float) numberOfSheets / (float) (numberOfStudentsLP + numberOfStudentsAS +
                numberOfStudentsEA);
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil +" листов бумаги.");
        System.out.println();

        // Задача 4: Производительность машины.
        System.out.println("Задача 4:");
        byte efficiency = 16 / 2;
        int productivityOverTime = 20 * efficiency;
        System.out.println("За 20 минут машина произвела " + productivityOverTime
                + " штук бутылок.");
        productivityOverTime = 24 * 60 * efficiency;
        System.out.println("За сутки машина произвела " + productivityOverTime
                + " штук бутылок.");
        productivityOverTime *= 3;
        System.out.println("За 3 дня машина произвела " + productivityOverTime
                + " штук бутылок.");
        productivityOverTime *= 10;
        System.out.println("За 1 месяц машина произвела " + productivityOverTime
                + " штук бутылок.");
        System.out.println();

        // Задача 5: Краска для ремонта.
        System.out.println("Задача 5:");
        byte brownPot = 4;
        byte whitePot = 2;
        byte totalPot = 120;
        byte totalClasses = (byte) (totalPot / (brownPot + whitePot));
        byte totalBrownPot = (byte) (totalClasses * brownPot);
        byte totalWhitePot = (byte) (totalClasses * whitePot);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePot
                + " банок белой краски и " + totalBrownPot + " банок коричневой краски.");
        System.out.println();

        // Задача 6: Завтрак спортсмена.
        System.out.println("Задача 6:");
        short bananas = 5 * 80;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        short weight = (short) (bananas + milk + iceCream + eggs);
        float weightKg = weight / 1000f;
        System.out.println("Вес спортзавтрака в граммах " + weight + " и килограммах " + weightKg
                + " соответственно.");
        System.out.println();

        // Задача 7: Вес спортсмена.
        System.out.println("Задача 7:");
        short overallDifference = 7 * 1000;
        byte daysMin = (byte) (overallDifference / 500);
        byte daysMax = (byte) (overallDifference / 250);
        float average = (daysMax + daysMin) / 2f;
        System.out.println("Для похудания спортсмену потребуется от " + daysMin + " до " + daysMax
                + " дней. В среднем будет затрачено " + average + " дней.");
        System.out.println();

        // Задача 8: Годовой доход и з/п.
        System.out.println("Задача 8:");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        System.out.println("Маша теперь получает " + (salaryMasha + salaryMasha / 10) +
                " рублей. Годовой доход вырос на " + salaryMasha * 12 / 10 + " рублей.");
        System.out.println("Денис теперь получает " + (salaryDenis + salaryDenis / 10) +
                " рублей. Годовой доход вырос на " + salaryDenis * 12 / 10 + " рублей.");
        System.out.println("Кристина теперь получает " + (salaryKristina + salaryKristina / 10) +
                " рублей. Годовой доход вырос на " + salaryKristina * 12 / 10 + " рублей.");

    }
}