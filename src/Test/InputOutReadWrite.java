package Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class InputOutReadWrite {
    public String readAsString (InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,charset);
        StringBuilder sb = new StringBuilder();
        int code = 0;
        while ((code = inputStreamReader.read()) != -1){
            sb.append(Character.toChars(code));
        }
        inputStreamReader.close();
        return sb.toString();
    }
}
