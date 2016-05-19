package directorybrowser;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by clouway on 16.05.16.
 */
public class DirectoryBrowser {
    public static void main(String s[]) {
        File path = new File("/home/clouway/");
        File[] files;
        if (path.exists()) {
            if (path.isDirectory()) {
                files = path.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isFile()) {
                        System.out.println("File" + files[i]);
                    }
                    if (files[i].isDirectory()) {
                        System.out.println("Directory" + files[i]);
                    }
                }
            }
        }
    }
}