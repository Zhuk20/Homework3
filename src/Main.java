public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        System.out.println("Задание 1");
        byte n1 = 67 ;
        short n2 = 569 ;
        int n3 = 27897 ;
        long n4 = 987678965549L;
        float n5 = 27.12f;
        double n6 = 2.786;
        short n7 = -159;
        System.out.println("Значение переменной n1 с типом byte равно " + n1);
        System.out.println("Значение переменной n2 с типом short равно " + n2);
        System.out.println("Значение переменной n3 с типом int равно " + n3);
        System.out.println("Значение переменной n4 с типом long равно " + n4);
        System.out.println("Значение переменной n5 с типом float равно " + n5);
        System.out.println("Значение переменной n6 с типом double равно " + n6);

        System.out.println("Задание 2");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
    }
    public static void task2(){
        System.out.println("Задание 3");
        short klass1 = 23;
        short klass2 = 27;
        short klass3 = 30;
        short list = 480;
        int x = list / (klass1 + klass2 + klass3 );
        System.out.println("На каждого ученика рассчитано " + x + " листов бумаги");
    }
    public static void task3(){
        System.out.println("Задание 4");
        // Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет
        // 16/2=8 (8 бут в 1 минуту)
        byte minut2 = 16;
        int minut1 = minut2 / 2;
        int minut20 = minut1 * 20;
        int sutki = minut1 * 1440;
        int day3 = minut1 * 4320;
        int mes = minut1 * 43200;
        System.out.println("За 20 минут машина произвела "+ minut20 +" штук бутылок");
        System.out.println("За сутки машина произвела "+ sutki +" штук бутылок");
        System.out.println("За 3 дня машина произвела "+ day3 +" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+ mes +" штук бутылок");
    }
    public static void task4(){
        System.out.println("Задание 5");
        byte banok = 120;
        byte bel = 2;
        byte korichniv = 4;
        int klass = banok/(bel+korichniv);
        int belSum = klass * bel;
        int korichSum = klass * korichniv;
        System.out.println("В школе, где " + klass + " классов, нужно " + belSum + " банок белой краски и " + korichSum + " банок коричневой краски ");
    }
    public static void task5(){
        System.out.println("Задание 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        int gram = (banana * 5) + (milk * 2) + (iceCream * 2) + (eggs * 4);
        float kg = gram / 1000f;
        System.out.println("Колличество грамм в завтраке : " + gram);
        System.out.println("Колличество килограмм в завтраке : " + kg);
    }
    public static void task6(){
        System.out.println("Задание 7");
        short weightNeed = 7000;
        short weight1 = 250;
        short weight2 = 500;
        int day1 = weightNeed / weight1;
        int day2 = weightNeed / weight2;
        int dayMid = (day1 + day2) / 2;
        System.out.println("Если спортсмен будет сбрасывать каждый день по 250 гр, то у него уйдет " + day1 + " дней");
        System.out.println("Если спортсмен будет сбрасывать каждый день по 500 гр, то у него уйдет " + day2 + " дней");
        System.out.println("в среднем на похудение уйдет " + dayMid + " дней");
    }
    public static void task7(){
        System.out.println("Задание 8");
        int masha = 67760;
        int den = 83690;
        int kris = 76230;
        int mashaUp = masha + ((masha * 10) / 100);
        int denUp = den + ((den * 10) / 100);
        int krisUp = kris + ((kris * 10) / 100);
        int mashaUpYear = (mashaUp * 12) - (masha * 12);
        int denUpYear = (denUp * 12) - (den * 12);
        int krisUpYear = (krisUp * 12) - (kris * 12);
        System.out.println("Маша теперь получает " + mashaUp + " рублей. Годовой доход вырос на " + mashaUpYear + " рублей");
        System.out.println("Денис теперь получает " + denUp + " рублей. Годовой доход вырос на " + denUpYear + " рублей");
        System.out.println("Кристина теперь получает " + krisUp + " рублей. Годовой доход вырос на " + krisUpYear + " рублей");
    }
}
