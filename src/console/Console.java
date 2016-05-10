
package console;


import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 09.05.16.
 */
public class Console {
    public String readString() throws IOException {
        Scanner in = new Scanner(System.in);
        String nextLine = in.nextLine();
        return nextLine;

    }


    public int readInt() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        return num;
    }

    public float readFloat() {
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        return num1;
    }

    public char readChar() {
        Scanner s = new Scanner(System.in);
        char x = s.nextLine().charAt(0);
        return x;
    }
}

