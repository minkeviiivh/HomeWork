// Минкевич Александр Lesson 3 (minkeviiich)
package com.company.Lesson3;
import com.company.Main;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    //Одномерные массивы
    public void task1() {
        int[] m = new int[21];
        for (int x = 1; x < 21; x++) {
            if (x % 2 == 0) {
                m[x] = x;
                System.out.print(m[x] + " ");
            }
        }
        System.out.println();
        System.out.print("_________________________");
        System.out.println();
        for (int x = 1; x < 21; x++) {
            if (x % 2 == 0) {
                m[x] = x;
                System.out.println(m[x]);
            }
        }
    }
    public void task2() {
        int[] m = new int[100];
        for (int x = 1; x < 100; x++) {
            if (x % 2 != 0) {
                m[x] = x;
                System.out.print(m[x] + " ");
            }
        }
        System.out.println();
        for (int x = m.length - 1; x > 0; x--) {
            if (x % 2 != 0) {
                System.out.print(m[x] + " ");
            }
        }
    }
    public void task3() {
        Random rand = new Random();
        int a = 0;
        int[] m = new int[101];
        for (int x = 0; x < 15; x++) {
            m[x] = rand.nextInt(101);
            if (m[x] % 2 == 0)
                a++;
            System.out.print(m[x] + " ");
        }
        System.out.println();
        System.out.println("Всего в массиве " + a + " четных элементов");
    }
    public void task4() {
        Random rand = new Random();
        int[] m = new int[20];
        for (int x = 0; x <m.length; x++) {
            m[x] = (int) (Math.random()*20);
            System.out.print(m[x]+" ");
        }
        System.out.println();
        for (int x = 0; x < m.length; x++) {
            if (x % 2 == 1) {
                m[x] = 0;
            }
            System.out.print(m[x]+" ");
        }
    }
    public void task5() {
        double sumM1=0,sumM2=0;
        int[] M1 = new int[5];
        for (int x = 0; x <M1.length; x++) {
            M1[x] = (int) (Math.random()*16);
            System.out.print(M1[x]+" ");
            sumM1+=(double)M1[x]/ M1.length;
        }
        System.out.println(" ");
        int[] M2 = new int[5];
        for (int x = 0; x <M2.length; x++) {
            M2[x] = (int) (Math.random()*16);
            System.out.print(M2[x]+" ");
            sumM2+=(double)M2[x]/ M2.length;
        }
        System.out.println(" ");
        if (sumM1==sumM2)
            System.out.println("Средние арифметические значения двух массивов равны");
        else {
            if (sumM1>sumM2)
                System.out.println("Среднее арифметическое значение первого массива больше");
            else
                System.out.println("Среднее арифметическое значение второго массива больше");
        }
    }
    public void task6() {
        Random rand = new Random();
        int[] m = new int[4];
        for (int x = 0; x < m.length; x++) {
            m[x] = (int) (Math.random()*10);
            System.out.print(m[x]+" ");
        }
        System.out.println();
        for(int x=0;x<m.length;x++){
            if(x>0) {
                if (m[x - 1] >= m[x]) {
                    System.out.println("Массив не возрастающий");
                    break;
                }
            }
            if(x==m.length-1)
                System.out.println("Массив строго возрастающий");
        }
    }
    public void task7() {
        int [] m = new int[12];
        int maxNumber = 0;
        int maxIndex = 12;
        for (int x = 0; x < m.length; x++) {
            m[x] = (int)(Math.random()*15);
            if(maxNumber <= m[x])
                System.out.print(m[x]+" ");
            {
                maxNumber = m[x];
                maxIndex = x;
            }
        }
        System.out.println();
        System.out.println("Индекс максимального элемента: " + maxIndex);
    } // не работает
    public void task8() {
        int n=0,a,s1=0,s2=0;
        do {
            System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                n = scanner.nextInt();
                if(n>0&&n%2==0) {
                    int[] m = new int[n];
                    for(int i=0; i<m.length; i++) {
                        m[i] = (int)(Math.random()*15);
                        System.out.print(m[i]+" ");
                    }
                    System.out.println();
                    a = m.length/2;
                    for(int i=0; i<a; i++) {
                        s1 = s1+Math.abs(m[i]);
                    }
                    for(int i=a; i<m.length; i++) {
                        s2 = s2+Math.abs(m[i]);
                    }
                    if(s1<s2) {
                        System.out.print("Сумма второй половины больше");
                    } else if(s1>s2) {
                        System.out.print("Сумма первой половины больше");
                    } else {
                        System.out.print("Сумма равна");
                    }
                }
            }
        }while(n<=0 || n%2!=0);
    }
    public void task9() {
        int n=0,a,s1=0,s2=0,j=0;
        do {
            System.out.print("Введите число: ");
            Scanner vvod = new Scanner(System.in);
            if(vvod.hasNextInt()) {
                n = vvod.nextInt();
                if(n>3) {
                    int[] mas1 = new int[n];
                    for(int i=0; i<mas1.length; i++) {
                        mas1[i] = (int)(Math.random()*(n+1));
                        System.out.print(mas1[i]+" ");
                        if(mas1[i]%2==0) {
                            j++;
                        }
                    }
                    System.out.println("\n");
                    if(j!=0) {
                        int[] mas2 = new int[j];
                        j = 0;
                        for(int i=0; i<mas1.length; i++) {
                            if(mas1[i]%2==0) {
                                mas2[j] = mas1[i];
                                System.out.print(mas2[j]+" ");
                                j++;
                            }
                        }
                    } else {
                        System.out.println("Четных элементов нет");
                    }
                }
            }
        }while(n<=3);
    }
    //Многомерные массивы
    public void task10() {
        int n=0,n2=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество столбцов матрицы: ");
        n = scanner.nextInt();
        System.out.print("Введите количество строк матрицы: ");
        n2= scanner.nextInt();
        int[][] mas = new int[n][n2];
        for(int x=0; x<mas.length; x++){
            for(int y=0; y<mas[x].length; y++) {
                mas[x][y] = (int)(Math.random()*51);
            }
        }
        for(int x=0; x<mas.length; x++) {
            for(int y=0; y<mas[x].length; y++) {
                System.out.print(mas[x][y]+" ");
            }
            System.out.println();
            int sum = 0;
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length - i - 1; j++) {
                    if (mas[i][j] % 2 == 0) sum += mas[i][j];
                }
            }
            System.out.println(sum);
        }
    } //не получается
}
