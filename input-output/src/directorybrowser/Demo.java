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
        final String directoryLinuxMac ="/home/clouway";
        List<Path> images = directoryBrowser.listFilesAndFolders(directoryLinuxMac);
        for( Path p : images){
            System.out.println(p);
        }
    }

}
