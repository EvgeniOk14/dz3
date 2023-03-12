import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


public class tusk3way1 
{

    public static void cycle(int n)
     {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) 
        {

            int number = random.nextInt(100);
            list.add(number);
            int item = number;
            sum += item;
        }
        System.out.println("Массив случайных чисел: " + list);
        System.out.println("Сумма всех элементов массива равна: " + sum);

        double mean = sum / n;
        System.out.println("Среднее арифметическое равно: " + mean);

        list.sort(Comparator.naturalOrder());
        System.out.println("Отсортированный массив случайных чисел: " + list);

        int min = list.get(0);
        System.out.println("Минимальный элемент равен: " + min);

        int max = list.get(list.size() - 1);
        System.out.println("Максимальный элемент равен: " + max); 
     }

    public static int scunNumber()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива n :");
        int n = sc.nextInt();
        return n;
    }

    public static void main(String[] args)
    {
        cycle(scunNumber());
    }
}
