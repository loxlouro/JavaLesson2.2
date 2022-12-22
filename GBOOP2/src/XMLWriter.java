import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class XMLWriter extends FileWrite{
    public XMLWriter(){
        super.mainScanner=new Scanner(System.in);
    }

    @Override
    void LineWrite(String pathFile, String nameFile) {
        try{
            String expantion=".xml";
            if (new File(pathFile+"/"+nameFile+expantion).isFile() !=true){
                Writer fw = new FileWriter(pathFile+"/"+nameFile+expantion,true);
                String input = mainScanner.nextLine();
                fw.append("\n"+input);
                fw.close();
            }
        } catch (Exception e){
            System.out.println("error");
        }
    }

    @Override
    void EnterWrite(String pathFile, String nameFile, String line) {

        try{
            String expansion = ".xml";
            if (new File(pathFile+"/"+nameFile+expansion).isFile()!=true){
                Writer fw = new FileWriter(pathFile+"/"+nameFile+expansion,true);
                fw.append("\n"+line);
                fw.close();
            }
        } catch (Exception e){
            System.out.println("error");
        }
    }
}
