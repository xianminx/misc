import java.util.*;
/**
 * This fails with error:<p/>
 * 1
 * Exception in thread "main" java.util.ConcurrentModificationException
 * 	at java.util.AbstractList$Itr.checkForComodification(AbstractList.java:372)
 * 		at java.util.AbstractList$Itr.next(AbstractList.java:343)
 * 			at TestFor.main(TestFor.java:8)
 *
 * 			shell returned 1
 *
 *
 */ 			
public class TestFor{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add(""+1);
		list.add(""+2);
		int i =3;
		for(String s : list){
			if(i< 5){
				list.add(""+ i++);	
			}
			System.out.println(""+s);
		}	
	}
}
