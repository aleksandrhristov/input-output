package console;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created by clouway on 09.05.16.
 */
public class Console {
    private Scanner in = new Scanner(System.in);
    public String readString() throws IOException {
        String nextLine = in.nextLine();
        return nextLine;
    }
    public int readInt() {
        int num = in.nextInt();
        return num;
    }
    public float readFloat() {
        float num1 = in.nextFloat();
        return num1;
    }
    public char readChar() {
        char x = in.nextLine().charAt(0);
        return x;
    }
}

