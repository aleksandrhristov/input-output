package reversecontent;

import java.io.*;

/**
 * Created by clouway on 10.05.16.
 */
public class TextFile {

    public int[] Reverse (java.io.File Reverse) throws IOException {
        FileInputStream source = new FileInputStream(Reverse);
        int currentByte = source.available();
        int readCount = 0;

        int byteContainer[] = new int[currentByte];
        while(readCount < currentByte){
            byteContainer[readCount] = source.read();
            readCount++;
        }
        source.close();
        return byteContainer;
    }

    public void printReverse(int[] fileContent) throws IOException {
        Writer  writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("files.txt"), "utf-8"));
        for(int byt=fileContent.length -1; byt >= 0 ; byt--){
            writer.write((char) fileContent[byt]);
        }
        writer.close();
    }
}
