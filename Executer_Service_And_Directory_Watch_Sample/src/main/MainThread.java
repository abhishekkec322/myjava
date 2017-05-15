package main;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jobs.MessageReaderJob;
import jobs.MessageWriterJob;

public class MainThread {

	static File currentDirFile = new File("");

	public static void main(String[] args) {

		// Clean output and input directories. We can also purge those files if
		// required/.
		cleanOutputDirectory();
		cleanInputDirectory();

		ExecutorService executorWrite = Executors.newCachedThreadPool();
		ExecutorService executorRead = Executors.newCachedThreadPool();

		Runnable readWorker = new MessageReaderJob("Reader");
		executorRead.execute(readWorker);
		Runnable writeWorker = new MessageWriterJob("Writer");
		executorWrite.execute(writeWorker);
		// Thread will not terminate until terminated manually.
		while (!executorWrite.isTerminated()) {
		}
		while (!executorRead.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}

	public static String outputFileLocation() {

		String outputDataPath = currentDirFile.getAbsolutePath();
		outputDataPath = outputDataPath.replace('\\', '/');
		outputDataPath = outputDataPath + "/src/resources/output/data/";
		System.out.println("path :" + outputDataPath);

		return outputDataPath;
	}

	public static String inputFileLocation() {

		String outputDataPath = currentDirFile.getAbsolutePath();
		outputDataPath = outputDataPath.replace('\\', '/');
		outputDataPath = outputDataPath + "/src/resources/input/data/";
		System.out.println("path :" + outputDataPath);

		return outputDataPath;
	}

	public static void cleanOutputDirectory() {
		File file = new File(outputFileLocation());
		String[] myFiles;
		if (file.isDirectory()) {
			myFiles = file.list();
			for (int i = 0; i < myFiles.length; i++) {
				File myFile = new File(file, myFiles[i]);
				myFile.delete();
			}
		}
	}

	public static void cleanInputDirectory() {
		File file = new File(inputFileLocation());
		String[] myFiles;
		if (file.isDirectory()) {
			myFiles = file.list();
			for (int i = 0; i < myFiles.length; i++) {
				File myFile = new File(file, myFiles[i]);
				myFile.delete();
			}
		}
	}
}
