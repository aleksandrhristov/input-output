package addtextinfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) throws IOException {
        TextFile textFile = new TextFile();
        String name = "files.txt";
        textFile.createFile(name);

    }
}