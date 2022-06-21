package WordCount;

import java.io.* ;
import java.util.*;



public class WordCount{
	String Count;
	
	int Word_count(String path) throws Exception {
		String line;  
        int count = 0;  
          
        //Opens a file in read mode  
        FileReader file = new FileReader(path);  
        BufferedReader br = new BufferedReader(file);  
             //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            
       
            count = count + words.length; 
            System.out.println("\nText in File: "+line);
            
            
        }  
 
        System.out.println("\nNumber of words present in given file: "+ count);  
        br.close(); 
        return count;
        
    }  
	

		
	}
	

