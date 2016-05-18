package transferobject;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        TransferObject transferObject = new TransferObject();
        String myFile = "files.txt";
        String myFile1 = "ffiles.txt";
        int BUFFER_SIZE = 20;
        InputStream in = new FileInputStream(myFile);
        OutputStream out = new FileOutputStream(myFile1);
        byte[] buf = new byte[BUFFER_SIZE];
        transferObject.transfer(in,out,buf,0,2);
        }
    }
