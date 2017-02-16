package files;
import java.io.*;

public class MyFileNameFilter implements FilenameFilter
{
    String ext =".";
   public boolean accept(File f,String name)
    {
        return name.endsWith(ext);
    }
    MyFileNameFilter(String ext)
    {
        this.ext += ext;
    }
    
}
