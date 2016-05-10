package reversecontent;

import java.io.IOException;

/**
 * Created by clouway on 10.05.16.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        ReverseFile reverseFile = new ReverseFile();
        reverseFile.createFile("files.txt");
    }
}