package transferobject;

import java.io.*;

import static com.google.common.base.Preconditions.checkNotNull;

public class TransferObject {
    private final int BUF_SIZE = 20;

<<<<<<< HEAD
    public long transfer(InputStream from, OutputStream to, int offset, int length) throws IOException {
=======
    public long transfer(InputStream from, OutputStream to,byte[] b ,int offset,int lenght) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("ffiles.txt");
>>>>>>> cce153d3cb462667a948b5fbddfdc9ae094382bd
        byte[] buf = new byte[BUF_SIZE];
        checkNotNull(from);
        checkNotNull(to);
        long total = 0;
        while (true) {
            int r = from.read(buf);
            if (r == -1) {
                break;
            }
<<<<<<< HEAD
            to.write(buf, offset, length);
=======
            to.write(buf, 0, r);
>>>>>>> cce153d3cb462667a948b5fbddfdc9ae094382bd
            total += r;
        }
        return total;
    }
}
