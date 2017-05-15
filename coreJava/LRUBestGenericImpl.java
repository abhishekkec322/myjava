package InterviewPrep;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LRUBestGenericImpl<K, V> {
	/*
	 * http://badalb.blogspot.sg/2016/09/implement-lru-cache-in-java.html
	 */
 private final int maxSize;

 //We will use ConcurrentHashMap as cache storage and ConcurrentLinkedQueue to keep track of element access order from the cache. 
 private ConcurrentHashMap<K, V> map;
 private ConcurrentLinkedQueue<K> queue;

 public LRUBestGenericImpl(final int maxSize) {
  this.maxSize = maxSize;
  map = new ConcurrentHashMap<K, V>(maxSize);
  queue = new ConcurrentLinkedQueue<K>();
 }

 public void put(final K key, final V value) {
  if (map.containsKey(key)) {
   // remove the key from the FIFO queue
   queue.remove(key);
  }

  /**The poll() method retrieves and removes the head of this queue, or returns null if this queue is empty. 
  *So while putting elements to the cache storage if we exceed the size limit, least recently used keys will be 
  *removed from the queue and element for that key will be removed from the cache. Similarly if we fetch some
  *element from cache we have to change the access order. 
  */
  
  while (queue.size() >= maxSize) {
   K oldestKey = queue.poll();
   if (null != oldestKey) {
    map.remove(oldestKey);
   }
  }
  queue.add(key);
  map.put(key, value);
 }

 public V get(final K key) {

  if (map.containsKey(key)) {
   // remove from queue and add it again in FIFO queue
   queue.remove(key);
   queue.add(key);
  }
  return map.get(key);
 }
 
 
 public static void main(String[] args) {
	  
	 LRUBestGenericImpl<Integer, String> cache = new LRUBestGenericImpl<>(4);
	  cache.put(1, "A");
	  cache.put(2, "B");
	  cache.put(3, "C");	  
	  // key 1 moved ahead
	  System.out.println(cache.get(1));
	  cache.put(4, "D");
	  cache.put(5, "E");	  
	  // put new element to cache. this will evict key 1 from cache
	  cache.put(6, "F");	  
	  //this will print null
	  
	  System.out.println("*********************************");
	  System.out.println(cache.get(1));
	  System.out.println(cache.get(2));
	  System.out.println(cache.get(3));
	  System.out.println(cache.get(4));
	  System.out.println(cache.get(5));
	  System.out.println(cache.get(6));

	 }
}
