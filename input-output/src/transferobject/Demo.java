package transferobject;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        String myFile = "files.txt";
        String myFile1 = "ffiles.txt";
        TransferObject transferObject = new TransferObject();
        InputStream in = new FileInputStream(myFile);
        OutputStream out = new FileOutputStream(myFile1);
        transferObject.transfer(in,out);
    }
}