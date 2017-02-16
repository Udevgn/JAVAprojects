
package files;
import java.io.File;

public class MyFile {
    
      String path;
      void p(String string)
      {
          System.out.println(string);
      }
   
 MyFile(String name)
   {
     path = name; 
   } 
    void function(){
   File f = new File(path);
   p("name of the fie"+f.getName());
   p(f.exists()?"exists":"dosn't not exists");
   p("name of the parent"+f.getParent());
   p(f.getPath());
   p(f.getAbsolutePath());
   p(f.canRead()?"canread":"canwrite");
   p(f.canWrite()?"canWrite":"canread");
   p("filesize"+f.length());
   p("free space"+f.getFreeSpace());
   
   
    
    
    } 
    
    
    
    
}
