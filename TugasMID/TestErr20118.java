/* Nama : Savira Rahmadani Fs
Stb : 13020210118 */

public class TestErr20118 {
    public static void main(String[] args) {
        int tot = 1;
        int j = 2;
        for (int i = 1; i < 10; i++) {
            tot += i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while (j < 10);
        while (j < 10) {
            j++;
        }
    }
}
