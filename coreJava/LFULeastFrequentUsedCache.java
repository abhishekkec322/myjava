package InterviewPrep;

import java.util.LinkedHashMap;
import java.util.Map;

public class LFULeastFrequentUsedCache {

class CacheEntry
{
    private String data;
    private int frequency;

    // default constructor
    private CacheEntry()
    {}

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }       

}

private static int initialCapacity;

private static LinkedHashMap<Integer, CacheEntry> cacheMap = new LinkedHashMap<Integer, CacheEntry>();
/* LinkedHashMap is used because it has features of both HashMap and LinkedList. 
 * Thus, we can get an entry in O(1) and also, we can iterate over it easily.
 * */

public LFULeastFrequentUsedCache(int initialCapacity)
{
    this.initialCapacity = initialCapacity;
}

public void addCacheEntry(int key, String data)
{
    if(!isFull())
    {
        CacheEntry temp = new CacheEntry();
        temp.setData(data);
        temp.setFrequency(0);

        cacheMap.put(key, temp);
    }
    else
    {
        int entryKeyToBeRemoved = getLFUKey();
        cacheMap.remove(entryKeyToBeRemoved);

        CacheEntry temp = new CacheEntry();
        temp.setData(data);
        temp.setFrequency(0);

        cacheMap.put(key, temp);
    }
}

public int getLFUKey()
{
    int key = 0;
    int minFreq = Integer.MAX_VALUE;

    for(Map.Entry<Integer, CacheEntry> entry : cacheMap.entrySet())
    {
        if(minFreq > entry.getValue().frequency)
        {
            key = entry.getKey();
            minFreq = entry.getValue().frequency;
        }           
    }

    return key;
}

public String getCacheEntry(int key)
{
    if(cacheMap.containsKey(key))  // cache hit
    {
        CacheEntry temp = cacheMap.get(key);
        temp.frequency++;
        cacheMap.put(key, temp);
        return temp.data;
    }
    return null; // cache miss
}

public static boolean isFull()
{
    if(cacheMap.size() == initialCapacity)
        return true;

    return false;
}

public static void main(String args []){
	
	LFULeastFrequentUsedCache lfu = new LFULeastFrequentUsedCache(4);
	
	lfu.addCacheEntry(1, "A");
	System.out.println(lfu.getCacheEntry(1));
	lfu.addCacheEntry(2, "B");
	System.out.println(lfu.getCacheEntry(1));
	lfu.addCacheEntry(3, "C");
	System.out.println(lfu.getCacheEntry(2));
	System.out.println(lfu.getCacheEntry(3));
	lfu.addCacheEntry(4, "D");
	
	lfu.addCacheEntry(5, "E");
	
	System.out.println("*************************************");
	System.out.println(lfu.getCacheEntry(1));
	System.out.println(lfu.getCacheEntry(2));
	System.out.println(lfu.getCacheEntry(3));
	System.out.println(lfu.getCacheEntry(4));
	System.out.println(lfu.getCacheEntry(5));
	
}

}