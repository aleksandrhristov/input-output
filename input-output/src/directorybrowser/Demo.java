package directorybrowser;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by clouway on 16.05.16.
 */
public class Demo {
    public static void main(String s[]) {
        DirectoryBrowser directoryBrowser = new DirectoryBrowser();
        //List<File> images = directoryBrowser.listContent();
        directoryBrowser.listContent("");
       // for (File p : images){
        //    System.out.println(p);
       // }
       // directoryBrowser.listContent("./");
    }
}
