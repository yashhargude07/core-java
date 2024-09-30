import java.util.Hashtable;
public class HashTableExample
{
public static void main(String args[])
{
Hashtable<String,String>ht=new Hashtable<String,String>();
ht.put("First","First inserted");
ht.put("Second","Second inserted");
ht.put("Third","Third inserted");
System.out.println("Value of key second:"+ht.get("Second"));
System.out.println("Is hashtable empty?"+ht.isEmpty());
ht.remove("third");
System.out.println(ht);
System.out.println("Size of HashTable:"+ht.size());
}
}