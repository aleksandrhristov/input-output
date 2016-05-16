package transferobject;
import com.google.common.io.ByteStreams;

import java.io.*;
import java.util.Arrays;

public class Demo12 {

    public static void main(String[] args) throws IOException {
        String myFile = "files.txt";
        String myFile1 = "ffiles.txt";
        TransferObject transferObject = new TransferObject();
        InputStream in = new FileInputStream(myFile);
        OutputStream out = new FileOutputStream(myFile1);
        transferObject.copy(in,out);
    }
}