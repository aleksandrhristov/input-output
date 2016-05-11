package reversecontent;

import java.io.IOException;

/**
 * Created by clouway on 10.05.16.
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        java.io.File fileToRead = new java.io.File("files.txt");

        File demo = new File();
        int[] readBytes = demo.readByte(fileToRead);

        demo.printReverse(readBytes);
    }
    }