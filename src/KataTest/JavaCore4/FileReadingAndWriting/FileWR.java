package KataTest.JavaCore4.FileReadingAndWriting;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWR {

    public static void main(String[] args) throws IOException {
//        ArrayList<String> name = new ArrayList<>();
//        name.add("Ivan");
//        name.add("July");
//        name.add("Katya");
//        name.add("Piter");
//        try ( FileWriter fw = new FileWriter("Name.txt")) {
//            for (String a :name) {
//                fw.write(a);
//                fw.write("\n");
//            }

//        }

        try(FileReader fl = new FileReader("Name.txt")){
            int ch;
            while ((ch = fl.read())!=-1){
                System.out.print((char) ch);
            }
        }

    }
}
