package addtextinfile;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        TextFiles textFile = new TextFiles();
        String name = "files.txt";
        textFile.createFile(name,".","/","|");


    }
}