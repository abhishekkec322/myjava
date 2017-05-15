import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String args[]) throws FileNotFoundException{
	
	
	File file = new File("C:/Gateway-CSG/Source_Code/COMMON-SERVICES-GATEWAY/CSGReportBuilder/csg_report/citylots.json");
    StringBuilder fileContents = new StringBuilder((int)file.length());
    Scanner scanner = new Scanner(file);
    String lineSeparator = System.getProperty("line.separator");

    try {
        while(scanner.hasNextLine()) {
            fileContents.append(scanner.nextLine() + lineSeparator);
        }
        
    } finally {
        scanner.close();
    }
    
    System.out.println("fileContents.toString() :"+fileContents.toString());
	}
}
