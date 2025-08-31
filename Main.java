import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1) Сумма от 1 до N
        Scanner sc = new Scanner(System.in);
/*        int a = 1;
        int sum = 0;
        int N = sc.nextInt();

       while ( a <= N ) {
           sum += a ;
            a++;
        }
       System.out.println(sum);

 // 2) Количество цифр числа
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;

          }  System.out.println("Количество цифр: " + count);

//3) Сумма цифр числа
        int n = sc.nextInt();
        int sum = 0;
        while ( n > 0 ) {
            sum = (n % 10) + sum;
            n = n / 10;
        }
        System.out.println(sum);


// 4) Есть ли в числе цифра 7?
        int n = sc.nextInt();
       boolean isSeven = false;
       while (n>0) {
           if (n % 10 == 7) {
               isSeven = true;
               break;
           } n = n/10;
       }
        System.out.println( isSeven ? "YES" : "NO");


//5) Таблица умножения для числа m (1..10)
        int m = sc.nextInt();
        int i = 1;
        while (i<=10) {
            System.out.println( m + "*" + i + "=" + (m*i));
            i++;
        }


//6) Сумма до нуля (do…while)
        int chislo;
        int sum = 0;
        do {
            chislo = sc.nextInt();
            sum = chislo + sum;
        }while (chislo!=0);
        System.out.println("Сумма = " +sum);

//7) Наименьший делитель > 1
        int n = sc.nextInt();
        int minDelitel =2;
        while (minDelitel<=n ) {
            if (n%minDelitel ==0) {
                System.out.println(minDelitel);
                break;
            }
            minDelitel++;
        }


//8) Сколько чётных и нечётных цифр?
        int x = sc.nextInt();
        int countChet=0;
        int countNechet=0;
        while (x>0) {
            if ((x%10)%2==0) {
                countChet++;
            } else {
                countNechet++ ;
            }x= x/10;
            } System.out.println("Четных = " +countChet);
             System.out.println("Нечетных = " + countNechet);

//9) Разворот числа
        int x = sc.nextInt();
        int razvorot = 0;
        while (x>0) {
            razvorot = (razvorot * 10) + x %10 ;
            x= x /10;

        }
        System.out.println(razvorot);

        //10) Простое число или нет
        int n = sc.nextInt();
        boolean flag = false;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                flag = true;
                break;
            }
            i++ ;
        } System.out.println( flag ? ("Число непростое, оно делится на "+i) : " Число простое");

 //11) Степени двойки ≤ N
        int N = sc.nextInt();
        int x = 2;
        int k =0;
        while (Math.pow(x,k) <= N) {
            System.out.println(Math.pow(x,k));
            k++;
        }

//12) Вывести 1..N, пропуская кратные 7
        int N = sc.nextInt();
        int i =1;

       while ( i < N ) {
           if (i % 7 > 0) {
               System.out.print(i+ " ");
           }
           i++;
       }


 //13) Часы и минуты
        int z = sc.nextInt();
        int h = z/60;
        int m= z%60;

        System.out.print (h + " " + m);

//14) Проверка “степень двойки”
       double c = sc.nextInt();
       double base = 2;
       double  a = Math.log(c) / Math.log(base);
        System.out.println( ( a%1==0 ) ? "YES, степень равна = "+a : "NO");

//15) НОК двух чисел через НОД
        int a= sc.nextInt();
        int b= sc.nextInt();
//        НОК — это наименьшее общее кратное двух и более чисел.
//        НОД — это наибольший общий делитель.


 //16) Гармонический ряд до N
        int N= sc.nextInt();
        double i=1;
        double harmonic=0;
        while (i<=N) {
            harmonic= harmonic+ (1/i);
            i++;
        }System.out.println(harmonic);

//17) Деление с остатком “вычитанием”
        int A= sc.nextInt();
        int B= sc.nextInt();
        int q =0 ;
        int r = 0;
        while (A > 0) {
        A = A-B;
        q++;
        if (B>A) {
            r = A;
            break;
        }
        } System.out.println("q = " + q + ", " + "r = " + r);


//18) Сумма нечётных 1..N
        int N = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= N) {
            if (i % 2 != 0) {
                sum = sum + i;
            }i++;
        }
        System.out.println(sum);

 //19) Среднее до отрицательного (do…while)
        double a;
        double sum= 0;
        int i = 0;
        double c;
        do {
            a = sc.nextDouble();
            if(a>0) {
            sum+=a;
            i++;
            }
        } while (a > 0);
        c = sum/i;

        System.out.println("Среднее значение = " + c );

 */
//20) Количество нулей в числе
        int n= sc.nextInt();
       int i=0;
       while (n>0) {
           if (n % 10 == 0) {
               i++;
           }
           n /= 10;
       }
        System.out.println(i);


    }
}