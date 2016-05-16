package transferobject;

import java.io.*;
import java.util.Arrays;


import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by clouway on 16.05.16.
 */
public class TransferObject {
    private final int BUF_SIZE = 0x1000; // 40

    public long copy(InputStream from, OutputStream to) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("ffiles.txt");
        byte[] buf = new byte[BUF_SIZE];
        String s = new String(buf);
        fileOutputStream.write(buf, 20, 60);
        checkNotNull(from);
        checkNotNull(to);
        long total = 0;
        while (true) {
            int r = from.read(buf);
            if (r == -1) {
                break;
            }
            to.write(buf, 0, r);
            total += r;
        }
        return total;
    }
    public void convertByteToString() {

        byte[] buf = new byte[BUF_SIZE];


        //Using the static toString method of the Byte class
        Byte.valueOf(String.valueOf(buf));

        //Using simple concatenation with an empty String
        System.out.println(buf + "");

        //Creating a byte array and passing it to the String constructor
       //(new String(new byte[] {}));

    }
}
