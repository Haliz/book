package shildt_book.scanner;

import java.util.Scanner;


public class Scan_int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1  2 3 four 5");
          while (scanner.hasNextInt()) {
              int i = scanner.nextInt();
              System.out.println(i);
          }

    }
}
