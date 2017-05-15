package jobs;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import service.MessageWriterService;
import serviceimpl.MessageWriterServiceImpl;

public class MessageWriterJob implements Runnable {
	
	private static AtomicInteger counter = new AtomicInteger(0);
	private static AtomicInteger fileNameCounter = new AtomicInteger(0);
	File currentDirFile = new File("");
	private String command;
    MessageWriterService messageWriterService = new MessageWriterServiceImpl();
    
    public MessageWriterJob(String str){
        this.command=str;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        while (!Thread.currentThread().isInterrupted()) {
        	counter.incrementAndGet();
            
        	processCommand();
        }
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        //counter.incrementAndGet();
        
        String tagkey= "tag"+counter.get();
        String tagValue = "="+"tag"+counter.get();
    	messageWriterService.messageTxtWritter(inputFileLocation(), tagkey+tagValue+"^A", "file"+fileNameCounter, "txt");        	
		System.out.println("Processing File for Counter :" +counter.get());
		
		if(counter.get()==6){		
			System.out.println("Process Completed for File" +"file"+fileNameCounter);
			counter.set(0);
			messageWriterService.messageCtlWriter(inputFileLocation(), "Written in Input", "file"+fileNameCounter, "ctl");
			fileNameCounter.incrementAndGet();			
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    public String inputFileLocation(){
    	
    	String inputDataPath = currentDirFile.getAbsolutePath();
    	inputDataPath= inputDataPath.replace('\\', '/');
    	inputDataPath= inputDataPath + "/src/resources/input/data/";
    	System.out.println("path :"+inputDataPath);
    	return inputDataPath;
    }
}