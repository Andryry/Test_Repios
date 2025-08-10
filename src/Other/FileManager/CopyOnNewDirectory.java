package Other.FileManager;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyOnNewDirectory extends SimpleFileVisitor<Path> {
    public CopyOnNewDirectory(Path ishodny, Path chelevoy) {
        this.ishodny = ishodny;
        this.chelevoy = chelevoy;
    }

    Path ishodny;
    Path chelevoy;

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newchelevoy = chelevoy.resolve(ishodny.relativize(dir));
        Files.copy(dir, newchelevoy, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newchelevoy = chelevoy.resolve(ishodny.relativize(file));
        Files.copy(file, newchelevoy, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) {
        Path cel = Paths.get("/Users/macbookair/Desktop/f");
        Path ish = Paths.get("/Users/macbookair/Desktop/And");
        try {
            Files.walkFileTree(ish, new CopyOnNewDirectory(ish,cel));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
