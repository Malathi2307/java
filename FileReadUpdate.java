import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileReadUpdate{
	public static void main(String[] args){
		String filePath="own.txt";
		String content="hai!you are welcome";
		try{
		File file = new File(filePath);
		Scanner s=new Scanner(file);
		System.out.print("File content:");
		while(Scanner.nextLine()){
			System.out.println(Scanner.nextLine());
		}
		Scanner.close();
		FileWriter writer=new FileWriter(file,true);
		Writer.write("\n"+necontent);
		Writer.close();
		System.out.println("File updated successfully!");
	    }catch(IOException e){
	    System.out.println("Error:"+e.getMessage());
	    }
	}
}
			
