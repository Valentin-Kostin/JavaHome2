// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

import java.util.Scanner;

public class Task_1 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ВВедите строку: ");
        String s = sc.nextLine();        
        int n = s.length();
        int[] arr_index = new int[n];        
        for (int i = 0; i < n; i++) {            
            System.out.printf("Введите %de индекс (от 1 до %d): ", i+1, n);
            int ni = Integer.parseInt(sc.nextLine());
            arr_index[i] = ni;        
        }
        String result = shuffle(s, arr_index, n);
        System.out.println(result);
        sc.close();
    }

    public static String shuffle(final String s, final int[] index, int n){
        char [] arr_str = new char[n];        
        for (int i = 0; i < n; i++) {            
            arr_str[index[i]-1] = s.charAt(i); 
        }
        String result = new String(arr_str);
    return result;
    }
}
