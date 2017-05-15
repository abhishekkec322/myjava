package jobs;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import service.MessageReaderService;
import serviceimpl.MessageReaderServiceImpl;

public class WatchDirectoryForCtlFile {

File currentDirFile = new File("");
	
public void watcher() throws IOException, InterruptedException {
	
MessageReaderService messageReaderService = new MessageReaderServiceImpl();	
Path path = Paths.get(inputFileLocation());
WatchService watchService = FileSystems.getDefault().newWatchService();
path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

boolean valid = true;
do {
	WatchKey watchKey = watchService.take();
	for (WatchEvent event : watchKey.pollEvents()) {
		WatchEvent.Kind kind = event.kind();
		if (StandardWatchEventKinds.ENTRY_CREATE.equals(event.kind())) {
			String fileName = event.context().toString();
			
			if(fileName.contains(".ctl"))
			{
				String textFileName= fileName.replace("ctl", "txt");
				messageReaderService.readMessage(path.toString(), textFileName);
//We can change file extension of processed files as well if we want to differentiate them. Here its not implemented because watch event only look for new files created.
//Old files will not be read again while using Watch Service. That will be required if we are using Thread in place of directory watch.			
			}						
		}
	}
	valid = watchKey.reset();
} while (valid);
}

public String inputFileLocation(){
	
	String inputDataPath = currentDirFile.getAbsolutePath();
	inputDataPath= inputDataPath.replace('\\', '/');
	inputDataPath= inputDataPath + "/src/resources/input/data/";
	System.out.println("path :"+inputDataPath);
	return inputDataPath;
	}
}
