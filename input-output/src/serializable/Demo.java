package serializable;

import java.io.*;

/**
 * Created by clouway on 24.05.16.
 */
public class Demo {
    public static void main(String[] args) {

        Employee e = new Employee("Aleksandar Hristov", "Vidima 25", 9308142204L, 1);
        DataClass dataClass = new DataClass();
        try {
            OutputStream out = new FileOutputStream("/home/clouway/employee.ser");
            dataClass.saveObject(out,e);

            InputStream in = new FileInputStream("/home/clouway/employee.ser");

          Employee dsr = (Employee) dataClass.getObject(in);

            System.out.println("Name: "+dsr.getName());
            System.out.println("Adress: "+dsr.getAddress());
            System.out.println("EGN: "+dsr.getEGN());
            System.out.println("ID: "+dsr.getNumber());
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();    
        }

    }
}

