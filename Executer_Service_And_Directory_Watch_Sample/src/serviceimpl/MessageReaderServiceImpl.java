package serviceimpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import service.MessageReaderService;
import service.MessageWriterService;

public class MessageReaderServiceImpl implements MessageReaderService{

	File currentDirFile = new File("");
	
	MessageWriterService messageWriterService = new MessageWriterServiceImpl();
	
	@Override
	public void readMessage(String fileLocation, String fileName) {
		// TODO Auto-generated method stub
		String 	File_Path = fileLocation+ "/"+ fileName;
		
		try (BufferedReader br = new BufferedReader(new FileReader(File_Path))) {

			String readData;
			
			StringBuffer stringbuffer = new StringBuffer();

			while ((readData = br.readLine()) != null) {
				stringbuffer.append(readData);
			}
			
			String str=stringbuffer.toString();	
			
			System.out.println("String from input location :" +str);
			
//We can use RegEx here to replace characters sets. I have not done because of shortage of time. All these string get and replace operations could have been done better.			
			String strTemp= str.replace("tag2=tag2^A","").replace("tag6=tag6^A","").replace("tag3=tag3^A","");
						
		/*	if(strTemp.startsWith("^")){
				strTemp= strTemp.substring(1, strTemp.length());
			}*/			
			System.out.println("final string in output    :::"+strTemp);
						
			messageWriterService.messageTxtWritter(outputFileLocation(), strTemp, fileName.replaceAll(".txt", ""), "txt");  
			messageWriterService.messageCtlWriter(outputFileLocation(), "Written in Output From Input", fileName.replaceAll(".txt", ""), "ctl");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public String outputFileLocation(){
				
		String outputDataPath = currentDirFile.getAbsolutePath();
		outputDataPath= outputDataPath.replace('\\', '/');
		outputDataPath= outputDataPath + "/src/resources/output/data/";
		System.out.println("path :"+outputDataPath);
		
		return outputDataPath;
		}

}
