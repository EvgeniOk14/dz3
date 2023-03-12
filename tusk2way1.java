import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class tusk2way1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите положительное число, размер массива: ");
        int n = sc.nextInt();
        System.out.println("Ввведите положительное число - начальный диапазон случайных чисел в массиве: ");
        int rangeStart = sc.nextInt();
        System.out.println("Ввведите положительное число - конечный диапазон случайных чисел в массиве: ");
        int rangeEnd = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            {
                list.add((int) (Math.random()*(rangeEnd-rangeStart+1)+rangeStart));
                
            }
        System.out.println("массив случайных чисел: " + list);

        list.sort(Comparator.naturalOrder());
        System.out.println("Отсортированный массив: " + list);

        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) %2 == 0)
            {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("массив случайных чисел без чётных чисел: " + list);

    }
}