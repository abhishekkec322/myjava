package serviceimpl;

import service.FileWriterService;
import service.MessageWriterService;

public class MessageWriterServiceImpl implements MessageWriterService{

//Sping annotation can be used here to do dependency injection.
	
	private FileWriterService fileWriterService = new FileWriterServiceImpl();
	
	@Override
	public void messageTxtWritter(String fileLocation, String content,String fileName,String fileType) {
		// TODO Auto-generated method stub
				
		fileWriterService.writeFile(fileLocation, content, fileName, fileType);
		
	}

	@Override
	public void messageCtlWriter(String fileLocation, String content,String fileName,String fileType) {
		// TODO Auto-generated method stub
		
		fileWriterService.writeFile(fileLocation, content, fileName, fileType);
	}

}
