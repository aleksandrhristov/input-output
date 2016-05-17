package transferobject;

import java.io.*;

import static com.google.common.base.Preconditions.checkNotNull;

public class TransferObject {
    private final int BUF_SIZE = 20;

    public long transfer(InputStream from, OutputStream to,byte[] b ,int offset,int lenght) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("ffiles.txt");
        byte[] buf = new byte[BUF_SIZE];
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
}
