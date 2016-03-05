import java.io.*;

/**
 * Created by Tim on 03/03/16.
 */
public class Hello {
    public static void main(String[] args) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new
                    FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            out.write("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
