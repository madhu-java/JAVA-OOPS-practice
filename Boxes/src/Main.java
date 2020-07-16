import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] boxOneItems = new int[3];
        int[] boxTwoItems = new int[3];
        for (int i = 0; i < 3; i++) {
            boxOneItems[i] = scanner.nextInt();
        }
        scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            boxTwoItems[i] = scanner.nextInt();
        }
//
//        }
        Arrays.sort(boxOneItems);
        Arrays.sort(boxTwoItems);

        int equal = 0, boxOnegreater = 0, boxOnesmaller = 0;
        for (int i = 0; i < 3; i++) {
            if (boxOneItems[i] == boxTwoItems[i]) {
                equal++;
                //System.out.println("equal "+equal);

            } else if (boxOneItems[i] <= boxTwoItems[i]) {
                boxOnesmaller++;
                //System.out.println("smaller "+smaller);
            } else if (boxOneItems[i] >= boxTwoItems[i]) {
                boxOnegreater++;
                //System.out.println("greater "+greater);
            }
        }
        if (equal == 3) {
            System.out.println("Box 1 = Box 2");
        } else if (boxOnesmaller >= 1 && boxOnegreater == 0) {
            System.out.println("Box 1 < Box 2");
        } else if (boxOnegreater >= 1 && boxOnesmaller == 0) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }

    }
}
