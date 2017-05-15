package InterviewPrep;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


/*
 * https://www.fitcoding.com/2014/02/06/how-to-implement-a-lru-cache/
 * http://docs.oracle.com/javase/6/docs/api/java/util/LinkedHashMap.html
 *   
 */

public class LRUGenericCacheThirdSolution<Key, Value>
{
private int size;
private ConcurrentLinkedQueue<Key> linkedQueue;
private ConcurrentHashMap<Key, Value> hashMap;
 
/**
* Cache constructor
* @param size - size of our cache
*/
public LRUGenericCacheThirdSolution(final int size)
{
this.size = size;
this.linkedQueue	= new ConcurrentLinkedQueue<Key>();
this.hashMap	= new ConcurrentHashMap<Key, Value>(size);
}
/**
* Return the Value corresponding to the given Key in the map. return null if key not found.
* @param key - Key
* @return value - Value
*/
public Value get(Key key) {
Value value = hashMap.get(key);
if (value != null) {
linkedQueue.remove(key);
linkedQueue.add(key);
}
return value;
}
/**
* Add new Key, Value pair to our Map and Queue. If the Key already exists,
* move it at the beginning of the queue.
* @param key - Key
* @param value - Value
*/
public synchronized void put(final Key key, final Value value)
{
   if (hashMap.containsKey(key))
   {
       linkedQueue.remove(key);
           }
 
   while (linkedQueue.size() >= size)
   {
       Key oldestKey = linkedQueue.poll();
       if (oldestKey != null) {
   hashMap.remove(oldestKey);
       }
 
       linkedQueue.add(key);
       hashMap.put(key, value);
   }
}

public static void main(String arg[]){
	
	LRUGenericCacheThirdSolution lru = new LRUGenericCacheThirdSolution(3);
	
	lru.put(1, 1);
	lru.put(2, 2);
	lru.put(3, 3);
	lru.put(4, 4);
	lru.put(5, 5);
	
	System.out.println("Data :"+lru.get(1));
	System.out.println("Data :"+lru.get(2));
	System.out.println("Data :"+lru.get(3));
	System.out.println("Data :"+lru.get(4));
	System.out.println("Data :"+lru.get(5));
	
}

}