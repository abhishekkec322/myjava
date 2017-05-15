import java.lang.reflect.Field;

// Read: http://stackoverflow.com/questions/20945049/is-a-java-string-really-immutable
public class StringWithReflections {

	public static void main(String str[]) throws NoSuchFieldException, SecurityException, IllegalAccessException {

		final String s1 = new String ("Hello World");
		final String s2 = "Hello World";
		//String s2 = "Hello 12345";
		String s3 = s1.substring(6);
		System.out.println(s1); // Hello World
		System.out.println(s2); // Hello World
		System.out.println(s3); // World

		Field field = String.class.getDeclaredField("value");
		field.setAccessible(true);
		char[] value = (char[]) field.get(s1);
		
		System.out.println(field.toGenericString());
		
		System.out.println(value);
		
		value[6] = 'J';
		value[7] = 'a';
		value[8] = 'v';
		value[9] = 'a';
		value[10] = '!';

		System.out.println("************************");
		
		System.out.println(s1); // Hello Java!
		System.out.println(s2); // Hello Java!
		System.out.println(s3); // World

	}
}