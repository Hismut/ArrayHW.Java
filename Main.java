import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1) Найти максимальный по значению элемент массива.
        int[] numbers = {2, 4, 444, 6, 8, 23, 54};
        int max = numbers[0];
        for (int i = 0, numbersLength = numbers.length; i < numbersLength; i++) {
            int number = numbers[i];
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
        System.out.println(" ");
        //------------------------------------------------------------------------------------------------
        // 2) Создайте массив из всех нечётных чисел от 1 до 99, выведите его элементы на экран в обратном порядке.

        int[] mas = new int[50];
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");

        }
        System.out.println(" \n");

        //--------------------------------------------------------------------------------------------------
        // 3) Создайте класс Book с полями author, title и yearOfPublishing.
        //   Создайте массив типа Book и заполните его книгами.
        //   Найдите в массиве все книги, названия которых начинаются на «А» изданные после 2020 года.

        Book[] books = new Book[3];
        books[0] = new Book("Акунин","Азазель",2021);
        books[1] = new Book("Пушкин","Евгений Онегин",1985);
        books[2] = new Book("Jordan Peterson","12 rules for life",2021);
        int count =0;

        for (Book book : books) {
            if (book.yearOfPublishing>=2020 && book.author.startsWith("А")){
                count++;
                System.out.println(count + " "+ book);
            }
        }
            }
        }
        

