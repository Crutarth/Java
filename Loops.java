// lecture: 4 - Loops
// Program to print Hello World! 5 times using for, while and do-while loop.

public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World!");
            i++;
        }

        // do-while loop
        int j = 0;
        do {
            System.out.println("Hello World!");
            j++;
        } while (j < 5);
    }
}