package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //проверяем четное или не четное число
        //task1(scanner);
        // tasc2(scanner);
        //task3(scanner);
        //task4(scanner);
        //task5(scanner);
        //task6(scanner);
        //task7(scanner);
         //task8(scanner);
        task9(scanner);

        //task10(scanner);
    }

    private static void task9(Scanner scanner) {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int a = x/1000%10;
        int b = x/100%10;
        int c = x%100/10;
        int d = x%10;
        String s = "";
        if(a==1){System.out.print("Одна тысяча ");
        }
        else if(2 <= a && a <= 4){
            switch (a) {
                case 2:
                    s = "Две";
                    break;
                case 3:
                    s = "Три";
                    break;
                case 4:
                    s = "Четыре";
                    break;
            }
                    System.out.print(s+ " тысячи");
        } else if(5 <= a && a <= 9){
            switch (a) {
                case 5:
                    s = "Пять";
                    break;
                case 6:
                    s = "Шесть";
                    break;
                case 7:
                    s = "Семь";
                    break;
                case 8:
                    s = "Восемь";
                    break;
                case 9:
                    s = "Девять";
                    break;
            }
                System.out.print(s+ " тысяч");

        }
        switch (b){
            case 1: s="cто";
            break;
            case 2: s="двести";
                break;
            case 3: s="триста";
                break;
            case 4: s="четыреста";
                break;
            case 5: s="пятьсот";
                break;
            case 6: s="шестьсот";
                break;
            case 7: s="семьсот";
                break;
            case 8: s="восемьсот";
                break;
            case 9: s="девятьсот";
                break;
        }
        System.out.print(" "+s+" ");
        if(c==1){
            switch (d){
                case 1: s="одиннадцать";
                break;
                case 2: s="двенадцать";
                    break;
                case 3: s="тринадцать";
                    break;
                case 4: s="четырнадцать";
                    break;
                case 5: s="пятнадцать";
                    break;
                case 6: s="шестнадцать";
                    break;
                case 7: s="семнадцать";
                    break;
                case 8: s="восемнадцать";
                    break;
                case 9: s="девятнадцать";
                    break;
                case 0: s="десять";
                break;
            }
            System.out.print(s+" "+"долларов");
        } else {
            switch (c) {
                case 2:
                    s = "двадцать";
                    break;
                case 3:
                    s = "тридцать";
                    break;
                case 4:
                    s = "сорок";
                    break;
                case 5:
                    s = "пятьдесят";
                    break;
                case 6:
                    s = "шестьдесят";
                    break;
                case 7:
                    s = "семьдесят";
                    break;
                case 8:
                    s = "восемьдесят";
                    break;
                case 9:
                    s = "девяносто";
                    break;

            }
            System.out.print(s+" ");
            switch (d){
                case 1: s="один";
                break;
                case 2: s="два";
                    break;
                case 3: s="три";
                    break;
                case 4: s="четыре";
                    break;
                case 5: s="пять";
                    break;
                case 6: s="шесть";
                    break;
                case 7: s="семь";
                    break;
                case 8: s="восемь";
                    break;
                case 9: s="девять";
                    break;
            }
            System.out.print(s+" ");
            if(d == 1){
                s = "доллар";
            }else if(2<=d && d<=4){
                s= "доллара";
            }else {
                s="долларов";
            }
            System.out.println(s);
        }
    }

    private static void task10(Scanner scanner) {
        System.out.println("Введите первое число ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число ");
        int y = scanner.nextInt();
        String s;
       s= x > y? "y= " + (x * y * 2) + ",x= " + (x + y) / 2:"y= " + (x + y) / 2 + ",x= " + (x * y * 2);
        System.out.println(s);
    }



    private static void task8(Scanner scanner) {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int a,b,c;
        c = x%10;
        b=x/10%10;
        a=x/100%10;
        if(a>b){
            if(c>b){
                    System.out.println("Первая последняя");
                }else {
                    System.out.println( "Первая вторая");
                }
        }else if (c>a){
            System.out.println( "Вторая и последняя");

        }
    }

    private static void task7(Scanner scanner) {
        System.out.println("Введите количество минут разговора: ");
        float x = scanner.nextFloat();
        int z =2;// стоимость разговора
        System.out.println("Введите номер дня недели: ");
        int y = scanner.nextInt();
        switch (y){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("Стоимость Вашего разговора составила: "+ x*z);
            break;
            case 6:
            case 7:System.out.println("Вам предоставлена скидка 20%,\nстоимость разговора составила: "+ (x*z-x*z/100*20));
            break;
            default:System.out.println("Вы ввели не существующий номер дня недели");
            break;
        }
    }

    private static void task6(Scanner scanner) {
        System.out.println("Введите стоимость покупки ");
        int x = scanner.nextInt();
        int y = x>= 500?x>=1000?5:3:0;

        System.out.println("Вам предоставляется скидка "+ y+"% .\n Сумма к оплате: "+ ((float) x  -(float) (x/100*y)));
    }

    private static void task5(Scanner scanner) {
        System.out.println("Введите год ");
        int x = scanner.nextInt();
        if (x%4 == 0 && x%400==0){
            System.out.println("Этот год высокосный");
        } else {
            System.out.println("Этот год не высокосный");
        }
    }

    private static void task4(Scanner scanner) {
        System.out.println("Введите дату Основания г.Одесса ");
        int x = scanner.nextInt();
        if (x == 1794){
            System.out.println("\033[31;1m Да, Вы правы!");
        }else {
            System.out.println("\033[1m"+x+"?"+"\033[0m");
            System.out.println(" Вы ошиблись Одесса была основана в 1794 году");
        }
    }

    private static void task3(Scanner scanner) {
        int x,y;
        float z;
        System.out.println("Введите первое число ");
        x = scanner.nextInt();
        System.out.println("Введите второе число ");
        y = scanner.nextInt();
        if ( y!=0){
            z=(float)x/y;
            System.out.println("Результат деления равен: " + z);
        }else {
            System.out.println("Делить на ноль нельзя");
        }
    }

    private static void task1(Scanner scanner) {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if(x%2 == 0){
            System.out.println("Введеное чило четное");
        }else {
            System.out.println("Введеное чило не четное ");
        }
    }

    private static void tasc2(Scanner scanner) {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int a, b, c;
        byte y = 0;
        a = x % 3;
        b = x % 5;
        c = x % 7;
        if (a == 0) {
            y = (byte) (y|1);
           }
        if (b == 0) {
            y= (byte)(y|2) ;
      }
        if (c == 0) {
            y= (byte)(y|4) ;
            }
    switch (y) {
        case 1: System.out.println("Число делится на 3");break;
        case 2: System.out.println("Число делится на 5");break;
        case 3: System.out.println("Число делится на 3 и 5");break;
        case 4:  System.out.println("Число делится на 7");break;
        case 5:  System.out.println("Число делится на 3 и 7");break;
        case 6:  System.out.println("Число делится на 5 и 7");break;
        case 7:  System.out.println("Число делится на 3 на 5 на 7");break;
        default: System.out.println("Число не делится на 3 на 5 и на 7");
    }}}
