import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

//Singleton with read resolve
public class Singleton implements Serializable {

private static final long serialVersionUID = -1348696156364702011L;
private static Singleton instance = new Singleton();
private int i;

public static Singleton getInstance() {
    return instance;
}
private Singleton() {
}
private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    instance = this;
}
private Object readResolve()  {
    return instance;
}
public static void main(String[] args) throws Throwable {
	
	//Map <String, String> map= new TreeMap <> ();
		
    Singleton s = Singleton.getInstance();
    s.i = 5;
    ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
    oos.writeObject(getInstance());
    oos.close();
    s.i = 7; //modified after serialization
    InputStream is = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(is);
    Singleton deserialized = (Singleton) ois.readObject();
    System.out.println(deserialized.i);  // prints 5
}
}