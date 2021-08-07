package shildt_book;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class My_Test {
    public static void main(String[] args) throws IOException {
        var a= System.nanoTime();
        System.out.println(a);
        for (int i = 100000; i > 1; i--) {
            System.out.println(i);
        }
        var b= System.nanoTime();
        System.out.println(b);
        System.out.println("Быстродействие: " + ((b-a)/1000000) + " мс");
    }
}
