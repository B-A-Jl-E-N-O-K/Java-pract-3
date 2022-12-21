package pract3;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;





public class Tester {

    public static void print_ar(double[] ar, DecimalFormat form)
    {
        for(int i = 0; i < ar.length;i++)
        {
            System.out.print(form.format(ar[i]));
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public static void print_int_ar(int[] ar)
    {
        for(int i = 0; i < ar.length;i++)
        {
            System.out.print(ar[i]);
            System.out.print(' ');
        }
        System.out.print('\n');
    }



    public static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void sort_ar(double[] ar)
    {
        boolean needIteration = true;

        while (needIteration)
        {
            needIteration = false;

            for (int i = 1; i < ar.length; i++) {
                if (ar[i] < ar[i - 1]) {
                    swap(ar, i, i-1);
                    needIteration = true;
                }
            }
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        Random rand_class = new Random();


        //Первое задание
        System.out.println("Первое задание!");
        double[] ar1, ar2; // объявление массива
        ar1 = new double[10];
        ar2 = new double[10];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = Math.random();
        }

        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = rand_class.nextDouble();
        }

        DecimalFormat form = new DecimalFormat("#.###");


        System.out.println("Массив, сгенерированный с помощью метода Math.random(): ");
        print_ar(ar1, form);

        System.out.println("Массив, сгенерированный с помощью класса Random: ");
        print_ar(ar2, form);

        //Сортировка

        sort_ar(ar1);
        sort_ar(ar2);

        System.out.println("Сортированный массив Math.random(): ");
        print_ar(ar1, form);

        System.out.println("Сортированный массив класса Random: ");
        print_ar(ar2, form);


        //Второе задание
        System.out.print("\n\n");
        System.out.println("Второе задание!");


        int[] second_task_arr = new int[4];
        for (int i = 0; i < second_task_arr.length; i++) {
            second_task_arr[i] = rand_class.nextInt(10, 99 + 1);
        }

        print_int_ar(second_task_arr);

        int prev = second_task_arr[0];
        boolean is_rise = true;

        for (int i = 1; i < second_task_arr.length; i++) {
            if (prev >= second_task_arr[i]) {
                is_rise = false;

            }
            prev = second_task_arr[i];
        }

        if (is_rise) {
            System.out.println("Массив строго возрастающий!");
        } else {
            System.out.println("Массив НЕ строго возрастающий!");
        }


        //Третье задание
        System.out.print("\n\n");
        System.out.println("Третье задание!");


        int n = 0;

        String s = ""; //введенное юзером значение

        boolean is_complete = false;
        while (!is_complete)
        {

            System.out.println("Введите число");
            s = sc.nextLine();

            try
            {
                n = Integer.parseInt(s.trim());
                if(n > 0)
                    is_complete = true;
                else
                    System.out.println("Введено целое число <= 0, попробуйте еще раз");


            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Введено не целое число, попробуйте еще раз");
            }
        }



        int[] third_task_arr = new int[n];

        for(int i = 0;i<third_task_arr.length;i++)
        {
            third_task_arr[i] = rand_class.nextInt(0, n + 1);
        }

        System.out.println("Ваш массив:");
        print_int_ar(third_task_arr);

        int[] third_task_arr_2 = new int[n];
        int second_ar_length = 0;
        for(int i = 0;i<third_task_arr.length;i++)
        {
            if(third_task_arr[i] % 2 == 0)
            {
                third_task_arr_2[second_ar_length] = third_task_arr[i];
                second_ar_length += 1;
            }

        }

        if(second_ar_length != 0)
        {
            System.out.println("Массив из четных чисел прошлого массива:");
            for(int i = 0;i<second_ar_length;i++)
            {
                System.out.print(third_task_arr_2[i]);
                System.out.print(' ');
            }

        }
        else
            System.out.println("В исходном массиве не было ни одного четного числа(");



        System.out.print("\n\n");
        System.out.println("Задания на классы Оболочки!");  //Задания на классы Оболочки!


        Double num1 = Double.valueOf(3.4);

        System.out.print("Преобразование в double: ");
        System.out.print(num1);
        System.out.print('\n');


        double x = 5.6;
        Double num2 = Double.valueOf(x);
        System.out.print("Преобразование в double через переменную: ");
        System.out.print(num2);
        System.out.print('\n');

        String str = "8.9";

        Double num3 = Double.valueOf(str);
        System.out.print("Преобразование в double через строку: ");
        System.out.print(num2);
        System.out.print('\n');

        String str1 = "100.101";

        Double num4 = Double.parseDouble(str1);
        System.out.print("Преобразование в double через строку методом parseDouble: ");
        System.out.print(num2);
        System.out.print('\n');

        System.out.print("Преобразование из double в byte: ");
        System.out.print(num4.byteValue());
        System.out.print('\n');

        System.out.print("Преобразование из double в short: ");
        System.out.print(num4.shortValue());
        System.out.print('\n');

        System.out.print("Преобразование из double в int: ");
        System.out.print(num4.intValue());
        System.out.print('\n');

        System.out.print("Преобразование из double в long: ");
        System.out.print(num4.longValue());
        System.out.print('\n');

        System.out.print("Преобразование из double в float: ");
        System.out.print(num4.floatValue());
        System.out.print('\n');

        System.out.print("Преобразование из double в double: ");
        System.out.print(num4.doubleValue());
        System.out.print('\n');

        System.out.println("Преобразование из double в bool невозможно");


        System.out.print("Преобразование из double в char: ");
        System.out.print((char)num4.doubleValue());
        System.out.print('\n');


        System.out.print("Вывод оболочки Double на экран: ");
        System.out.print(num4);
        System.out.print('\n');

        String d = Double.toString(3.14);
        System.out.print("Преобразование литерала double в строку: ");
        System.out.print(d);
        System.out.print('\n');



        System.out.print("\n\n");
        System.out.println("Задания на форматирование!");   //Задания на форматирование

        System.out.println("Задание 2");

        Tovar[] shop_catalog = new Tovar[3];
        Tovar sword = new Tovar(1600, "Меч массового произоводства", 1);
        Tovar bow = new Tovar(1000, "Лук массового произоводства", 2);
        Tovar helmet = new Tovar(2000, "Шлем массового произоводства", 3);
        shop_catalog[0] = sword;
        shop_catalog[1] = bow;
        shop_catalog[2] = helmet;


        System.out.println("Добро пожаловать в наш магазин");


        NumberFormat numberFormatRus = NumberFormat.getCurrencyInstance();
        NumberFormat numberFormatUSA = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatUK = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat numberFormatUChina = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat[] formates = new NumberFormat[4];
        formates[0] = numberFormatRus;
        formates[1] = numberFormatUSA;
        formates[2] = numberFormatUK;
        formates[3] = numberFormatUChina;

        int is_work = 1;

        while(is_work == 1)
        {
            System.out.println("Чтобы посмотреть информацию о товаре, введите его номер");

            sword.printName();

            bow.printName();

            helmet.printName();

            int inp = sc.nextInt();

            System.out.println("В какой валюте вы хотите увидеть цену?");
            System.out.println("1. Российские рубли");
            System.out.println("2. Доллары США");
            System.out.println("3. Английские фунты");
            System.out.println("4. Китайские Юани");
            int inp_valute = sc.nextInt();
            String[] valutes = new String[4];
            valutes[0] = "Российские рубли";
            valutes[1] = "Доллары США";
            valutes[2] = "Английские фунты";
            valutes[3] = "Китайские Юани";
            double curr_tovar_price = shop_catalog[inp - 1].makePriceLocal(inp_valute);

            System.out.println("Цена выбранного товара в валюте " + valutes[inp_valute - 1] + ": "+ formates[inp_valute - 1].format(curr_tovar_price));

            System.out.println("Желаете посмотреть другой товар? (0 или 1)");
            is_work = sc.nextInt();
        }

    }
}
