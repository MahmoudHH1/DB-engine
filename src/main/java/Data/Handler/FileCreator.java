package Data.Handler;

import java.io.*;

/**
 * The FileCreator class provides methods for storing and reading objects as serialized files.
 */
public class FileCreator {

    /**
     * Stores the provided object as a serialized file at the specified path.
     *
     * @param o    The object to be stored.
     * @param path The file path where the object will be stored.
     * @throws IOException if there is an error during the serialization process.
     */
    public static void storeAsObject(Object o, String path) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(path + ".class");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(o);
        out.close();
        fileOut.close();
    }

    /**
     * Reads and deserializes an object from the specified file path.
     *
     * @param path The file path from which to read the serialized object.
     * @return The deserialized object.
     * @throws IOException            if there is an error during the deserialization process or if the file is not found.
     * @throws ClassNotFoundException if the class of the serialized object cannot be found during deserialization.
     */
    public static Object readObject(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(path + ".class");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Object o = in.readObject();
        in.close();
        fileIn.close();
        return o;
    }
}
