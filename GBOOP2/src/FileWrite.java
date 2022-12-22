
import java.util.Scanner;

public abstract class FileWrite {

    Scanner mainScanner = new Scanner(System.in);

    public FileWrite() {
        this.mainScanner=new Scanner(System.in);
    }

    abstract void LineWrite(String pathFile, String nameFile);
    abstract void EnterWrite(String pathFile, String nameFile, String line);
}
