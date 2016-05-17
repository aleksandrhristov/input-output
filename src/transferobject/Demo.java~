package transferobject;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        TransferObject transferObject = new TransferObject();
        String myFile = "files.txt";
        String myFile1 = "ffiles.txt";
        InputStream in = new FileInputStream(myFile);
        OutputStream out = new FileOutputStream(myFile1);
        transferObject.transfer(in, out, 0, 2);
    }
}
