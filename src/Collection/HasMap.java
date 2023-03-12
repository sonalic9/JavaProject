package Collection;
import java.util.HashMap;
public class HasMap {

	private static HashMap<String, Integer> map1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<String,Integer> basket = new HashMap<String,Integer>();
  basket.put("Item1",1);
  basket.put("Item2",5);
  basket.put("Item3",2);
  basket.put("Item3",6);
  System.out.println("The map is"+ basket);
  basket.put ("item3 ",4);
  System.out.println("the map after change the basket"+basket);
  basket.remove("item2");
  System.out.println("the map after delete from the basket"+basket);
  
  for (String item: basket.keySet()){
	  	  System.out.println("Item name is "+ item);
	  	System.out.println("Item qty  is "+ basket.get(item));
  }
  for (Integer Val: basket.values()) {
	  System.out.println("The Value is"+Val);
	  
  }
  
  String str = "Clean World Green World Happy World";
  String [] arr1=str.split(" ");
  HashMap<String,Integer> map1 = new HashMap<String,Integer>();
  for (String word: arr1) {
	  if (!map1.keySet().contains(word) ) {
	  map1.put(word,1);
	  
  }else {
	  map1.put(word,map1.get(word)+1);
   }  
  }  
  System.out.println("The result map is "+ map1);
  
	}
 

}
 