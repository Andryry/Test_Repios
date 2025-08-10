package Other.FileManager;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatedFiles {
    public static void main(String[] args) {
        Path p = Paths.get("/Users/macbookair/Desktop/And/Andew.txt");
        try (FileWriter reader = new FileWriter("/Users/macbookair/Desktop/And/Asas/AsasBuba.txt")) {
            String name = "BubapumaMganbangASAS";
            reader.write(name);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
