package console;

import java.io.IOException;


/**
 * Created by clouway on 09.05.16.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        Console console = new Console();
        System.out.println(console.readChar());
        System.out.println(console.readString());
        System.out.println(console.readFloat());
        System.out.println(console.readInt());
    }
}
