package serviceimpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import service.FileWriterService;

public class FileWriterServiceImpl implements FileWriterService{

	@Override
	public void writeFile(String fileLocation, String content, String fileName, String fileType) {
		// TODO Auto-generated method stub
		
		String 	File_Path = fileLocation+ fileName+ "." +fileType;
		File file= new File(File_Path);

		try(FileWriter FileWriter = new FileWriter(file.getAbsoluteFile(), true); BufferedWriter bufferedWriter = new BufferedWriter(FileWriter)){
			if (!file.exists()) {
				file.createNewFile();
			}
			// else append data in existing file
			bufferedWriter.write(content);
			System.out.println("Written in file successfully");

		} catch (IOException e) {
			e.printStackTrace();
		} 	
		
	}

}
