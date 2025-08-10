package Other.FileManager;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryDelite extends SimpleFileVisitor <Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Name of file: " + file.getFileName() + " is delite");
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Name of directory: " + dir.getFileName() + " is delite");
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}
class test1 {
    public static void main(String[] args) {
        Path directory = Paths.get("/Users/macbookair/Desktop/And");
        try {
            Files.walkFileTree(directory,new DirectoryDelite());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
