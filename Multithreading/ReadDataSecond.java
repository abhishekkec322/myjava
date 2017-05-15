package multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataSecond implements Runnable {
	  
    @SuppressWarnings("unused")
	private String command;
    
//    MessageReaderService messageReaderService = new MessageReaderServiceImpl();
	
    public ReadDataSecond(String str){
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
    	BufferedReader br = null;
    	{
    System.out.println("Second Thread");
    
    
    	}
    }
 }