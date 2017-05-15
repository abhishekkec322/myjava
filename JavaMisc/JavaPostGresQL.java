import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JavaPostGresQL {
   public static void main(String args[]) {
      Connection c = null;
      Statement stmt = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/localpostgresql",
            "postgres", "password");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");
         
         BufferedReader in = new BufferedReader(new FileReader("C:/Gateway-CSG/Source_Code/COMMON-SERVICES-GATEWAY/CSGReportBuilder/csg_report/citylots.json"));

         String line;
         
         while ((line = in.readLine()) != null) {

             // do something with line

         }
         in.close();
         
         stmt = c.createStatement();
         String sql = "INSERT INTO report_data (ID,jsonData,uuid,callbackurl,name) "
               + "VALUES (27, 'Paul', 32, 'California', 20000.00 );";
         stmt.executeUpdate(sql);

         
         stmt.close();	
         c.commit();
         c.close();
      } catch (Exception e) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      System.out.println("Records created successfully");
   }
}