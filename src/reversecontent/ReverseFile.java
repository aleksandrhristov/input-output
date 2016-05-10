package reversecontent;

import java.io.*;

/**
 * Created by clouway on 10.05.16.
 */
public class ReverseFile {
    public void createFile(String name) throws IOException {
        console(name);
    }

    private void console(String name) throws IOException {
        Writer writer = null;
        String buf = read();
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name), "utf-8"));
            writer.write(buf);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private String read() throws IOException {
        BufferedReader stream = new BufferedReader(new FileReader("files.txt"));
        return  (String.valueOf(new StringBuffer(stream.readLine()).reverse()));
    }
}
