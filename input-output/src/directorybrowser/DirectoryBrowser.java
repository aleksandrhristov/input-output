package directorybrowser;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DirectoryBrowser {

        public List<Path> listFilesAndFolders(String path){
            File folder = new File(path);
            List<Path> images = new LinkedList<Path>();
            for(Path p : images){
                System.out.println(p);
            }
            File[] listOfFiles = folder.listFiles();
            String s = "";
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    s += "\n " + listOfFiles[i].getName();
                } else if (listOfFiles[i].isDirectory()) {
                    s += "\n " + listOfFiles[i].getName() + "/";
                }
            }
    return images;
        }
    }


