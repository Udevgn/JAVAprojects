
package files;
import java.io.FileNotFoundException;

public class Files {

  
    public static void main(String[] args) {
        /*MyFile mf;
        mf = new MyFile("C:\\filehandling\\myworld.txt");
        mf.function();
        
*/
        MyOpStreamClass mo;
        mo = new MyOpStreamClass("D:\\filehandling\\mytext.txt");
        try{
        mo.charfrequency();
        }catch(FileNotFoundException e)
        {
            System.out.println("caught"+e);
        }
    }
    
}
