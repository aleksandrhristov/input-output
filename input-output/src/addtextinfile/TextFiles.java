package addtextinfile;

import java.io.*;
import java.util.Scanner;

/**
 * Created by clouway on 10.05.16.
 */
public class TextFiles {

    public void createFile(String name, String... names) {
        console(name, names);
    }

    private void console(String name, String... names) {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(name), "utf-8"));
            write(writer, names);
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

    private void write(Writer writer, String... stopSymbols) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String s = "";

        while (true) {
            s = scanner.next();
            writer.write(s + "\n");
            if (isStopSymbol(s, stopSymbols)) {
                break;
            }
        }


    }

    private boolean isStopSymbol(String symbol, String[] stopSymbols) {
        for (int i = 0; i < stopSymbols.length; i++) {
            if (symbol.equals(stopSymbols[i])) {
                return true;
            }
        }
        return false;
    }

}







