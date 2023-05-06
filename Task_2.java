/*На первой строке записывается натуральное число n - количество строчек в книге. 
Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, 
на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", 
где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, 
на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. 
название продуктов написаны строчными буквами. Гарантируется, что продукты, 
на которые нужно выполнить замену, не встречаются изначально в тексте.
Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. 
На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, 
то и замена тоже должна начинаться с большой буквы! 
Sample Input:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
*/

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /*String [] recept = {"Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.", 
                            "Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.",
                            "Вода 100мл, Пиво 500мл. Смешать, выпить и забыться до утра)"};
        String [] produkts = {"арахис - колбаса", "клубника - вишня", "сгущенка - молоко", "вода - водка"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько строк в рецепте меняем: ");
        int n_recept = Integer.parseInt(sc.nextLine());
        int[] index_recept = new int[n_recept];

        for (int i = 0; i < n_recept; i++) {            
            System.out.printf("Какую %de строку (от 0 до %d): ", i, recept.length-1);
            index_recept[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < index_recept.length; i++) {
            System.out.println(recept[index_recept[i]]);
        }

        System.out.print("Сколько продуктов меняем: ");
        int n_produkts = Integer.parseInt(sc.nextLine());
        int[] index_produkts = new int[n_produkts];

        for (int i = 0; i < n_produkts; i++) {            
            System.out.printf("Какую %de строку (от 0 до %d): ", i, produkts.length-1);
            index_produkts[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < index_produkts.length; i++) {
            System.out.println(produkts[index_produkts[i]]);
            
        }

        for (int i = 0; i < index_recept.length; i++) {
            String new_recept = recept[index_recept[i]];
            System.out.println(new_recept);
        }
        sc.close();*/
        int n =2;
        String [] n_arr = new String[n];
        n_arr[0] = "Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.";
        n_arr[1]= "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.";
        int m =3;
        String [] m_arr = new String[m];
        m_arr[0] = "арахис - колбаса";
        m_arr[1] = "клубника - вишня";
        m_arr[2] = "сгущенка - молоко";

        change_book(n_arr, m_arr);

        for (String i: n_arr) {
            System.out.println(i);
        }
    }
    public static void change_book(String[]arrN, String[]arrM){
        for( int i =0; i< arrN.length; i++){
            for(String m: arrM){
                arrN[i] =change_record(arrN[i],m);

            }
        }
    }
    public static String change_record(String n, String m){
        String [] m_record = m.split(" - ");
            n = n.replace(m_record[0],m_record[1]);
            n = n.replace(cap_letter(m_record[0]), cap_letter(m_record[1]) );
        return n;
    }
    public static String cap_letter(String change_word){
        change_word = change_word.substring(0, 1).toUpperCase() + change_word.substring(1);
        return change_word;
    }
}