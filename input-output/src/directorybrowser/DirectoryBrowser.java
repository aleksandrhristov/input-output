package directorybrowser;

import java.io.File;

public class DirectoryBrowser {
    public int listContent(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        {
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    listOfFiles[i].getName();
                } else if (listOfFiles[i].isDirectory()) {
                    listOfFiles[i].getName();
                }
            }
            return 0;
        }
    }
}

