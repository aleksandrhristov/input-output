package reversecontent;
import java.io.IOException;
/**
 * Created by clouway on 10.05.16.
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        java.io.File fileToRead = new java.io.File("files.txt");
        Text demo = new Text();
        demo.reverse(fileToRead);
        System.out.println(demo.reverse(fileToRead));
//        String readBytes = demo.reverse(fileToRead);
//        demo.printReverse(readBytes);
    }
    }