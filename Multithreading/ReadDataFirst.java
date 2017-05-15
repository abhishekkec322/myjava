package multithreading;

import java.io.IOException;

public class ReadDataFirst implements Runnable {
	  
    @SuppressWarnings("unused")
	private String command;
    
//    MessageReaderService messageReaderService = new MessageReaderServiceImpl();
	
    public ReadDataFirst(String str){
        this.command=str;
    }

    @Override
    public void run() {
        try {
        	
        	System.out.println("Calling Run");
			processCommand();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private void processCommand() throws IOException {
    	{
    		
    		System.out.println("First Thread");
    
    	}
    }
 }