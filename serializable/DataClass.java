package serializable;

import java.io.*;

/**
 * Created by clouway on 19.05.16.
 */
public class DataClass {
    public void saveObject(OutputStream out, Object o) {
        try {
            ObjectOutputStream outp = new ObjectOutputStream(out);
            outp.writeObject(o);
            outp.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public Object getObject(InputStream in) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("/home/clouway/employee.ser");
            ObjectInputStream inputStream = new ObjectInputStream(in);
            e = (Employee) inputStream.readObject();
            inputStream.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();

        } catch (ClassNotFoundException c) {

            c.printStackTrace();


        }
        return e;
    }
}
