package WordCount;
import java.util.*;
public class Word_count_main {

	public static void main(String[] args) throws Exception{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter text in file..\n");
		String Text_Write_in_File= sc.nextLine();
		
		File_Write file= new File_Write();
		file.File_Create();
		file.File_write(Text_Write_in_File);
		file.open_File("/Users/samana/Downloads/Words1.txt");
		
		WordCount word= new WordCount();
		word.Word_count("/Users/samana/Downloads/Words1.txt");
		

	}

}
