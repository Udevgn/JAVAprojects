
package sets;
public class Union 
{
   String str1,str2;
   String list1[] ;
   String list2[] ;
   String outputstring ;
  
    Union(String Str1,String Str2)
    {
        str1 = Str1;
        str2 = Str2;
    }
    Union(String [] List1,String[] List2)
    {
        list1 = List1;
        list2 = List2;
    }
    String Myunion1()
    {    
  outputstring = new String(str2);
            char  temp;
            char  attach[] = new char[str1.length()+str2.length()] ;
            int k=0;
            int flag =0;
            char []strc1 = str1.toCharArray();
            char [] strc2 = str2.toCharArray();
         for(int i = 0 ;i<strc1.length;i++)
         {
               temp = strc1[i];
               for(int j=0;j<strc2.length;j++)
               {
                   flag = 0;
                   if(temp == strc2[j])
                   {
                    flag = 1;
                    break;
                   }
                   if(flag == 0)
                   {
                       attach[k++] = strc2[j];
                   }
                       
               }
              
             
            }    
            
      outputstring += new String(attach);
      return outputstring;
    }

    String[] Myunion2()
            
    {    String outputstring2 [] = new String[list1.length+list2.length] ;
         int i,j,k=0;
         int flag = 0;
         int pos=0;
        for(i=0;i<list1.length;i++)
            outputstring2[k++] = list1[i];
    for(i=0;i<list1.length;i++)
               {
                 
                   
                    for(j=0;j<list2.length;j++)
                       {    flag = 0;
                           
                           if(list1[i].equals(list2[j]) )
                           {
                              flag = 1;
                              pos = j;
                              break;
                          
                           }
                       }   
                         if(flag == 0)
                         outputstring2[k++] = list2[pos];
                       
                }  
       return outputstring2; 
    }  
}

