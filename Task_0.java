
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример: jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ВВедите драгоценные камни: ");
        String jewels = sc.nextLine();
        System.out.print("ВВедите кучу обычных камней: ");
        String stones = sc.nextLine();
        String result = findJewelsInStones(jewels, stones);
        System.out.println(result);
        sc.close();
    }

    public static String findJewelsInStones(String jewels, String stones) {
        int countA = 0, countB = 0;
        for (int index = 0; index < stones.length(); index++) {
            if (stones.regionMatches(index, jewels, 0, 1)) {
                countA++;
            }
            if (stones.regionMatches(index, jewels, 1, 1)) {
                countB++;
            }
        }
        String result = jewels.charAt(0) + Integer.toString(countA) + jewels.charAt(1) + Integer.toString(countB);
        System.out.println();
        return result;
    }
}
