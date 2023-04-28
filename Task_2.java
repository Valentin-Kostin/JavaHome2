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
        String [] recept = {"Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.", 
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
            // System.out.println(produkts[ni]);        
        }

        for (int i = 0; i < index_produkts.length; i++) {
            System.out.println(produkts[index_produkts[i]]);
        }

        for (int i = 0; i < index_recept.length; i++) {
            String new_recept = recept[index_recept[i]];
            System.out.println(new_recept);
        }
        sc.close();
    }
}
