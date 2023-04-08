import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C://Temp");
        if (!file.exists()) {
            System.out.println("По данному пути файла\\каталога не найдено!");
            return;
        }
        File[] arr = file.listFiles();
        StringBuilder stringBuilder = new StringBuilder();
        assert arr != null;
        for (File val : arr) {
            if (val.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(val.getAbsolutePath()))) {
                    String s;
                    while ((s = br.readLine()) != null) {
                        stringBuilder.append(s).append("\n");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file.getAbsolutePath() + "/result.txt"))) {
            bf.write(stringBuilder.toString());
            System.out.println("Create file Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}