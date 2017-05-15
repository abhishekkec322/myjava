package service;

public interface MessageWriterService {	
	void messageCtlWriter(String fileLocation, String content, String fileName, String fileType);
	void messageTxtWritter(String fileLocation, String content, String fileName, String fileType);	
}
