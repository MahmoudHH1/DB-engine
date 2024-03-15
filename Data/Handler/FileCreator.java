package Data.Handler;

import Data.Table.Table;

import java.io.*;

public class FileCreator {
    public static void storeAsObject(Object o, String path) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(path+".class");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(o);
        out.close();
        fileOut.close();
    }

    public static Object readObject(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(path+".class");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Object o = in.readObject();
        in.close();
        fileIn.close();
        return o;
    }


}
