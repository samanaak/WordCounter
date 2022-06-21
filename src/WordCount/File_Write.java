package WordCount;

import java.awt.Desktop;
import java.io.*;
import java.util.*;


public class File_Write {
	String File;
	void File_Create() {
		try {
		      File file_object = new File("/Users/samana/Downloads/Words1.txt");
		      if (file_object.createNewFile()) {
		        System.out.println("File created: " + file_object.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
}
	void File_write(String text) {
		try {
		      FileWriter myWriter = new FileWriter("/Users/samana/Downloads/Words1.txt");
		      myWriter.write(text);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	


}
	void open_File(String path) {
		try  
		{  
		//constructor of file class having file as argument  
		File file = new File(path);   
		if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
		{  
		System.out.println("not supported");  
		return;  
		}  
		Desktop desktop = Desktop.getDesktop();  
		if(file.exists())         //checks file exists or not  
		desktop.open(file);              //opens the specified file  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
	}

}
