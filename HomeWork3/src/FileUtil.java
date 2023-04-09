import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String fileName = "reader.dat";
    public static boolean saveReadersList(List<Reader> readers) {
        boolean check;
        try (ObjectOutputStream write = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            write.writeObject(readers);
            check = true;
        } catch (IOException e) {
            check = false;
            e.printStackTrace();
        }
        return check;
    }

    public static List<Reader> restoreReadersList() {
        List<Reader> readers;
        try (ObjectInputStream read = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            readers = (List<Reader>) read.readObject();
        } catch (Exception e) {
            System.out.println("Данные не загрузились");
            readers = new ArrayList<>();
        }
        return readers;
    }
}
