import java.util.Locale;
import java.util.Scanner;
/**
 * Программа детектор палиндрома
 * @author Левина Алина
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   //создает объект Scanner для чтения ввода
        String str = in.nextLine();  //читает пользовательский ввод
        if(isPalindrome(str)){  //проверяет на палиндромность пользовательскую строку
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }

    /**
     * Метод, проверяющий, является ли строка палиндромом
     * @param s строка для проверки
     * @return Возвращает {@code True} если строка является палиндромом. {@code False} в противном случае (пустая строка считается палиндромом).
     */
    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replace(" ", "");    //не учитываем регистр и пробелы
        if (s.equals(new StringBuilder(s).reverse().toString())){ //С помощью StringBuilder создается перевернутая копия s и сравнивается с оригиналом
            return true;    //в случае равенства, строка является палиндромом
        } else {
            return false;
        }
    }
}