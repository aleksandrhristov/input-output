package transferobject;

import com.google.common.io.ByteStreams;
import sun.misc.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by clouway on 16.05.16.
 */
public class Demo12 {

    public static void main(String[] args) throws IOException {
        String myFile = "files.txt";
        TransferObject transferObject = new TransferObject();
        InputStream in = new FileInputStream(myFile);
        OutputStream out = new ByteArrayOutputStream();
        int len = 40;
        int offset = 10;
        byte[] bytes = new byte[4096];
        Arrays.toString(bytes);
        ByteStreams.copy(in,out);

    }
}
