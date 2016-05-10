package addtextinfile;

import java.io.*;
import java.util.Scanner;

/**
 * Created by clouway on 10.05.16.
 */
public class TextFile {

    public void createFile(String name) {
        console(name);
    }

    private void console(String name) {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(name), "utf-8"));
            writ(writer);
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

    private void writ(Writer writer) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (true) {
            s = scanner.next() + "\n";
            writer.write(s);
            if (s.equals("/\n")) break;
        }
    }
}






