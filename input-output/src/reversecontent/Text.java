package reversecontent;

import java.io.*;

/**
 * Created by clouway on 10.05.16.
 */
public class Text {




    public String reverse(File reverse) throws IOException {
        FileInputStream source = new FileInputStream(reverse);
        int currentByte = source.available();
        int readCount = 0;

        byte byteContainer[] = new byte[currentByte];
        while(readCount < currentByte){
            byteContainer[readCount] = (byte) source.read();
            readCount++;
        }
        source.close();
        String s = "";
        for (byte b : byteContainer){
            s+=(char)b;
        }
        return (String.valueOf(new StringBuffer(s).reverse()));
    }

}
