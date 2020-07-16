import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner((System.in));
        String str = scanner.nextLine();
        while (!str.equals("0")) {
            try {
                System.out.println(Integer.parseInt(str) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + str);
            }
            str = scanner.nextLine();
        }

    }
}