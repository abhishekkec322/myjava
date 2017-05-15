package jobs;

import java.io.IOException;
import service.MessageReaderService;
import serviceimpl.MessageReaderServiceImpl;

public class MessageReaderJob implements Runnable {
	  
    @SuppressWarnings("unused")
	private String command;
    
    MessageReaderService messageReaderService = new MessageReaderServiceImpl();
	
    public MessageReaderJob(String str){
        this.command=str;
    }

    @Override
    public void run() {
        try {
			processCommand();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private void processCommand() throws IOException {
        try {
 //Thread calling watch service to look for .ctl file created.       	
        	WatchDirectoryForCtlFile watch = new WatchDirectoryForCtlFile();
        	watch.watcher();        	
        	
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
