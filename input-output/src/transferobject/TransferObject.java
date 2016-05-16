package transferobject;

import java.io.*;


import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by clouway on 16.05.16.
 */
public class TransferObject {
    private final int BUF_SIZE = 0x1000; // 40

    public long copy(InputStream from, OutputStream to, byte[] buffer, int len, int offset) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("ffiles.txt");
        byte[] buf = new byte[BUF_SIZE];
        fileOutputStream.write(buf, 20, 60);
        to.flush();
        checkNotNull(from);
        checkNotNull(to);
        long total = 0;
        while (true) {
            int r = from.read(buf);
            if (r == -1) {
                to.flush();
                break;
            }
            to.write(buf, 0, r);
            total += r;
        }
        return total;
    }
}
