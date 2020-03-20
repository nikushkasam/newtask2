import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);
         *//* String max;
        String min;*//*
        System.out.print("Введите любые числа разной длины через пробел: ");
        String numbersStr = in.nextLine();
        String[] numbersSplit = numbersStr.split(" ");*/


        // Задание 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        /*max = min = numbersSplit[0];
        for (int i = 0; i < numbersSplit.length; i++) {
            if (max.length() <= numbersSplit[i].length()) max = numbersSplit[i];
            if (min.length() >= numbersSplit[i].length()) min = numbersSplit[i];
        }
        System.out.println("Самое длинное число: " + max);
        System.out.println("Самое короткое число: " + min);*/


        // Задание 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

        /*int[] array = new int[numbersSplit.length];
        for (int i =0; i < numbersSplit.length; i++){
            array[i] = Integer.parseInt(numbersSplit[i]);
        }

        int[] sortedUp = new int[array.length];
        int[] sortedDwn = new int[array.length];
        for (int i=0; i<array.length; i++){
            sortedUp[i]=array[i];
            sortedDwn[i]=array[i];
        }

        int temp;
        for (int i = 0; i<array.length; i++){
            int min = i;
            int max = i;
            for (int j = i+1; j<array.length; j++){
                if (sortedUp[min]>sortedUp[j]){
                    temp = sortedUp[min];
                    sortedUp[min] = sortedUp[j];
                    sortedUp[j] = temp;
                }
                if (sortedDwn[max]<sortedDwn[j]){
                    temp = sortedDwn[max];
                    sortedDwn[max] = sortedDwn[j];
                    sortedDwn[j] = temp;
                }
            }
        }

        System.out.print("Числа в порядке возрастания: ");
        for (int i = 0; i < sortedUp.length; i++) {
            System.out.print(sortedUp[i] + " ");
        }
        System.out.println();
        System.out.print("Числа в порядке убывания: ");
        for (int i = 0; i < sortedDwn.length; i++) {
            System.out.print(sortedDwn[i] + " ");
        }*/


        // Задание 3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

        /*int tempLength = 0;
        for (int i = 0; i < numbersSplit.length; i++) {
            tempLength += numbersSplit[i].length();
        }
        int overageLength = tempLength/numbersSplit.length;
        System.out.println("\nВыводим те числа, длина которых меньше средней длины = " + overageLength);
        if (overageLength == 0) System.out.println("Нет ни одного числа, удовлетворяющих условию!");
        for (int i = 0; i < numbersSplit.length; i++) {
            if (overageLength >= numbersSplit[i].length()) System.out.println("Число: " + numbersSplit[i] + ", его длина: " + numbersSplit[i].length()+ "; ");
        }
        System.out.println("\nВыводим те числа, длина которых больше средней длины = " + overageLength);
        if (overageLength == 0) System.out.println("Нет ни одного числа, удовлетворяющих условию!");
        for (int i = 0; i < numbersSplit.length; i++) {
            if (overageLength < numbersSplit[i].length()) System.out.println("Число: " + numbersSplit[i] + ", его длина: " + numbersSplit[i].length()+ "; ");
        }*/


        // Задание 4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.

        //задаем массив, значения которого - количество раличных цифр в числе. Обнуляем его.
        /*int array[] = new int[numbersSplit.length];
        for (int i = 0; i < numbersSplit.length; i++) {
            array[i] = 0;
        }
        int k = 0;
        //перебираем числа в массиве numbersSplit:разбиваем их на цифры, сортируем в порядке возрастания
        for (String num : numbersSplit) {
            byte[] a = num.getBytes();
            Arrays.sort(a);
            int tmp = 1, step = 1;
            for (int i = 0; i < a.length; i += step) {
                step = 1;
                for (int j = i; j < (a.length - 1); j++) {
                    if (a[j] != a[j + 1]) {
                        tmp++;
                    }
                    step++;
                }
            }
            //здесь заполняем массив с количеством различных чисел для каждого числа
            array[k++] = tmp;
        }
        //перебираем числа на количество различных цифр
        int min = 0;
        for (k = 1; k < numbersSplit.length; k++) {
            if (array[k] < array[min]) {
                min = k;
            }
        }
        System.out.println("Число, в котором число различных цифр минимально: " + numbersSplit[min]);
    }*/


        //Задание 5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.

        /*int odd, even, n = 0, k = 0;
        for (String num : numbersSplit) {
            byte[] a = num.getBytes();
            odd = 0;
            even = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0)
                    even = even + 1;
                else odd = odd + 1;
            }
            if (even > 0)
                k = k + 1;
            if (even == odd)
                n = n + 1;
        }
        System.out.println("Количество чисел, содержащих четные  цифры: " + k);
        System.out.print("Количество чисел, содержащих равное количество четных и нечетных чисел: " + n + '\n');
    }*/


        // Задание 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

        /*for (String num : numbersSplit) {
            byte[] a = num.getBytes();
            byte[] b = num.getBytes();
            Arrays.sort(b);
            if (Arrays.equals(a, b)) {
                System.out.println("Число, цифры в котором идут в строгом порядке возрастания: " + num);
            }
        }*/


        // Задание 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

        /*int array[] = new int[numbersSplit.length];
        for (int i = 0; i < numbersSplit.length; i++) {
            array[i] = 0;
        }
        int k = 0;
        for (String num : numbersSplit) {
            byte[] a = num.getBytes();
            Arrays.sort(a);
            int tmp = 1, step = 1;
            for (int i = 0; i < a.length; i += step) {
                step = 1;
                for (int j = i; j < (a.length - 1); j++) {
                    if (a[j] == a[j + 1]) {
                        tmp++;
                        break;
                    }
                    step++;
                }
            }
            array[k++] = tmp;
        }
        int min = 0;
        for (k = 1; k < numbersSplit.length; k++) {
            if (array[k] < array[min]) {
                min = k;
            }
        }
        System.out.println("Число, состоящее только из различных цифр: " + numbersSplit[min]);*/


        //Задание 8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

        /*int n, k = 1;
        System.out.println("Введите количество строк и столбцов в матрице:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = k;
                k++;
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }*/

        // Задание 9. Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.

        /*int n;
        System.out.println("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }*/


        // Задание 9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.

       /* int n;

        System.out.println("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println("Матрица с упорядоченными по возрастанию столбцами: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i + 1; k < n; k++) {
                    if (array[i][j] > array[k][j]) {
                        int tmp = array[i][j];
                        array[i][j] = array[k][j];
                        array[k][j] = tmp;
                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Матрица с упорядоченными по возрастанию строками: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i][j] > array[i][k]) {
                        int tmp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = tmp;
                    }
                }

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/


        // Задание 9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо
       /* int n, k;

        System.out.println("Введите количество строк и столбцов в матрице ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        //сдвиг на к вниз
        System.out.println("Введите величину сдвига вниз:");
        k = scan.nextInt();
        System.out.println("Матрица сo сдвигом вниз на: " + k + '\n');
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[n - k + i][j] + " ");
            System.out.println();
        }
        for (int i = k; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i - k][j] + " ");
            System.out.println();
        }
        //матрица со сдвигом вверх
        System.out.println("Введите величину сдвига вверх: ");
        k = scan.nextInt();
        System.out.println("Матрица сo сдвигом вверх на: " + k + '\n');

        for (int i = 0; i < n - k; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i + k][j] + " ");
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        //матрица со сдвигом влево
        System.out.println("Введите величину сдвига влево: ");
        k = scan.nextInt();
        System.out.println("Матрица сo сдвигом влево на: " + k + '\n');

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - k; j++)
                System.out.print(array[i][j + k] + " ");
            for (int r = 0; r < k; r++)
                System.out.print(array[i][r] + " ");
            System.out.println();
        }
        //матрица со сдвигом вправо
        System.out.println("Введите величину сдвига вправо: ");
        k = scan.nextInt();
        System.out.println("Матрица сo сдвигом вправо на: " + k);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++)
                System.out.print(array[i][n - k + j] + " ");
            for (int j = k; j < n; j++)
                System.out.print(array[i][j - k] + " ");
            System.out.println();
        }*/


        // Задание 9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

        /*int n, l = 0;

        System.out.println("Введите количество строк и столбцов в матрице: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];
        int array1[] = new int[n * n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
                array1[l] = array[i][j];//преобразуем матрицу из двумерного в одномерный массив
                l++;
            }
        //вывод матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        //вывод массива
        System.out.println("Одномерный массив: ");
        for (l = 0; l < n * n; l++) {
            System.out.print(array1[l] + " ");
        }
        System.out.println();

        System.out.println("Элементы матрицы идущие подряд по возрастанию: ");
        for (l = 0; l < n * n - 1; l++)
            if ((array1[l] < array1[l + 1]) && (array1[l + 1] - array1[l] == 1)) {
                System.out.println(array1[l] + " " + array1[l + 1]);
            }
        System.out.println();
        System.out.println("Элементы матрицы идущие подряд по убыванию: ");
        for (l = 0; l < n * n - 1; l++)
            if ((array1[l] > array1[l + 1]) && (array1[l] - array1[l + 1] == 1)) {
                System.out.println(array1[l] + " " + array1[l + 1]);
            }*/

        //Задание 9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки

        /*int n, p, neg, sum;
        System.out.println("Введите количество строк и столбцов в матрице: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            p = 0;
            sum = 0;
            neg = 0;
            System.out.println("Сумма элементов матрицы, расположенных между первым и вторым положительными элементами  " + (i + 1) + "-ой строки: ");

            first:
            {
                for (int j = 0; j < n - 1; j++)
                    second:
                            {
                                if (array[i][j] > 0) {
                                    p++;
                                    if (array[i][j + 1] <= 0) {
                                        for (int k = j + 1; k < n; k++) {
                                            if (array[i][k] <= 0) {
                                                sum = sum + array[i][k];
                                                neg++;
                                            }
                                            if (array[i][k] > 0) {
                                                System.out.print(sum + " ");
                                                break first;
                                            } else if ((neg == n - 1) && (p == 1)) {
                                                System.out.println("В этой строке только один положительный элемент");
                                                break first;
                                            }
                                        }
                                    } else {
                                        if ((neg == n - 1) && (p == 1)) {
                                            System.out.println("В этой строке только один положительный элемент");
                                            break first;
                                        }
                                        System.out.println(sum + " ");
                                        break first;
                                    }


                                } else {
                                    neg++;
                                    if ((neg == n - 1) && (p == 1)) {
                                        System.out.println("В этой строке только один положительный элемент");
                                        break first;
                                    }
                                    if (neg == n) {
                                        System.out.println("В этой строке нет положительных элементов");
                                        break first;
                                    } else break second;
                                }
                            }
            }
            System.out.println();
        }*/

        // Задание 9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки

        /*Random r = new Random();
        int n = 6;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(20);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        turn(a, 2);
    }

    public static void turn (int[][] a, int rotation){
        int tmp;
        for (int k = 0; k < rotation ; k++) {
            for(int i=0;i<a.length/2;i++) {
                for(int j=i;j<a.length-1-i;j++) {
                    tmp = a[i][j];
                    a[i][j]=a[j][a.length-1-i];
                    a[j][a.length-1-i] = a[a.length-1-i][a.length-1-j];
                    a[a.length-1-i][a.length-1-j] = a[a.length-1-j][i];
                    a[a.length-1-j][i] = tmp;
                }
            }
        }
        if (rotation == 1) System.out.println("Output 90");
        if (rotation == 2) System.out.println("Output 180");
        if (rotation == 3) System.out.println("Output 270");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }*/

        // 9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.

       /* int n;
        double sum1;

        System.out.println("Введите количество строк и столбцов в матрице: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];
        double sum2[] = new double[n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2 * (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            for (int j = 0; j < n; j++) {
                sum1 = sum1 + array[i][j];
            }
            System.out.println();
            System.out.println("Среднее арифметическое " + (i + 1) + "-ой строки: " + sum1 / n);
            sum2[i] = sum1;
        }
        System.out.println();

        System.out.println("Новая матрица с вычетом среднего арифметического строки матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((array[i][j] - sum2[i] / n) + " ");
            System.out.println();
        }*/

        // Задание 9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.

        /*int n;

        System.out.println("Введите количество строк и столбцов в матрице: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];
        int m = n;
        int l = n;
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < l; i++)
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 2 * (n + 1) - (n + 1));
            }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        //Удаляем лишние строки
        for (int i = 0; i < l; i++) {
            int tmp = 0;
            for (int j = 0; j < m; j++)
                if (array[i][j] == 0)
                    tmp = 1;
            if (tmp == 1) {
                for (int z = i; z < (l - 1); z++)
                    for (int j = 0; j < m; j++)
                        array[z][j] = array[z + 1][j];
                --i;
                --l;
            }
        }
        for (int j = 0; j < m; j++) {
            int tmp = 0;
            for (int i = 0; i < l; i++)
                if (array[i][j] == 0)
                    tmp = 1;
            if (tmp == 1) {
                for (int z = j; z < (m - 1); z++)
                    for (int i = 0; i < l; i++)
                        array[i][z] = array[i][z + 1];
                --j;
                --m;
            }
        }
        System.out.println("Уплотненная матрица: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }*/


        // Задание 9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.

        /*int n;

        System.out.println("Введите количество строк и столбцов в матрице N*N: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[][] = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2 * (n + 1));
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println("Преобразованная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i][j] == 0) {
                        int tmp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = tmp;
                    }
                }

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/

    }
}



