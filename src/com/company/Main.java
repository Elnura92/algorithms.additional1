package com.company;

import java.util.Scanner;

public class Main {
     static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Какую задачу вы бы хотели посмотреть:");
        int answer = scan.nextInt();
        switch (answer) {
            case 1:
                additionalFirst();
                break;
            case 2:
                additionalSecond();
            case 3:
                additionalThird();
        }






















    }

    public static void mainHomeWork(){

    }

    public static void additionalFirst(){

        System.out.println("Введите размер годовой зарплаты:");

        double salary = scan.nextDouble();

        double bonus = 0.05*(0.5*salary) + 0.08*(0.3*salary) + 0.1*(0.2*salary);

        System.out.println("Размер годового бонуса составил " + bonus);



    }



    public static void additionalSecond(){

        System.out.println("Введите ваше слово");
        String word = scan.nextLine();
        char[] letters = word.toCharArray();

        int len = letters.length;
        if (len % 2 != 0){
            int index = len / 2;
            System.out.println(letters[index-1] + "" + letters[index] + "" + letters[index+1]);
        }else if (len % 2 == 0){
            System.out.println(letters[len-2] + "" + letters[len-1]);
        }

    }

     public static void additionalThird(){

        int num = 1;
        int nextNum = 0;
        int sum = 0;

        System.out.println("Мы будем подсчитывать сумму в цепочке 1+11+111+1111...+n");
        System.out.println("Введите желаемое количество элементов в цепочке:");
        int times = scan.nextInt();

        while (times > 0){
            nextNum += num;
            System.out.println(nextNum);
            sum += nextNum;
            num *= 10;

            times --;
        }
        System.out.println("Сумма всех элементов цепочки равна " + sum);



    }
}
