
package files;
import java.io.FilenameFilter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class MyOpStreamClass  
{  String dir;
   File f;
   FileReader  of;
    MyOpStreamClass(String Dir)
    {
        dir = Dir;
       f =  new File(dir);
    }
    
     
     int freq[]  = new int[1000];
    char character[] = new char [1000];
    void charfrequency() throws FileNotFoundException
  {
    
     
    //FileOutputStream of = new FileOutputStream(f);
  /*  FilenameFilter ff = new MyFileNameFilter("xml");
    String names [] = f.list(ff);
     for(int i =0;i<names.length;i++)
    {
        System.out.println(names[i]);
    }*/
     freq[0] = 0;
    for(int k=1;k<freq.length;k++)
        freq[k] = 1;
    try{
      of = new FileReader(f);
       }catch(FileNotFoundException e)
        {
      System.out.println("yout file specified not found"+e);
        }
  char inp [] = new char[1000];
  try{
  of.read(inp);
  }catch(IOException e)
  {
      System.out.println("caught"+e);
  }
  int in=0;
  character[0] = inp[0];
  for(int i=0;i<inp.length;i++)
  {   int f=0;
      char temp = inp[i];
      if(temp == ' ')
          continue;
    /*  int index = bsearch(temp);
      if(index == -1)
        character[p++] = temp;
      else
          freq[index]++;*/
     for(int j=0;j<character.length;j++){
         if(character[j] == temp)
         {
             freq[j]++;
             f =1;
             break;
         }
     }
     if(f == 0)
         character[++in] = temp;
   }
  for(int z=0;z<in;z++)
  {
      System.out.println(""+character[z]+"-->> "+freq[z]);
  }
  try{
      of.close();
  }catch(IOException e){
      System.out.println(e);
  }
}
    /*int bsearch(char temp)
    {   int flag = 0,i=0;
        for( i=0;i<character.length;i++)
        {
            if(character[i] == temp);
            flag = 1;
            break;
        }
         if(flag == 1){
             return i ;
         }
             
               else {
                return -1;
         }
    }*/
}
